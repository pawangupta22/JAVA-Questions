import java .util.Scanner;
public class firstdigit {

    public static int digit( int num){
        while(num>10){
            num = num/10;
        }
        return num;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int result = digit(n);
        System.out.print(result);
    }
}
