public class sum_of_natural_num_cube {

    public static int cube(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + (i * i * i); //Math.pow(n,3)
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 5;
        int result = cube(number);
        System.out.print(result);

    }
}
//series ka sum than find sum and than square of the nuumber
