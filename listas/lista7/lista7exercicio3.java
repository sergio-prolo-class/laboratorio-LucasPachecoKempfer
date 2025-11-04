package lista7;

import java.util.Scanner;

public class lista7exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com a classe (1-Arqueiro, 2-Bárbaro, 3-Druida, 4-Mago): ");
        int classe = sc.nextInt();
        System.out.print("Entre com a vitalidade desejada: ");
        int vitalidade = sc.nextInt();

        int vitalidadeInicial = 0;
        int incNormal = 0;
        int incEspecial = 0;

        switch (classe) {
            case 1:
                vitalidadeInicial = 150;
                incNormal = 10;
                incEspecial = 20;
                break;
            case 2:
                vitalidadeInicial = 200;
                incNormal = 15;
                incEspecial = 30;
                break;
            case 3:
                vitalidadeInicial = 100;
                incNormal = 5;
                incEspecial = 10;
                break;
            case 4:
                vitalidadeInicial = 80;
                incNormal = 4;
                incEspecial = 8;
                break;
            default:
                System.out.println("Classe inválida!");
                sc.close();
                return;
        }

        int nivel = 0;

        while (vitalidade >= vitalidadeInicial) {
            if (nivel % 5 == 0) {
                vitalidadeInicial += incEspecial;
            } else {
                vitalidadeInicial += incNormal;
            }
            nivel++;
        }

        System.out.println("Nível necessário: " + nivel);
        sc.close();
    }
}
