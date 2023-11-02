package br.com.efood.application.port.outgoing;

import br.com.efood.application.domain.Customer;
import br.com.efood.application.domain.Product;

public interface SaveProductPort {

    void save(Product domainObject);
}
