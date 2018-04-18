public class Time
{
    public static void main(String[] args)
    {
        double hour = 16.0;
        double minute = 24.0;
        double second = 10.0;
        second =(hour*3600.0) + (minute*60.0) + second; //converted hours and minutes into seconds
        System.out.println("Number of seconds since midnight: " + second);

        second = 86400.0 - second;
        System.out.println( "Number of seconds until midnight: " + second);

        double day = hour + (minute/60.0);
        System.out.println("Percentage of day passed: " + ( day / 24.00 ) * 100.00);
    }
}
