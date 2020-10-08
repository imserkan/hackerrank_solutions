package sislamoglu.in.lisa_workbook;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Solution.workbook(5, 3, new int[]{4, 2, 6, 1, 10}) == 4);
    }

    // Complete the workbook function below.
    static int workbook(int n, int k, int[] arr) {
        int result = 0;
        int page = 1;
        for(int i = 0; i < arr.length; i++) {
            int problems = arr[i];
            // problems
            for(int problem = 1; problem <= problems; problem++) {
                if(problem == page) {
                    result++;
                }
                if((problem % k == 0) || problem == problems) {
                    page++;
                }
            }
        }
        return result;
    }
}
