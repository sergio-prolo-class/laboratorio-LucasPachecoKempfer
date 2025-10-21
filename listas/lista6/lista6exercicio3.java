package lista6;

import java.util.Scanner;

public class lista6exercicio3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o valor do ângulo em graus: ");
        double graus = sc.nextDouble();

        double senoAprox;

        if (graus >= 0 && graus <= 180) {
            senoAprox = (4 * graus * (180 - graus)) / (40500 - graus * (180 - graus));
        } else if (graus > 180 && graus <= 360) {
            double x = 360 - graus;
            senoAprox = - (4 * x * (180 - x)) / (40500 - x * (180 - x));
        } else {
            System.out.println("Ângulo fora do intervalo 0° a 360°");
            sc.close();
            return;
        }

        double radianos = graus * Math.PI / 180;

        System.out.printf("Valor aproximado do seno: %.4f%n", senoAprox);
        System.out.printf("Valor real do seno: %.4f%n", Math.sin(radianos));

        sc.close();

    }
}
