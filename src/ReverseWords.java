import java.util.Arrays;

public class ReverseWords {

    public static void main(String[] args) {
        System.out.println(reverseWord("Let's take LeetCode contest"));
    }

    public static String reverseWord(String s) {
//        Create a string builder out of the the string -> Let's take LeetCode contest
        StringBuilder stringBuilder = new StringBuilder(s);
//        reverse the whole string -> tsetnoc edoCteeL ekat s'teL
        stringBuilder.reverse();
//        split to create an array
        String[] strings = stringBuilder.toString().split(" ");
//        remove all the characters from the initial array -> [tsetnoc, edoCteeL, ekat, s'teL]
        stringBuilder.delete(0,stringBuilder.length());
//        iterate over the array backwards adding the words into the string builder
        for (int i = strings.length -1 ; i >= 0 ; i--) {
            stringBuilder.append(strings[i]).append(" ");
        }
        return stringBuilder.toString().trim();
    }


        public static String reverseWordsIn(String s) {

        StringBuilder stringBuilder = new StringBuilder(s);

        int left = 0;
        int right = 0;
        int prevRight = 0;



        while (right < s.length() - 1) {

            if (stringBuilder.charAt(right + 1) != ' ') {
                right++;
            } else {
                prevRight = right +2;
                String reversed = String.valueOf(new StringBuilder(stringBuilder.substring(left, right + 1)).reverse());
                stringBuilder.replace(left, right + 1, reversed);
                right = prevRight;
                left = prevRight;
            }

        }

        String reversed = String.valueOf(new StringBuilder(stringBuilder.substring(left, right + 1)).reverse());
        System.out.println(reversed);
        stringBuilder.replace(left, right + 1, reversed);

        return stringBuilder.toString();

    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sBuilder = new StringBuilder();

        for (String word : words) {

            sBuilder.append(reverse(word)).append(" ");
        }

        return sBuilder.toString().trim();

    }

    private static String reverse(String word) {

        StringBuilder str = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            str.append(word.charAt(i));
        }

        return str.toString();

    }

}
