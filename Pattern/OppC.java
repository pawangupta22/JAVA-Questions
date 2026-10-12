// *****
//     *
//     *
// *****
public class OppC {

    public static void rectangle(int rows, int col) {
        for(int i=1; i<=rows; i++){
            for( int j=1;j<=col;j++){
                if(i==1||i==rows||j==col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) { 
        int total_row = 5 ;
        int total_col = 5;
        rectangle(total_row, total_col);
    }
}
