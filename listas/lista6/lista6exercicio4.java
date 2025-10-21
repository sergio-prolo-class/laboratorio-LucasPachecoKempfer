package lista6;

import java.util.Scanner;

public class lista6exercicio4 {
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Entre com o valor negociado: ");
        double valorNegociado = sc.nextDouble();
        double comissao;

        if (valorNegociado >= 0 && valorNegociado < 2500) {
            comissao = 30 + (valorNegociado * 0.017);
            if (comissao < 39) {
                comissao = 39;
            }
        } else if (valorNegociado >= 2500 && valorNegociado < 6500){
            comissao = 56 + (valorNegociado * 0.0066);
        } else if (valorNegociado >= 6500 && valorNegociado < 20000){
            comissao = 76 + (valorNegociado * 0.0034);
        } else if (valorNegociado >= 20000 && valorNegociado < 50000){
            comissao = 100 + (valorNegociado * 0.0022);
        } else if (valorNegociado >= 50000 && valorNegociado < 500000){
            comissao = 155 + (valorNegociado * 0.0011);
        } else {
            comissao = 255 + (valorNegociado * 0.0009);
        }

        System.out.printf("Taxa de corretagem: $%.2f%n", comissao);


        sc.close();

    }

}
