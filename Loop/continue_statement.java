
// Display all number entered by user except multiple of 10

import java.util.Scanner;
public class continue_statement {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("Enter a new number :");
            int n = sc.nextInt();

            if (n%10 == 0) {
                continue;
            }
            System.out.println("Your number was : "+n);
        } while(true);
    
    }
     
}
