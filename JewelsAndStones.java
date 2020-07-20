class Solution {
    public static int numJewelsInStones(String J, String S) {
        int counter = 0;
        for(char ch: S.toCharArray()){
            if(J.contains(String.valueOf(ch))){
                counter++;
            }
        }
        return counter;
    }
}

public class JewelsAndStones {
    public static void main(String[] args) {


        String stones = "aAAbbbb";
        String jewels = "aA";

        int result = Solution.numJewelsInStones(jewels, stones );
        System.out.println(String.valueOf(result));


    }


}
