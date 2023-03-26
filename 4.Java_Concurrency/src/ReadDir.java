import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadDir
{
    public static void main(String[] args) throws IOException, InterruptedException {
        Process p = new ProcessBuilder("path", "-l")
                .directory(Paths.get("/dir").toFile())
                .start();
        try (var in = new Scanner(p.getInputStream())) {
            while (in.hasNextLine())
                System.out.println(in.nextLine());
        }

        int result = p.waitFor();
        System.out.println("Exit value: " + result);
    }
}