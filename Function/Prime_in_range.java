import java.util.*;
public class Prime_in_range {

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

    public static void prime_in_range(int n){
        for(int i=2; i<=n; i++){
            if(isprime(i)){
                System.out.print(i);
                System.out.print(" ");
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range from 2 to n :");
        int num = sc.nextInt();

        prime_in_range(num);
        
    }
}