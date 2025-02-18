package comadse2401_SESS02_generics;

/**
 * This is a generic class that can work with any data type (T).
 * It stores a variable of type T and provides methods to set, get, and show the type of the variable.
 * 
 * @param <T> This denotes the type parameter. It can be any type like Integer, String, etc.
 * @author USER
 */
public class GenericClass<T> {
    
    // Private field of type T
    private T varT;
    
    // Getter method to return the value of varT
    public T getVar() {
        return varT;
    }
    
    // Setter method to set the value of varT
    public void setVarT(T varT) {
        this.varT = varT;
    }
    
    // Default constructor
    public GenericClass() {
        // No initialization, just an empty constructor
    }
    
    // Parameterized constructor to initialize varT with a value
    public GenericClass(T varT) {
        this.varT = varT;
    }
    
    // Method to show the type of varT
    public String showType() {
        return this.varT.getClass().getTypeName();
    }
}
