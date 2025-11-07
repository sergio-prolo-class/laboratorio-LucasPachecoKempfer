package lista8;

import java.util.Scanner;

public class lista8exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroAlunos;
        do {
            System.out.print("Entre com o número de alunos: ");
            numeroAlunos = sc.nextInt();
        } while (numeroAlunos < 1);

        double somaMedias = 0;

        for (int i = 1; i <= numeroAlunos; i++) {
            double somaNotas = 0;

            System.out.println("Entre com as notas das provas do aluno " + i + ": ");
            for (int j = 1; j <= 3; j++) {
                somaNotas += lerNotaValida(sc, "Nota " + j + ": ");
            }

            System.out.println("Entre com as notas dos trabalhos do aluno " + i + ": ");
            for (int j = 1; j <= 3; j++) {
                somaNotas += lerNotaValida(sc, "Nota " + j + ": ");
            }

            double mediaAluno = mediaAluno(somaNotas);
            somaMedias += mediaAluno;

            System.out.println("Média final do aluno " + i + ": " + formatar(mediaAluno));
        }

        double mediaDisciplina = somaMedias / numeroAlunos;
        System.out.println("Média da disciplina: " + formatar(mediaDisciplina));

        sc.close();
    }

    // Calcula média de um aluno
    public static double mediaAluno(double somaNotas) {
        return somaNotas / 6.0;
    }

    // Lê nota válida (0 a 10)
    public static double lerNotaValida(Scanner sc, String mensagem) {
        double nota;
        do {
            System.out.print(mensagem);
            nota = sc.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
            }
        } while (nota < 0 || nota > 10);
        return nota;
    }

    // Formata número com vírgula e duas casas
    public static String formatar(double valor) {
        return String.format("%.2f", valor).replace('.', ',');
    }
}
