import java.util.*;

public class ThreeSum {
    //Time complexity O(n3)
    public List<List<Integer>> threeSumBruteForce(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++ ){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i] + nums[j] + nums[k]==0){
                        List<Integer> triplet = new ArrayList<Integer>();

                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        Collections.sort(triplet);
                        result.add(triplet);

                    }
                }
            }
        }
 return result = new ArrayList<List<Integer>> (new LinkedHashSet<List<Integer>> (result));
    }

    public static List<List<Integer>> ThreeSumOptimized(int[] arr){
        if(arr == null || arr.length<3) return new ArrayList<>();
        //sort the array
        Arrays.sort(arr);
        Set<List<Integer>> result = new HashSet<>();
        for(int i=0;i<arr.length-2;i++){
            int left = i+1;
            int right = arr.length-1;
        while(left<right){
            int sum= arr[i] + arr[left] + arr[right];
            if(sum==0){
                result.add(Arrays.asList(arr[i], arr[left], arr[right]));
                left++;
                right--;
            }else if(sum<0){
                left++;
            }else{
                right--;
            }
        }
        }
        return new ArrayList<>(result);
    }

    public static void main(String args[]){
        int nums[] = {-1,0,1,2,-1,-4};
        System.out.print(ThreeSumOptimized(nums));
    }
}
