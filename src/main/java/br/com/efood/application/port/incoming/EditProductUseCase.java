package br.com.efood.application.port.incoming;

import br.com.efood.adapters.web.ProductDTO;

public interface EditProductUseCase {

    void editProduct(ProductDTO dtoObject, Long productId);
}
