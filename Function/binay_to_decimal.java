import java.util.*;
public class binay_to_decimal {

    public static void bin_dec(int num){
        int sum=0;
        int power=0;

        while (num > 0) {
            int last_digit = num % 10;
            sum = sum + (int) Math.pow(2, power) * last_digit;
            power++;
            num = num / 10;
        }

        System.out.print("Decimal no. = "+sum);

    }





    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter binay number :");
        int bin = sc.nextInt();

        bin_dec(bin);
    }
    
}
