import java.util.Scanner;
public class product_of_ab{
    
    public static int multiply(int a,int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :");
        int x = sc.nextInt();
        System.out.print("Enter b :");
        int y = sc.nextInt();

        int prod = multiply(x,y); // call
        System.out.println("a*b = "+prod);
 
    }
}