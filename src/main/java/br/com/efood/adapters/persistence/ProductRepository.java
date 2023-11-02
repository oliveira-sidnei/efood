package br.com.efood.adapters.persistence;

import br.com.efood.adapters.persistence.entity.ProductEntity;
import br.com.efood.adapters.persistence.repository.SpringDataJpaProductRepository;
import br.com.efood.application.domain.Category;
import br.com.efood.application.domain.Product;
import br.com.efood.application.port.outgoing.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductRepository implements SaveProductPort, EditProductPort, GetProductPort, DeleteProductPort{

    private final SpringDataJpaProductRepository repository;

    public ProductRepository(SpringDataJpaProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public void delete(Long productId) {
        this.repository.findById(productId).ifPresent(this.repository::delete);
    }

    @Override
    public List<ProductEntity> findProductByCategory(Category categoryType) {
        return this.repository.findByCategory(categoryType);
    }

    @Override
    public void save(Product domainObject) {
        this.repository.save(new ProductEntity(domainObject));
    }

    @Override
    public void update(Product domainObject, Long productId) {
        this.repository.findById(productId).ifPresent(product-> this.repository.save(new ProductEntity(domainObject, productId)));
    }
}
