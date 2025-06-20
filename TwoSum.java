import java.util.*;
public class TwoSum {
    public static int[] TwoSumEqualsTarget(int arr[], int tgt){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length-1;i++){
            int complement = tgt-arr[i];
            if(hm.containsKey(complement)){
                return new int[]{hm.get(complement), i};
            }
            hm.put(arr[i], i); // store value and its index
        }
        return new int[]{-1, -1}; // shouldn't reach here as per problem
    }
    public static void main(String args[]){
       int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = TwoSumEqualsTarget(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
}
}
