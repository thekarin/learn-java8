package chap6;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class PartitionPrimeNumbersTest {

    @Test
    public void 파티션_소수_판별() {
        Map<Boolean, List<Integer>> resultMap = PartitionPrimeNumbers.partitionPrimes(100);
        System.out.println("resultMap.get(false) = " + resultMap.get(true));
    }
}