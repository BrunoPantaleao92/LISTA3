public class Exercicio14 {
    public static void executar(){
        /* Faça um programa que receba
        o preço de custo
        e o preço de venda
        de 40 produtos.
        
        Mostre como resultado se houve lucro, prejuízo ou empate para cada produto.
        
        Informe média de preço de custo e do preço de venda.*/

        Produto14 produto = new Produto14();

        produto.calcularLucro();

        Prompt.imprimir(produto.toString());
    }
}
