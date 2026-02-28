public class pattern2
{
    public static void main(String[] args)
    {
        int i,j;
        int n=5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=2*i-1;j++)
            {
                if(j==1||j==2*i-1||i==n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}