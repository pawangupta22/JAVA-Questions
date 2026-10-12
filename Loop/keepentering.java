import java.util.Scanner;
public class keepentering {
    public static void main (String[] arg){
        Scanner sc = new Scanner(System.in);
        
        int n=1;      // only int n; wrong, To calculate %, Java needs a number - now loop started
        while(n%10!=0){
            System.out.print("Enter a number :");
            n = sc.nextInt();
        }
        System.out.print("You entered a number which is the multiple of 10 !");

        sc.close();
    }
    
}
