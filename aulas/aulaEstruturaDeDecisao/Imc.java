package aulaEstruturaDeDecisao;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double peso = sc.nextDouble();
        double altura = sc.nextDouble();
        double imc = peso / altura * altura;

        if (peso >= 0 || altura >= 0){
            if (imc >= 30) {
                System.out.printf("%.3f, Obesidade", imc);
            } else if (imc >= 25 && imc <= 29.9){
                System.out.printf("%.3f, Sobrepeso", imc);
            } else if (imc >= 18.5 && imc >= 24.9){
                System.out.printf("%.3f, Peso normal", imc);
            } else {
                System.out.printf("%.3f, Abaixo do peso", imc);
            }
        }
        
        sc.close();

    }

}
