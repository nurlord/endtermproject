// Interface segregation
public class Car extends Transport implements AutoVehicle {
    // Encapsulation
    protected final int topSpeed;
    protected final int year;
    protected final String brand;
    protected final String model;
    //


    // Dependency inversion principle
    private final Engine engine; // Liskov substitutions
    public void start() {
        engine.start();
    }
    //
    public Car(int topspeed, int y, String b, String m, Engine e ) {
        this.topSpeed = topspeed;
        this.year = y;
        this.brand = b;
        this.model = m;
        this.engine = e;
    }

    @Override
    public String getAutoInfo() {
       return String.format("%s %s %s", brand, model, year);
   }
   @Override
   public int getTopSpeed() {
        return topSpeed;
    }
}
