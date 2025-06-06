public class LastOccurenece {
    public static int lastOccurence(int arr[],int key,int i){
    if(i==arr.length){
        return -1;
    }
    
    int isFound=lastOccurence(arr,key,i+1);
    if(isFound != -1){
        return isFound;
    }
    //check with self 
    if(arr[i]==key){
        return i;

    }
    return isFound;
}
public static void main(String args[]){
    int arr[] = {8, 3, 6 ,9, 5, 10, 2, 5, 3};
    System.out.print(lastOccurence(arr, 0,0));
}
}
