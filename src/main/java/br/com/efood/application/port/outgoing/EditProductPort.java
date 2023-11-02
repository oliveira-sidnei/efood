package br.com.efood.application.port.outgoing;

import br.com.efood.application.domain.Product;

public interface EditProductPort {

    void update(Product domainObject, Long productId);
}
