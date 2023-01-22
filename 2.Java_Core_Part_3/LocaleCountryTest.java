import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleCountryTest {

    public static void main(String[] args) {
        Locale localeRU = new Locale("ru", "RU");
        Locale localeUK = Locale.UK;

        System.out.println(NumberFormat.getCurrencyInstance(localeRU).format(1000));
        System.out.println(NumberFormat.getCurrencyInstance(localeUK).format(1000));

        ResourceBundle resourceBundleDefault = ResourceBundle.getBundle("file with resources");
        System.out.println(resourceBundleDefault.getLocale());
    }
}
