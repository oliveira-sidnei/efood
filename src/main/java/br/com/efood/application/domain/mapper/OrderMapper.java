package br.com.efood.application.domain.mapper;

import br.com.efood.adapters.persistence.entity.OrderEntity;
import br.com.efood.adapters.web.OrderDTO;
import br.com.efood.adapters.web.OrderRequest;
import br.com.efood.application.domain.Order;

public interface OrderMapper {
    OrderDTO mapNewInstance(OrderEntity orderEntity);

    Order mapNewInstance(OrderRequest orderRequest);
}
