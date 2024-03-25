public class Exercicio6 {
    public static void executar(){
        /*Faça um programa que receba o preço de custo de um produto e mostre o valor de venda.
        Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário. */

        Venda06 venda = new Venda06();

        venda.precoCusto = Prompt.lerDecimal("Digite o preço de custo: ");
        venda.percentualAcrescimo = Prompt.lerDecimal("Digite o percentual de acrecimo (x.xx): ");

        Prompt.linhaEmBranco();
        Prompt.separador();
        Prompt.linhaEmBranco();

        Prompt.imprimir(venda.toString());


    }
}
