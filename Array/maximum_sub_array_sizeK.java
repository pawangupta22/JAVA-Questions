public class maximum_sub_array_sizeK {
    public static void sum(int arr[], int k){
        int maxSum = 0;
        for(int i=0; i<arr.length; i++){
            int start=i;
            for(int j=i; j<arr.length; j++){
                int end=j;
                if(end-start+1 == k){
                    int sum = 0;
                    for(int x=start; x<=end; x++){
                        System.out.print(arr[x]+" ");
                        sum += arr[x];
                    }
                    System.out.println(" = " + sum);
                    if(sum > maxSum){
                        maxSum = sum;
                    }
                }
            }

            System.out.println();
        }
        System.out.println("Maximum Sum = " + maxSum);
    }
    public static void main(String[] args) {

        int arr[]= {2,4,6,8,10,12,5};

        sum(arr, 6);
    }
} 

