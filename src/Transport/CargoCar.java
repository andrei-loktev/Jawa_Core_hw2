package Transport;

public class CargoCar extends Transport<DriverC> {
    public CargoCar(String brand, String model, double engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Грузовое авто, марка " + getBrand() + "начал движение");
    }
    @Override
    public void stopMove() {
        System.out.println("Грузовое авто, марка " + getBrand() + "закончил движение");
    }

    public void pitStop() {
        System.out.println("пит-стоп у грузовика");
    }

    public void lapTime() {
        int minTime = 180;
        int maxTime = 120;
        int bestTime = (int)(minTime + (maxTime - minTime)*Math.random());
        System.out.println("лучшее время круга в секундах: " + bestTime);
    }

    public void maxSpeed() {
        int minSpeed = 80;
        int maxSpeed = 100;
        int maxSpeedOnArrival = (int)(minSpeed + (maxSpeed - minSpeed)*Math.random());
        System.out.println("макс скорость в кмч: " + maxSpeedOnArrival);
    }
}
