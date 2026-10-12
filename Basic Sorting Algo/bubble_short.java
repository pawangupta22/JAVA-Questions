public class bubble_short {

    public static void shorting(int arr[]){
        boolean isSorted = true; //array is alredy sorted
        for(int i=0; i<arr.length-1; i++){
            
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    isSorted = false;  // if swaping happned 
                }
                if(isSorted)  // means jo phle define kiy ho wo, yeha pr true 
                     break;
            }

    }
    System.out.print("Sorted Array is ");
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
    }
    }

    public static void main(String[] args){
        int arr[]= {1,2,3,4,5};
        shorting(arr);
    }
}
