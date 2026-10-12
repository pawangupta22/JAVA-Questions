import java.util.*;
public class largest_no {

    public static int getlargest(int number[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++){
            if(number[i]>largest){
                largest=number[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int number[] = {10,11,5,6,9,15,20};
        int result = getlargest(number);
        System.out.print("Largest no: "+ result);

    }
    
}
