public class Aluno {

    //propriedades

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    //metodos - comportamentos

    public double calcularMedia(){
        return (nota1 + nota2 + nota3) / 3;
    }
    public String toString(){
        return "Nome: " + nome + "\n" + 
        "Média: " + (nota1 + nota2 + nota3) / 3;
    }

}


