import java.util.HashSet;

public class NumSplits {

    public static void main(String[] args) {
        System.out.println(numSplits("aacaba"));
    }

    public static int numSplits(String s) {
        if (s == null) return 0;

        HashSet<Character> set = new HashSet<>();

        int[] dpLeft = new int[s.length()];
        int[] dpRight = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            set.add(c);
            dpLeft[i] = set.size();
        }

        set = new HashSet<>();

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            set.add(c);
            dpRight[i] = set.size();
        }

        int ans = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (dpLeft[i] == dpRight[i + 1]) ans++;
        }
        return ans;
    }

}
