import java.io.IOException;
import java.util.Scanner;

public class Uri1181 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double M[][] = new double[12][12];
        double result=0;
        int L = input.nextInt();
        char C = input.next().toUpperCase().charAt(0);

        for(int i=0; i < 12; i++) 
            for (int j = 0; j < 12; j++)
                M[i][j] = input.nextDouble();
        
        for(int j=0; j < 12; j++)
            result += M[L][j];
        
        if(C == 'M')
            result /= 12;
        System.out.printf("%.1f\n",result);
    }
}

