package br.com.efood.adapters.persistence.entity;

import br.com.efood.application.domain.Category;
import br.com.efood.application.domain.Product;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@Entity
@Table(name = "product")
@Getter
public class ProductEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;

    @Column(name = "product_name")
    private String name;

    private Category category;

    @Column(name = "product_description")
    private String description;

    private BigDecimal price;

    public ProductEntity(Product domainObject) {
        this.category = domainObject.getCategory();
        this.name = domainObject.getName();
        this.description = domainObject.getDescription();
        this.price = domainObject.getPrice();
    }

    public ProductEntity(Product domainObject, Long productId) {
        this.category = domainObject.getCategory();
        this.name = domainObject.getName();
        this.description = domainObject.getDescription();
        this.price = domainObject.getPrice();
        this.productId = productId;
    }
}
