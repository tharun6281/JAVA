import java.util.Scanner;
public class strmethods 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        System.out.println("Length:"+str.length());
        System.out.println("Uppercase:"+str.toUpperCase());
        System.out.println("Lowercase:"+str.toLowerCase());
        System.out.println("Trimmed:"+str.trim());
        System.out.println("Substring:"+ str.substring(2,6));
        System.out.println("Contains'Java':"+str.contains("Java"));
        System.out.println("Replace:"+str.replace("Java", "Python"));
    }
}