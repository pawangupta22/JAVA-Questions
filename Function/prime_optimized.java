import java.util.*;
public class prime_optimized {

    public static boolean isprime(int n){
        if(n==2){
            return true;
        }
        
        for(int i=2; i<=Math.sqrt(n); i++){              // important
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you want to check :");
        int num = sc.nextInt();

        boolean prime = isprime(num);
        System.out.println(prime);
        
    }
}


