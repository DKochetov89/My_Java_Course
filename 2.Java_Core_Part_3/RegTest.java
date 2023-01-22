import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegTest {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Quit Quit");
        Pattern pattern1 = Pattern.compile("Q");
        Matcher matcher1 = pattern1.matcher(stringBuilder);
        while (matcher1.find()) {
            System.out.println(matcher1.start() + " " + matcher1.group());
        }

        Pattern pattern2 = Pattern.compile("\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}");
        Matcher matcher2 = pattern2.matcher("myEmail@gmail.com");
        System.out.println(matcher2.matches());

    }
}
