// Inheritance
public class Truck extends Car   {
    private final int capacity;
    public Truck(int topspeed, int y, String b, String m,  Engine e, int towingCapacity) {
        // Inheritance
        super(topspeed, y, b, m, e);
        this.capacity = towingCapacity;
    }

    // Single responsibility principle
    @Override
    public String getAutoInfo() {
        return String.format("%s %s %s, top speed(kmh): %s, capacity %s", brand, model, year, topSpeed, capacity);
    }

}
