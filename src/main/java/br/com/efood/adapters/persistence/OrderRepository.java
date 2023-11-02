package br.com.efood.adapters.persistence;

import br.com.efood.adapters.persistence.entity.OrderEntity;
import br.com.efood.adapters.persistence.repository.SpringDataJpaOrderRepository;
import br.com.efood.application.domain.Order;
import br.com.efood.application.port.outgoing.GetOrderPort;
import br.com.efood.application.port.outgoing.SaveOrderPort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderRepository implements SaveOrderPort, GetOrderPort {

    private final SpringDataJpaOrderRepository repository;

    public OrderRepository(SpringDataJpaOrderRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<OrderEntity> findOrder() {
        return this.repository.findAll();
    }

    @Override
    public void save(Order domainObject) {
        this.repository.save(new OrderEntity(domainObject));
    }
}
