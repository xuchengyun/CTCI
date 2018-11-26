class IsUnique {
    // only check for 26 lower case character
    public static boolean isUnique(String s) {
        int checker = 0;
        for (char c : s.toCharArray()) {
            int val = c - 'a';
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
    return true;
    }

    public static void main(String[] args) {
        String s1 = "aasvs";
        String s2 = "basf";
        System.out.println(isUnique(s1));
        System.out.println(s2);
    }

}
