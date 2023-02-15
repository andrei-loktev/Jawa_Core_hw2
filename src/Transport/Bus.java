package Transport;

public class Bus extends Transport<DriverD> {
    public Bus(String brand, String model, double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
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
