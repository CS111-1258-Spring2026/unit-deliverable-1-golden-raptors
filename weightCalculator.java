public class weightCalculator {
    
    /**
     * Calculates BMI (Body Mass Index)
     * @param weightKg weight in kilograms
     * @param heightM height in meters
     * @return BMI value
     */
    public static double calculateBMI(double weightKg, double heightM) {
        if (heightM <= 0) {
            throw new IllegalArgumentException("Height must be positive");
        }
        return weightKg / (heightM * heightM);
    }
    
    /**
     * Calculates weight change (loss or gain)
     * @param currentWeight current weight in kg
     * @param previousWeight previous weight in kg
     * @return weight change (negative = loss, positive = gain)
     */
    public static double calculateWeightChange(double currentWeight, double previousWeight) {
        return currentWeight - previousWeight;
    }
    
    /**
     * Calculates weight change percentage
     * @param currentWeight current weight in kg
     * @param previousWeight previous weight in kg
     * @return percentage change
     */
    public static double calculateWeightChangePercent(double currentWeight, double previousWeight) {
        if (previousWeight <= 0) {
            throw new IllegalArgumentException("Previous weight must be positive");
        }
        return ((currentWeight - previousWeight) / previousWeight) * 100;
    }
    
    /**
     * Returns BMI category
     * @param bmi BMI value
     * @return BMI category as String
     */
    public static String getBMICategory(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal weight";
        if (bmi < 30) return "Overweight";
        return "Obese";
    }
}