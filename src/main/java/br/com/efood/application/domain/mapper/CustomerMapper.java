package br.com.efood.application.domain.mapper;

import br.com.efood.adapters.persistence.entity.CustomerEntity;
import br.com.efood.adapters.web.CustomerDTO;
import br.com.efood.application.domain.Customer;

public interface CustomerMapper {
    Customer mapNewInstance(CustomerDTO dtoObject);

    CustomerDTO mapNewInstance(CustomerEntity entity);
}
