public class Pairs {

    public static void printpairs(int number[]) {
        for (int i = 0; i < number.length; i++) {
            int curr = number[i];
            for (int j = i + 1; j < number.length; j++) {
                System.out.print("(" + curr + "," + number[j]+")");
            }
            System.out.println();
        }
    }

    public static void main(String[] arg){
        int arr[] = {2,4,6,8,10};
        printpairs(arr);

    }
}

// Note: array.length gives the total number of elements,
//  while indexing starts from 0,
//  so the last index is array.length - 1;
//  therefore, use i < array.length, not i <= array.length.