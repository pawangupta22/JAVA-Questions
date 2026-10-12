public class Replace{

    public static int replace(int num){
        int reverse = 0;
          while (num != 0) {
            int rem = num % 10;
            if(rem==0){
                rem=5;
            } 
            reverse = reverse * 10 + rem;
            num = num / 10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        int number = 1004;
        int result = replace(number);

        int result2 = replace(result);
        System.out.print(result2);

    }
}
