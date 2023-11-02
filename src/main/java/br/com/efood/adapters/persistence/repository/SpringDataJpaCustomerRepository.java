package br.com.efood.adapters.persistence.repository;

import br.com.efood.adapters.persistence.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataJpaCustomerRepository extends JpaRepository<CustomerEntity, Long> {

    CustomerEntity findByDocumentIdentifier(String documentIdentifier);
}
