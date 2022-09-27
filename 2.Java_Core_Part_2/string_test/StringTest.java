package string_test;

public class StringTest {

    public static void main(String[] args) {
        String str = "abcd-abcd";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(0));
        System.out.println(str.contains("123"));
        System.out.println(str.compareTo("abcd"));
        System.out.println(str.length());
        System.out.println(str.startsWith("ab"));
        System.out.println(str + "\n");

        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder.append("-abcd"));
    }
}
