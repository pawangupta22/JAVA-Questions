import java.util.*;
public class SumOFNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter integer value x :");
        int x = sc.nextInt();

        System.out.print("enter float value y :");
        float y = sc.nextFloat();

        double sum =(short)(x+y);
        // short k = (short)sum;
        System.out.println("Sum ="+sum);

        float sum2 = (byte)(x+y);
         System.out.print("Sum ="+sum2);


        sc.close();
    }
}

/* byte -> short -> int -> long -> float -> double */