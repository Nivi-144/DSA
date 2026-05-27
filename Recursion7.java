public class Recursion7 {
    int[] a={1,5,9,6,3};
    int n=a.length;
    void f(int i){
        if(i>=n/2){
            return;
        }
        int temp=a[i];
        a[i]=a[n-i-1];
        a[n-i-1]=temp;
        f(i+1);    
    }
    public static void main(String[] args){
        int i=0;
        Recursion7 obj=new Recursion7();
        obj.f(0);
        for(int j=0;j<obj.a.length;i++){
            System.out.println(obj.a[i]+"  ");
        }
        
    }    
}
