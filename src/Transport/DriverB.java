package Transport;

public class DriverB extends Driver {

    public DriverB(String name, boolean hasDoc, int experience) {
        super(name, hasDoc, experience);
    }
    public void startMove(){
        System.out.println("Водитель категории В " + getName() + "начал движение");
    }

    public void stopMove(){
        System.out.println("Водитель категории В " + getName() + "закончил движение");
    }

    public void refuel(){
        System.out.println("Водитель категории В " + getName() + "заправляется");
    }
}
