import java.io.IOException;
import java.util.Scanner;

public class EuclidesMDCRecursivo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.printf("- Calcule o MDC de dois números - \nDigite o primeiro número:");
        int n1 = input.nextInt();

        System.out.printf("Digite o segundo número: ");
        int n2 = input.nextInt();

        System.out.println("O MDC de " + n1 + " e " + n2 + " é: " + euclidesAlgoritmo(n1,n2));
    }

    public static int euclidesAlgoritmo(int n1, int n2){
        if (n2 == 0)
            return n1;
        else
            return euclidesAlgoritmo(n2, n1 % n2);
    }
}



