package lista6;

import java.util.Scanner;

public class lista6exercicio1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o total de vendas (R$) : ");
        double totalVendas = sc.nextDouble(); 
        System.out.print("Entre com a avaliação de desempenho (1-10): ");
        int avaliacao = sc.nextInt();

        double remuneracao = 2000;
        
        if (totalVendas >= 0) {
            if (totalVendas >= 10000) {
                remuneracao = 2000 + (totalVendas * 0.07);
            } else {
                remuneracao = 2000 + (totalVendas * 0.05);
            }

            if (avaliacao >= 8) {
                remuneracao += 500;
            }
            
            System.out.printf("Remuneração: R$ %.2f%n", remuneracao);
        } else {
            System.out.println("Erro: Remuneração negativa");
        }
        

        sc.close();

    }

}
