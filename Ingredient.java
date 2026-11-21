package recipeCalorieCalculator;

/**
 * One ingredient in a recipe.
 * Nutrition values are per 1 unit (e.g. calories per 1 tbsp).
 */
public class Ingredient {

    private String name;
    private double quantity;
    private String unit;
    private double caloriesPerUnit;
    private double proteinPerUnit;
    private double carbsPerUnit;
    private double fatPerUnit;

    public Ingredient(String name, double quantity, String unit, double caloriesPerUnit,
                      double proteinPerUnit, double carbsPerUnit, double fatPerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
        this.caloriesPerUnit = caloriesPerUnit;
        this.proteinPerUnit = proteinPerUnit;
        this.carbsPerUnit = carbsPerUnit;
        this.fatPerUnit = fatPerUnit;
    }

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }

    public double getCaloriesPerUnit() {
        return caloriesPerUnit;
    }

    public double getProteinPerUnit() {
        return proteinPerUnit;
    }

    public double getCarbsPerUnit() {
        return carbsPerUnit;
    }

    public double getFatPerUnit() {
        return fatPerUnit;
    }

    // Totals for the amount used in the recipe
    public double getCalories() {
        return quantity * caloriesPerUnit;
    }

    public double getProtein() {
        return quantity * proteinPerUnit;
    }

    public double getCarbs() {
        return quantity * carbsPerUnit;
    }

    public double getFat() {
        return quantity * fatPerUnit;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
