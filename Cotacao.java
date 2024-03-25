public class Cotacao {
    //propriedades
    public double qtdeDolares;
    public double valorCotacaoDolar;

    //metodos
    public double conversaoReais(){
    return qtdeDolares * valorCotacaoDolar;
    }

    public String toString(){
        return "Dólares: " + qtdeDolares + "\n" +
                "Cotação do dólar R$: " + valorCotacaoDolar  + "\n" +
                "Conversão em reais: " + conversaoReais();
    }
}
