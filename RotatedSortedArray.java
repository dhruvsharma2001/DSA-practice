public class RotatedSortedArray {
    public static int SearchInARotatedSortedArray(int arr[], int target, int si, int ei){
        if(si>ei){
            return -1;
        }

        //find mid
        int mid = si +((ei-si)/2);
        if(arr[mid]==target){
            return mid;
        }
        //if left half is sorted
        if(si<=arr[mid]){
            //if key is in left half
            if(arr[si]<=target && target <=arr[mid]){
                //search in left
               return SearchInARotatedSortedArray(arr, target, si, mid-1);
            }else{
                //search in right
                return SearchInARotatedSortedArray(arr, target, mid+1, ei);
            }
        }else{ //if right half is sorted
                //search in right
            if(arr[mid]<=target && target <=arr[ei]){
               return SearchInARotatedSortedArray(arr, target, mid+1, ei);
            }else {         
                //search in left
                return SearchInARotatedSortedArray(arr, target , si, mid-1);
            }
        }
    }
    public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,2};
        int target=0;//output->4
        int targinx= SearchInARotatedSortedArray(arr,target,0,arr.length-1);
        System.out.println(targinx);
    }
}
