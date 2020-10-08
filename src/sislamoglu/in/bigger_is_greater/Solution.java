package sislamoglu.in.bigger_is_greater;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Solution.biggerIsGreater("ab").equals("ba"));
        System.out.println(Solution.biggerIsGreater("bb").equals("no answer"));
        System.out.println(Solution.biggerIsGreater("hefg").equals("hegf"));
        System.out.println(Solution.biggerIsGreater("dhck").equals("dhkc"));
        System.out.println(Solution.biggerIsGreater("dkhc").equals("hcdk"));

    }

    static String biggerIsGreater(String w) {
        for (int i = w.length() - 2; i >= 0; i--) {
            for (int j = w.length() - 1; j > i; j--) {
                if (w.charAt(j) > w.charAt(i)) {
                    String result = "";
                    for (int k = 0; k < i; k++) {
                        result += w.charAt(k);
                    }
                    result += w.charAt(j);
                    for (int t = w.length() - 1; t > i; t--) {
                        if (t != j) result += w.charAt(t);
                        else result+= w.charAt((i));
                    }
                    return result;
                }
            }
        }
        return "no answer";
    }

}
