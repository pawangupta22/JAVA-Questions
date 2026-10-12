public class bd {

    public static int binary(int num){
        int bin=0;
        int power=0;

        while (num>0) {
        int rem = num%10;
            bin = bin + rem * (int) Math.pow(2,power);
            power++;
            num = num/10;  
        }

       return bin;
    }

    
    public static void main(String[] args) {
       int result = binary(1111);
       System.out.print("Binary number is :"+result);
        
    }
}

