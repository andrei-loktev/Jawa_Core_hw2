package Transport;

public enum LoadCapacity {
    N1 (1, 3.5),
    N2 (3,12),
    N3 (12,20);

    private double min;
    private double max;

    LoadCapacity(double min, double max) {
        this.min = min;
        this.max = max;
    }

    public double getMin() {return min;}

    public double getMax() {return max;}

    public static LoadCapacity getValue(double value) {
        for(LoadCapacity i : LoadCapacity.values()) {
            if (value>= i.getMin() && value<= i.getMax()){
                System.out.println(i);
                return i;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Грузоподъёмность: " +
                "min=" + min +
                ", max=" + max + super.toString();
    }
}
