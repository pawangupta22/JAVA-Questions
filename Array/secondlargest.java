import java.util.Arrays;

public class secondlargest {

    public static int secLargest(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-2];
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,11,8,3,7};
        int result = secLargest(arr);
        System.out.print(result);

    }

    
    
}
