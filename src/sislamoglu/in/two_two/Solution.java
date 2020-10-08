package sislamoglu.in.two_two;

import java.math.BigInteger;

//TODO: UNSOLVED. solve the team limits case, most prob 2^800 after some value its not necessary to check remaining
public class Solution {

    public static void main(String[] args) {
        System.out.println(Solution.twoTwo("2222222") == 7);
        System.out.println(Solution.twoTwo("24256") == 4);
        System.out.println(Solution.twoTwo("65536") == 1);
        System.out.println(Solution.twoTwo("023223") == 4);
        System.out.println(Solution.twoTwo("33579") == 0);
        System.out.println(Solution.twoTwo("9303535670983768199031344740966458039726609416797671171603074549512182887851493418575245449136173639177760276560207077549242900846267596823817051317718446589520242536874132581700120107002038199303870846751188192899823151552628349788604516295066307994130118526061826166445047808309163001841380667575628151274558987543914186376514799892578820116121531383164833962895501326553806236997089282520174174189206292883439012459432693877366459895758465185873923518437208883287869410049671804351768330228241833181048771841834309240249132277574952747489997467168763400466618303709392785810954982875161446396373040800947562126272731545618170968107390172263733095197200113358841034017182951507037254979515982202834948083154776267844089139019063040156654448338365040715366458968162887836583628774290327941701420576894069006881693378223441337877537377325813845730080900918242835443359855685076558915384842574884883772410178635875682021801984576460752303423488223007451985306231415357182726483615059804162147483648324"));
    }

    static int twoTwo(String a) {
        int[] arr = new int[a.length()];
        for (int i = 0; i < a.length(); i++){
            arr[i] = Integer.valueOf(String.valueOf(a.charAt(0)));
        }
        int count = 0;
        for (int i = 0; i < a.length(); i++){
            for (int j = i+1; j <= a.length(); j++){
                String substringVal = a.substring(i, j);
                if (!substringVal.startsWith("0")){
                    BigInteger bigInteger = new BigInteger(a.substring(i, j));
                    if (isPowerOfTwo(bigInteger)) {
                        count++;
                        int index = (int)(Math.ceil((Math.log(bigInteger.longValue()) / Math.log(2))));
                        if (Math.pow(2, index) >= 800){
                            break;
                        }

                    }
                }
            }
        }
        return count;
    }

    static boolean isPowerOfTwo(BigInteger n)
    {
        if(n.intValue()==0)
            return false;

        return (int)(Math.ceil((Math.log(n.longValue()) / Math.log(2)))) ==
                (int)(Math.floor(((Math.log(n.longValue()) / Math.log(2)))));
    }
}
