import java.util.Scanner;
public class Recursion2{
    void printNumbers(int i, int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        printNumbers(i+1,n);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        Recursion2 obj= new Recursion2();
        obj.printNumbers(1,n);
        sc.close();
    }
}