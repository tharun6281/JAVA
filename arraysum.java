import java.util.Scanner;
public class array1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[3];
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("sum array elements are:");
        for(int j=0;j<arr.length;j++)
        {
            System.out.println(arr[j]);
            sum=sum+arr[j];
            System.out.println(sum);
        }
    }
}
