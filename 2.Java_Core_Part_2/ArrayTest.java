public class ArrayTest {

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 0, 10, 12, 89, 34, 37, -8, -9};
        for (int i : arr) {
            String check =  (i % 2 == 0) ? "Четное" : "Нечетное";
            System.out.println(check + " " + i);
        }
    }
}
