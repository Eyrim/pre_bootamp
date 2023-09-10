import java.util.Arrays;
import java.util.List;

public class Multiply implements Calculation {
    @Override
    public int calculate(List<Integer> nums) {
        return nums.stream()
                    .reduce((total, i) -> total * i)
                    .get();
    }
}
