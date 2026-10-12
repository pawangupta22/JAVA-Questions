
public class primenum {

    public static void prime( int num){
        if(num==1){
            System.out.print("number is prime");
        }
        for(int i=2; i<num; i++){
            if(num%i==0){
                System.out.print("Numer is not a prime");
                break;
            }
            else{
                System.out.print("Number is prime");
            }

        }

    }
    public static void main(String[] arg){
        int number = 5;
        prime(number);

    }

}
