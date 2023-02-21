package Transport;

public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;

    private boolean diagnosticPassed;

    public Transport(String brand, String model, double engineVolume, T driver) {
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model = model;
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
        setEngineVolume(engineVolume);
        setDriver(driver);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "тип транспорта: " + brand +
                ", модель: " + model +
                ", двигатель: " + engineVolume ;
    }

    public abstract void startMove();

    public abstract void stopMove();

    public abstract Type getType();

    public abstract void printType();

    public abstract boolean passDiagnostics() throws TransportTypeException;

    public boolean isDiagnosticPassed() {
        return diagnosticPassed;
    }

    public void setDiagnosticPassed(boolean diagnosticPassed) {
        this.diagnosticPassed = diagnosticPassed;
    }
}

