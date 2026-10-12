import java.util.Scanner;
public class switchstatement {
    public static void main (String[] arg){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 to 7 to Know DAY ! : ");
        int day = sc.nextInt();

        switch (day){
            case 1:System.out.print("Monday");
            break;

            case 2:System.out.print("Tuesday");
            break;

            case 3:System.out.print("Wednesday");
            break;

            case 4:System.out.print("Thursday");
            break;

            case 5:System.out.print("Friday");
            break;

            case 6:System.out.print("Saturday");
            break;

            case 7:System.out.print("Sunday");
            break;

            default :System.out.print("Invalid Number");
            break;
        }

        sc.close();
        
    }

    
}