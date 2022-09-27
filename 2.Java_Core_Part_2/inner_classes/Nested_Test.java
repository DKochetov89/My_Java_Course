package inner_classes;

public class Nested_Test {
        private int _var;
        class Nested {
            void setPrivateField(int var)
            {
                Nested_Test.this._var = var;
            }
        }
}
