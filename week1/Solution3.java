package week1;

/**
 * @author rajuraghuwanshi
 */
public class Solution3 {

    public boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote == null || magazine == null) {
            return false;
        }

        int[] freqMap = new int[26];
        char[] magazineArray = magazine.toCharArray();

        for (char letter : magazineArray) {
            freqMap[letter - 97]++;
        }

        int ransomNoteLength = ransomNote.length();

        for (int i = 0; i < ransomNoteLength; i++) {
            char letter = ransomNote.charAt(i);

            if (freqMap[letter - 97] > 0) {
                freqMap[letter - 97]--;
            } else {
                return false;
            }

        }

        return true;
    }
}
