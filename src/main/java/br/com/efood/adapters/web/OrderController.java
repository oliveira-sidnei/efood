package br.com.efood.adapters.web;

import br.com.efood.application.port.incoming.GetOrderUseCase;
import br.com.efood.application.port.incoming.SaveOrderUseCase;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/order")
public class OrderController {

    private final SaveOrderUseCase saveOrderUseCase;
    private final GetOrderUseCase getOrderUseCase;

    public OrderController(SaveOrderUseCase saveOrderUseCase, GetOrderUseCase getOrderUseCase) {
        this.saveOrderUseCase = saveOrderUseCase;
        this.getOrderUseCase = getOrderUseCase;
    }


    @PostMapping
    void createOrder(@RequestBody OrderRequest orderRequest){
        this.saveOrderUseCase.saveOrder(orderRequest);
    }

    @GetMapping()
    List<OrderDTO> getOrders(){
        return this.getOrderUseCase.findOrders();
    }
}
