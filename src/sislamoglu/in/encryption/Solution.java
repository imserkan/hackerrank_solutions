package sislamoglu.in.encryption;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Solution.encryption("haveaniceday").equals("hae and via ecy"));
        System.out.println(Solution.encryption("feedthedog").equals("fto ehg ee dd"));
        System.out.println(Solution.encryption("chillout").equals("clu hlt io"));
        System.out.println(Solution.encryption("iffactsdontfittotheorychangethefacts").equals("isieae fdtonf fotrga anoyec cttctt tfhhhs"));
    }

    static String encryption(String s) {
        return reconstructSquaretizedArray(squaretize(s));
    }

    static char[][] squaretize(String input){
        int size = input.length();
        Double aDouble = Math.sqrt(size);
        int n = Math.floor(aDouble) - aDouble == 0? aDouble.intValue() : aDouble.intValue()+1;

        char[][] characterArray = new char[n][n];

        int count = 0;
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                try{
                    characterArray[i][j] = input.charAt(count);
                    count++;
                }catch (Exception ex){
                    break;
                }

            }
        }
        return characterArray;
    }

    static String reconstructSquaretizedArray(char[][] charArray){
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < charArray[0].length; j++){
            for (int i = 0; i < charArray.length; i++){
                if (charArray[i][j] != '\u0000'){
                    sb.append(charArray[i][j]);
                }
            }
            sb.append(" ");
        }
        return sb.toString().substring(0, sb.length() -1);
    }

}
