import java.io.IOException;
import java.util.Scanner;

public class EuclidesMDCRIterativo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("- Calcule o MDC de dois números - \nDigite o primeiro número:");
        int n1 = input.nextInt();

        System.out.printf("Digite o segundo número: ");
        int n2 = input.nextInt();
        int resto = 0;

        while(n2 != 0){
            resto = n1 % n2;
            n1 = n2;
            n2 = resto;
        }

        System.out.println("O MDC de " + n1 + " e " + n2 + " é: " + resto);
    }
}

