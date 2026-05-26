import java.util.Scanner;
public class Recursion5{
    void printNumbers(int i, int n){
        if(i<1){
            return;
        }
        
        printNumbers(i-1,n);
        System.out.println(i);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        Recursion5 obj= new Recursion5();
        obj.printNumbers(n,n);
        sc.close();
    }
}