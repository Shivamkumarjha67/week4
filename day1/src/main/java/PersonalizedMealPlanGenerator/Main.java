package PersonalizedMealPlanGenerator;

public class Main {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegetarianPlan = generateMealPlan(VegetarianMeal.class, "My Vegetarian Plan");
        displayMealPlan(vegetarianPlan);

        Meal<VeganMeal> veganPlan = generateMealPlan(VeganMeal.class, "My Vegan Plan");
        displayMealPlan(veganPlan);

        Meal<KetoMeal> ketoPlan = generateMealPlan(KetoMeal.class, "My Keto Plan");
        displayMealPlan(ketoPlan);

        Meal<HighProteinMeal> highProteinPlan = generateMealPlan(HighProteinMeal.class, "My High Protein Plan");
        displayMealPlan(highProteinPlan);
    }

    // Generic method to generate and validate a personalized meal plan
    public static <T extends MealPlan> Meal<T> generateMealPlan(Class<T> mealType, String planName) {
        try {
            // Creating instance using reflection
            T mealPlan = mealType.getDeclaredConstructor(String.class).newInstance(planName);

            // Add meals based on meal type (replace with your logic)
            if (mealPlan instanceof VegetarianMeal) {
                ((VegetarianMeal) mealPlan).addMeal("Vegetable Curry");
                ((VegetarianMeal) mealPlan).addMeal("Lentil Soup");
            } else if (mealPlan instanceof VeganMeal) {
                ((VeganMeal) mealPlan).addMeal("Tofu Scramble");
                ((VeganMeal) mealPlan).addMeal("Black Bean Burgers");
            } else if (mealPlan instanceof KetoMeal) {
                ((KetoMeal) mealPlan).addMeal("Steak and Avocado");
                ((KetoMeal) mealPlan).addMeal("Salmon with Asparagus");
            } else if (mealPlan instanceof HighProteinMeal) {
                ((HighProteinMeal) mealPlan).addMeal("Chicken");
                ((HighProteinMeal) mealPlan).addMeal("Greek Yogurt");
            }

            // Validation logic (replace with your specific rules)
            if (mealPlan.getMeals().isEmpty()) {
                throw new IllegalArgumentException("Meal plan cannot be empty.");
            }

            return new Meal<>(mealPlan);

        } catch (Exception e) {
            System.err.println("Error generating meal plan: " + e.getMessage());
            return null; // Or throw an exception if you prefer
        }
    }

    public static void displayMealPlan(Meal<? extends MealPlan> meal) {
        if (meal != null) {
            System.out.println("Meal Plan: " + meal.getMealPlan().getName());
            for (String mealItem : meal.getMealPlan().getMeals()) {
                System.out.println("- " + mealItem);
            }
        }
    }
}
