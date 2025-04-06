package com.wipro.abcmart.service;

import java.util.List;

import com.wipro.abcmart.entity.BookManagement;

public interface ProductService {
	 BookManagement saveProduct(BookManagement product);
	    
	    BookManagement getProductById(int productId);
	    
	    List<BookManagement> getAllProducts();
	    
	    BookManagement updateProduct(BookManagement product);
	    
	    void deleteProduct(int productId);
	    
	    List<BookManagement> getProductsByCategory(String categoryName);
	    
	    List<BookManagement> getProductsWithInPriceRange(double minPrice,double maxPrice);
	}
