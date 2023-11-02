package br.com.efood.application.services;

import br.com.efood.adapters.persistence.entity.CustomerEntity;
import br.com.efood.adapters.web.CustomerDTO;
import br.com.efood.application.domain.Customer;
import br.com.efood.application.domain.mapper.CustomerMapper;
import br.com.efood.application.port.incoming.GetCustomerUseCase;
import br.com.efood.application.port.incoming.SaveCustomerUseCase;
import br.com.efood.application.port.outgoing.GetCustomerPort;
import br.com.efood.application.port.outgoing.SaveCustomerPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements SaveCustomerUseCase, GetCustomerUseCase {


    private final SaveCustomerPort saveCustomerPort;

    private final CustomerMapper customerMapper;

    private final GetCustomerPort getCustomerPort;


    @Autowired
    public CustomerService(SaveCustomerPort saveCustomerPort, CustomerMapper customerMapper, GetCustomerPort getCustomerPort) {
        this.saveCustomerPort = saveCustomerPort;
        this.customerMapper = customerMapper;
        this.getCustomerPort = getCustomerPort;
    }

    @Override
    public void saveCustomer(CustomerDTO dtoObject) {
        Customer customerInstance = this.customerMapper.mapNewInstance(dtoObject);
        this.saveCustomerPort.save(customerInstance);
    }

    @Override
    public CustomerDTO findCustomer(String documentIdentifier) {
        CustomerEntity entity = getCustomerPort.findCustomerByDocumentIdentifier(documentIdentifier);
        return this.customerMapper.mapNewInstance(entity);
    }
}
