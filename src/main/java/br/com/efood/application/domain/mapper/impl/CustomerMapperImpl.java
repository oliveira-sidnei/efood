package br.com.efood.application.domain.mapper.impl;

import br.com.efood.adapters.persistence.entity.CustomerEntity;
import br.com.efood.adapters.web.CustomerDTO;
import br.com.efood.application.domain.Customer;
import br.com.efood.application.domain.mapper.CustomerMapper;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public Customer mapNewInstance(CustomerDTO dtoObject) {
        return new Customer(dtoObject.email(), dtoObject.name(), dtoObject.documentIdentifier());
    }

    @Override
    public CustomerDTO mapNewInstance(CustomerEntity entity) {
        return new CustomerDTO(entity.getEmail(), entity.getDocumentIdentifier(), entity.getName());
    }
}
