/*  else runs only when the current if is false.
    It does not check all iterations of the loop.

    for (int i = 2; i < n; i++) {
    if (n % i == 0) {
        System.out.println("Not Prime");
        break;
    } else {
        System.out.println("Prime");
    }


        Take n = 9.

        i = 2
        9 % 2 != 0

        The else runs immediately and prints:

        Prime

        But the next iteration is:

        i = 3
        9 % 3 == 0

        Now it prints:

        Not Prime

 */

import java.util.Scanner;

public class Prime_num {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check prime or not: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println(n + " is not a prime number");
        } else {
            int i;

            for (i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not a prime number");
                    break;
                }
            }

            if (i == n) {  // The loop body does not run when i = n, but i does become n.
                System.out.println(n + " is a prime number");
            }
        }
        sc.close();
    }
}
