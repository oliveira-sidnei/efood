package br.com.efood.adapters.persistence.entity;

import br.com.efood.application.domain.Customer;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customer")
@NoArgsConstructor
@Getter
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long customerId;

    private String name;

    private String email;

    @Column(name = "document_identifier")
    private String documentIdentifier;


    public CustomerEntity(Customer customer){
        this.name = customer.getName();
        this.email = customer.getEmail();
        this.documentIdentifier = customer.getDocumentIdentifier();
    }
}
