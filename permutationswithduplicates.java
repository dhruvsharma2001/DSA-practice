import java.util.*;
public class permutationswithduplicates {
    public static void BackTrack(List<List<Integer>> result, ArrayList<Integer> tempList, int[] nums, boolean[] used){
        if(tempList.size()==nums.length 
        && !result.contains(tempList)){
        result.add(new ArrayList<>(tempList));
        return;
    }
    
            for(int i=0;i<nums.length;i++){
                if(used[i])
                continue;
                
                used[i] = true;
                tempList.add(nums[i]);
                BackTrack(result, tempList, nums,used);

                used[i] = false;
                tempList.remove(tempList.size()-1);
            }
    
        }
    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> result= new ArrayList<>();
        BackTrack(result, new ArrayList<>(), nums, new boolean[nums.length]);
        return result;
    }
    public static void main(String args[]){
        int[] nums = {1, 2, 1, 5};
        System.out.print(permute(nums));
    }
    
}
