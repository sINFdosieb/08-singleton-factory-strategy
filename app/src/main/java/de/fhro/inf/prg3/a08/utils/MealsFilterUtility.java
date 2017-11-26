package de.fhro.inf.prg3.a08.utils;

import java.util.LinkedList;
import java.util.List;

import de.fhro.inf.prg3.a08.model.Meal;

/**
 * Simple utility class to extract the logic of filter
 * utility classes should be abstract to avoid instantiation
 * @author Peter Kurfer
 */

public abstract class MealsFilterUtility {

    /**
     * private constructor to avoid instantiation even when the class is inherited
     */
    private MealsFilterUtility() {
    }

    /**
     * Filter the given meals to remove non vegetarian ones
     * @param mealsToFilter meals to filter
     * @return list of vegetarian meals
     */
    public static List<Meal> filterForVegetarian(List<Meal> mealsToFilter) {
        List<Meal> result = new LinkedList<>();
        /* iterate all the meals */
        for (Meal m : mealsToFilter) {
            /* check if meal is vegetarian */
            if (m.isVegetarian()) {
                result.add(m);
            }
        }
        return result;
    }
}
