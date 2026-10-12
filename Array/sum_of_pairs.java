public class sum_of_pairs {

    public static void sum(int arr[], int num){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==num){
                System.out.print("("+i+","+(j)+")");

            }
        
            }

        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        sum(arr, 14);
        
    }

    

}

