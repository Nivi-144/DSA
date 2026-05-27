public class Recursion6 {
    int f(int n){
        if(n==0)
            return 1;
        return n*f(n-1);    
    }
    public static void main(){
        int n=6;
        Recursion6 obj=new Recursion6();
        int result= obj.f(n);
        System.out.println("Result:"+result);
        
    }
    
}
