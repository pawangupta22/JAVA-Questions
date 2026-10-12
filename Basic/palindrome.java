import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();
        int reverse = 0;
        while (num != 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;              
            num = num / 10;
        }

        if( num == reverse){
            System.out.print("Number is a palindrome");
        }
        else{
            System.out.print("Number is not a palindrome");
        }
    }
    

}
