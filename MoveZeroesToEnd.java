public class MoveZeroesToEnd {
    public static void MoveZeroesToEnd(int nums[]) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                // swap nums[left] and nums[right]
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = {0, 1, 3, 90, 8, 0, 5};
        MoveZeroesToEnd(arr);
        
        // Print final result
        System.out.print("Array after moving zeroes: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}