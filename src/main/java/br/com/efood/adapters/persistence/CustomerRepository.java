package br.com.efood.adapters.persistence;

import br.com.efood.adapters.persistence.entity.CustomerEntity;
import br.com.efood.adapters.persistence.repository.SpringDataJpaCustomerRepository;
import br.com.efood.application.domain.Customer;
import br.com.efood.application.port.outgoing.GetCustomerPort;
import br.com.efood.application.port.outgoing.SaveCustomerPort;
import org.springframework.stereotype.Component;

@Component
public class CustomerRepository implements SaveCustomerPort, GetCustomerPort {

    private final SpringDataJpaCustomerRepository repository;

    public CustomerRepository(SpringDataJpaCustomerRepository repository) {
        this.repository = repository;
    }


    @Override
    public void save(Customer customer){
        this.repository.save(new CustomerEntity(customer));
    }

    @Override
    public CustomerEntity findCustomerByDocumentIdentifier(String documentIdentifier) {
        return this.repository.findByDocumentIdentifier(documentIdentifier);
    }
}
