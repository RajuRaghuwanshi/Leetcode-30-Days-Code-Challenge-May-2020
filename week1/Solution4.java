package week1;

/**
 * @author rajuraghuwanshi
 */
public class Solution4 {

    public int findComplement(int num) {

        int maxBits = countBits(num);

        for (int i = 0; i < maxBits; i++) {
            num = num ^ (1 << i);
        }

        return num;
    }

    static int countBits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n >>= 1;
        }

        return count;
    }
}
