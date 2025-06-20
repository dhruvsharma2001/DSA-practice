public class ArraytargetSum {
    public static boolean TwoNumberSumToAtarget(int arr[], int tgt){
        int i=0,j=arr.length-1;
        while(i<j){
            int sum = arr[i]+arr[j];
            if(sum==tgt) return true;
            else if(sum<tgt){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5, 6};
        int target = 33;
        System.out.print(TwoNumberSumToAtarget(arr, target));
    }
}
