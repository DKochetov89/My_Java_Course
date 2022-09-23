public class LandlinePhone extends Phone {
    private int batteryCapacity;
    public LandlinePhone(int year, String company, String country , int batteryCapacity) {
        super(year, company, country);
        this.batteryCapacity = batteryCapacity;
    }
    @Override
    public void call(int outputNumber) {
        System.out.println("LandlinePhone calling " + outputNumber);
    }
    public void connectionPort(int portA) {
        System.out.println("LandlinePhone is connecting " + portA);
    }
    public void connectionPort(int portA, int portB) {
        System.out.println("LandlinePhone is connecting " + portA + " " + portB);
    }
    @Override
    public void openConnection() {
        System.out.println("LandlinePhone is opening connection");
    }
    @Override
    public void closeConnection() {
        System.out.println("LandlinePhone is closing connection");
    }
}
