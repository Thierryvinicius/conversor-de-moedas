package modelo;

import java.util.Scanner;

public class InterfaceUsuario {
    Scanner scanner = new Scanner(System.in);

    public void menuConversor() {
        String escolha = "";
        while (!escolha.equalsIgnoreCase("7")) {
            System.out.println("""
                    ****************************************************
                    $$ Damos as boas-vindas ao Conversor de Moedas $$
                    Escolha uma opção de conversão:
                        
                    1) Dólar (USD) → Real Brasileiro (BRL) 
                    2) Peso Argentino (ARS) → Dólar (USD)
                    3) Dólar (USD) → Peso Argentino (ARS)
                    4) Real Brasileiro (BRL) → Dólar (USD)
                    5) Dólar (USD) → Peso Colombiano (COP)
                    6) Peso Colombiano (COP) → Dólar (USD)
                    7) Sair
                    ****************************************************
                    """);
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextLine();
           if (escolha.equals("7")){
                System.out.println("Programa finalizado com sucesso!");
                break;
           }
            System.out.print("Escolha o valor para conversão: ");
            double valor = scanner.nextDouble();
            scanner.nextLine(); //para limpar o buffer
            conversao(escolha, valor);

        }
    }
        public void conversao (String escolha,double valor){
            switch (escolha) {
                case "1":
                    try {
                        Conversor con = new Conversor("USD", "BRL", valor);
                        ConexaoApi api = new ConexaoApi(con);
                        api.conectarApi();
                    } catch (Exception e) {
                        System.out.println("Ocorreu um erro na conversão");
                    }
                    break;

                case "2":
                    try {
                        Conversor con = new Conversor("ARS", "USD", valor);
                        ConexaoApi api = new ConexaoApi(con);
                        api.conectarApi();
                    } catch (Exception e) {
                        System.out.println("Ocorreu um erro na conversão");
                    }
                    break;

                case "3":
                    try {
                        Conversor con = new Conversor("USD", "ARS", valor);
                        ConexaoApi api = new ConexaoApi(con);
                        api.conectarApi();
                    } catch (Exception e) {
                        System.out.println("Ocorreu um erro na conversão");
                    }
                    break;

                case "4":
                    try {
                        Conversor con = new Conversor("BRL", "USD", valor);
                        ConexaoApi api = new ConexaoApi(con);
                        api.conectarApi();
                    } catch (Exception e) {
                        System.out.println("Ocorreu um erro na conversão");
                    }
                    break;

                case "5":
                    try {
                        Conversor con = new Conversor("USD", "COP", valor);
                        ConexaoApi api = new ConexaoApi(con);
                        api.conectarApi();
                    } catch (Exception e) {
                        System.out.println("Ocorreu um erro na conversão");
                    }
                    break;

                case "6":
                    try {
                        Conversor con = new Conversor("COP", "USD", valor);
                        ConexaoApi api = new ConexaoApi(con);
                        api.conectarApi();
                    } catch (Exception e) {
                        System.out.println("Ocorreu um erro na conversão");
                    }
                    break;

                default:
                        System.out.println("Opção Inválida! " +
                                "Selecione uma opção valida. ");
                    break;
            }
        }
}
