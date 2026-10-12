public class inverted_star {
    public static void main(String[] arg) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <=4-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

/*


****    n-1+1 star printed in first row n-(i-1)
***     n-2+1 
**
*



*/