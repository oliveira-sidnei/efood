package br.com.efood.application.port.outgoing;

import br.com.efood.adapters.persistence.entity.CustomerEntity;

public interface GetCustomerPort {

    CustomerEntity findCustomerByDocumentIdentifier(String documentIdentifier);
}
