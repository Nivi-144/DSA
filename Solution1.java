import java.util.Scanner;
class Solution1 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int original = x;
        int reverse = 0;
        while (x != 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }
        return original == reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        Solution1 obj = new 1Solution();
        boolean result = obj.isPalindrome(n);
        System.out.println(result);
        sc.close();
    }
}
