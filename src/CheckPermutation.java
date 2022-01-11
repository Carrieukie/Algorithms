import java.util.Arrays;

/**
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
 * <p>
 * In other words, return true if one of s1's permutations is the substring of s2.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s1 = "ab", s2 = "eidbaooo"
 * Output: true
 * Explanation: s2 contains one permutation of s1 ("ba").
 * Example 2:
 * <p>
 * Input: s1 = "ab", s2 = "eidboaoo"
 * Output: false
 */

public class CheckPermutation {

    public static void main(String[] args) {
        System.out.println(checkInclusion("hello", "ooolkdnckalsdnvcojsandvcjawheollnsdcvjansldcsjdbviewjvbasdvsavkjsdv"));
    }

    public static boolean checkInclusion(String s1, String s2) {

        if (s2.length() < s1.length() || s2.length() == 0) return false;
        if (s1.length() == 0) return true;

        int x = s1.length(), y = s2.length();
        int[] array1 = new int[26];
        int[] array2 = new int[26];

        for (int i = 0; i < x; i++) {
            array1[s1.charAt(i) - 'a']++;
            array2[s2.charAt(i) - 'a']++;

        }

        for (int i = x; i < y; i++) {
            if (Arrays.equals(array1, array2)) {
                return true;
            }
            array2[s2.charAt(i - x) - 'a']--;
            array2[s2.charAt(i) - 'a']++;
        }
        return Arrays.equals(array1, array2);
    }
}
