package com.devops.product_service.service;

import com.devops.product_service.dto.ProductRequest;
import com.devops.product_service.dto.ProductResponse;
import com.devops.product_service.dto.UpdateProductRequest;

import java.util.List;
import java.util.UUID;

public interface ProductService {

    ProductResponse createProduct(ProductRequest request);

    List<ProductResponse> getAllProducts();

    ProductResponse getProductById(UUID id);

    ProductResponse updateProduct(UUID id, UpdateProductRequest request);

    void deleteProduct(UUID id);
}

