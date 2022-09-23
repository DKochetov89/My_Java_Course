package solid.interface_segregation;

public class Order implements SendingEmail, SendingSMS, SendingPhoneCall, SendingToMesseger{
}
