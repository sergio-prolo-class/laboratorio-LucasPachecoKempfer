package aulaEstruturaDeDecisao;

import java.util.Scanner;

public class Sobrepeso {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double peso = sc.nextDouble();
        double altura = sc.nextDouble();
        double imc = peso / altura * altura;

        if (peso >= 0 || altura >= 0){
            if (imc >= 30) {
                System.out.println("Obesidade");
            } else if (imc >= 25 && imc <= 29.9){
                System.out.println("Sobrepeso");
            } else if (imc >= 18.5 && imc >= 24.9){
                System.out.println("Peso normal");
            } else {
                System.out.println("Abaixo do peso");
            }
        }
        
        sc.close();

    }

}
