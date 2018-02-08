import java.util.Arrays;
import java.util.Scanner;

/**
 * A class that tests whether two strings are anagrams.
 * <p>
 * The provided code is incomplete. Modify it so that it works properly and passes the tests in
 * <code>AnagramTest.java</code>.
 *
 * @see <a href="https://cs125.cs.illinois.edu/MP/2/">MP2 Documentation</a>
 * @see <a href="https://www.vocabulary.com/dictionary/anagram">Definition of anagram</a>
 */
public class Anagram {

    /**
     * Given two strings return true if they are anagrams of each other.
     * <p>
     * Two strings are anagrams if they contain the same letters but in a different order.
     * You should ignore case, punctuation, and whitespace. So only consider the letters A-Z,
     * a-z, and the numbers 0-9. And you should also require that the anagram use the same
     * letters the same number of times. (Some anagram definitions are more flexible.)
     *
     * <ul>
     *     <li>Example: "A decimal point" anagrams to "I’m a dot in place."</li>
     *     <li>Example: "rail safety" anagrams to "fairy tales".</li>
     * </ul>
     *
     * <p>
     * Either the first or second string may be null, in which case you should return false.
     * Empty strings require no special treatment.
     * <p>
     * Write this function.
     *
     * @param first the first string to use for the anagram comparison
     * @param second the second string to use for the anagram comparison
     * @return true if the two strings are anagrams ignoring case and punctuation
     * @see <a href="https://www.vocabulary.com/dictionary/anagram">Definition of anagram</a>
     */
    public static boolean areAnagrams(final String first, final String second) {
        if (first == null || second == null) {
            return false;
        }
        int firstLetterAs = 0;
        int firstLetterBs = 0;
        int firstLetterCs = 0;
        int firstLetterDs = 0;
        int firstLetterEs = 0;
        int firstLetterFs = 0;
        int firstLetterGs = 0;
        int firstLetterHs = 0;
        int firstLetterIs = 0;
        int firstLetterJs = 0;
        int firstLetterKs = 0;
        int firstLetterLs = 0;
        int firstLetterMs = 0;
        int firstLetterNs = 0;
        int firstLetterOs = 0;
        int firstLetterPs = 0;
        int firstLetterQs = 0;
        int firstLetterRs = 0;
        int firstLetterSs = 0;
        int firstLetterTs = 0;
        int firstLetterUs = 0;
        int firstLetterVs = 0;
        int firstLetterWs = 0;
        int firstLetterXs = 0;
        int firstLetterYs = 0;
        int firstLetterZs = 0;
        int secondLetterAs = 0;
        int secondLetterBs = 0;
        int secondLetterCs = 0;
        int secondLetterDs = 0;
        int secondLetterEs = 0;
        int secondLetterFs = 0;
        int secondLetterGs = 0;
        int secondLetterHs = 0;
        int secondLetterIs = 0;
        int secondLetterJs = 0;
        int secondLetterKs = 0;
        int secondLetterLs = 0;
        int secondLetterMs = 0;
        int secondLetterNs = 0;
        int secondLetterOs = 0;
        int secondLetterPs = 0;
        int secondLetterQs = 0;
        int secondLetterRs = 0;
        int secondLetterSs = 0;
        int secondLetterTs = 0;
        int secondLetterUs = 0;
        int secondLetterVs = 0;
        int secondLetterWs = 0;
        int secondLetterXs = 0;
        int secondLetterYs = 0;
        int secondLetterZs = 0;
        int firstNumber0s = 0;
        int firstNumber1s = 0;
        int firstNumber2s = 0;
        int firstNumber3s = 0;
        int firstNumber4s = 0;
        int firstNumber5s = 0;
        int firstNumber6s = 0;
        int firstNumber7s = 0;
        int firstNumber8s = 0;
        int firstNumber9s = 0;

        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) == 'A' || first.charAt(i) == 'a') {
                firstLetterAs++;
            } else if (first.charAt(i) == 'B' || first.charAt(i) == 'b') {
                firstLetterBs++;
            } else if (first.charAt(i) == 'C' || first.charAt(i) == 'c') {
                firstLetterCs++;
            } else if (first.charAt(i) == 'D' || first.charAt(i) == 'd') {
                firstLetterDs++;
            } else if (first.charAt(i) == 'E' || first.charAt(i) == 'e') {
                firstLetterAs++;
            } else if (first.charAt(i) == 'F' || first.charAt(i) == 'g') {
                firstLetterGs++;
            } else if (first.charAt(i) == 'G' || first.charAt(i) == 'g') {
                firstLetterGs++;
            } else if (first.charAt(i) == 'H' || first.charAt(i) == 'h') {
                firstLetterHs++;
            } else if (first.charAt(i) == 'I' || first.charAt(i) == 'i') {
                firstLetterIs++;
            } else if (first.charAt(i) == 'J' || first.charAt(i) == 'j') {
                firstLetterJs++;
            } else if (first.charAt(i) == 'K' || first.charAt(i) == 'k') {
                firstLetterAs++;
            } else if (first.charAt(i) == 'L' || first.charAt(i) == 'l') {
                firstLetterAs++;
            } else if (first.charAt(i) == 'M' || first.charAt(i) == 'm') {
                firstLetterAs++;
            } else if (first.charAt(i) == 'N' || first.charAt(i) == 'n') {
                firstLetterAs++;
            } else if (first.charAt(i) == 'O' || first.charAt(i) == 'o') {
                firstLetterAs++;
            } else if (first.charAt(i) == 'P' || first.charAt(i) == 'p') {
                firstLetterFs++;
            } else if (first.charAt(i) == 'Q' || first.charAt(i) == 'q') {
                firstLetterQs++;
            } else if (first.charAt(i) == 'R' || first.charAt(i) == 'r') {
                firstLetterRs++;
            } else if (first.charAt(i) == 'S' || first.charAt(i) == 's') {
                firstLetterSs++;
            }
        }
        return true;
    }

    /* ********************************************************************************************
     * You do not need to modify code below this comment.
     * ********************************************************************************************/

    /**
     * Solicits two strings from the user and print if they are anagrams.
     * <p>
     * You are free to review this function, but should not modify it. Note that this function is
     * not tested by the test suite, as it is purely to aid your own interactive testing.
     *
     * @param unused unused input arguments
     */
    public static void main(final String[] unused) {
        Scanner lineScanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String first = lineScanner.nextLine();
        System.out.println("Enter another string: ");
        String second = lineScanner.nextLine();
        if (areAnagrams(first, second)) {
            System.out.println("The two strings are anagrams");
        } else {
            System.out.println("The two strings are not anagrams");
        }
    }
}
