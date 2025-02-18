// GenericClass.java
public class GenericClass<T extends Number> {  // Restrict T to Number types

    // Private field of type T
    private T varT;

    // Constructor to initialize varT
    public GenericClass(T varT) {
        this.varT = varT;
    }

    // Getter method to return the value of varT
    public T getVar() {
        return varT;
    }

    // Method to show the type of varT
    public String showType() {
        return this.varT.getClass().getTypeName();
    }

    // Method to calculate the average of an array of T elements
    public double getAverage(T[] nums) {
        double sum = 0.0;  // Variable to hold the sum of the elements
        for (T num : nums) {
            sum += num.doubleValue();  // Convert each number to double and add to the sum
        }
        return nums.length > 0 ? sum / nums.length : 0.0;  // Return the average or 0 if empty
    }
}
