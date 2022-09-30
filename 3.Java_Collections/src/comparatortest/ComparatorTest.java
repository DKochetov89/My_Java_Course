package comparatortest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Car ferrari = new Car(1990, "Ferrari 360 Spider", 310);
        Car lamborghini = new Car(2012, "Lamborghini Gallardo", 290);
        Car bugatti = new Car(2010, "Bugatti Veyron", 350);

        cars.add(ferrari);
        cars.add(bugatti);
        cars.add(lamborghini);

        Collections.sort(cars);
        for (Car car: cars) {
            System.out.println(car.getManufactureYear() + " " + car.getModel() + " " + car.getMaxSpeed());
        }
        System.out.println("##############");

        Comparator<Car> comparatorMaxSpeed = new ComparatorMaxSpeed();
        Collections.sort(cars, comparatorMaxSpeed);
        for (Car car: cars) {
            System.out.println(car.getManufactureYear() + " " + car.getModel() + " " + car.getMaxSpeed());
        }
    }
}
