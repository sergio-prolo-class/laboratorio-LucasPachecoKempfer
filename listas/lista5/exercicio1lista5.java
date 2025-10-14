package lista5;

import java.util.Scanner;

public class exercicio1lista5 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da temperatura em Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("Temperatura em Celsius: %.3f%n", celsius);        

        sc.close();

    }

}
