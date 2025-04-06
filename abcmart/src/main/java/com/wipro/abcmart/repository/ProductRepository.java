package com.wipro.abcmart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.wipro.abcmart.entity.BookManagement;

public interface ProductRepository extends JpaRepository<BookManagement,Integer> {
      
 BookManagement findByProductName(String productName);
 List<BookManagement>findByCategory(String categoryName);
 
 @Query(name = "Product.filterProductsWithInPriceRange")
 List<BookManagement> filterProductsWithInPriceRange(@Param("min") double minPrice, @Param("max") double maxPrice);
}
