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
