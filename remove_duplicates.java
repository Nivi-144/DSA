class remove_duplicates{
    public static void main(String args[]){
        int[] arr={1,1,2,2,4,4,4,5,5,5,55};
        int i=0;
        int n=arr.length;
        for(i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[j]!=arr[i]){
                    arr[i+1]=arr[j];
                    i++;
                }                
            }
        System.out.println(i+1);    
        return ;    
        }
    }
}