package br.com.efood.application.services;

import br.com.efood.adapters.web.OrderDTO;
import br.com.efood.adapters.web.OrderRequest;
import br.com.efood.application.domain.mapper.OrderMapper;
import br.com.efood.application.port.incoming.GetOrderUseCase;
import br.com.efood.application.port.incoming.SaveOrderUseCase;
import br.com.efood.application.port.outgoing.GetOrderPort;
import br.com.efood.application.port.outgoing.SaveOrderPort;

import java.util.List;
import java.util.stream.Collectors;

public class OrderService implements GetOrderUseCase, SaveOrderUseCase {

    private final SaveOrderPort saveOrderPort;

    private final GetOrderPort getOrderPort;

    private final OrderMapper orderMapper;

    public OrderService(SaveOrderPort saveOrderPort, GetOrderPort getOrderPort, OrderMapper orderMapper) {
        this.saveOrderPort = saveOrderPort;
        this.getOrderPort = getOrderPort;
        this.orderMapper = orderMapper;
    }

    @Override
    public List<OrderDTO> findOrders() {
        return this.getOrderPort.findOrder().stream().map(this.orderMapper::mapNewInstance).collect(Collectors.toList());
    }

    @Override
    public void saveOrder(OrderRequest orderRequest) {
        this.orderMapper.mapNewInstance(orderRequest);

    }
}
