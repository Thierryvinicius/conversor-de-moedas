package modelo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexaoApi {
    private final String base_code;
    private final String target_code;
    private final double amount;

    public ConexaoApi(Conversor valores) {
        this.base_code = valores.moedaEscolhida();
        this.target_code = valores.moedaParaConverter();
        this.amount = valores.valorConvertido();
    }


    public void conectarApi() throws IOException, InterruptedException {
        String apikey = "5f24543c01c5a0ccc7042bbd";
        String endereco = "https://v6.exchangerate-api.com/v6/"+apikey+"/pair/"+this.base_code+"/"+this.target_code+"/"+this.amount;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        Gson gson = new GsonBuilder().create();
        Conversor conversor = gson.fromJson(json, Conversor.class);
        System.out.println(conversor);
    }
}
