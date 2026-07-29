class linear_Search{
    public static void main(String args[]){
        int[] arr={1,0,2,3,2,0,0,4,5,1};
        int num=4;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==num){
                System.out.println(i);
            }
        }

    }
}