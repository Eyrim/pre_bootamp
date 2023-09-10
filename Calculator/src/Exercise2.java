import java.util.Random;
import java.util.Scanner;

public class Exercise2 {
    public static void exercise2() {
        Scanner scanner = new Scanner(System.in);
        int[] nums = getNumsFromUser(scanner);
        String input;

        System.out.println("Enter an operation to perform (+, *, -):");
        input = scanner.next();

        System.out.println(calculate(input, nums));
        scanner.close();
    }

    //TODO: 10/09/2023: Potentially stop using the same scanner across multiple methods? Unsure if bad practice
    private static int[] getNumsFromUser(Scanner scanner) {
        int[] nums;

        System.out.println("How many numbers?");
        // Create new array for however many numbers user specified
        nums = new int[Integer.parseInt(scanner.next())];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter number: " + (i+1));
            nums[i] = Integer.parseInt(scanner.next());
        }

        return nums;
    }

    private static int[] getRandomNums(int quantity) {
        Random rand = new Random();
    
        return rand.ints(quantity).toArray();
    }

    private static Integer calculate(String operation, int[] nums) {
        switch (operation) {
            case "+":
                return new Add().calculate(nums);

            case "*":
                return new Multiply().calculate(nums);

            case "-":
                return new Subtract().calculate(nums);

            default:
                return null;
        }
    }
}
