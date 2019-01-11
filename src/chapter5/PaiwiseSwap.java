package chapter5;

public class PaiwiseSwap {
    public int swapPairwise(int a) {
        return (((a & 0xaaaaaaaa) >>> 1) | ((a & 0x55555555) << 1));
    }
}
