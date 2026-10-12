public class majority_opti {

    public static int majority (int arr[]){
    int candidate = 0;
    int count = 0;

    for ( int i=0; i<arr.length; i++){
        if(count == 0){
            candidate = arr[i];
        }
        if(candidate == arr[i]){
            count++;
        }
        else count--;
    }
    return candidate;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 1, 3, 5};
        int result =  majority(arr);
        System.out.print("Majority element is :"+ result);
    }
}
