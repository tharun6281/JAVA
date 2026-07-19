import java.util.*;
class random 
{
    public static int getRandomNumber() 
    {
        int min = 1;
        int max = 100;
        int randNumber = (int)(Math.random()*(max-min+1))*min;
        return randNumber;
    }
    public static void main(String[] args) throws Exception 
    {
        System.out.println("Random Number: " + getRandomNumber());
    }
}
