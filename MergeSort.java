public class MergeSort {
    public static void MergeSortFunction(int arr[], int start, int end){
        if(start<=end){
            return;
        }
        int mid = start+(end-start)/2;
        MergeSortFunction(arr, start, mid);//for left
        MergeSortFunction(arr, mid+1, end);//for right
        Merge(arr, start, mid, end);
    }
    public static void Merge(int arr[], int si, int mid, int ei){
        int tempArr[] = new int[ei-si+1];
        int i= si;//left part
        int j= mid+1;//right part
        int k=0;

        // Merge both halves into temp
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                tempArr[k] = arr[i];
                i++;
            }else{
                tempArr[k]=arr[j];
                j++;
            }
            k++;
        }

         // Copy remaining elements from left half
        while(i<=mid){
            tempArr[k] = arr[i];
            i++;
            k++;
        }

         // Copy remaining elements from right half
        while(j<=ei){
            tempArr[k] = arr[j];
            j++;
            k++;
        }

        //copy temp array to original array
        for(k=0,i=si;k<tempArr.length;k++, i++){
            arr[i] = tempArr[k];
        }
    }
    public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        MergeSortFunction(arr,0,arr.length-1);
    }
}
