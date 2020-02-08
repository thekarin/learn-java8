package chap6;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.IntSummaryStatistics;

import static chap6.Dish.menu;
import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class SummarizingTest {

    @Test
    public void howManyDishes() {
        assertThat(Summarizing.howManyDishes()).isEqualTo(menu.size());
    }

    @Test
    public void findMostCaloricDish() {
        Dish mostCaloricDish = Summarizing.findMostCaloricDish();
        assertThat(mostCaloricDish.getName()).isEqualTo("pork");

        mostCaloricDish = Summarizing.findMostCaloricDishUsingComparator();
        assertThat(mostCaloricDish.getName()).isEqualTo("pork");
    }

    @Test
    public void calculateTotalCalories() {
        assertThat(Summarizing.calculateTotalCalories()).isEqualTo(4300);
    }

    @Test
    public void calculateAverageCalories() {
        assertThat(Summarizing.calculateAverageCalories()).isEqualTo(477.77777777777777);
    }

    @Test
    public void calculateMenuStatistics() {
        final IntSummaryStatistics intSummaryStatistics = Summarizing.calculateMenuStatistics();
        log.info("{}", intSummaryStatistics);
    }

    @Test
    public void getShortMenu() {
        assertThat(Summarizing.getShortMenu()).isEqualTo("porkbeefchickenfrench friesriceseason fruitpizzaprawnssalmon");
    }

    @Test
    public void getShortMenuCommaSeparated() {
        assertThat(Summarizing.getShortMenuCommaSeparated()).isEqualTo("pork, beef, chicken, french fries, rice, season fruit, pizza, prawns, salmon");
    }
}