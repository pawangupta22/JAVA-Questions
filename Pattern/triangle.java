public class triangle {
    public static void main(String[] args) {
        for(int i =1; i<=5; i ++){
            if(i==2 || i==4){
                continue;
            }
            for(int j=1; j<=5-i+1; j++){
            System.out.print('*');    
        }
        System.out.println();
        
    }
    }
}


