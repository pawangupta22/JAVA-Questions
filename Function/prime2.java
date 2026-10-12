import java.util.*;
public class prime2 {

    public static boolean prime(int n){
        if(n<2){
            return false;
        }

       for(int i=2; i<Math.sqrt(n); i++){
        if(n%i==0){
            return false;
        }
       }
       return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number you want to check :");
        int num = sc.nextInt();
        
        boolean result = prime(num);
        System.out.print(result);
    }
}
