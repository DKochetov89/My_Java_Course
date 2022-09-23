package solid.liskov;

import solid.single_responsibility.OrderProcessor;

public class OrderValidator_v2 extends OrderValidator_v1 {

    @Override
    public void isValid(OrderProcessor orderProcessor) {
        // new order validation
    }
}
