/**
 *
 */
package Logic1;

/**
 * @author lunguc
 * Given 2 ints, a and b, return their sum.
 * However, "teen" values in the range 13..19 inclusive, are extra lucky.
 * So if either value is a teen, just return 19.
 */
public class teenSum {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public int teenSum(int a, int b) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return 19;
        } else {
            return (a + b);
        }
    }

}
