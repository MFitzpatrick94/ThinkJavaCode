public class DemoMath
{
    public static void main(String[] args)
    {
        int a = 2;
        int b = 3;

        int abs = Math.abs(a);
        int max = Math.max(a, b);
        double pow = Math.pow(a,b);
        double pi = Math.PI;

        System.out.println("Before: "+ a + " After: " + abs);
        System.out.println("Before: "+ a + ", " + b + " After: " + max);
        System.out.println("Before: "+ a + ", " + b + " After: " + pow);
        System.out.println(pi);

    }
}
