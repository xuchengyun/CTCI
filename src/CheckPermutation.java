import java.util.Arrays;

/*
*  1.case sensitive or not
*  2.are there white spaces or not
*  3. how many character in the array (128 or 26)
*/
public class CheckPermutation {
    // Sorting the String
    public static boolean checkPermutation1(String s1, String s2) {
//        if (s1.length() != s2.length()) return false;
        s1 = s1.toLowerCase().replaceAll("\\s", "");
        s2 = s2.toLowerCase().replaceAll("\\s", "");
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        s1 = new String(chars1);
        s2 = new String(chars2);
        return s1.equals(s2);
    }

    // Check if two String has the same number of characters count
    public static boolean checkPermutation2(String s1, String s2) {
//        if (s1.length() != s2.length()) return false;
        int[] count = new int[26];
        s1 = s1.toLowerCase().replaceAll("\\s", "");
        s2 = s2.toLowerCase().replaceAll("\\s", "");
        for (char c : s1.toCharArray()) {
            count[c - 'a'] ++;
        }

        for(char c : s2.toCharArray()) {
            count[c - 'a']--;
            if (count[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "abs fdc SSD";
        String s2 = "abscdfssda";
        System.out.println(checkPermutation1(s1,s2));
        System.out.println(checkPermutation2(s1,s2));
    }
}
