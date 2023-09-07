import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Exercise2 {
    public static void exercise2() {
        int[] nums = new int[2];
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Enter the first number:");
        nums[0] = Integer.parseInt(scanner.next());
        System.out.println("Enter the second number:");
        nums[1] = Integer.parseInt(scanner.next());

        System.out.println("Enter an operation to perform (+, *, -):");
        input = scanner.next();

        System.out.println(calculate(input, nums));
        scanner.close();
    }

    private static int[] getRandomNums(int quantity) {
        Random rand = new Random();
    
        return rand.ints(quantity).toArray();
    }

    private static Integer calculate(String operation, int[] nums) {
        switch (operation) {
            case "+":
                return Arrays.stream(nums)
                    .reduce((total, i) -> total + i).getAsInt();

            case "*":
                return Arrays.stream(nums)
                    .reduce((total, i) -> total * i).getAsInt();

            case "-":
                return Arrays.stream(nums)
                    .reduce((total, i) -> total - i).getAsInt();

            default:
                return null;
        }
    }
}
