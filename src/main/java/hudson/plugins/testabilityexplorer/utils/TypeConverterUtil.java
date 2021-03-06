package hudson.plugins.testabilityexplorer.utils;

/**
 * Utility class to do some conversions.
 *
 * @author reik.schatz
 */
public class TypeConverterUtil
{
    private TypeConverterUtil() { }

    /**
     * Returns the given String parsed to an Integer. If the String cannot be
     * converted, the default value will be returned instead.
     *
     * @param value a String
     * @param defaultValue default int value to return if conversion fails
     * @return int
     */
    public static int toInt(String value, int defaultValue)
    {
        try
        {
            return Integer.parseInt(value);
        }
        catch (NumberFormatException e)
        {
            return defaultValue;
        }
    }

    /**
     * Returns the given String parsed to a Double. If the String cannot be
     * converted, the default value will be returned instead.
     *
     * @param value a String
     * @param defaultValue default double value to return if conversion fails
     * @return double
     */
    public static double toDouble(String value, double defaultValue)
    {
        try
        {
            return Double.parseDouble(value);
        }
        catch (NumberFormatException e)
        {
            return defaultValue;
        }
    }
}
