
// Print 1 to N

import java.util.Scanner;
public class whileloop1toN{
    public static void main(String[] arg){

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Value Of N :");
    int N = sc.nextInt();
    
    int i=1;
    while(i<=N){
        System.out.println(i);
        i++;
    }

    sc.close();
    }
}