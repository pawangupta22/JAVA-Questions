public class LinearSearch {

    public static int linear(int arr[],int key ){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {10,20,30,40,50};
        int key = 40;
        int result = linear(number,key);

        if(result==-1){
            System.out.print("Key not found!");
        }
        else{
            System.out.print("Key is present at index : "+result);
        }
        
    }
}
