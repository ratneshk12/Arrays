public class VARARGS { // VARARGS: Variable Arguments.
    public static void main(String[] args) {
        System.out.println(add(10, 20,30,40,50)); // ... ellipses indicates variable number of arguments.
        System.out.println(add(1,2,3));
    }

    static int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
