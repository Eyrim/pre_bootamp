import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Exercise2 {
    public static void exercise2() {
        int[] nums = getRandomNums(2);
        Scanner scanner = new Scanner(System.in);
        String input;

        for (int i : nums) {
            System.out.println(i);
        }

        System.out.println("Enter an operation to perform (+, *, -): ");
        input = scanner.next();
        scanner.close();

        System.out.println(calculate(input, nums));
    }

    private static int[] getRandomNums(int quantity) {
        Random rand = new Random();

        return rand.ints(quantity).toArray();
    }

    private static Integer calculate(String operation, int[] nums) {
        switch (operation) {
            case "+":
                return Arrays.stream(nums)
                    .reduce(0, 
                        (total, i) -> total + i);

            case "*":
                return Arrays.stream(nums)
                    .reduce(1, 
                        (total, i) -> total * i);

            case "-":
                return Arrays.stream(nums)
                    .reduce((total, i) -> total - i).getAsInt();

            default:
                return null;
        }
    }
}
