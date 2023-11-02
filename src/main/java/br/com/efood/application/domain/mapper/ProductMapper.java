package br.com.efood.application.domain.mapper;

import br.com.efood.adapters.persistence.entity.ProductEntity;
import br.com.efood.adapters.web.ProductDTO;
import br.com.efood.application.domain.Product;

public interface ProductMapper {

    Product mapNewInstance(ProductDTO dtoObject);

    ProductDTO mapNewInstance(ProductEntity entityObject);
}
