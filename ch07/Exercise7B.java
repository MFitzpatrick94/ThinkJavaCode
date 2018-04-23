public class Exercise7B
{
    public static void main(String[] args)
    {
        int num = 0;

        for( int i = 0; i <= 100 ; i+=10)
        {
            System.out.println("For: " + i );
        }

        while ( num <= 100)
        {
            System.out.println("While: " + num );
            num += 10;
        }

        num = 0;

        do
        {
            System.out.println("DoWhile: " + num);
            num += 10;
        } while(num <= 100);
    }
}
