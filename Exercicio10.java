public class Exercicio10 {
    public static void executar(){

        /*Faça um programa que receba a idade de um número finito de pessoas e mostre mensagem informando “maior de idade” e “menor de idade” para cada pessoa. Considerar a pessoa com 18 anos como maior de idade. */

        int num = Prompt.lerInteiro("Digite a quantidade de pessoas a serem checadas: ");

        Pessoa10[] pessoa = new Pessoa10[num];
        
        for(int i = 0; i < num; i++){
            pessoa[i].idade = Prompt.lerInteiro("Digite a idade da " + (i + 1) + "ª pessoa: ");
        }

        for(int i = 0; i < num; i++){
            Prompt.imprimir(pessoa[i].checarIdade());
        }
        
    }
}
