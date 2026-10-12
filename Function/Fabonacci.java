public class Fabonacci {

    public static int fabn(int num) {
        int first = 0;
        int second = 1;

        for (int i = 0; i < num; i++) {
            int third = first + second;
            first = second;
            second = third;
        }

        return first;
    }

    public static void main(String[] args) {
        int number = 6;
        int result = fabn(number);
        System.out.print(result);
    }
}