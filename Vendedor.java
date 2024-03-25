public class Vendedor {

    // propriedades
    public String nome;
    public double salarioFixo;
    public double totalVendas;

    //metodos
    public double comissao(){
        return totalVendas * 0.15;
    }

    public String toString(){
        return "Nome: " + nome + "\n" +
                "Salário fixo: " + salarioFixo + "\n" +
                "Salário total: " + (comissao() + salarioFixo);
    }
}

