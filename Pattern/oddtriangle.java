public class oddtriangle {
    public static void main(String[] args) {
        for(int i=1; i<=3; i ++){
            for(int j=1; j<=5; j++){
                if(j<i){
                  System.out.print('');    
                }
                else if(j<5-2*(i-1)){
                System.out.print('*'); 
            } 
              
        }
        System.out.println();
        
    }
    }
}
