package sislamoglu.in.chocolate_feast;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Solution.chocolateFeast(10, 2, 5) == 6);
        System.out.println(Solution.chocolateFeast(12, 4, 4) == 3);
        System.out.println(Solution.chocolateFeast(6, 2, 2) == 5);
    }

    static int chocolateFeast(int n, int c, int m) {
        int count = 0;
        int chocolateBought = n/c;
        count+= chocolateBought;

        int extraAmount;
        do{
            extraAmount = chocolateBought / m;
            count += extraAmount;
            chocolateBought = extraAmount + chocolateBought%m;
        }while (extraAmount != 0);
        return count;
    }
}
