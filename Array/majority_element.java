public class majority_element {

    public static int majority(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > arr.length/2) {
                return arr[i];
            }
        }return -1;

    }


    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 1, 3, 5, 1 };
        int result =  majority(arr);
        System.out.print("Majority element is :"+ result);

    }

}