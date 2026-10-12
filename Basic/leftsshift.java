public class leftsshift {
    public static void main(String[] args) {

        int n = 5;
        int k= 1;

        // System.out.println("Left shift: "+(n<<k));
        // System.out.print("Right shift :"+ (n>>k));

        int left = n<<k;
        float right = n>>k;

        System.out.println("Left shift: "+left);
        System.out.print("Right shift :"+right);
    }
}
