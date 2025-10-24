package lista6;

import java.util.Scanner;

public class lista6exercicio5 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com um número inteiro de 1 a 99: ");
        int num = sc.nextInt();

        if (num < 1 || num > 99) {
            System.out.println("Número fora do intervalo!");
        } else {
            String extenso = "";

            if (num <= 19) {
                switch (num) {
                    case 1: extenso = "um"; break;
                    case 2: extenso = "dois"; break;
                    case 3: extenso = "três"; break;
                    case 4: extenso = "quatro"; break;
                    case 5: extenso = "cinco"; break;
                    case 6: extenso = "seis"; break;
                    case 7: extenso = "sete"; break;
                    case 8: extenso = "oito"; break;
                    case 9: extenso = "nove"; break;
                    case 10: extenso = "dez"; break;
                    case 11: extenso = "onze"; break;
                    case 12: extenso = "doze"; break;
                    case 13: extenso = "treze"; break;
                    case 14: extenso = "quatorze"; break;
                    case 15: extenso = "quinze"; break;
                    case 16: extenso = "dezesseis"; break;
                    case 17: extenso = "dezessete"; break;
                    case 18: extenso = "dezoito"; break;
                    case 19: extenso = "dezenove"; break;
                }
            } else {
                int dezenas = num / 10;
                int unidades = num % 10;

                switch (dezenas) {
                    case 2: extenso = "vinte"; break;
                    case 3: extenso = "trinta"; break;
                    case 4: extenso = "quarenta"; break;
                    case 5: extenso = "cinquenta"; break;
                    case 6: extenso = "sessenta"; break;
                    case 7: extenso = "setenta"; break;
                    case 8: extenso = "oitenta"; break;
                    case 9: extenso = "noventa"; break;
                }

                if (unidades != 0) {
                    extenso += " e ";
                    switch (unidades) {
                        case 1: extenso += "um"; break;
                        case 2: extenso += "dois"; break;
                        case 3: extenso += "três"; break;
                        case 4: extenso += "quatro"; break;
                        case 5: extenso += "cinco"; break;
                        case 6: extenso += "seis"; break;
                        case 7: extenso += "sete"; break;
                        case 8: extenso += "oito"; break;
                        case 9: extenso += "nove"; break;
                    }
                }
            }

            System.out.println("Número por extenso: " + extenso);
        }

        sc.close();

    }

}
