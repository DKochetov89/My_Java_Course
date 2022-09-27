package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception_Test {

    public void closeResourceInFinally() {
        FileInputStream inputStream = null;
        try {
            File file = new File("./tmp.txt");
            inputStream = new FileInputStream(file);

            // используем inputStream для чтения файла

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public void doNotDoThis() throws Exception {}

    public void doSomething(String input) throws MyException {}

    private class MyException extends Exception {}

    public void catchMostSpecificExceptionFirst() {
        try {
            System.out.println("Сообщение");
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
