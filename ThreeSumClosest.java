import java.util.*;
public class ThreeSumClosest {
     public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int resultSum = nums[0] + nums[1] + nums[2];
        int minDifference = Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            int left = i+1;
            int right = nums.length-1;
            int sum = nums[i] + nums[left] + nums[right];
            while(left<right){
                if(sum == target){
                    return target;
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
                int diffToTarget = Math.abs(sum-target);
                if(diffToTarget<minDifference){
                    resultSum = sum;
                    minDifference = diffToTarget;
                }
            }
        }
        return resultSum;
    }
    public static void main(String args[]){
        int arr[] = {-1,2,1,-4};
        int target = 1;
        System.out.print(threeSumClosest(arr, target));
    }
}
