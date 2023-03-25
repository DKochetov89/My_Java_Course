import java.util.Random;

public class ConstructorTest {
    public static void main(String[] args) {
        var staff = new Employee[3];

        staff[0] = new Employee("Harry", 40000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee();

        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary="
                    + e.getSalary());
        }
    }
}

class Employee {
    private static int nextId;

    private int id;
    private String name = ""; // instance field init
    private double salary;

    // static init block
    static {
        var generator = new Random();
        nextId = generator.nextInt(10000);
    }

    // object init block
    {
        id = nextId;
        nextId++;
    }

    // three overloaded constructors
    public Employee(String n, double s) {
        name = n;
        salary = s;
    }

    public Employee(double s) {
        // calls the Employee(String, double) constructor
        this("Employee #" + nextId, s);
    }

    public Employee() {
        // name ""
        // salary 0
        // id initialized in initialization block
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}
