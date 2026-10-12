import java.util.Arrays;

public class majority_sort {

    public static int majority(int arr[]) {
        Arrays.sort(arr);
        int mid = arr.length/2;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
                if (arr[mid]==arr[i]){
                    count++;
                }
                if (count > arr.length/2) {
                return arr[mid];
            }

        }
    return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 1, 3, 5};
        int result =  majority(arr);
        System.out.print("Majority element is :"+ result);

    }
}
