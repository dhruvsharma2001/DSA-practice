import java.util.*;

public class permutations {
    public static void Backtrack(List<List<Integer>> result, ArrayList<Integer> tempList, int[] nums){
    if(tempList.size()==nums.length){
    result.add(new ArrayList<>(tempList));
    return;
}

        for(int num:nums){
            if(tempList.contains(num)){
                continue;
            }
            tempList.add(num);
            Backtrack(result, tempList, nums);
            tempList.remove(tempList.size()-1);
        }

    }
    public static List<List<Integer>> Permute(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        Backtrack(result, new ArrayList<>(), nums);
        return result;
    }
    public static void main(String args[]){
        int[] nums = {1,2,3};
        System.out.print(Permute(nums));
    }
}
