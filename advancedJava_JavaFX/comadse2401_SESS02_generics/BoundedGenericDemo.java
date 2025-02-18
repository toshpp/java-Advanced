package comadse2401_SESS02_generics;

public class BoundedGenericDemo {

    public static void main(String[] args) {
        // Create an array of Integers
        Integer[] intArray = {1, 2, 3, 4, 5};

        // Instantiate BoundedGeneric class with Integer array
        BoundedGeneric<Integer> intBoundedGeneric = new BoundedGeneric<>(intArray);

        // Calculate and display the sum and average of the Integer array
        System.out.println("Sum: " + intBoundedGeneric.getSum());
        System.out.println("Average: " + intBoundedGeneric.getAverage());  // Calling getAverage() here

        Double[] doubleArray = {2.0, 3.0,4.0};

        // Instantiate BoundedGeneric class with Double array
        BoundedGeneric<Double> doubleBoundedGeneric = new BoundedGeneric<>(doubleArray);

        // Calculate and display  average of the Double array
        System.out.println("Sum: " + doubleBoundedGeneric.getSum());
        System.out.println("Average: " + doubleBoundedGeneric.getAverage());  // 
    }
}
