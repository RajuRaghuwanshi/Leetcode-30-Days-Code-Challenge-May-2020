package week2;

/**
 * @author rajuraghuwanshi
 */
public class Solution5 {

    public int singleNonDuplicate2(int[] nums) {

        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result ^= nums[i];
        }

        return result;
    }

    public int singleNonDuplicate(int[] nums) {


        int start = 0;
        int end = nums.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (mid % 2 == 0) {

                if (nums[mid] == nums[mid + 1]) {
                    start = mid + 2;
                } else {
                    end = mid - 1;
                }

            } else {

                if (nums[mid] == nums[mid - 1]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            }
        }

        return nums[start];
    }
}
