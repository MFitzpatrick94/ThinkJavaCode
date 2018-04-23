public class Exercise7A
{
    public static void main(String[] args)
    {
        int num = 1;

        for (int i = 1; i <= 10; i++)
        {
            System.out.println("For: " + i);
        }

        while (num <= 10)
        {
            System.out.println("While: " + num);
            num++;
        }
         num = 1;
        do
        {
            System.out.println("DoWhile: " + num);
            num++;

        }while (num <= 10);

        for (int i = 10; i >= 1; i--)
        {
            System.out.println("For CD: " + i);
        }
        num = 10;
        while (num >= 1)
        {
            System.out.println("While CD: " + num);
            num--;
        }
        num = 10;
        do
        {
            System.out.println("DoWhile CD: " + num);
            num--;

        }while (num >= 1);


    }
}
