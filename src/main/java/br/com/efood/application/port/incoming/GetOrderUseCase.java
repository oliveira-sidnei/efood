package br.com.efood.application.port.incoming;

import br.com.efood.adapters.web.OrderDTO;

import java.util.List;

public interface GetOrderUseCase {
    List<OrderDTO> findOrders();
}
