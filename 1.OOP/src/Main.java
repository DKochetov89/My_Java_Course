/*
Основные принципы ООП
*/

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("OOP" + "\n");
        LandlinePhone landlinePhone = new LandlinePhone(2000, "Sony", "Japan",
                4000);
        Smartphone smartphone = new Smartphone(2010, "Sony", "Japan",
                "Symbian");

        User user_0 = new User("Dmitriy");
        user_0.usePhone(landlinePhone);
        user_0.usePhone(smartphone);

        landlinePhone.openConnection();
        {
            landlinePhone.connectionPort(10);
            landlinePhone.connectionPort(10, 20);
        }
        landlinePhone.call(123456);
        landlinePhone.ring();

        smartphone.charging();
        smartphone.install();
        smartphone.openConnection();
        smartphone.call(123456);
        smartphone.ring();

        List<Phone> phones = new ArrayList<>();
        phones.add(landlinePhone);
        phones.add(smartphone);
    }
}
