class move_zeros_to_the_end{
    public static void main(String args[]){
        int[] arr={1,2,9,6,4,0,7,5,0,3,0};
        int n=arr.length;
        int nz=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                nz++;
            }
        } 
        int[] temp= new int[nz];
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<nz;i++){
            arr[i]=temp[i];
        }
        for(int i=nz;i<n;i++){
            arr[i]=0;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}