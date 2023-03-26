package web.jdbc;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HTMLRequestTest {

    public static void main(String[] args) {
        try {
            URLConnection urlConnection = new URL("http://www.google.com").openConnection();
            Scanner scanner = new Scanner(urlConnection.getInputStream());
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            Map<String, List<String>> headerMap = urlConnection.getHeaderFields();
            System.out.println("\n" + "HEADER --- " + headerMap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
