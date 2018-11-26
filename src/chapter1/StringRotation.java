package chapter1;

public class StringRotation {

    static boolean isRoration(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        String s = s2 + s2;
        if (isSubString(s1, s2)) {
            return true;
        }
        return false;
    }

    static boolean isSubString(String s1, String s2) {
        return true;
    }
}
