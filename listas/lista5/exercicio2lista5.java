package lista5;

import java.util.Scanner;

public class exercicio2lista5 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite as notas do aluno: ");
        double media = (sc.nextDouble() + sc.nextDouble() + sc.nextDouble() + sc.nextDouble()) / 4;

        System.out.print("Digite a presenca do aluno: ");
        int presenca = sc.nextInt();

        System.out.printf("Média: %.1f -- %s%n", media, media >= 6 && presenca >= 75? "Aprovado" : "Reprovado");



        sc.close();

    }
    
}
