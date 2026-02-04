public class Main{
    public static void main(String[] args) {
        
        int [] numbers = {10, 20, 30, 40, 50};
        int target = 30;
        
        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers [i])
            {
                System.out.println("Element found at index: " + i);
                break;
            }
        }
    }
}