import java.util.*;
public class Equal_array {
    public static void main(String[] args) {
       Integer arr1[] = {1,2,2,3,4};
       Integer arr2[] = {4,2,3,2,1};

       HashMap<Integer,Integer>map = new HashMap<>();

       for(Integer x :arr1)map.put(x,map.getOrDefault(x,0 ));
    }
        for(Integer b: arr2){
            if(map.containskey(x)||map.get(num)==0)
                return false;
        }
        else{
            map.put(map.get(x-1));
        }
        return true 
}
 