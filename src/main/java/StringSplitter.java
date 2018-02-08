import java.util.Arrays;
import java.util.Scanner;

/**
 * A class that splits a string on character change boundaries.
 * <p>
 * The provided code is incomplete. Modify it so that it works properly and passes the tests in
 * <code>StringSplitterTest.java</code>.
 *
 * @see <a href="https://cs125.cs.illinois.edu/MP/2/">MP2 Documentation</a>
 */
public class StringSplitter {
    public static String[] splitString​(String input) {
        if (input == null) {
            return null;
        } else if (input.isEmpty()) {
            String[] empty = new String[0];
            return empty;
        }
        String thisGuy = "";
        if (input.length() == 1) {
            thisGuy = input;
        }
        for (int i = 0; i <= input.length() - 2; i++) {
            if (i == 0 && input.charAt(i) != input.charAt(i + 1)) {
                thisGuy = input.substring(i, i + 1);
            }
            if (i == 0 && input.charAt(i) == input.charAt(i + 1)) {
                thisGuy = input.substring(i, i + 1);
            }
            if (i != 0 && input.charAt(i) != input.charAt(i - 1)) {
                thisGuy += ",";
            }
            if (i != 0 && input.charAt(i) == input.charAt(i + 1)) {
                    thisGuy += input.substring(i,i + 1);
            }
            if (i != 0 && input.charAt(i) != input.charAt(i + 1)) {
                    thisGuy += input.substring(i, i + 1);
            }
        }
        if (input.length() != 1) {
            if (input.charAt(input.length() - 1) == input.charAt(input.length() - 2)) {
                thisGuy += input.substring(input.length() - 1, input.length());
            }
            if (input.charAt(input.length() - 1) != input.charAt(input.length() - 2)) {
                thisGuy += "," + input.substring(input.length() - 1, input.length());
            }
        }
        return thisGuy.split(",");
    }

    /* ********************************************************************************************
     * You do not need to modify code below this comment.
     * ********************************************************************************************/

    /**
     * Solicit a string and split it whenever the character changes.
     * <p>
     * You are free to review this function, but should not modify it. Note that this function is
     * not tested by the test suite, as it is purely to aid your own interactive testing.
     *
     * @param unused unused input arguments
     */
    public static void main(final String[] unused) {
        Scanner lineScanner = new Scanner(System.in);
        System.out.println("Enter a string to split: ");
        String input = lineScanner.nextLine();
        System.out.println("This splits into: ");
        System.out.println(Arrays.toString(splitString(input)));
    }
}
