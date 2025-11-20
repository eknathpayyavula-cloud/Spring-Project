package eku.e_commerce.controller;


import eku.e_commerce.model.Products;
import eku.e_commerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;


    @GetMapping("/all")
    public List<Products> getAll(){
        System.out.println("Hello from Controller");
        return service.getall();
    }

    @GetMapping("/{id}")
    public Optional<Products> getBydId(@PathVariable Integer id){
        System.out.println("get by id");
        return service.getBydId(id);
    }


    @PostMapping("/add")
    public Products addProducts(@RequestBody Products products){
        System.out.println("Product added from Controller");
        return service.addProduct(products);
    }

    @PostMapping("/update")
    public Products updateProduct(@RequestBody Products products){
        System.out.println("Product updated from Controller");
        return service.updateProduct(products);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable Integer id){
        System.out.println("Product deleted");
         service.deleteProduct(id);
    }

}
