package chapter1;

public class URLify {
     static void replaceSpaces(char[] str, int trueLength) {
         int index = str.length - 1;
         for (int k = trueLength - 1; k >= 0; k--) {
             if (str[k] == ' ') {
                 str[index] = '%';
                 str[index - 1] = '0';
                 str[index - 2] = '2';
                 index -= 3;
             } else {
                 str[index] = str[k];
                 index--;
             }
         }
    }

    public static void main(String[] args) {
        String input = "Mr John Smith    ";
        char[] cs = input.toCharArray();
        int trueLength = 13;
        replaceSpaces(cs, trueLength);
        for (char c : cs) {
            System.out.print(c);
        }
    }
}
