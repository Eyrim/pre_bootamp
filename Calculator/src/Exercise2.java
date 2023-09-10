import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    public static void exercise2() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = getNumsFromUser(scanner);
        String input;

        System.out.println("Enter an operation to perform (+, *, -):");
        input = scanner.next();

        System.out.println(calculate(input, nums));
        scanner.close();
    }

    //TODO: 10/09/2023: Potentially stop using the same scanner across multiple methods? Unsure if bad practice
    private static ArrayList<Integer> getNumsFromUser(Scanner scanner) {
        ArrayList<Integer> nums = new ArrayList<>();
        String next;

        // Get the first input
        System.out.println("Enter a number:");
        next = scanner.next().toLowerCase();

        while (!next.equals("done")) {
            nums.add(Integer.parseInt(next));

            System.out.println("Enter another number");
            next = scanner.next().toLowerCase();
        }

        return nums;
    }

    private static int[] getRandomNums(int quantity) {
        Random rand = new Random();
    
        return rand.ints(quantity).toArray();
    }

    private static Integer calculate(String operation, List<Integer> nums) {
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
