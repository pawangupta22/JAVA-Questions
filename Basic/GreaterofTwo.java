import java.util.Scanner;
public class GreaterofTwo{
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :");
        float a = sc.nextFloat();
        System.out.print("Enter second number :");
        float b = sc.nextFloat();
        if(a>b){
            System.out.println(a + " is greater");
        }
        else{
            System.out.println(b + " is grater");
        }
        sc.close();
    }
}