public class Average {
    public static void main(String[] args) {
        System.out.println(average(10, 20, 30, 40, 50)); // ... ellipses indicates variable number of arguments.
    }
    
    static double average(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length; // Cast to double for accurate average.
    }
}
