package Transport;

public class Bus extends Transport<DriverD> {

    private Size size;
    public Bus(String brand, String model, double engineVolume, DriverD driver, Size size) {
        super(brand, model, engineVolume, driver);
        this.size = size;
    }

    @Override
    public void startMove() {
        System.out.println("автобус, марка " + getBrand() + "начал движение");
    }

    @Override
    public void stopMove() {
        System.out.println("автобус, марка " + getBrand() + "закончил движение");
    }
    public void pitStop() {
        System.out.println("пит-стоп у автобуса");
    }

    @Override
    public void printType() {
        if(getType() == null) {
            System.out.println("недостаточно данных");
        } else {
            System.out.println(getType());
        }
    }

    @Override
    public boolean passDiagnostics() throws TransportTypeException {
        System.out.println("Автобусы диагностику не проходят");
        return false;
    }

    @Override
    public Type getType() {
        return Type.BUS;
    }

    public void lapTime() {
        int minTime = 200;
        int maxTime = 150;
        int bestTime = (int)(minTime + (maxTime - minTime)*Math.random());
        System.out.println("лучшее время круга в секундах: " + bestTime);
    }

    public void maxSpeed() {
        int minSpeed = 60;
        int maxSpeed = 80;
        int maxSpeedOnArrival = (int)(minSpeed + (maxSpeed - minSpeed)*Math.random());
        System.out.println("макс скорость в кмч: " + maxSpeedOnArrival);
    }
}
