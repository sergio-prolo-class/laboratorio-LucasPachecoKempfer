package aulasIntrodutorias;
import java.util.Scanner;

public class Caixas {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com a altura (m): ");
        double altura = sc.nextDouble();

        System.out.print("Entre com a largura (m): ");
        double largura = sc.nextDouble();

        System.out.print("Entre com a profundidade (m): ");
        double profundidade = sc.nextDouble();

        double area = 2 * (altura * largura + altura * profundidade + largura * profundidade);
        double volume = altura * largura * profundidade;

        System.out.printf("A área é %.2f e o volume é %.3f m3%n", area, volume);

        System.out.print("Entre com a quantidade produzida: ");
        int quantidade = sc.nextInt();

        System.out.print("Entre com o custo por m2: ");
        double custom2 = sc.nextDouble();

        double custoTotal = quantidade * custom2 * area;

        System.out.printf("O custo total de produção é: %.2f%n", custoTotal);

        sc.close();

    }
    
}
