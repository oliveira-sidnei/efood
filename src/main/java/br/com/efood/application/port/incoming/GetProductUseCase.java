package br.com.efood.application.port.incoming;

import br.com.efood.adapters.web.ProductDTO;

import java.util.List;

public interface GetProductUseCase {

    List<ProductDTO> findProductByCategory(String category);
}
