package lista7;

import java.util.Scanner;

public class lista7exercicio2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int senha = 314159;

        System.out.print("Entre com a senha: ");
        int tentativa = sc.nextInt();
        do {
            System.out.println("Acesso negado (senha incorreta)");
            System.out.print("Entre com a senha: ");
            tentativa = sc.nextInt();
        } while (senha != tentativa);

        System.out.println("Acesso autorizado");



        sc.close();

    }
    
}
