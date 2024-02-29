public class Bike extends Transport {
    private final int topSpeed;
    public Bike(int s){
        this.topSpeed = s;
    }

    @Override
    public int getTopSpeed() {
        return topSpeed;
    }
}
