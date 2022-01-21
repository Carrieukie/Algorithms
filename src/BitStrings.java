public class BitStrings {

    public static void main(String[] args) {
        System.out.println(numberOfStrings(2));
    }

    private static int numberOfStrings(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *=2;
        }
        return ans;
    }

}
