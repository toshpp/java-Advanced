package comadse2401_SESS02_generics;

/**
 * This class will be used to demonstrate bounded generics classes and
 * generic methods. This class accepts type parameters of type java.lang.Number
 * or any of its subclasses.
 * 
 * @author USER
 */
public class BoundedGeneric<T extends Number> {

    // Array to hold numeric values
    protected T[] nums;

    // Default constructor
    public BoundedGeneric() { }

    // Constructor to initialize nums array
    public BoundedGeneric(T[] nums) {
        this.nums = nums;
    }

    // Getter for nums
    public T[] getNums() {
        return nums;
    }

    // Setter for nums
    public void setNums(T[] nums) {
        this.nums = nums;
    }

    // Method to calculate the sum of the elements in nums
    public double getSum() throws ArithmeticException {
        double sum = 0.0d;
        for (T num : nums) {
            sum += num.doubleValue();  // Convert each number to double and add it to the sum
        }
        return sum;  // Return the sum as a double
    }

    // Method to calculate the average of the elements in nums
    public double getAverage() throws ArithmeticException {
        double sum = getSum();  // Get the sum of the elements
        if (nums.length == 0) {
            throw new ArithmeticException("Cannot divide by zero - array length is zero.");
        }
        return sum / nums.length;  // Return the arithmetic mean
    }

    // Method to return the sum in the type of T
    public T getSumAsT() throws ArithmeticException {
        double sum = getSum();  // Get the sum in double format
        return (T) Double.valueOf(sum);  
    }
}
