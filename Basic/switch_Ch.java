import java.util.Scanner;
public class switch_Ch {
    public static void main (String[] arg){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A to F to Know DAY ! : ");
        char day = sc.next().charAt(0);                    // 😡😡

        switch (day){
            case 'A':System.out.print("Monday");             // single quotes
            break;

            case 'B':System.out.print("Tuesday");
            break;

            case 'C':System.out.print("Wednesday");
            break;

            case 'D':System.out.print("Thursday");
            break;

            case 'E':System.out.print("Friday");
            break;

            case 'F':System.out.print("Saturday");
            break;

            case 'G':System.out.print("Sunday");
            break;

            default:System.out.print("Invalid Character");
            break;
        }

        sc.close();
        
    }

    
}

