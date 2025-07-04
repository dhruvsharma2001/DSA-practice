public class QuickSort {
    public static void quicksort(int arr[],int si,int ei){
    if(si>=ei){
        return;
    }
    //last element
    int pIdx = partition(arr,si,ei);
    quicksort(arr,si,pIdx-1);//left
    quicksort(arr,pIdx+1,ei);//right
    }
    public static int partition(int arr[],int si,int ei){
        int piv=arr[ei];
        int i=si-1;//to make place elements smaller than pivot
        for(int j=si;j<ei;j++){
            if (arr[j]<=piv){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;


            }

        }
                i++;
                
                int temp=piv;
                arr[ei]=arr[i];
                arr[i]=temp;
                return i;

    }
    public static void main(String args[]){
    int arr[]={6,3,9,5,2,8};
    quicksort(arr,0,arr.length-1);
    }
}
