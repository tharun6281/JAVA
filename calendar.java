import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class calendar
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, 1);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        for (int i = Calendar.SUNDAY; i < firstDayOfWeek; i++) 
        {
            System.out.print("    ");
        }
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int day = 1; day <= daysInMonth; day++) 
        {
            System.out.printf("%3d ", day);
            if ((day + firstDayOfWeek - 1) % 7 == 0) 
            {
                System.out.println();
            }
        }
        scanner.close();
    }
}
