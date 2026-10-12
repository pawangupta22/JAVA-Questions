import java.util.Scanner;
public class cancatinate_array {

    public static void concatinate(int arr1[], int arr2[]){
        
        int arr3[] = new int [arr1.length + arr2.length];
        for(int i = 0; i<arr1.length; i++){
            arr3[i] = arr1[i];
        }

        for(int i = 0; i<arr2.length; i++){
            arr3[i+arr1.length] = arr2[i];
        }

        System.out.print("Final array is :");
        for ( int i=0; i<arr3.length; i++){
            System.out.print(arr3[i]+" ");
        }




    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter size of 1st array:");
    int a= sc.nextInt();

    int x[] = new int[a];
    System.out.print("Enter all element of 1st array:");
    for(int i=0; i<x.length; i++){
        x[i] = sc.nextInt();
    }

    System.out.print("Enter size of 2nd array:");
    int b= sc.nextInt();

    int y[] = new int[b];
    System.out.print("Enter element of 2nd array:");
    for(int i=0; i<y.length; i++){
        y[i] = sc.nextInt();
    }

    concatinate(x,y);
    
    sc.close();
    }
}
