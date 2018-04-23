public class Exercise7C
{
    public static void main(String[] args)
    {
        int num = 100;

        for( int i = 100 ; i >= -100; i-=8)
        {
            System.out.println("For: " + i);
        }

        while ( num >= -100)
        {
            System.out.println("While: " + num);
            num -= 8;
        }

        num =100;

        do
        {
            System.out.println("DoWhile: " + num);
            num -= 8;
        }while ( num >= -100);

    }
}
