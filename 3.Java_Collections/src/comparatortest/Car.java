package comparatortest;

public class Car implements Comparable<Car>{
    private int manufactureYear;
    private String model;
    private int maxSpeed;

    public Car(int manufactureYear, String model, int maxSpeed) {
        this.manufactureYear = manufactureYear;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public int compareTo(Car o) {
        return this.getManufactureYear() - o.getManufactureYear();
    }
}
