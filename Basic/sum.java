import java.util.*;

public class sum{
    public static void main(String[] arg){
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter your first number :");
        int a = sc.nextInt();
        System.out.print("Enter your Second number :");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
        sc.close();
    }
}