import java.io.IOException;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int T = sc.nextInt(), i = 0, I, prev = 0, next = 0, aux = 0;
            while (i != T) {
                I = sc.nextInt();

                for (int x = 1; x < I; x++) {
                    prev = x;
                    next = prev;
                    aux = next;
                }
                System.out.println("Fib(" + I + ") = " + aux);
                i++;
            }

        } catch (NumberFormatException e){
            System.out.println("Enter a valid input");
        }
    }
}
