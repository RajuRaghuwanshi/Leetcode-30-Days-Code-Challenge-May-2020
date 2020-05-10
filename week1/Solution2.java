package week1;

/**
 * @author rajuraghuwanshi
 */
public class Solution2 {
    public int numJewelsInStones(String J, String S) {

        boolean [] charMap = new boolean[123];

        char[] jArray = J.toCharArray();

        for(char c:jArray){
            charMap[c]=true;
        }

        char[] sArray = S.toCharArray();
        int result=0;
        for(char c:sArray){
            if(charMap[c]){
                result++;
            }
        }

        return result;
    }
}
