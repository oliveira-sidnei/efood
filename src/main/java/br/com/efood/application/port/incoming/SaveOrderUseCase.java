package br.com.efood.application.port.incoming;

import br.com.efood.adapters.web.OrderRequest;

public interface SaveOrderUseCase {

    void saveOrder(OrderRequest orderRequest);
}
