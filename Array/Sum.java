public class Sum {

    public static int sum_array(int arr[]){
        int sum =0;
        for(int i =0; i<arr.length; i++){
            sum = sum + arr[i];
        }

        return sum;
    }

    public static void main ( String[] arg){
        int arr[] = {10,20,30,40,50};
        
        int result = sum_array(arr);
        System.out.print("sum ="+result);


    }
    
}
h