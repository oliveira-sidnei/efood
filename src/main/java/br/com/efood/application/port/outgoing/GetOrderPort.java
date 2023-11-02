package br.com.efood.application.port.outgoing;

import br.com.efood.adapters.persistence.entity.OrderEntity;

import java.util.List;

public interface GetOrderPort {

    List<OrderEntity> findOrder();
}
