
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
abstract class Car
{
    String name;
    String description;
    public Car(String name,String description){
        this.name = name;
        this.description = description;
    }
    public abstract void display();
}
