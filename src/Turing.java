import java.util.ArrayList;
import java.util.Arrays;

public class Turing {

    public static void main(char[] args) {
        System.out.println("kk");
    }

    public static void main(String[] args) {

        String one = "yes";
        String two = "yes";
        String h = one;
        System.out.println(one == two);

    }


        public static int calcpoints(String[] ops){
        ArrayList<Integer> points = new ArrayList<>();

        for (String string : ops){
            if(string.matches("-?\\d+")){
                points.add(Integer.valueOf(string));
            }
            if (string.equals("+")){
                points.add(points.get(points.size()-1) + points.get(points.size()-2));
            }
            if (string.equals("D")){
                points.add(2 * points.get( points.size()-1));
            }
            if (string.equals("C")){
                points.remove(points.size()-1);
            }
        }
        int ans = 0;
        for (Integer integer: points){
            ans += integer;
        }
        return ans;
    }
}
