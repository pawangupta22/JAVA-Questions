import java.util.Scanner;
public class binomial{

    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;  
        }
    return f;
    }

    public static int binomialcoff(int n,int r){
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n-r);
        int binomialcoff = fact_n / (fact_r * fact_nmr);
        return binomialcoff;
    }
    public static void main (String[] arg){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter value of n :");
        int x = sc.nextInt();
        System.out.print("Enter value of r :");
        int y = sc.nextInt();


        int result = binomialcoff(x,y);
        System.out.print("Binomial cofficient of number is :"+result);

    }

}