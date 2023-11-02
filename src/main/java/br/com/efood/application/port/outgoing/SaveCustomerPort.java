package br.com.efood.application.port.outgoing;

import br.com.efood.application.domain.Customer;

public interface SaveCustomerPort {

    void save(Customer customer);
}
