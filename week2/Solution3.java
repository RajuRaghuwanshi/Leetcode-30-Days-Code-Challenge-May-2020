package week2;

/**
 * @author rajuraghuwanshi
 */
public class Solution3 {

    //runtime beats 100% of the java submissions
    public int findJudge(int N, int[][] trust) {

        int[] map = new int[N + 1];

        int len = trust.length;

        for (int i = 0; i < len; i++) {

            map[trust[i][1]]++;
        }

        for (int i = 1; i < N + 1; i++) {
            if (map[i] == N - 1) {
                for (int j = 0; j < len; j++) {
                    if (trust[j][0] == i) {
                        return -1;
                    }
                }
                return i;
            }
        }

        return -1;
    }

    //runtime beats 86% of the java submissions

    public int findJudge(int N, int[][] trust) {

        int[] inDegree = new int[N + 1];
        int[] outDegree = new int[N + 1];
        int len = trust.length;

        for (int i = 0; i < len; i++) {
            inDegree[trust[i][1]]++;
            outDegree[trust[i][0]]++;
        }

        for (int i = 1; i < N + 1; i++) {
            if (inDegree[i] == N - 1 && outDegree[i] == 0) {
                return i;
            }
        }

        return -1;
    }
}
