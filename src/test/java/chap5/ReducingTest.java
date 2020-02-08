package chap5;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class ReducingTest {

    @Test
    public void 리듀싱_연산_합_곱셈() {
        final List<Integer> numbers = Arrays.asList(3, 4, 5, 1, 2);
        Integer sum = numbers.stream().reduce(0, (a, b) -> a + b);
        assertThat(sum).isEqualTo(15);

        sum = numbers.stream().reduce(0, Integer::sum);
        assertThat(sum).isEqualTo(15);

        Integer multiply = numbers.stream().reduce(1, (a, b) -> a * b);
        assertThat(multiply).isEqualTo(120);
    }

    @Test
    public void 리듀싱_연산_최대값_최소값() {
        final List<Integer> numbers = Arrays.asList(3, 4, 5, 1, 2);
        Integer max = numbers.stream().reduce(0, (a, b) -> Integer.max(a, b));
        assertThat(max).isEqualTo(5);

        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        min.ifPresent((m) -> assertThat(m).isEqualTo(1));
    }
}