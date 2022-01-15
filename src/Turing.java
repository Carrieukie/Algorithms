import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Turing {


    public static void main(String[] args) {

        System.out.println(Arrays.toString(missinDuplicate(new int[]{1, 2, 3, 4, 5, 3})));

        IntStream.range(0,100)
                .filter( i -> i % 2 == 0)
                .forEach(System.out::println);
    }

    public static int[] missinDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = arr[i] < 0 ? arr[i] * -1 : arr[i];
            if (arr[index] < 0) {
                return new int[]{index, i + 1};
            } else {
                arr[index] = arr[index] * -1;
            }
        }
        return null;
    }

    public static int calcpoints(String[] ops) {
        ArrayList<Integer> points = new ArrayList<>();

        for (String string : ops) {
            if (string.matches("-?\\d+")) {
                points.add(Integer.valueOf(string));
            }
            if (string.equals("+")) {
                points.add(points.get(points.size() - 1) + points.get(points.size() - 2));
            }
            if (string.equals("D")) {
                points.add(2 * points.get(points.size() - 1));
            }
            if (string.equals("C")) {
                points.remove(points.size() - 1);
            }
        }
        int ans = 0;
        for (Integer integer : points) {
            ans += integer;
        }
        return ans;
    }
}
