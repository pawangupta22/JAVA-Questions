// monotonic - increasing or decresing
public class Binary_search {

    public static int search(int arr[], int key){
        int start = 0;
        int end = arr.length-1;

        while (start<=end) { // index
            int mid = (start + end)/2;
            if( arr[mid] == key){
                return mid; 
            }
            if(arr[mid]>key){ 
                end = mid-1;
            }

            else{
                start = mid+1;
            }
        }
        return -1  ;
    }

    public static void main (String[] args) {
        int arr[]={10,20,30,40,50};
        int key = 90;
        int result = search(arr,key);
        System.out.print("Index for key = "+result);

        
    }
    
}
