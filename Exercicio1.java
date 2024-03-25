public class Exercicio1 {
    public static void executar(){
        /*Escrever um programa que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
        No final informar o nome do aluno e a sua média (aritmética). */

        Aluno objAluno = new Aluno();

        objAluno.nome = Prompt.lerLinha("Digite o nome do aluno: ");

        objAluno.nota1 = Prompt.lerDecimal("Digite a nota da 1° prova: ");
        objAluno.nota2 = Prompt.lerDecimal("Digite a nota da 2° prova: ");
        objAluno.nota3 = Prompt.lerDecimal("Digite a nota da 3° prova: ");

        Prompt.imprimir(objAluno.toString());    
    }
}
