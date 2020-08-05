// URI Online Judge | 1071

import java.io.IOException;
import java.util.Scanner;

public class SumConsecutiveOddNumbers {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int sumOdd = 0;
        
        if (firstNumber > secondNumber) {
            for (int i = secondNumber+1; i < firstNumber; i++)
                if (i % 2 != 0)
                    sumOdd += i;
            System.out.println(sumOdd);
        } else {
            for (int i = firstNumber+1; i < secondNumber; i++)
                if (i % 2 != 0)
                    sumOdd += i;
            System.out.println(sumOdd);
        }
        input.close();
    }
}