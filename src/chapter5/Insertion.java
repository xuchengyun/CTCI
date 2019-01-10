package chapter5;

/*
Example:
input: N = 100000000000, M = 10011, i = 2, j = 6
output: N= 10001001100

step1: clear bit j through i in N
step2: shift M so that it fit the potion length with bit j through i
step3: Merge M and N
 */
public class Insertion {
    public int insert(int M, int N, int i, int j) {
        int allOnes = ~0;
        int left = ~0 << (j + 1);
        int right = ~0 >> i;
        int mask = left & right;
        int n_cleared = N & mask;
        int m_shifted = M << i;
        return n_cleared | m_shifted;
    }
}
