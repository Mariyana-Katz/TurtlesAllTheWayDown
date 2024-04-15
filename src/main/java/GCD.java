public class GCD {
    public static int gcd(int i, int j) {
        if (j == 0) return i;
        if (i == 0) return j;

        // p and q even
        if ((i & 1) == 0 && (j & 1) == 0) return gcd(i >> 1, j >> 1) << 1;

            // p is even, q is odd
        else if ((i & 1) == 0) return gcd(i >> 1, j);

            // p is odd, q is even
        else if ((j & 1) == 0) return gcd(i, j >> 1);

            // p and q odd, p >= q
        else if (i >= j) return gcd((i-j) >> 1, j);

            // p and q odd, p < q
        else return gcd(i, (j-i) >> 1);
    }

}
