package ua.artcode.vital.oop;

/**
 * class (fields and methods)
 *        state      actions
 *        of
 *        object
 *
 */
public class Robot {

    //fields
    int power; //0
    String name; // null
    double price; // 0.0

    //method
    public void go(){
        System.out.printf("Hi, im robot! My name: %s, power: %d, price: %.3f\n", name, power, price);
    }

}
