public class StringUtil
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to StringUtil");

        String firstCharacterOfGoodbye = getFirstCharacter("Goodbye");
        System.out.println("getFirstCharacter returns: " + firstCharacterOfGoodbye);
        System.out.println("getFirstCharacter returns: " + getFirstCharacter("Hello"));

        String lastCharacterOfHello = getLastCharacter("Hello");
        System.out.println("getLastCharacter for Hello returns: " + lastCharacterOfHello);
        System.out.println("getLastCharacter returns: " + getLastCharacter("Goodbye"));

        String firstTwoCharacters = getFirstTwoCharacters("Hello");
        System.out.println("getFirstTwoCharacters returns: " + firstTwoCharacters);
        System.out.println("getFirstTwoCharacters returns: " + getFirstTwoCharacters("Goodbye"));

        String lastTwoCharacters = getLastTwoCharacters("Hello");
        System.out.println("getLastTwoCharacters returns: " + lastTwoCharacters);
        System.out.println("getLastTwoCharacters returns: " + getLastTwoCharacters("Goodbye"));

        String allButFirstThree = getAllButFirstThreeCharacters("Hello");
        System.out.println("getAllButFirstThreeCharacters returns: " + allButFirstThree);
        System.out.println("getAllButFirstThreeCharacters returns: " + getAllButFirstThreeCharacters("Goodbye"));

        System.out.println(printCharacters("Hello"));
        System.out.println(printCharacters("Goodbye"));

        System.out.println(printPhoneNumber("501-555-0100"));

        String firstE = findFirstE("Hello");
        System.out.println("findFirstE returns: " + firstE);
        System.out.println("findFirstE returns: " + findFirstE("Goodbye"));

        System.out.println("is Finn returns: " + isFinn("Finn"));
        System.out.println("is Finn returns: " + isFinn("Jake"));

    }

    private static String isFinn( String name)
    {
        int title = name.indexOf("Finn");
        if (name == "Finn") return "true";
        else return "false";
    }

    private static String findFirstE( String firstE)
    {
        System.out.println(firstE.indexOf('e'));
        return firstE;
    }

    private static String printPhoneNumber(String number)
    {

        String areaCode =  number.substring(0,3);
        String exchange = number.substring(4,7);
        int lineNumber = number.length() - 4;
        return "Area Code: " + areaCode + " Exchange: " + exchange + " Line Number " + number.substring(lineNumber, lineNumber + 4) ;

    }

    private static String printCharacters( String print)
    {
        for( int p = 0; p < print.length(); p++)
        {
            char print2 = print.charAt(p);
            System.out.println(print2 + ":" + print.length());
        } return print;

    }

    private static String getAllButFirstThreeCharacters( String first3)
    {
        return first3.substring(3,first3.length());
    }

    private static String getLastTwoCharacters(String lastTwo)
    {
        int startIndex = lastTwo.length()-2;
        return lastTwo.substring(startIndex, startIndex + 2);
    }

    private static String getFirstTwoCharacters(String firstTwo)
    {
        return firstTwo.substring(0,2);
    }

    private static String getLastCharacter(String value)
    {
     int startIndex = value.length()-1;
     return value.substring(startIndex, startIndex +1);
    }

    private static String getFirstCharacter(String value )
    {
       return value.substring(0,1);

    }
}
