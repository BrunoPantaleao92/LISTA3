public class Exercicio11 {
    public static void executar() {

        /*
         * Escrever um programa que leia o nome e o sexo de 56 pessoas e informe o nome
         * e se ela é homem ou mulher. No final informe total de homens e de mulheres.
         */
        Pessoa11 pessoa = new Pessoa11();
        int homens = 0;
        int mulheres = 0;

        for (int i = 0; i < 3; i++) {
            pessoa.nome = Prompt.lerLinha("Digite o nome: ");
            pessoa.sexo = Prompt.lerLinha("Digite o sexo (M / H): ");

            if (pessoa.sexo == "M" || pessoa.sexo == "m") {
                Prompt.imprimir(pessoa.nome);
                Prompt.imprimir("Mulher");
                mulheres++;
            }

            if (pessoa.sexo == "H" || pessoa.sexo == "h") {
                Prompt.imprimir(pessoa.nome);
                Prompt.imprimir("Homem");
                homens++;
            }
        }

        Prompt.imprimir("Total homens: " + homens + "\n");
        Prompt.imprimir("Total mulheres: " + mulheres);

    }
}
