package chapter5;

public class Conversion {
    public int convert(int a, int b) {
        // Leverage XOR to check if two bits are same
        int cnt = 0;
        for (int n = a ^ b; n > 0; n = n >>> 1) {
            if ((n & 1) == 1) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Conversion c = new Conversion();
        int a = 29, b = 15;
        System.out.println(c.convert(a, b));
    }
}
