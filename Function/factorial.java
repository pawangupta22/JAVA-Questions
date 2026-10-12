import java.util.Scanner;
public class factorial {

    public static int fact(int a){
        int f=1;
        for(int i=1;i<=a;i++){
            f=f*i;  
        }
    return f;

    }
    public static void main (String[] arg){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number :");
        int x = sc.nextInt();

        int factorial_of_num = fact(x);
        System.out.print("Factorial of number is :"+factorial_of_num);

    }

}


