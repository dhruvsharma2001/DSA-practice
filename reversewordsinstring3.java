public class reversewordsinstring3 {
    public static String ReverseWordsInAString(String s){
        char [] arr = s.toCharArray();
        int left = 0, right = 0;
        while(right<arr.length){
            if(arr[right] == ' '){
            reverse(arr, left, right - 1);
            left = right + 1;
        }

        right++;
    }

    // Reverse the last word
    reverse(arr, left, right - 1);

    // Return the string
    return new String(arr);
    }
    private static void reverse(char[] arr, int left, int right) {
    while (left < right) {
      char temp = arr[left];
      arr[left++] = arr[right];
      arr[right--] = temp;
    }
  }
    public static void main(String args[]){
        String s = "two pointers";
        System.out.print(ReverseWordsInAString(s));
    }
}
