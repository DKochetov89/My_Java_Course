import java.io.*;

public class SerializableTesting {

    public static void main(String[] args) throws IOException {
        String[] stringArr = {"Hello", "Tom", "and", "nice", "to", "meet", "you"};
        NeedToSave needToSave = new NeedToSave(stringArr);

        //создаем 2 потока для сериализации объекта и сохранения его в файл
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\save.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        // сохраняем в файл
        objectOutputStream.writeObject(needToSave);

        //закрываем поток и освобождаем ресурсы
        outputStream.close();
        objectOutputStream.close();
    }
}

class NeedToSave implements Serializable {
    private String[] info;

    public NeedToSave(String[] info){
        this.info = info;
    }
}
