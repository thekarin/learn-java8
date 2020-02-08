package chap6;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.function.BinaryOperator;

import static chap6.Dish.menu;
import static java.util.stream.Collectors.*;

public class Summarizing {

    public static long howManyDishes() {
        menu.stream().toArray();
        return menu.stream().collect(counting());
    }

    public static Dish findMostCaloricDish() {
        return menu.stream().collect(reducing((d1, d2) -> d1.getCalories() > d2.getCalories() ? d1 : d2)).get();
    }

    public static Dish findMostCaloricDishUsingComparator() {
        final Comparator<Dish> dishCaloriesComparator = Comparator.comparingInt(Dish::getCalories);
        final BinaryOperator<Dish> moreCaloricOf = BinaryOperator.maxBy(dishCaloriesComparator);
        return menu.stream().collect(reducing(moreCaloricOf)).get();
    }

    public static int calculateTotalCalories() {
        return menu.stream().collect(summingInt(Dish::getCalories));
    }

    public static Double calculateAverageCalories() {
        return menu.stream().collect(averagingInt(Dish::getCalories));
    }

    public static IntSummaryStatistics calculateMenuStatistics() {
        return menu.stream().collect(summarizingInt(Dish::getCalories));
    }

    public static String getShortMenu() {
        return menu.stream().map(Dish::getName).collect(joining());
    }

    public static String getShortMenuCommaSeparated() {
        return menu.stream().map(Dish::getName).collect(joining(", "));
    }
}
