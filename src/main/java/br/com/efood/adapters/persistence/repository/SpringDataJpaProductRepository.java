package br.com.efood.adapters.persistence.repository;

import br.com.efood.adapters.persistence.entity.ProductEntity;
import br.com.efood.application.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpringDataJpaProductRepository extends JpaRepository<ProductEntity, Long> {


    List<ProductEntity> findByCategory(Category categoryType);
}
