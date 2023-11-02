package br.com.efood.application.port.incoming;

import br.com.efood.adapters.web.CustomerDTO;

public interface SaveCustomerUseCase {

    void saveCustomer(CustomerDTO dtoObject);

}
