import java.util.Arrays;

public class Multiply implements Calculation {
    @Override
    public int calculate(int[] nums) {
        return Arrays.stream(nums)
                    .reduce((total, i) -> total * i)
                    .getAsInt();
    }
}
