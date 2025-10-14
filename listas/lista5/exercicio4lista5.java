package lista5;

import java.util.Scanner;

public class exercicio4lista5 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o ano: ");
        int year = sc.nextInt();

        System.out.printf("%s%n", year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)? "É bissexto" : "Não é bissexto" );


        sc.close();

    }

}
