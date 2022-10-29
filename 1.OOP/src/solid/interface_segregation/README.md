I: Interface Segregation Principle (Принцип разделения интерфейса).

Создавайте узкоспециализированные интерфейсы, предназначенные для конкретного клиента. 
Клиенты не должны зависеть от интерфейсов, которые они не используют.

class Order implements SendingEmail, SendingSMS, SendingPhoneCall, SendingToMesseger
