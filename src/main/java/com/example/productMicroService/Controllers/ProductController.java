package com.example.productMicroService.Controllers;


import com.example.productMicroService.Entity.ProductEntity;
import com.example.productMicroService.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
   private ProductService productService;



    @GetMapping("/getProduct/{id}")
    public ResponseEntity<?> getStatus(@PathVariable("id") Integer id) {
        try {
       var v= productService.getProductById(id);
            return ResponseEntity.ok(v);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred while fetching Aj: ");
        }
    }



    @PostMapping("/addProduct")
    public ResponseEntity<?> addProduct(@RequestBody ProductEntity product) {
        try {
             productService.saveProduct(product);

             return ResponseEntity.ok("Product saved successfully");
        }
        catch (Exception e) {

             return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error occurred while saving product: ");
        }
    }
}
