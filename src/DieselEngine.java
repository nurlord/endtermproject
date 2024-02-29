// Dependency inversion principle
public class DieselEngine implements Engine {
    int horsePower;
    public DieselEngine(int horsepower) {
        this.horsePower = horsepower;
    }
    public void start() {
        System.out.println("Diesel engine started");
    }
}
