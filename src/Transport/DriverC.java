package Transport;

public class DriverC extends Driver{
    public DriverC(String name, boolean hasDoc, int experience) {
        super(name, hasDoc, experience);
    }
    public void startMove(){
        System.out.println("Водитель категории С " + getName() + "начал движение");
    }

    public void stopMove(){
        System.out.println("Водитель категории С " + getName() + "закончил движение");
    }

    public void refuel(){
        System.out.println("Водитель категории С " + getName() + "заправляется");
    }
}
