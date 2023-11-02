package br.com.efood.application.domain;

import lombok.Getter;

@Getter
public class Customer {

    private String name;

    private String email;

    private String documentIdentifier;

    public Customer(String email, String name, String documentIdentifier) {
        this.email = email;
        this.name = name;
        this.documentIdentifier = documentIdentifier;
    }
}
