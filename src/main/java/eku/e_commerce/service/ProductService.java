package eku.e_commerce.service;

import eku.e_commerce.model.Products;
import eku.e_commerce.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public List<Products> getall() {

        System.out.println("Hello from Service");

        return repo.findAll();
    }

    public Products addProduct(Products products) {
        System.out.println("Product added from Service");
        return repo.save(products);

    }

    public void deleteProduct(Integer id) {
        repo.deleteById(id);
    }

    public Optional<Products> getBydId(Integer id) {
        return repo.findById(id);
    }

    public Products updateProduct(Products products) {
        return repo.save(products);
    }
}
