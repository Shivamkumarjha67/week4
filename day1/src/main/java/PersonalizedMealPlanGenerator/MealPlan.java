package PersonalizedMealPlanGenerator;

import java.util.List;

public interface MealPlan {
    String getName(); //Gets the name of the MealPlan
    List<String> getMeals(); //Gets the list of meals in the MealPlan
}
