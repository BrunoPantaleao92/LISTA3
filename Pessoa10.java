public class Pessoa10 {
    public int qtdPessoas;
    public int idade;

    public String checarIdade(){
        if(idade >= 18){
            return "Maior de idade";
        }
        else{
            return "Menor de idade";
        }
    }
}