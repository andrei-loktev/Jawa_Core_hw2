package Transport;

public class DriverD extends Driver{
    public DriverD(String name, boolean hasDoc, int experience) {
        super(name, hasDoc, experience);
    }
    public void startMove(){
        System.out.println("Водитель категории D " + getName() + "начал движение");
    }

    public void stopMove(){
        System.out.println("Водитель категории D " + getName() + "закончил движение");
    }

    public void refuel(){
        System.out.println("Водитель категории D " + getName() + "заправляется");
    }
}
