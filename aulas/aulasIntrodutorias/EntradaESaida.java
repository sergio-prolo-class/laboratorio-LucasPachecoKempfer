package aulasIntrodutorias;
import java.util.Scanner;

public class EntradaESaida {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite algo: ");
        String entrada = sc.nextLine();

        System.out.println("Você digitou: " + entrada);





        sc.close();
    }

}
