package lista6;

import java.util.Scanner;

public class lista6exercicio2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com os lados do triângulo: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if ((a + b) > c && (c + a) > b && (b + c) > a) {
            if (a == b && b == c && a == c) {
                System.out.println("Triângulo equilátero");
            } else if (a != b && a != c && b != c){
                System.out.println("Triângulo escaleno");
            } else {
                System.out.println("Triângulo isósceles");
            }
        } else {
            System.out.println("Triângulo inválido");
        }



        sc.close();

    }

}
