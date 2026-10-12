//logic - number ka square less than the  
public class perfactsquare {

    public static void perfact(int num){ // method
        for(int i=1; i<=num; i++){
            int m= i*i;
            if(m<=num){
                System.out.print(m+" ");
            }
        }
    }

    public static void main(String[] args) {
        int number = 10;
        perfact(number);
        
    }
}