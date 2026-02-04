public class SearchAnArray{
    public static void main(String[] args) {
        
        int [] numbers = {10, 20, 30, 40, 50};
        int target = 50;

        boolean isFound = false;
        
        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers [i])
            {
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println("Element found in the array.");
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}