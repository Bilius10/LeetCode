import java.util.*;

public class removeElement {

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 2;

        int k = removeElemento(nums, val);

    }

    public static int removeElemento(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }


}
