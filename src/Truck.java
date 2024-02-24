public class Truck extends MotorTransport{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        if (getWheelsCount() > 6) {
            System.out.println("Проверяем прицеп ");
        }
    }

    @Override
    public void check() {
        super.check();
        checkTrailer();
    }
}
