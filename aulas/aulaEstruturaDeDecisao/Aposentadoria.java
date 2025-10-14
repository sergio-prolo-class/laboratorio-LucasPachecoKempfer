package aulaEstruturaDeDecisao;
import java.util.Scanner;

public class Aposentadoria {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int t = sc.nextInt();

        if (i >= 65 || t >= 30 || (i >= 60 && t >= 25)){
            System.out.println("Pode");
        } else {
            System.out.println("Não pode");
        }


        sc.close();

    }

}
