public class Smartphone extends Phone {
    private String operatingSystem;
    public Smartphone(int year, String company, String country ,String operatingSystem) {
        super(year, company, country);
        this.operatingSystem = operatingSystem;
    }
    public void install() {
        System.out.println("Install operating system");
    }
    @Override
    public void call(int outputNumber) {
        System.out.println("Smartphone calling " + outputNumber);
    }
    public void charging() {
        System.out.println("Smartphone is charging");
    }
    @Override
    public void openConnection() {
        System.out.println("Smartphone is opening connection");
    }
    @Override
    public void closeConnection() {
        System.out.println("Smartphone is closing connection");
    }
}
