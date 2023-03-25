package inner_classes;

public class Anonymous_Test {

    void method() {
        System.out.println("method экземпляра класса Anonymous_Test");
    }

    public static void main(String[] args) {
        Anonymous_Test anonymous_test = new Anonymous_Test() {
            {
                super.method();
                method();
                new_method();
            }

            @Override
            void method() { // переопределение метода в анонимном классе
                    System.out.println("method экземпляра анонимного класса ");
                }
                void new_method() {
                    //новый метод который мы добавили
                    System.out.println("new_method экземпляра анонимного класса ");
                }
            };
        anonymous_test.method();
    }
}
