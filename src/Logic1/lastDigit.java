/**
 *
 */
package Logic1;

/**
 * @author lunguc
 * Given three ints, a b c, return true if two or more of them have the same rightmost digit.
 * The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
 */
public class lastDigit {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public boolean lastDigit(int a, int b, int c) {
        return ((a % 10 == b % 10) || (a % 10 == c % 10) || (b % 10 == c % 10));
    }

}