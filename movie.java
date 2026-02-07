import java.util.Scanner;
public class movie 
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter movie name:");
        String movieName = sc.nextLine();
        System.out.println("Enter ticket price:");
        int ticketPrice = sc.nextInt();
        System.out.println("Enter number of seats:");
        int seat = sc.nextInt();
        if (seat != 0 && ticketPrice != 0) 
        {
            int total = seat * ticketPrice;
            System.out.println("Movie Name: " + movieName);
            System.out.println("The total amount: " + total);
        }
    }
}

