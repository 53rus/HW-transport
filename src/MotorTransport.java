public abstract class MotorTransport extends Transport implements Service{

    public MotorTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель ");
    }

    @Override
    public void check() {
        super.check();
        checkEngine();
    }
}
