import java.util.Arrays;

public class Add implements Calculation {
    @Override
    public int calculate(int[] nums) {
        return Arrays.stream(nums)
                    .reduce((total, i) -> total + i)
                    .getAsInt();
    }
}
