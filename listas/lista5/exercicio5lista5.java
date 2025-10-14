package lista5;

import java.util.Scanner;

public class exercicio5lista5 {  
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com a primeira parte (1 dígito): ");
        int primeiraParte = sc.nextInt();

        System.out.print("Entre com a segunda parte (6 dígitos): ");
        int segundaParte = sc.nextInt();

        System.out.print("Entre com a terceira parte, sem o dígito verificador (5 dígitos): ");
        int terceiraParte = sc.nextInt();

        long codigo = primeiraParte * 1_000_000_00000L + segundaParte * 100_000L + terceiraParte;

        int d1 = (int)(codigo / 100000000000L % 10);
        int d2 = (int)(codigo / 10000000000L % 10);
        int d3 = (int)(codigo / 1000000000L % 10);
        int d4 = (int)(codigo / 100000000L % 10);
        int d5 = (int)(codigo / 10000000L % 10);
        int d6 = (int)(codigo / 1000000L % 10);
        int d7 = (int)(codigo / 100000L % 10);
        int d8 = (int)(codigo / 10000L % 10);
        int d9 = (int)(codigo / 1000L % 10);
        int d10 = (int)(codigo / 100L % 10);
        int d11 = (int)(codigo / 10L % 10);
        int d12 = (int)(codigo % 10);
 
        int somaImpares = d1 + d3 + d5 + d7 + d9 + d11;
        int somaPares = d2 + d4 + d6 + d8 + d10 + d12;
        int total = somaImpares + somaPares * 3;
        int digito = (10 - (total % 10)) % 10;

        System.out.println("Dígito verificador: " + digito);

        sc.close();
    }

}
