package br.com.efood.application.port.outgoing;

import br.com.efood.adapters.persistence.entity.ProductEntity;
import br.com.efood.application.domain.Category;

import java.util.List;

public interface GetProductPort {

    List<ProductEntity> findProductByCategory(Category categoryType);
}
