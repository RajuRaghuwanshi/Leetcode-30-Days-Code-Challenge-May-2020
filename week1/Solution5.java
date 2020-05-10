package week1;

/**
 * @author rajuraghuwanshi
 */
public class Solution5 {
    public int firstUniqChar(String s) {

        int[] index = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int value = s.charAt(i) - 97;
            if (index[value] > 0) {
                index[value] = -1;
            } else if (index[value] == 0) {
                index[value] = i + 1;
            }

        }
        int indexValue = Integer.MAX_VALUE;
        ;
        for (int i = 0; i < 26; i++) {
            if (index[i] > 0) {
                indexValue = Math.min(indexValue, index[i]);
            }
        }

        return indexValue == Integer.MAX_VALUE ? -1 : indexValue - 1;
    }
}
