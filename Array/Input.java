import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // sc ke place pr kuch 
        System.out.print("Enter the size of Array :");
        int num = sc.nextInt(); //call
        int arr[] = new int[num]; // imp
        
        System.out.println("Enter 5 elements :");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Arry Elements");
        for(int i=0; i<5; i++){
            System.out.println(arr[i]);
        }
        
    }
}













// arr[0] = sc.nextInt();