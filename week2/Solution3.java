package week2;

/**
 * @author rajuraghuwanshi
 */
public class Solution3 {

    //runtime beats 100% of the java submissions
    public int findJudge(int N, int[][] trust) {

        int []map = new int[N+1];

        int len = trust.length;

        for(int i=0; i<len; i++){

            map[trust[i][1]]++;
        }

        for(int i=1; i<N+1; i++){
            if(map[i]==N-1){
                for(int j=0; j<len; j++){
                    if(trust[j][0]==i){
                        return -1;
                    }
                }
                return i;
            }
        }

        return -1;
    }

    //runtime beats 86% of the java submissions
    public int findJudge2(int N, int[][] trust) {

        int []map = new int[N+1];
        int []map2 = new int[N+1];

        int len = trust.length;

        for(int i=0; i<len; i++){

            map[trust[i][1]]++;
            map2[trust[i][0]]++;

        }

        for(int i=1; i<N+1; i++){
            if(map[i]==N-1 && map2[i]==0){
                return i;
            }
        }

        return -1;
    }
}
