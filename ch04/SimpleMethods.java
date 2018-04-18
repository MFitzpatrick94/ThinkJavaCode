public class SimpleMethods
{
    public static void main(String[] args)
    {
        printCount( 5 );

        int count = 9;
        printCount(count);

        int someNumber = 3;
        printCount(someNumber);

        printSum( 4, 6);
        printSum(7, 2);

        printBoolean( true);
        printBoolean(false);
    }
    public static void printCount(int count)
    {
        System.out.println("The count is: " + count);
    }
    public static void printSum(int x, int y)
    {
        int z = x + y;
        System.out.println(x + " + " + y + " = " +  z);
    }
    public static void printBoolean(boolean isStudent)
    {
        System.out.println("I am a student: " + isStudent);
    }
}
