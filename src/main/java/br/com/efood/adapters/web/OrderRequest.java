package br.com.efood.adapters.web;

import java.util.List;

public record OrderRequest(String customerIdentifier, List<Long> products) {

}
