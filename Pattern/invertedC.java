// *****
// *   *
// *   *
// *****
public class invertedC {

    public static void rectangle(int rows, int col) {
        for(int i=1; i<=rows; i++){
            for( int j=1;j<=col;j++){
                if(i==1||i==rows||j==1||j==col){
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
        int total_row = 10 ;
        int total_col = 7;
        rectangle(total_row, total_col);
    }
}