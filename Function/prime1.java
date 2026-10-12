import java.util.*;
public class prime1 {

    public static boolean isprime(int n){
        if(n==2){
            return true;
        }
        
        boolean isprime = true;
        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                isprime=false;
            }
        }
        return isprime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you want to check :");
        int num = sc.nextInt();

        boolean prime = isprime(num);
        System.out.println(prime);
        
    }
}
