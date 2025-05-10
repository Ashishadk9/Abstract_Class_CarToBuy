
/**
 * Write a description of class CarToBuy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class CarToBuy extends Car 
{
    private double price;
    private int registeredYear;
    
    public CarToBuy(String name,String description,double price, int registeredYear){
        super(name,description);
        this.price = price;
        this.registeredYear = registeredYear;
    }
    @Override
    public void display(){
        System.out.println("Car Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Price: $" + price);
        System.out.println("Registered Year: " + registeredYear);
    }
}
