package br.com.efood.application.domain.mapper.impl;

import br.com.efood.adapters.persistence.entity.ProductEntity;
import br.com.efood.adapters.web.ProductDTO;
import br.com.efood.application.domain.Category;
import br.com.efood.application.domain.Product;
import br.com.efood.application.domain.mapper.ProductMapper;
import org.springframework.stereotype.Component;

@Component
public class ProductMapperImpl implements ProductMapper {


    @Override
    public Product mapNewInstance(ProductDTO dtoObject) {
        return new Product(dtoObject.name(), Category.getCategoryByName(dtoObject.category()), dtoObject.description(), dtoObject.price());
    }

    @Override
    public ProductDTO mapNewInstance(ProductEntity entityObject) {
        return new ProductDTO(entityObject.getName(), entityObject.getCategory().name(), entityObject.getDescription(), entityObject.getPrice());
    }
}
