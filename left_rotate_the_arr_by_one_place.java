class left_rotate_the_arr_by_one_place{
    public static void main(String args[]){
        int[] arr={1,2,3,4,5};
        int temp =arr[0];
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];  
        }
        arr[n-1]=temp;
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
    }
}