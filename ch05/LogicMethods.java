public class LogicMethods
{
    public static void main(String[] args)
    {
        printIsLarge(200);
        printIsLargeOrSmall(2);
        printLargest(4, 4);
        printLargestOdd(7, 5);
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
        boolean x = number1 % 2 !=0;
        boolean y = number2 % 2 !=0;
        if (x && y)
        {
            if (number1 > number2)
            {
                System.out.println("The largest odd number is: " + number1);
            }
        }
        if (x && y)
        {
            if (number2 > number1)
            {
                System.out.println("The largest odd number is: " + number2);
            }
        }

        boolean a = number1 % 2 == 0;
        boolean b = number2 % 2 == 0;
        if ( a && b)
        {
            System.out.println("Neither number is odd.");
        }

        if (x&&y)
        {
            System.out.println("Two odds make an even. " + (number1 + number2));
        }
    }
}
