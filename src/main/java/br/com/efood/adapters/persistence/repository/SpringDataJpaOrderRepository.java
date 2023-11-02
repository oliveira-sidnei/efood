package br.com.efood.adapters.persistence.repository;

import br.com.efood.adapters.persistence.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataJpaOrderRepository extends JpaRepository<OrderEntity, Long> {

}
