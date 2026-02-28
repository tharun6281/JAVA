import java.util.Scanner;
public class reversestring
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        String rev=" ";
        for(int i=str.length()-1;i>=0;i--)
            rev+=str.charAt(i);
        {
            System.out.println("the reverse string is:"+rev);
        }
    }
}