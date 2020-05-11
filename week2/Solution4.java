package week2;

/**
 * @author rajuraghuwanshi
 */
public class Solution3 {

    //Use BFS runtime beats 10 % of the java submissions
    public int[][] floodFill2(int[][] image, int sr, int sc, int newColor) {

        if (newColor == image[sr][sc]) {
            return image;
        }
        Queue<int[]> q = new LinkedList<>();

        int[] h = {0, -1, 0, 1};
        int[] v = {-1, 0, 1, 0};

        int color = image[sr][sc];
        int max_row = image.length;
        int max_col = image[0].length;

        q.add(new int[]{sr, sc});

        while (!q.isEmpty()) {

            int[] index = q.poll();

            image[index[0]][index[1]] = newColor;
            for (int j = 0; j < 4; j++) {
                int cur_row = index[0] + h[j];
                int cur_col = index[1] + v[j];

                if ((cur_row >= 0 && cur_row < max_row && cur_col >= 0 && cur_col < max_col) && (image[cur_row][cur_col] == color)) {
                    q.add(new int[]{cur_row, cur_col});
                }

            }

        }

        return image;

    }

    static final int[] h = {0, -1, 0, 1};
    static final int[] v = {-1, 0, 1, 0};

    //Use DFS runtime beats 100 % of the java submissions
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        if (newColor == image[sr][sc]) {
            return image;
        }


        dfsUtil(image,sr,sc,newColor,image[sr][sc]);

        return image;

    }
    static void dfsUtil(int[][] image, int r, int c, int newColor,int startColor){

        if(r<0 || r>=image.length || c<0 || c>=image[0].length){
            return;
        }
        if(image[r][c]!=startColor){
            return;
        }
        image[r][c] = newColor;

        for(int i=0; i<4; i++){
            dfsUtil(image,r+h[i],c+v[i],newColor,startColor);
        }


    }
}
