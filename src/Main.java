public class Main {
    public static void main(String[] args) {
        ElectricEngine electricEngine = new ElectricEngine(534);
        Car tesla = new Car(250, 2020, "Tesla", "Model S Long Range Plus", electricEngine);

        DieselEngine dieselEngine = new DieselEngine(277);
        Truck truck = new Truck(180, 2020, "Chevrolet", "Silverado LT 4WD", dieselEngine, 5300);

        Bike bicycle = new Bike(150);

        System.out.println(tesla.getTopSpeed());
        System.out.println(truck.getTopSpeed());
        System.out.println(bicycle.getTopSpeed());
    }
}

