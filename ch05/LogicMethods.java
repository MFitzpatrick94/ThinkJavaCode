public class LogicMethods
{
    public static void main(String[] args)
    {
        printIsLarge(200);
        printIsLargeOrSmall(2);
        printLargest(4, 4);
        printLargestOdd(2, 6);
    }

    private static void printIsLarge(int number)
    {
        if (number > 99)
        {
            System.out.println("The number is large.");
        }
    }

    private static void printIsLargeOrSmall(int number)
    {
        if (number > 99)
        {
            System.out.println("The number is large.");
        } else if (number < 10)
        {
            System.out.println("The number is small.");
        }
    }

    private static void printLargest(int number1, int number2)
    {
        if (number1 > number2)
        {
            System.out.println("The largest number is: " + number1);
        } else if (number2 > number1)
        {
            System.out.println("The largest number is: " + number2);
        } else if (number1 == number2)
        {
            System.out.println("The numbers are equal.");
        }
    }

    private static void printLargestOdd(int number1, int number2)
    {
        if ((number1 % 2 != 0) && (number2 % 2 != 0))
        {
            if (number1 > number2)
            {
                System.out.println("The largest odd number is: " + number1);
            }
        }
        if ((number1 % 2 != 0) && (number2 % 2 != 0))
        {
            if (number2 > number1)
            {
                System.out.println("The largest odd number is: " + number2);
            }
        }
        if ((number1 % 2 != 0) && (number2 % 2 != 0))
        {
           //if ((number1 && number2))
            System.out.println("Neither number is odd.");
        }
    }
}
