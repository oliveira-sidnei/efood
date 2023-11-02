package br.com.efood.adapters.web;

import br.com.efood.application.port.incoming.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/product")
public class ProductController {

    private final SaveProductUseCase saveProductUseCase;

    private final EditProductUseCase editProductUseCase;

    private final GetProductUseCase getProductUseCase;

    private final DeleteProductUseCase deleteProductUseCase;

    public ProductController(SaveProductUseCase saveProductUseCase, EditProductUseCase editProductUseCase, GetProductUseCase getProductUseCase, DeleteProductUseCase deleteProductUseCase) {
        this.saveProductUseCase = saveProductUseCase;
        this.editProductUseCase = editProductUseCase;
        this.getProductUseCase = getProductUseCase;
        this.deleteProductUseCase = deleteProductUseCase;
    }


    @PostMapping
    void createProduct(@RequestBody ProductDTO dtoObject){
        this.saveProductUseCase.saveProduct(dtoObject);
    }

    @PutMapping("/update/{productId}")
    void updateProduct(@RequestBody ProductDTO dtoObject, @PathVariable Long productId){
        this.editProductUseCase.editProduct(dtoObject, productId);
    }

    @DeleteMapping("/remove/{productId}")
    void deleteProduct(@PathVariable Long productId){
        this.deleteProductUseCase.deleteProduct(productId);
    }


    @GetMapping("/{category}")
    List<ProductDTO> getProductInformation(@PathVariable String category){
        return this.getProductUseCase.findProductByCategory(category);
    }
}
