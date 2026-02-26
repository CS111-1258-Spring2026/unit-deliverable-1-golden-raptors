/********************************************
*	AUTHORS:	<Kaan,Ricardo Jr,Xander>
* COLLABORATORS: <name of peer, tutor, instructor, anyone else who helped>
*	LAST MODIFIED:	<date of last change>
********************************************/

/********************************************
* Daily Calorie & Nutrition Tracker
*********************************************
* PROGRAM DESCRIPTION:
* This program tracks a user's meals for a day, calculates total calories and average nutrients,
* and provides formatted output to show daily intake summary.
*********************************************
* ALGORITHM:
* 1. Declare variables for meal names, calories, protein, carbs, and fat.
* 2. Initialize variables with example meal data.
* 3. Calculate total calories, total protein, carbs, fat.
* 4. Calculate average nutrients per meal using static methods.
* 5. Output formatted summary.
*********************************************
* STATIC METHODS:
* calculateTotalCalories - Kaan
* calculateAverageNutrient - Kaan
*********************************************/


public class Main
{
  /***** CONSTANT SECTION *****/
  public static final int NUM_MEALS = 3; // For simplicity


  public static void main(String[] args)
  {
    /***** DECLARATION SECTION *****/
    String meal1, meal2, meal3;
    int calories1, calories2, calories3;
    double protein1, protein2, protein3;
    double carbs1, carbs2, carbs3;
    double fat1, fat2, fat3;


    /***** INITIALIZATION SECTION *****/
    meal1 = "Breakfast";
    calories1 = 350;
    protein1 = 20.5;
    carbs1 = 45.0;
    fat1 = 10.0;


    meal2 = "Lunch";
    calories2 = 600;
    protein2 = 35.0;
    carbs2 = 70.0;
    fat2 = 20.0;


    meal3 = "Dinner";
    calories3 = 500;
    protein3 = 30.0;
    carbs3 = 60.0;
    fat3 = 15.0;


    /***** INTRO SECTION *****/
    System.out.println("Welcome to the Daily Calorie & Nutrition Tracker!\n");


    /***** PROCESSING SECTION *****/
    int totalCalories = calculateTotalCalories(calories1, calories2, calories3);
    double avgProtein = calculateAverageNutrient(protein1, protein2, protein3);
    double avgCarbs = calculateAverageNutrient(carbs1, carbs2, carbs3);
    double avgFat = calculateAverageNutrient(fat1, fat2, fat3);


    /***** OUTPUT SECTION *****/
    System.out.println("Meal Summary:");
    System.out.printf("%-10s %8s %8s %8s %8s\n", "Meal", "Calories", "Protein", "Carbs", "Fat");
    System.out.printf("%-10s %8d %8.1f %8.1f %8.1f\n", meal1, calories1, protein1, carbs1, fat1);
    System.out.printf("%-10s %8d %8.1f %8.1f %8.1f\n", meal2, calories2, protein2, carbs2, fat2);
    System.out.printf("%-10s %8d %8.1f %8.1f %8.1f\n", meal3, calories3, protein3, carbs3, fat3);


    System.out.println("\nDaily Totals:");
    System.out.printf("Total Calories: %d\n", totalCalories);
    System.out.printf("Average Protein: %.1f g\n", avgProtein);
    System.out.printf("Average Carbs: %.1f g\n", avgCarbs);
    System.out.printf("Average Fat: %.1f g\n", avgFat);
  }


  /***** STATIC METHODS *****/
  public static int calculateTotalCalories(int c1, int c2, int c3)
  {
    return c1 + c2 + c3;
  }


  public static double calculateAverageNutrient(double n1, double n2, double n3)
  {
    return (n1 + n2 + n3) / NUM_MEALS;
  }
}
