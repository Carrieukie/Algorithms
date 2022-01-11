import java.util.HashSet;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 * <p>
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 * <p>
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringNoRepeating {

    public static void main(String[] args) {
        System.out.println((lengthOfLongestSubstring("pwwkew")));
    }


    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        int ans = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                set.clear();
                i = ++left;
                set.add(s.charAt(i));
            }else {
                set.add(c);
            }
            ans = Math.max(ans, set.size());
        }

        return ans;
    }

}
