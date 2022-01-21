public class PalindromeReorder {
    public static void main(String[] args) {
        palindromeRedorder("ahfdha");
    }

    /**
     * Find out if a palindrome can be generated from the input string
     * @param s
     */
    private static void palindromeRedorder(String s) {
        int[] chars = new int[26];
        int c1 = 0;
        for (char c : s.toCharArray()){
            ++chars[c - 'a'];
        }
        for (int i = 0; i < 26; i++) {
            c1 += chars[i] & 1;
        }
        if (c1 > 1) {
            System.out.println("No Solution");
        }
    }

}
