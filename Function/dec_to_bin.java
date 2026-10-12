//solve a qus on paper to unnderstand the logic 
import java.util.*;
public class dec_to_bin {

    public static void binary(int num){
        int bin=0;
        int power=0;

        while (num>0) {
        int rem = num%2;
            bin = bin + rem * (int) Math.pow(10,power);
            power++;
            num = num/2;   // imp
        }

        System.out.print("Binary number is :"+bin);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal Number :");
        int dec = sc.nextInt();

        binary(dec);
        
    }
    
}
