package CheckIfItIsaStraightLine;

public class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length <= 2)
            return true;
        int[] vector = new int[2];
        vector[0] = coordinates[1][0] - coordinates[0][0];
        vector[1] = coordinates[1][1] - coordinates[0][1];

        int[] vector2 = new int[2];
        for (int i = 2; i < coordinates.length; i++) {
            vector2[0] = coordinates[i][0] - coordinates[0][0];
            vector2[1] = coordinates[i][1] - coordinates[0][1];
            int crossProduct = vector2[0] * vector[1] - vector2[1] * vector[0];
            if (crossProduct != 0)
                return false;
        }

        return true;
    }
}
