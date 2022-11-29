package hello.core.order;

import org.junit.jupiter.api.Test;

class OrderServiceImplTest {

    @Test
    void createOrder(){
        OrderServiceImpl orderService = new OrderServiceImpl();
        orderService.createOrder(1L, "itemA", 10000);
    }
}