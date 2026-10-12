public class Reverse {

    public static void reverse(int number[]){
        int start=0;
        int end = number.length-1;
        while(start < end){
            int temp = number[end];
            number[end] = number[start];
            number[start] = temp;

            start++;
            end--;

        }

    }

    public static void main(String[] args){
        int arr[]={2,4,6,8,10};
        reverse(arr);       
 
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");

        }
    }
    
}
