package inner_classes;

public class Static_Nested_Test {
    private static int prVar;
    static class Nested
    {
        int getStaticOuterVar() { return Static_Nested_Test.prVar; }
        void setStaticOuterVariable(int var) { Static_Nested_Test.prVar = var; }
    }

    public static void main(String[] args) {
        Static_Nested_Test.Nested nestedObj = new Static_Nested_Test.Nested();
        Static_Nested_Test.prVar = 100;

        System.out.println("nestedObj.getStaticOuterVar() = " + nestedObj.getStaticOuterVar());

        nestedObj.setStaticOuterVariable(111);
        System.out.println("Static_Nested_Test.prStOuterVar = " + Static_Nested_Test.prVar);
    }
}