// public class repeatedstar {
//     public static void main(String[] args) {
//         for( int i=1; i<=6; i++){
//             for(int j=1; j<=i+(i%2); j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
        
//     }
    
// }


public class repeatedstar {
    public static void main(String[] args) {
        for( int i=1; i<=7; i++){
            for(int j=1; j<=i-(i%2); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}