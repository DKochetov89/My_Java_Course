public class User {
    String name;
    public User(String name) {
        this.name = name;
    }
    void usePhone(Phone phone) {
        System.out.println("User is using phone" + phone);
    }
}
