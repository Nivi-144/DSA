public class SortedCheck{
    public static void main(String args[]){
    int[] arr={1,2,3,4,5,6};
    boolean sorted=true;
    int n= arr.length;
    for(int i=1;i<n;i++){
        if(arr[i]<arr[i-1]){
            sorted = false;
        }
        }  
    if(sorted){
        System.out.println("Array is sorted..");
    } 
    else{
        System.out.println("Not Sorted..");
    }
        
    }
}