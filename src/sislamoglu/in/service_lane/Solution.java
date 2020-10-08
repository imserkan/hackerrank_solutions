package sislamoglu.in.service_lane;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.equals(
                Solution.serviceLane(
                        new int []{2, 3, 1, 2, 3, 2, 3, 3},
                        new int [][]{{0, 3}, {4, 6}, {6, 7}, {3, 5}, {0, 7}}
                        ),
                new int[]{1, 2, 3, 2, 1})
        );
        System.out.println(Arrays.equals(
                Solution.serviceLane(
                        new int []{1, 2, 2, 2, 1},
                        new int [][]{{2, 3}, {1, 4}, {2, 4}, {2, 4}, {2, 3}}
                ),
                new int[]{2, 1, 1, 1, 2})
        );
    }

    static int[] serviceLane(int[] width, int[][] cases) {
        int[] result = new int[cases.length];
        for (int i = 0; i < cases.length; i++){
            int start = cases[i][0];
            int end = cases[i][1];
            int min = Integer.MAX_VALUE;
            for (int j = start; j <= end; j++){
                if (min > width[j]){
                    min = width[j];
                }
            }
            result[i] = min;
        }
        return result;
    }
}
