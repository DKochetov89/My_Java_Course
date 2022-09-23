package solid.single_responsibility;

public class OrderProcessor {

    public static void main(String[] args) {

        OrderCreator crOrder = new OrderCreator();
        crOrder.createClientOrder();

        PaymentChecker chPayment = new PaymentChecker();
        chPayment.checkingPayment();

        EmailController sdEmail = new EmailController();
        sdEmail.sendingEmail();

        ControllerDB svDB = new ControllerDB();
        svDB.savingDB();
    }
}
