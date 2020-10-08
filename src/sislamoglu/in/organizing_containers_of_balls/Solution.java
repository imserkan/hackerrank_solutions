package sislamoglu.in.organizing_containers_of_balls;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Solution.organizingContainers(constructContainer(2,
                1, 1,
                1, 1)).equals("Possible"));
        System.out.println(Solution.organizingContainers(constructContainer(2,
                0, 2,
                1, 1)).equals("Impossible"));
        System.out.println(Solution.organizingContainers(constructContainer(3,
                1, 3, 1,
                2, 1, 2,
                3, 3, 3)).equals("Impossible"));
        System.out.println(Solution.organizingContainers(constructContainer(3, 0, 2, 1
                , 1, 1, 1
                , 2, 0, 0)).equals("Possible"));
        System.out.println(Solution.organizingContainers(constructContainer(2, 999336263, 998799923
                , 998799923, 999763019)).equals("Possible"));
        System.out.println(Solution.organizingContainers(constructContainer(4, 997612619, 934920795, 998879231, 999926463
                , 960369681, 997828120, 999792735, 979622676
                , 999013654, 998634077, 997988323, 958769423
                , 997409523, 999301350, 940952923, 993020546)).equals("Possible"));
    }

    static int[][] constructContainer(int n, int... values){
        int[] valuesArray = values;
        int[][] container = new int[n][n];
        int count = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                container[i][j] = valuesArray[count];
                count++;
            }
        }
        return container;

    }

    static String organizingContainers(int[][] container) {
            if (container.length != container[0].length){
                return "Impossible";
            }
            int[] totalRowValueArray = new int[container.length];
            int[] totalColumnValueArray = new int[container[0].length];

            for (int i = 0; i< totalRowValueArray.length; i++){
                for (int j = 0; j < totalColumnValueArray.length; j++){
                    totalRowValueArray[i] += container[i][j];
                    totalColumnValueArray[i] += container[j][i];
                }
            }
            Arrays.sort(totalRowValueArray);
            Arrays.sort(totalColumnValueArray);
            if (Arrays.equals(totalRowValueArray, totalColumnValueArray)){
                return "Possible";
            }else{
                return "Impossible";
            }
    }
}
