public class Automovel {

    //propriedades

    public double distância;
    public double combustivel;

    //metodos
    public double consumoMedio(){
        return distância/combustivel;
    }

    public String toString(){
        return "Consumo médio do carro: " + distância/combustivel + "Km/l";
    }
}
