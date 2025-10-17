package aulaEstruturaDeDecisao;

import java.util.Scanner;

public class ExpressaoAritmetica {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double primeiroNumero = sc.nextDouble();
        char operacao = sc.next().charAt(0);
        double segundoNumero = sc.nextDouble();

        switch (operacao) {
            case '+':
                System.out.println(primeiroNumero + segundoNumero);
                break;
            case '-':
                System.out.println(primeiroNumero - segundoNumero);
                break;
            case '*':
                System.out.println(primeiroNumero * segundoNumero);
                break;
            case '/':
                if (segundoNumero != 0) {
                    System.out.println(primeiroNumero / segundoNumero);
                } else {
                    System.out.println("Erro: divisão por zero");
                }
                break;
            default:
                System.out.println("Erro: operação inválida");
                break;
        }




        sc.close();
    }
}
