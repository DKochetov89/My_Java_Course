import java.lang.annotation.*;

public class AnnotationTest {

    public static void main(String[] args) {
        TestClass testClass = new TestClass(0);
        testClass.method(1000);
    }
}

@MyAnnotation (checkProgram = true)
class TestClass {
    @MyAnnotation
    int a;
    @MyAnnotation
    public void method(@MyAnnotation int b) {

    }
    @MyAnnotation
    public TestClass(int a) {
        this.a = a;
    }
}

@Inherited // для того, чтобы к классам наследникам тоже применялась аннотация
@Retention(RetentionPolicy.RUNTIME) // видимость аннотации
@Target({ElementType.PARAMETER, ElementType.FIELD, ElementType.CONSTRUCTOR,
        ElementType.METHOD, ElementType.TYPE_USE}) // цель применения аннотации
@interface MyAnnotation {
    boolean checkProgram() default false;
}
