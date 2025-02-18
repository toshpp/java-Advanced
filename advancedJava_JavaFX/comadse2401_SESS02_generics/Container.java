/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comadse2401_SESS02_generics;

/**
 *
 * @author irungu
 */
public class Container<T>
{
    protected T item;
    
    public Container (T item)
    {
        this.item=item;
        
    }
    
    //method to retrive/get an item from the container

    public T getItem()
    {
        return item;
    }
    
    //method to set items

    public void setItem(T item)
    {
        this.item = item;
    }
    
    // method to set items
    public void displayItemInfo(){
        System.out.println("Item:"+ item.toString());
    }

    
    
}
