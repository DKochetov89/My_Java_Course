package solid.dependency_inversion;

public class OrderProcessor_DIP {
    private MailSender mailSender;
    private OrderRepository repository;

    public OrderProcessor_DIP(MailSender mailSender, OrderRepository repository) {
        this.mailSender = mailSender;
        this.repository = repository;
    }
    boolean isValid() {
        return true;
    }

    public void process(OrderProcessor_DIP order){
        if (order.isValid() && repository.save()) {
                mailSender.sendEmail();
            }
    }
}
