public class ArrayDemo
{
    public static void main(String[] args)
    {
        int[] values = {5, 2, 9, 8, 0};
        printArray(values);

        int[] totals = {1, 5, 9};
        int sum = arrayTotal(totals);
        System.out.println("Total: " + sum);

        int[] maxes = {78, 23, 9, 34};
        int big = arrayMax(maxes);
        System.out.println("Max: " + big);

        int[] indexes = {5, 8, 21, 19, 2};
        int ind = arrayMaxIndex(indexes);
        System.out.println("Max index: " + ind);

        double[] averages = {34.2, 18.0, 12.5, 13.1};
        double avg = arrayAverage(averages);
        System.out.println("Average is: " + avg);

        String[] testString = {"Bob", "June", "New"};
        printArray2(testString);

        int[] arrayF = new int[10];
        arrayF[0] = 5;
        arrayF[3] = 1;
        arrayF[9] = 4;
        printArray(arrayF);

        String[] arrayG = new String[10];
        arrayG[0] = "Hi";
        arrayG[3] = "Hello";
        arrayG[9] = "Bye";
        printArray2(arrayG);





    }

    private static void printArray(int[] values)
    {
        for (int value : values)
        {
            System.out.println("Value: " + value);
        }
    }

    private static int arrayTotal(int[] totals)
    {
        int sum = 0;
        for (int total : totals)
        {
            sum = sum + total;
        }
        return sum;

    }

    private static int arrayMax(int[] maxes)
    {
        int big = 0;
        for (int max : maxes)
        {
            big = Math.max(max, big);
        }
        return big;
    }


    private static int arrayMaxIndex(int[] indexes)
    {
        int ind = 0;
        int max = 0;

        for (int i = 0; i < indexes.length; i++)
        {
            if (indexes[i] > ind)
            {
                ind = indexes[i];
                max = i;
            }
        }

        return max;
    }

    private static double arrayAverage( double[] averages)
    {
        double avg =0;

        for (double average:averages)
        {
            avg = (avg + average);
        }
        avg = avg / averages.length;

        return avg;
    }

    private static void printArray2(String[] testStrings)
    {
        for (String testString : testStrings)
        {
            System.out.println("String: " + testString);
        }
    }
}
