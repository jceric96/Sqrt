public class Sqrt {
    // O(logn)
    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        long begin = (long) 0;
        long end = (long) x / 2 + 1;
        while (begin < end) {
            long p = (begin + end + 1) / 2;
            if (p * p == x) {
                return (int) p;
            } else if (p * p < x) {
                begin = p;
            } else {
                end = p - 1;
            }
        }
        return (int) begin;
    }

    public static void main(String[] args) throws Exception {
        Sqrt sqrt = new Sqrt();
        System.out.println(sqrt.mySqrt(16));
    }
}
