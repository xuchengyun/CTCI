package chapter1;

public class OneAway {
    // in general, put two indexes and make sure the indexes for both of them less than two string lengths
    static boolean isOneAway(String s1, String s2) {
        if (s1.length() == s2.length()) {
            return isReplace(s1, s2);
        } else if (s1.length() == s2.length() + 1) {
            return isInsert(s1, s2);
        } else if (s1.length() + 1 == s2.length()) {
            return isInsert(s2, s1);
        }
        return false;
    }

    private static boolean isReplace(String s1, String s2) {
        try {
            if (s1.length() != s2.length()) {
                throw new Exception();
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }

        boolean flag = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (flag) return false;
                flag = true;
            }
        }
        return true;
    }

    private static boolean isInsert(String s1, String s2) {
        int j = 0;
        boolean flag = false;
        for (int i = 0; i < s2.length(); i++) {
            if (s1.charAt(i) != s2.charAt(j)) {
                if (flag) {
                    return false;
                }
               j++;
            }
            j++;
        }
        return true;
    }
}
