package br.com.efood.application.services;

import br.com.efood.adapters.web.ProductDTO;
import br.com.efood.application.domain.Product;
import br.com.efood.application.domain.mapper.ProductMapper;
import br.com.efood.application.port.incoming.DeleteProductUseCase;
import br.com.efood.application.port.incoming.EditProductUseCase;
import br.com.efood.application.port.incoming.GetProductUseCase;
import br.com.efood.application.port.incoming.SaveProductUseCase;
import br.com.efood.application.port.outgoing.DeleteProductPort;
import br.com.efood.application.port.outgoing.EditProductPort;
import br.com.efood.application.port.outgoing.GetProductPort;
import br.com.efood.application.port.outgoing.SaveProductPort;
import br.com.efood.application.domain.Category;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService implements SaveProductUseCase, EditProductUseCase, GetProductUseCase, DeleteProductUseCase {


    private final DeleteProductPort deleteProductPort;

    private final EditProductPort editProductPort;

    private final SaveProductPort saveProductPort;

    private final GetProductPort getProductPort;

    private final ProductMapper productMapper;

    public ProductService(DeleteProductPort deleteProductPort, EditProductPort editProductPort, SaveProductPort saveProductPort,
                          GetProductPort getProductPort, ProductMapper productMapper) {
        this.deleteProductPort = deleteProductPort;
        this.editProductPort = editProductPort;
        this.saveProductPort = saveProductPort;
        this.getProductPort = getProductPort;
        this.productMapper = productMapper;
    }


    @Override
    public void deleteProduct(Long productId) {
        this.deleteProductPort.delete(productId);

    }

    @Override
    public List<ProductDTO> findProductByCategory(String category) {
        return this.getProductPort.findProductByCategory(Category.getCategoryByName(category))
                .stream().map(this.productMapper::mapNewInstance).collect(Collectors.toList());
    }

    @Override
    public void saveProduct(ProductDTO dtoObject) {
        Product domainObject = this.productMapper.mapNewInstance(dtoObject);
        this.saveProductPort.save(domainObject);
    }

    @Override
    public void editProduct(ProductDTO dtoObject, Long productId) {
        Product domainObject = productMapper.mapNewInstance(dtoObject);
        this.editProductPort.update(domainObject, productId);

    }
}
