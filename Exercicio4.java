public class Exercicio4 {
    public static void executar(){
        /* Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$). O programa deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o usuário.*/

        Cotacao objCotacao = new Cotacao();
        objCotacao.qtdeDolares = Prompt.lerDecimal("Digite a quantidade de dólares: ");
        objCotacao.valorCotacaoDolar = Prompt.lerDecimal("Digite o valor da cotação em reais: ");

        Prompt.linhaEmBranco();
        Prompt.separador();
        Prompt.linhaEmBranco();


        Prompt.imprimir(objCotacao.toString());
    }

}
