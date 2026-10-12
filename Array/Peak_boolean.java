
// First Peak element of array

public class Peak_boolean {

    public static boolean peak(int arr[]) {
        if (arr[0] > arr[1]) {
            return true;
        }
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i + 1] > arr[i] && arr[i + 1] > arr[i + 2]) {
                return true;
            }
        }
        if (arr[arr.length - 1] > arr[arr.length - 2]) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 3, -8, 3 };
        boolean result = peak(arr);
        System.out.print(result);

    }
}
