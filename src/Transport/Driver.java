package Transport;

public abstract class Driver {
    private String name;
    private boolean hasDoc;
    private int experience;

    public Driver(String name, boolean hasDoc, int experience) {
        this.name = name;
        this.hasDoc = hasDoc;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public boolean isHasDoc() {
        return hasDoc;
    }

    public int getExperience() {
        return experience;
    }

    public abstract void startMove();

    public abstract void stopMove();

    public abstract void refuel();
}
