import java.util.Scanner;
public class incometex {

    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Income :");
        int a= sc.nextInt();
        if(a<=500000){
            System.out.print("No Tex");
        }
        else if(a>=500000 && a<=1000000){
            System.out.print("Tex is = " +a*0.2);   
        } 
        else {
            System.out.print("Tex is ="+a*0.3);
        }
        sc.close();
    }
}