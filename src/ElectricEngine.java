// Dependency inversion principle
public class ElectricEngine implements Engine {
    int horsePower;
    public ElectricEngine(int horsepower) {
        this.horsePower =horsepower;
    }
    public void start() {
        System.out.println("Electric engine started");
    }
}
