package chapter1;
/*
* Using two pointers
*/
public class StringCompression {
    static String compressString(String s) {
        if (s.length() == 0 || s == null) return "";
        int slow = 0, fast = 0;
        char[] chars = s.toCharArray();
        StringBuilder resBuilder = new StringBuilder();
        resBuilder.append(chars[0]);
        for (int i = 1; i < chars.length; i++){
            if (chars[i] == chars[i - 1]) {
                fast++;
            } else {
                resBuilder.append(fast + 1 - slow).append(chars[i]);
                fast = i;
                slow = i;
            }
        }
        resBuilder.append(fast + 1 - slow);
        return resBuilder.toString();
    }

    public static void main(String[] args) {
        String s = "a";
        System.out.println(compressString(s));

    }
}
