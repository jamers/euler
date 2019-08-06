package io.github.jamers.math;

public class NumberToWordFormatter
{
    public static String format(int i)
    {
        if(i > 1000 || i < 1) {
            throw new IllegalArgumentException();
        }
        int thousands = i / 1000;
        int hundreds = (i - (thousands * 1000)) / 100;
        int tens = ((i - (thousands * 1000)) - hundreds * 100) / 10;
        int ones = (((i - (thousands * 1000)) - hundreds * 100) - tens * 10);

        boolean and = (thousands > 0 || hundreds > 0) && (tens > 0 || ones > 0);
        boolean hyphen = tens > 0 && ones > 0;

        StringBuilder result = new StringBuilder();
        if(thousands > 0) {
            result.append(formatLessThanTwenty(thousands));
            result.append(" thousand ");
        }
        if(hundreds > 0) {
            result.append(formatLessThanTwenty(hundreds));
            result.append(" hundred ");
        }
        if(and) {
            result.append("and ");
        }
        if(tens > 1) {
            result.append(formatTens(tens));
            if(hyphen)
            {
                result.append("-");
            } else {
                result.append(" ");
            }
        }
        if(ones > 0 || tens == 1) {
            if(tens == 1) {
                ones = ones + 10;
            }
            result.append(formatLessThanTwenty(ones));
        }

        return result.toString().trim();
    }

    private static String formatLessThanTwenty(int in) {
        String[] numbers = {"zero", "one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve",
                "thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};
        return numbers[in];
    }

    private static String formatTens(int in) {
        String[] numbers = {"zero", "ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        return numbers[in];
    }
}
