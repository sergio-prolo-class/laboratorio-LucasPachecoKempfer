package lista7;

import java.util.Scanner;

public class lista7exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes, primeiroDia, dias = 0;

        do {
            System.out.print("Entre com o número do mês: ");
            mes = sc.nextInt();
            switch (mes) {
                case 1, 3, 5, 7, 8, 10, 12 -> dias = 31;
                case 4, 6, 9, 11 -> dias = 30;
                case 2 -> dias = 28;
                default -> System.out.println("Entre com o número do mês: ");
            }
        } while (mes < 1 || mes > 12);

        do {
            System.out.print("Entre com o primeiro dia da semana: ");
            primeiroDia = sc.nextInt();
        } while (primeiroDia < 1 || primeiroDia > 7);

        System.out.println();
        System.out.println("D S T Q Q S S");

        for (int i = 1; i < primeiroDia; i++) {
            System.out.print("   ");
        }

        for (int dia = 1; dia <= dias; dia++) {
            System.out.printf("%2d ", dia);
            if ((dia + primeiroDia - 1) % 7 == 0)
                System.out.println();
        }
        System.out.println();
        sc.close();
    }
}
