// URI Online Judge | 2160
import java.io.IOException;
import java.util.Scanner;

class NameAtForm{
    public static void main(String args[]) throws IOException{
        Scanner input = new Scanner(System.in);

        String textLine = input.nextLine();
        
        if (textLine.length() > 80)
            System.out.println("NO");
            else
            System.out.println("YES");
        
        input.close();
    }
}