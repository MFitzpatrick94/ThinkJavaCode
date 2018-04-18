import java.util.Scanner;
public class TempConvert
{
    public static void main(String[] args)
    {
        double cel;
        double fahrenheit;
        Scanner in = new Scanner(System.in);

        System.out.print("Degrees in Celcius: ");
        cel = in.nextDouble();

        fahrenheit = cel * (9.0/5.0) + 32.0;
        System.out.printf("%.1f C = %.1f F", cel, fahrenheit);




    }
}
