
// First Peak element of array

public class Peak_element {

    public static int peak(int arr[]) {
        if (arr[0] > arr[1]) {
                return arr[0];
            }
        for (int i = 0; i < arr.length - 1; i++) { 

            if (arr[i + 1] > arr[i] && arr[i + 1] > arr[i + 2]) {
                return arr[i + 1];
            }

           
        }
         if( arr[arr.length-1]>arr[arr.length-2]){
                return arr[arr.length-1];
            }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 7, -8, 3 };
        int result = peak(arr);
        System.out.print(result);

    }
}
