package sislamoglu.in.kaprekar_numbers;

public class Solution {

    public static void main(String[] args) {
        Solution.kaprekarNumbers(1, 99999);
    }

    static void kaprekarNumbers(int p, int q) {
        StringBuilder sb = new StringBuilder();
        for (int i = p; i <= q; i++){
            if (isKaprekar(i)){
                sb.append(i + " ");
            }
        }
        System.out.println(sb.toString().isEmpty()? "INVALID RANGE": sb.toString().substring(0, sb.toString().length()-1));
    }

    static boolean isKaprekar(int number){
        long squaredNumber = (long) number*number;
        String squaredNumberString = String.valueOf(squaredNumber);
        String left  = squaredNumberString.substring(0, squaredNumberString.length() / 2);
        String right = squaredNumberString.substring(squaredNumberString.length() / 2);

        int leftValue = (left.isEmpty())  ? 0 : Integer.parseInt(left);
        int rightValue = (right.isEmpty()) ? 0 : Integer.parseInt(right);

        if (leftValue+rightValue == number){
            return true;
        }
        return false;
    }
}
