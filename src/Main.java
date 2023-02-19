import Transport.*;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            DriverB driverB = new DriverB("водитель кат.Б № " + i, true, 2 + i);
            Car car = new Car(" легковое авто № " + i, "№ " + i, 1.6, driverB, BodyType.CROSSOVER);

            DriverC driverC = new DriverC("водитель кат.С № " + i, true, 3 + i);
            CargoCar cargoCar = new CargoCar("грузовое авто марки № " + i, "№ " + i, 3.5,
                    driverC, LoadCapacity.getValue(8));

            DriverD driverD = new DriverD("водитель кат.Д № " + i, true, 5 + i);
            Bus bus = new Bus("автобус № " + i, "№ " + i, 5.5, driverD, Size.S);

            System.out.println(car);
            System.out.println(cargoCar);
            System.out.println(bus);
            printInfo(car);
            printInfo(cargoCar);
            printInfo(bus);
        }
    }
    public static void printInfo (Transport<?> transport){
        System.out.println("водитель " + transport.getDriver().getName() +
                " управляет " + transport.getBrand() + " и будет участвовать в заезде");
    }
}
