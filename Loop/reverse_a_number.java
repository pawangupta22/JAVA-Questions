/* logic : first find the last digit 
[rev = rev*10+last_digit] then remove the last digit */ 

import java.util.Scanner;
public class reverse_a_number {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you wants to reverse : ");
        int num = sc.nextInt();

        int reverse = 0;
        
    while(num!=0){   // n>0
        int last_digit = num%10;
        reverse = (reverse * 10 + last_digit);
        num=num/10;
    }
    System.out.print("Reversed number is : "+reverse); // remember concatination

    sc.close();
    }
}
