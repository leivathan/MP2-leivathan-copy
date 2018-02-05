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
public static boolean checkPassword(String password, int minLength, int minLetter, int minNumber, int minSpecial){
    boolean validPass = false;
    int numberOfLetters = 0;
    int numberOfNumbers = 0;
    int numberOfSpecials = 0;
    for (int i = 0; i < password.length(); i++) {
        if (password.charAt(i) == 'a' || password.charAt(i) == 'b' || password.charAt(i) == 'c' || password.charAt(i) == 'd' || password.charAt(i) == 'e' || password.charAt(i) == 'f' || password.charAt(i) == 'g' ||password.charAt(i) == 'h' || password.charAt(i) == 'i' || password.charAt(i) == 'j' || password.charAt(i) == 'k' || password.charAt(i) == 'l' || password.charAt(i) == 'm' || password.charAt(i) == 'n' || password.charAt(i) == 'o' || password.charAt(i) == 'p' || password.charAt(i) == 'q' || password.charAt(i) == 'r' || password.charAt(i) == 's' || password.charAt(i) == 't' || password.charAt(i) == 'u' || password.charAt(i) == 'v' || password.charAt(i) == 'w' || password.charAt(i) == 'x' || password.charAt(i) == 'y' || password.charAt(i) == 'z') {
            numberOfLetters += 1;
        } else if (password.charAt(i) == 'A' || password.charAt(i) == 'B' || password.charAt(i) == 'C' || password.charAt(i) == 'D' || password.charAt(i) == 'E' || password.charAt(i) == 'F' || password.charAt(i) == 'G' ||password.charAt(i) == 'H' || password.charAt(i) == 'I' || password.charAt(i) == 'J' || password.charAt(i) == 'K' || password.charAt(i) == 'L' || password.charAt(i) == 'M' || password.charAt(i) == 'N' || password.charAt(i) == 'O' || password.charAt(i) == 'P' || password.charAt(i) == 'Q' || password.charAt(i) == 'R' || password.charAt(i) == 'S' || password.charAt(i) == 'T' || password.charAt(i) == 'U' || password.charAt(i) == 'V' || password.charAt(i) == 'W' || password.charAt(i) == 'X' || password.charAt(i) == 'Y' || password.charAt(i) == 'Z') {
            numberOfLetters += 1;
        }
        if (password.charAt(i) == '0' || password.charAt(i) == '1' || password.charAt(i) == '2' || password.charAt(i) == '3' || password.charAt(i) == '4' || password.charAt(i) == '5' || password.charAt(i) == '6' || password.charAt(i) == '7' || password.charAt(i) == '8' || password.charAt(i) == '9') {
            numberOfNumbers += 1;
        }
        if (password.charAt(i) == '!' || password.charAt(i) == '@' || password.charAt(i) == '#' || password.charAt(i) == '$' || password.charAt(i) == '%' || password.charAt(i) == '^' || password.charAt(i) == '&' || password.charAt(i) == '*') {
            numberOfSpecials += 1;
        }
        if (password.length() >= minLength && numberOfLetters >= minLetter && numberOfNumbers >= minNumber && numberOfSpecials >= minSpecial) {
            validPass = true;
        } else {
            validPass = false;
        }
    }
    return validPass;

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
}