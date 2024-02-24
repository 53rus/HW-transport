public class Main {
    public static void main(String[] args) {
        ServiceStation serviceStation = new ServiceStation();

        Bicycle cube = new Bicycle("Cube", 2);
        Bicycle desna = new Bicycle("Desna", 2);
        Car bmw = new Car("BMW", 4);
        Car audi = new Car("Audi", 4);
        Truck man = new Truck("Man", 6);
        Truck scania = new Truck("Scania", 12);

        serviceStation.check(man);


    }
}