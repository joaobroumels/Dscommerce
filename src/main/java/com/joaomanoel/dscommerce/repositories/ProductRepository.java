package com.joaomanoel.dscommerce.repositories;

import com.joaomanoel.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {



}
