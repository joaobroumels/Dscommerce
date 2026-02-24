package com.joaomanoel.dscommerce.controllers;


import com.joaomanoel.dscommerce.dto.ProductDTO;
import com.joaomanoel.dscommerce.entities.Product;
import com.joaomanoel.dscommerce.repositories.ProductRepository;
import com.joaomanoel.dscommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping(value = "/{id}")
    public ProductDTO findById(@PathVariable Long id){
        ProductDTO dto = service.findBYId(id);
        return dto;
    }

}
