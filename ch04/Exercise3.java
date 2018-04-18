public class Exercise3
{
    public static void main(String[] args)
    {
        printAmerican( "Wednesday", 18, "April" , 2018);
        printEuropean( "Wednesday",18,"April", 2018);
    }
    public static void printAmerican( String day, int date, String month, int year )
    {
        System.out.println("American format: " + day +", " + month +" "+ date +", "+ year);
    }
    public static void printEuropean( String day,int date, String month, int year)
    {
        System.out.println("European format: " + day +" " + day +" "+ month +" "+ year);

    }
}
