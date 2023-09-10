import java.util.Arrays;

public class Subtract implements Calculation {
    @Override
    public int calculate(int[] nums) {
        return Arrays.stream(nums)
                    .reduce((total, i) -> total - i)
                    .getAsInt();
    }
}
