import java.util.Scanner;

/**
 * A class that produces a multiplication table.
 * <p>
 * The provided code is incomplete. Modify it so that it works properly and passes the tests in
 * <code>TimesTableTest.java</code>.
 *
 * @see <a href="https://cs125.cs.illinois.edu/MP/2/"/>MP2 Documentation</a>
 * </p>
 *
 */


public class TimesTable {
    /**
     * Given two positive numbers first and second, produce a multiplication table for numbers first through second, inclusive.
     * <p>
     * For example, if create(4, 6) produces the following 2D array: [[0, 4, 5, 6] [4, 16, 20, 24] [5, 20, 25, 30] [6, 24, 30, 36]]
     * </p>
     * <p>
     * Note that:
     *     <ul>
     *         <li>The output array should always start with a zero, such that output[0][0] == 0.</li>
     *         <li>The output array is symmetric, such that output[n][m] == output[m][n].</li>
     *     </ul>
     * </p>
     * <p>
     * You should reject any values of first and second that are not positive.
     * You should also reject the case where second is not greater than first. In these cases create return null.
     * </p>
     * @param first the number to start the multiplication table at
     * @param second the number to end the multiplication table with
     * @return the two-dimensional multiplication table, or null if the arguments are invalid
     */
    public static int[][] createTimesTable(final int first, final int second) {
        if (first <= 0 || second <= 0) {
            return null;
        }
        if (second <= first) {
            return null;
        }
        int difference = second - first;
        int[][] timesTable = new int[difference + 2][difference + 2];
        timesTable[0][0] = 0;
        for (int i = 0; i < difference + 1; i++) {
           for (int j = 0; j < difference + 1; j++) {
             timesTable[i + 1][j + 1] = (first + i) * (first + j);
           }
           timesTable[i + 1][0] = first + i;
           timesTable[0][i + 1] = first + i;
        }

        for (int i = 0; i < difference + 2; i++) {
            for (int j = 0; j < difference + 2; j++) {
                System.out.print(timesTable[i][j] + " ");
            }
            System.out.println();
        }
        return timesTable;
    }
    public static void main(final String[] unused) {
        Scanner lineScanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        int first = lineScanner.nextInt();
        System.out.println("Enter another string: ");
        int second = lineScanner.nextInt();
        int[][] ans  = createTimesTable(first, second);
    }
}
/**
 * Given two positive numbers first and second, produce a multiplication table for numbers through first and second, inclusive.
 */
