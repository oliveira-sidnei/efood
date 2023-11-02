package br.com.efood.application.port.incoming;

import br.com.efood.adapters.web.CustomerDTO;

public interface GetCustomerUseCase {

    CustomerDTO findCustomer(String documentIdentifier);

}
