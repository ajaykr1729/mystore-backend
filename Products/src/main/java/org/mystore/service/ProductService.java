package org.mystore.service;

import org.mystore.model.Product;
import org.mystore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private  ProductRepository productRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }

    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    public List<Product> findByCategory(String category){
        return productRepository.findByCategoryOrderByIdDesc(category);
    }
    public List<Product> findProductsByCategoryAndSubcategory(String category, String subcategory) {
        return productRepository.findByCategoryAndSubcategoryOrderByIdDesc(category, subcategory);
    }

    public Product getLatestProductByCategory(String category) {
        return productRepository.findFirstByCategoryOrderByIdDesc(category);
    }

    public Product updateProduct(Product updatedProduct) {
        Product savedProduct = productRepository.save(updatedProduct);
        return savedProduct;
    }

}
