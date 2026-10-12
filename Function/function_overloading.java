import java.util.*;
public class function_overloading {

    public static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }

    public static int sum(int a, int b, int c){
        int sum = a+b+c;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many number you want to add 2 or 3 :");
        int num = sc.nextInt();

        if(num==2){
            System.out.print("Enter 1st number :");
            int x = sc.nextInt();
            System.out.print("Enter 2st number :");
            int y = sc.nextInt();

            int result1 = sum(x,y);
            System.out.print("Sum = "+result1);

        }
        else{
            System.out.print("Enter 1st number :");
            int x = sc.nextInt();
            System.out.print("Enter 2st number :");
            int y = sc.nextInt();
            System.out.print("Enter 3st number :");
            int z = sc.nextInt();

            int result2 = sum(x,y,z);
            System.out.print("Sum = "+result2);

        }


    }
}
