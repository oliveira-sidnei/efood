package br.com.efood.application.domain.mapper.impl;

import br.com.efood.adapters.persistence.entity.OrderEntity;
import br.com.efood.adapters.web.OrderDTO;
import br.com.efood.adapters.web.OrderRequest;
import br.com.efood.application.domain.Order;
import br.com.efood.application.domain.mapper.OrderMapper;
import org.springframework.stereotype.Component;

@Component
public class OrderMapperImpl implements OrderMapper {


    @Override
    public OrderDTO mapNewInstance(OrderEntity orderEntity) {
        return new OrderDTO(orderEntity.getOrderStatus().name(), orderEntity.getPrice(), orderEntity.getOrderStartTime(), orderEntity.getOrderEndTime());
    }

    @Override
    public Order mapNewInstance(OrderRequest orderRequest) {
        return new Order(orderRequest.customerIdentifier(), orderRequest.products());
    }
}
