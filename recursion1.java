import java.util.Scanner;
public class recursion1{
    void name(int i,int n){
        if (i>n){
            return;
        }
        System.out.println("Nivi");
        name(i+1,n);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times:");
        int n=sc.nextInt();
        recursion1 obj= new recursion1();
        obj.name(1, n);
        sc.close();
    }
}