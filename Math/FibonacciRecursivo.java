import java.util.Scanner;

class FibonacciRecursivo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o n-esimo termo de fibonnaci: ");
        int fib = sc.nextInt();
        
        System.out.println("O " + fib + " termo de fibonaccié igual a: " + fibonnaciRecursivo(fib));
        sc.close();
    }

    private static int fibonnaciRecursivo(int n){
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonnaciRecursivo(n-1) + fibonnaciRecursivo(n-2);
    }
}
