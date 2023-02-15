package Transport;

public class Car extends Transport<DriverB> {
    public Car(String brand, String model, double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("авто, марка " + getBrand() + "начал движение");
    }

    @Override
    public void stopMove() {
        System.out.println("авто, марка " + getBrand() + "закончил движение");
    }

    public void pitStop() {
        System.out.println("пит-стоп у машины");
    }

    public void lapTime() {
        int minTime = 150;
        int maxTime = 100;
        int bestTime = (int)(minTime + (maxTime - minTime)*Math.random());
        System.out.println("лучшее время круга в секундах: " + bestTime);
    }

    public void maxSpeed() {
        int minSpeed = 100;
        int maxSpeed = 120;
        int maxSpeedOnArrival = (int)(minSpeed + (maxSpeed - minSpeed)*Math.random());
        System.out.println("макс скорость в кмч: " + maxSpeedOnArrival);
    }

}
