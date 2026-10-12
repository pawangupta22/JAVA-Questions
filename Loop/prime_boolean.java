import java.util.Scanner;
public class prime_boolean {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check prime or not: ");
        int n = sc.nextInt();

        boolean isprime =true;
        for(int i=2 ; i<=n-1; i++){
            if(n%i==0){
                isprime=false;
                break;
            }
        }

        if(isprime == true){                               //if (isprime) {
            System.out.print(n+" is a prime ");
        }
        else{
            System.out.print(n+" is not a prime");
        }

        sc.close();
    } 

}

