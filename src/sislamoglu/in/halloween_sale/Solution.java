package sislamoglu.in.halloween_sale;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Solution.howManyGames(20, 3, 6, 80) == 6);
        System.out.println(Solution.howManyGames(20, 3, 6, 85) == 7);
        System.out.println(Solution.howManyGames(16, 2, 1, 9981) == 9917);
        System.out.println(Solution.howManyGames(9, 16, 7, 324) == 46);
    }

    static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        return howManyGames(s, p, d, m, 0);
    }

    static int howManyGames(int currentMoney, int currentPrice, int discountPrice, int minValue, int count){
        if (currentPrice == 1){
            return count+currentMoney;
        }
        int money = currentMoney - currentPrice;
        count++;
        if (money < 0){
            return count-1;
        }else if (money == 0){
            return count;
        }
        currentPrice = (currentPrice-discountPrice) <= minValue? minValue : currentPrice-discountPrice;
        return howManyGames(money, currentPrice, discountPrice, minValue, count);
    }
}
