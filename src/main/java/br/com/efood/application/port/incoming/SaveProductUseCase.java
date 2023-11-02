package br.com.efood.application.port.incoming;

import br.com.efood.adapters.web.ProductDTO;

public interface SaveProductUseCase {

    void saveProduct(ProductDTO dtoObject);
}
