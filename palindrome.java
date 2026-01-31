import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        if (isPalindrome(input)) 
        {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
        sc.close();
    }
    public static boolean isPalindrome(String str) 
    {
        str = str.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) 
        {
            if (str.charAt(left) != str.charAt(right)) 
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}