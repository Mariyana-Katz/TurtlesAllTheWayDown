public class Factorial {

    public static long factorial(int i) {
        if (i == 1)
            return 1;
        else
            return i * factorial(i - 1);
    }
}