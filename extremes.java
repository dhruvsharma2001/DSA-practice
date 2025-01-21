import java.util.Arrays;

public class extremes {
    public static int[] Extremes(int nums[]){
        int start = 0, end = nums.length-1;
        int result[] = new int[nums.length];
        int index = 0;
        while(start<=end){
            if(index %2==0){
                result[index] = nums[start];
                start++;
            }else{
                result[index] = nums[end];
                end--;
            }
            index++;
        }
     return result;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6};
        int[] result = Extremes(nums);
        System.out.println("Extremes : "+Arrays.toString(result));
    }
}
