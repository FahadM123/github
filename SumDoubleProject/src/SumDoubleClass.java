public class SumDoubleClass {
    public static void main(String[] args) {
        System.out.println(sumDouble(10, 12));
        System.out.println(sumDouble(13, 12));
        System.out.println(sumDouble(8, 5));
    }

    public static int sumDouble(int a, int b) {
        int sum = a + b;
        if (a == b) {
            sum = sum * 2;
        }
        return sum;
    }
}