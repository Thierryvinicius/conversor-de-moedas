package modelo;
import com.google.gson.annotations.SerializedName;

public record Conversor(@SerializedName("base_code") String moedaEscolhida,
                        @SerializedName("target_code") String moedaParaConverter,
                        @SerializedName("conversion_result") double valorConvertido){
    @Override
    public String toString() {
        return  "moeda escolhida = '" + moedaEscolhida + '\'' +
                ", moeda convertida='" + moedaParaConverter + '\'' +
                ", valor convertido=" + valorConvertido + " " + moedaParaConverter;
    }
}