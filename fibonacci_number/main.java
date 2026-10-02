public class main {
    static int loop = 18;
    static int index = 0;

    public static void main(String[] args) {
        fibo(0, 1);
    }

    public static void fibo(int prev1, int prev2) {
        System.out.println("prev1: " + prev1);
        System.out.println("prev2: " + prev2);
        if (index < loop) {
            int result = prev1 + prev2;
            System.out.println(result);
            prev1 = prev2;
            prev2 = result;

            index++;
            fibo(prev1, prev2);
        }

    }
}
