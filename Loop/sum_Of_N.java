
// Sum Of N Natural Number

import java.util.Scanner;
public class sum_Of_N {
    public static void main (String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enetr The Value Of N : ");
        int N = sc.nextInt();

        int sum = 0;
        int i=1;
        while(i<=N){
            sum = sum +i;
            i++;
        }
        
        System.out.print("sum = "+sum);
        sc.close();

    }
    
}
