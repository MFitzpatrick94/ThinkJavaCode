public class Time
{
    public static void main(String[] args)
    {
        double hour = 16.0;
        double minute = 24.0;
        double second = 10.0;
        double secondsSince =(hour*3600.0) + (minute*60.0) + second; //converted hours and minutes into seconds
        System.out.println("Number of seconds since midnight: " + secondsSince);

        double secondsUntil = (24.0*3600.00) - secondsSince;
        System.out.println( "Number of seconds until midnight: " + secondsUntil);

        double day = hour + (minute/60.0);
        System.out.println("Percentage of day passed: " + ( day / 24.00 ) * 100.00);

        double x = 15.0;  //start hour
        double y = 36.0; //start minute
        //double z = 30.0; //start second
        double start = (hour + (minute/60.0)) - ( x + (y/60.0));
        System.out.println( "Elapsed Time: " + start);

    }
}
