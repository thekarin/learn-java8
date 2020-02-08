package chap6;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ReducingTest {

    @Test
    public void calculateTotalCalories() {
        assertThat(Reducing.calculateTotalCalories()).isEqualTo(4300);
    }

    @Test
    public void calculateTotalCaloriesWithMethodReference() {
        assertThat(Reducing.calculateTotalCaloriesWithMethodReference()).isEqualTo(4300);
    }

    @Test
    public void calculateTotalCaloriesWithoutCollectors() {
        assertThat(Reducing.calculateTotalCaloriesWithoutCollectors()).isEqualTo(4300);
    }

    @Test
    public void calculateTotalCaloriesUsingSum() {
        assertThat(Reducing.calculateTotalCaloriesUsingSum()).isEqualTo(4300);
    }
}