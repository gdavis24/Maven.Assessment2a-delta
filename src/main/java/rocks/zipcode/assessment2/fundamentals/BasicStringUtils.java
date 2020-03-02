package rocks.zipcode.assessment2.fundamentals;

import java.util.regex.Pattern;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2)
    {
        return string1 + string2;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1)
    {
        String output = "";
        for (int i = string1.length() - 1; i >= 0; i--)
        {
            output = output + string1.charAt(i);
        }
        return output;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2)
    {
        String output1 = "";
        for (int i = string1.length() - 1; i >= 0; i--)
        {
            output1 = output1 + string1.charAt(i);
        }

        String output2 = "";
        for (int i = string2.length() - 1; i >= 0; i--)
        {
            output2 = output2 + string2.charAt(i);
        }
        return output1 + output2;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove)
    {
        String newString = string.replaceAll(charactersToRemove, "");
        return newString;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove)
    {
        String newString = string.replace(charactersToRemove, "");
        String outputReverse = "";
        for (int i = newString.length() - 1; i >= 0; i--)
        {
            outputReverse = outputReverse + newString.charAt(i);
        }
        return outputReverse;
    }
}
