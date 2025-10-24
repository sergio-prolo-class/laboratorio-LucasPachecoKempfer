package lista7;

import java.util.Scanner;

public class lista7exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o número de linhas: ");
        int n = sc.nextInt();
        int cont = 1;

        for (int i = 1; i <= n; i++) { // passa da linha um até a linha n
            for (int j = 0; j < i; j++) { // aqui o j vai de 0 até a linha do 
                System.out.print(cont + " "); // printa o contador e seu espaço  
                cont++; // incrementa apenas
            }
            System.out.println(); // pula a linha 
        }


        sc.close();

    }

}
