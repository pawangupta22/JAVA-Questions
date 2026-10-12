import java.util.Scanner;
public class GreaterOf3 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter First Number :");
        float a= sc.nextFloat();
        System.out.print("Enter Second Number :");
        float b= sc.nextFloat();
        System.out.print("Enter Third Number :");
        float c= sc.nextFloat();

        if(a>=b && a>=c){
            System.out.print(a+" is Greater");
        }
        else if(b>=c){
            System.out.print(b+ " is Greater");
        }
        else{
            System.out.print(c+" is Greater");
        }
        sc.close();
    }
}
 