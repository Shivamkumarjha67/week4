package PersonalizedMealPlanGenerator;

import java.util.ArrayList;
import java.util.List;

public class VeganMeal implements MealPlan {
    private String name;
    private List<String> meals;

    public VeganMeal(String name) {
        this.name = name;
        this.meals = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<String> getMeals() {
        return meals;
    }

    public void addMeal(String meal) {
        meals.add(meal);
    }
}
