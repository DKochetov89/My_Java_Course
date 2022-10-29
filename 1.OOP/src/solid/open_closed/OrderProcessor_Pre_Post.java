/*
O: Open-Closed Principle (Принцип открытости-закрытости).
Программные сущности (классы, модули, функции) должны быть открыты для расширения, но не для модификации.
class OrderProcessor_Pre_Post extends OrderProcessor - расширяет OrderProcessor
*/

package solid.open_closed;

import solid.single_responsibility.OrderProcessor;

public class OrderProcessor_Pre_Post extends OrderProcessor {

    void preOrderProcess() {
        //pre order processing
    }

    void postOrderProcess() {
        //post order processing
    }
}
