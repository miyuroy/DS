package sum;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static void main(String[] args) {
        int arr[]={1,2,3,8};
        int res[]= twoSums(arr,9);
        System.out.println("indices:"+res[0]+ " and "+res[1]);
    }

    private static int[] twoSums(int[] arr, int target) {
        Map<Integer,Integer> record=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int otherNum=target-arr[i];
           if(record.containsKey(otherNum)){
               return new int[]{ record.get(otherNum),i};
           }
           else {
               record.put(arr[i], i);
           }
        }
        return new int[]{};
    }
}
