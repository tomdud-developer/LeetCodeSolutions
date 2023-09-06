package org.leetcode.solutions.P1071_Greatest_Common_Divisor_of_Strings;

public class Solution {

    public String gcdOfStrings(String str1, String str2) {

        StringBuilder builder = new StringBuilder("");
        String result = "";


        for (int i = 0; i < str2.length() && i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i))
                return result;

            builder.append(str2.charAt(i));

            if (str1.length() % builder.length() == 0
                    && str2.length() % builder.length() == 0) {

                if (isValid(str1, builder.toString())
                        && isValid(str2, builder.toString())) {
                    result = builder.toString();
                }

            }
        }

        return result;
    }

    private boolean isValid(String str, String divider) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < str.length() / divider.length(); i++)
            builder.append(divider);

        return builder.toString().equals(str);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.gcdOfStrings("ABCABC", "ABC"));
    }
}