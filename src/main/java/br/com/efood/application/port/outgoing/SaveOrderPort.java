package br.com.efood.application.port.outgoing;

import br.com.efood.application.domain.Order;

public interface SaveOrderPort {

    void save(Order domainObject);
}
