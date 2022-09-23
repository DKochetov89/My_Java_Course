abstract class Phone implements OpenConnection, CloseConnection {
    private int year;
    String company;
    protected String country;
    public Phone(int year, String company, String country) {
        this.year = year;
        this.company = company;
        this.country = country;
    }
    private void onlineRegistration() {
        System.out.println("Phone is in online registration");
    }
    public void call(int outputNumber) {
        onlineRegistration();
        System.out.println("Calling number");
    }
    public void ring() {
        System.out.println("Ringing");
    }
}
