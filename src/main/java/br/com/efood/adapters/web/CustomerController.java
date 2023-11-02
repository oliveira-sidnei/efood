package br.com.efood.adapters.web;

import br.com.efood.application.port.incoming.GetCustomerUseCase;
import br.com.efood.application.port.incoming.SaveCustomerUseCase;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/customer")
public class CustomerController {

    private final SaveCustomerUseCase saveCustomerUseCase;
    private final GetCustomerUseCase getCustomerUseCase;


    public CustomerController(SaveCustomerUseCase saveCustomerUseCase, GetCustomerUseCase getCustomerUseCase) {
        this.saveCustomerUseCase = saveCustomerUseCase;
        this.getCustomerUseCase = getCustomerUseCase;
    }


    @PostMapping
    void saveCustomerInformation(@RequestBody CustomerDTO dtoObject){
        this.saveCustomerUseCase.saveCustomer(dtoObject);
    }

    @GetMapping("/{documentIdentifier}")
    CustomerDTO getCustomerInformation(@PathVariable String documentIdentifier){
        return this.getCustomerUseCase.findCustomer(documentIdentifier);
    }
}
