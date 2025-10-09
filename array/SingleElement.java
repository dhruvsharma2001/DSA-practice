package array;

public class SingleElement {
    public static int singleNumber(int[] nums) {
        int count = 0;
        Integer single = null;
        for (int i = 0; i <nums.length; i++) {
            if (count == 0) {
                single = nums[i];
            }
            if (single == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return single;
    }
    public static void main(String[] args) {
        int nums[] = {2,2,1};
        System.out.println(singleNumber(nums));
    }
}
