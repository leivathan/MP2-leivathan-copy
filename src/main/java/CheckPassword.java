import java.util.Scanner;

/**
 * A class that validates a password based on rules.
 * <p>
 * The provided code is incomplete. Modify it so that it works properly and passes the tests in
 * <code>CheckPasswordTest.java</code>.
 *
 * @see <a href="https://cs125.cs.illinois.edu/MP/2/">MP2 Documentation</a>
 */

public class CheckPassword {
public static boolean checkPassword(final String password, final int minLength, final int minLetter,
                                    final int minNumber, final int minSpecial) {
    boolean validPass = false;
    int numberOfLetters = 0;
    int numberOfNumbers = 0;
    int numberOfSpecials = 0;
    if (password.equals("") && minLength == 0 && minLetter == 0 && minNumber == 0 && minSpecial == 0) {
        return true;
    }
    for (int i = 0; i < password.length(); i++) {
        if (Character.isLetter(password.charAt(i))) {
            numberOfLetters++;
        }
        if (Character.isDigit(password.charAt(i))) {
            numberOfNumbers++;
        }
        if (password.charAt(i) == '!' || password.charAt(i) == '@' || password.charAt(i) == '#'
                || password.charAt(i) == '$' || password.charAt(i) == '%' || password.charAt(i) == '^'
                || password.charAt(i) == '&' || password.charAt(i) == '*') {
            numberOfSpecials++;
        }
        if (password.length() >= minLength && numberOfLetters >= minLetter
                && numberOfNumbers >= minNumber && numberOfSpecials >= minSpecial) {
            validPass = true;
        } else {
            validPass = false;
        }
    }
    return validPass;
}
    /**
     * Given a potential password check it against provided rules.
     * <p>
     * The function is passed a length and letter, number, and special character counts.
     * It should return true if the password is the appropriate length and has the required number of letters,
     * numbers, and special characters, and false otherwise. !,@,#,$,%,^,&amp; (ampersand),
     * and * count as special characters.
     * <p>
     * The counts may be zero, in which case there are no requirements for that rule. For example, if
     * numberCount == 0 then the password does not have to contain a number. Of course, it still can.
     * <p>
     * The passed password string may be empty but will not be null.
     * <p>
     * Declare and write this function.
     *
     * @param validPass the boolean that gets the true/false value for a valid password.
     * @param password the password to check
     * @param minLength the minimum length for the password
     * @param minLetter the minimum number of letters the password must contain
     * @param minNumber the minimum number of letters that the password must contain
     * @param minSpecial the minimum number of special characters that the password must contain
     * @return true if the password follows the rules, false otherwise
     */

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
        System.out.println("The rules are the password must be 10 characters "
                        + "and contain two digits and one special character");
        System.out.println("Enter a password to check: ");
        String password = lineScanner.nextLine();
        final int minLength = 10;
        if (checkPassword(password, minLength, 0, 2, 1)) {
            System.out.println("The password is valid");
        } else {
            System.out.println("The password is invalid");
        }
    }
}