import java.util.Scanner;
public class Recursion3{
    void printNumbers(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumbers(n-1);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        Recursion3 obj= new Recursion3();
        obj.printNumbers(n);
        sc.close();
    }
}