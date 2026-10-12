import java.util.Scanner;
public class starprint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of elements :");
        int num = sc.nextInt();

        int arr[] = new int[num];
        System.out.print("Enter all elements :");
        for(int i=0; i<arr.length; i++){
        arr[i]=sc.nextInt();
        } 

        int max= arr[0];
        for(int i=0; i<arr.length; i++){
            if(max<=arr[i]){
                max=arr[i];
            }
        } 

        for(int i=max; i>0; i--){
            for(int j=0; j<num; j++){
                if(arr[j]<i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
                
            }
              System.out.println();
        }
    }
}