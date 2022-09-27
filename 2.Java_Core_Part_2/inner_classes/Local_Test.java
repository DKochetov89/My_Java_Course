package inner_classes;

public class Local_Test {
    private int prIntVar = 1;
    private static int prStIntVar = 2;
    private final int prFinVar  = 3;

    void anyMethodOfOuter(){
        class LocalClass{
            void anyMethodLocal(){
                prIntVar = 10;
                prStIntVar = 20;
            }
        }

        LocalClass localOb = new LocalClass();
        localOb.anyMethodLocal();
        }

        public static void main(String[] args) {
            Local_Test outerObj = new Local_Test();
            System.out.println("prIntVar = "+ outerObj.prIntVar + " prStIntVar = "+ Local_Test.prStIntVar
                + " prFinVar = "+ outerObj.prFinVar);

            outerObj.anyMethodOfOuter();

            System.out.println("prIntVar = "+ outerObj.prIntVar + " prStIntVar = "+ Local_Test.prStIntVar
                +" prFinVar = "+ outerObj.prFinVar);

        }
}
