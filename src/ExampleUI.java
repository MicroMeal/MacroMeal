import MacroCalculators.*;

import java.util.HashMap;

public class ExampleUI {
    public static void main(String[] args) {

        System.out.println("Welcome to the Macro Meal's calorie calculator");

        //We add information about the person...
        TDEECalories tdeeCalories = new TDEECalories(80, 178, 23, Gender.MALE, MovementExpenditure.SEDENTARY);

        //We add the person's goal...
        GoalEnum goalChosen = GoalEnum.LOSEVERYFAST;

        //We use the calculated caloric intake to determine macro ratios...
        MacrosInGrams myMacrosInGrams = new MacrosInGrams();
        HashMap<String, Integer> macroMap;
        macroMap = myMacrosInGrams.MacrosInGrams(goalChosen.getGoalCalories(tdeeCalories.getFinalTDEE()));

        //Printing
        System.out.println("Here are the values you provided: \n");
        System.out.println("Weight in KG: " + tdeeCalories.getWeightInKG());
        System.out.println("Age: " + tdeeCalories.getAge());
        System.out.println("Height in CM: " + tdeeCalories.getHeightInCM());
        System.out.println("MacroCalculators.Gender: " + tdeeCalories.getGender());
        System.out.println("Movement Expenditure Chosen: " + tdeeCalories.getMovementExpenditure() + "\n");
        System.out.println("You have chosen the goal: " + goalChosen.toString());

        System.out.println("Your goal calories are: " + goalChosen.getGoalCalories(tdeeCalories.getFinalTDEE()));
        System.out.println("You should aim for "
                +macroMap.get("Protein")+" grams of protein, "
                +macroMap.get("Carbohydrates")+" grams of carbohydrates and "
                +macroMap.get("Fats")+" grams of fats per day.");
    }
}
