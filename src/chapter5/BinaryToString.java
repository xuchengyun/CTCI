package chapter5;

/*
Given a number between 0 and 1(0.72),
print the binary representation.
 */
public class BinaryToString {
    public String printBinary(double n) {
        if (n <= 0 || n >= 1) return "ERROR";
        StringBuilder binaryBuilder = new StringBuilder(".");
        while (n > 0) {
            if (binaryBuilder.length() > 32) return "ERROR";
            if (2 * n >= 1) {
                binaryBuilder.append(1);
                n = 2 * n - 1;
            } else {
                binaryBuilder.append(0);
                n = 2 * n;
            }
        }
        return binaryBuilder.toString();
    }
}
