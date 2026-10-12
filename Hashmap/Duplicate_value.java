import java.util.*;
public class Duplicate_value {
public static void main(String[] args) {
    int arr[] = {1,2,1,1,3,2,3,3,1,1};
    int n= arr.length;
    
    HashMap<Integer,Integer>map = new HashMap<>();

    for ( int i=0; i<n; i++){ // for each se v kr skte h
    Integer count = map.get(arr[i]);
    //System.out.print(count);

    if(count == null){
        map.put(arr[i],1);
    }
    else{
        map.put(arr[i], count+1);
    }
    }
    System.out.print(map);
}
}