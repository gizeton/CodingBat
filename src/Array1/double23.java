/**
 *
 */
package Array1;

/**
 * @author LunguC
 * Given an int array, return true if the array contains 2 twice, or 3 twice.
 * The array will be length 0, 1, or 2.
 */
public class double23 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public boolean double23(int[] nums) {
        if (nums.length == 2) {
            if (nums[0] == 2 && nums[1] == 2)
                return true;
            return (nums[0] == 3 && nums[1] == 3);
        }
        return false;
    }

}