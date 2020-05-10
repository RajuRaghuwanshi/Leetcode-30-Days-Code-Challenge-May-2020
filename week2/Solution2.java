package week2;

/**
 * @author rajuraghuwanshi
 */
public class Solution2 {
    //runtime beats 100% of the java submissions
    public boolean isPerfectSquare2(int num) {

        if (num <= 1) {
            return true;
        }
        long lowerBound = 1;
        long upperBound = num / 2;

        while (lowerBound <= upperBound) {

            long mid = lowerBound + (upperBound - lowerBound) / 2;

            if (mid * mid == num) {
                return true;
            }
            if (mid * mid < num) {
                lowerBound = mid + 1;
            } else {
                upperBound = mid - 1;
            }

        }

        return false;

    }

    //runtime beats 100% of the java submissions
    public boolean isPerfectSquare(int num) {

        if (num <= 0) {
            return false;
        }

        double sqrtValue = Math.sqrt(num);

        return sqrtValue - Math.ceil(sqrtValue) == 0 ? true : false;
    }
}
