import java.util.Scanner;
class user
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        double a = sc.nextDouble();
        float b = sc.nextFloat();
        sc.nextLine();
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(a);
        System.out.println(b);
        System.out.println(str1);
        System.out.println(str2);
    }
}
