import java.util.Scanner;
public class Search {

    public static int searching(int x, int arr[]){
     for (int i=0; i<arr.length; i++){
        if(arr[i]==x){
            return i;
        }
     }
     return -1;
        
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array :");
        int num = sc.nextInt();


        int arr[] = new int[num]; // imp
        
        System.out.println("Enter 5 elements :");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Arry Elements");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        
        
        System.out.print("Enter the value of x :");
        int x = sc.nextInt();

        
        
       int result = searching(x,arr);
       System.out.print("Index:"+result);
    }
       

}
