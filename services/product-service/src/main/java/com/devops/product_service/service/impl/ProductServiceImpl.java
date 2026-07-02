package com.devops.product_service.service.impl;

import com.devops.product_service.dto.ProductRequest;
import com.devops.product_service.dto.ProductResponse;
import com.devops.product_service.dto.UpdateProductRequest;
import com.devops.product_service.entity.Product;
import com.devops.product_service.repository.ProductRepository;
import com.devops.product_service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public ProductResponse createProduct(ProductRequest request) {

        Product product = new Product();
        product.setName(request.getName());
        product.setDescription(request.getDescription());
        product.setPrice(request.getPrice());
        product.setStockQuantity(request.getStockQuantity());
        product.setCategory(request.getCategory());

        Product saved = productRepository.save(product);

        return mapToResponse(saved);
    }

    @Override
    public List<ProductResponse> getAllProducts() {
        return List.of();
    }

    @Override
    public ProductResponse getProductById(UUID id) {
        return null;
    }

    @Override
    public ProductResponse updateProduct(UUID id, UpdateProductRequest request) {
        return null;
    }

    @Override
    public void deleteProduct(UUID id) {

    }

    private ProductResponse mapToResponse(Product product) {

        ProductResponse response = new ProductResponse();

        response.setId(product.getId());
        response.setName(product.getName());
        response.setDescription(product.getDescription());
        response.setPrice(product.getPrice());
        response.setStockQuantity(product.getStockQuantity());
        response.setCategory(product.getCategory());
        response.setCreatedAt(product.getCreatedAt());
        response.setUpdatedAt(product.getUpdatedAt());

        return response;
    }
}
