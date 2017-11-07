package Warmup2;

/**
 * @author LunguC
 * Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
 */
public class countXX {
    /**
     * @param args
     */
    public static void main(String[] args) {
        countXX c = new countXX();
        System.out.println(c.countXX("abcxx"));
        System.out.println(c.countXX("xxx"));
        System.out.println(c.countXX("axxxx"));

    }

    public int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                count++;

            }
        }
        return count;
    }

}
