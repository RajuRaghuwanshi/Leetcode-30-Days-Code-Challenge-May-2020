package week2;

/**
 * @author rajuraghuwanshi
 */
public class Solution1 {

    static double findSlope(int x1, int y1, int x2, int y2) {

        if (x2 - x1 == 0) {
            return 0;
        }
        return (double) (y2 - y1) / (x2 - x1);

    }

    public boolean checkStraightLine(int[][] coordinates) {

        int numberOfcoordinates = coordinates.length;

        if (numberOfcoordinates == 2) {
            return true;
        }

        double slope = findSlope(coordinates[0][0], coordinates[0][1], coordinates[1][0], coordinates[1][1]);

        for (int i = 1; i < numberOfcoordinates - 1; i++) {

            double newSlope = findSlope(coordinates[i][0], coordinates[i][1], coordinates[i + 1][0], coordinates[i + 1][1]);

            if (slope != newSlope) {
                return false;
            }

        }

        return true;
    }
}
