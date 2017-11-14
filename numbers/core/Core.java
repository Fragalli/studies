package core;

/**
 * Created by fragalli on 14/11/17.
 */
public class Core {
    public static void main(String[] args) {
        buildValues(1234, 5678);
    }

    public static void sumRemaining(char[] chars, int diff, StringBuilder builder) {
        for (int j = diff; j < chars.length; j++) {
            builder.append(chars[j]);
        }
    }

    public static Integer buildValues(Integer a, Integer b) {
        String aString = a.toString();
        String bString = b.toString();

        char[] chars = aString.toCharArray();
        char[] charsB = bString.toCharArray();

        StringBuilder builder = new StringBuilder();

        int min = Integer.min(aString.length(), bString.length());
        int max = Integer.max(aString.length(), bString.length());


        for (int i = 0; i < min; i++) {
            builder.append(chars[i]);
            builder.append(charsB[i]);
        }

        if (aString.length() > bString.length()) {
            sumRemaining(chars, max - min, builder);
        } else sumRemaining(charsB, max - min, builder);

        String sum = builder.toString();
        System.out.println("Numero final = " + sum);

        return validateSum(sum);
    }

    public static Integer validateSum(String sum) {
        int integer = Integer.parseInt(sum);
        if (integer > 1000000) {
            return -1;
        }
        return integer;
    }

}
