import java.util.Scanner;
public class vote
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String str = sc.nextLine();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        if(age >= 18)
        {
            System.out.println("Eligible to vote.");
        }
        else
        {
            System.out.println("Not eligible to vote.");
        }
    }
}