package com.wipro.abcmart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.abcmart.entity.BookManagement;
import com.wipro.abcmart.exception.ProductNotFoundException;
import com.wipro.abcmart.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	
	
	@Override
	public BookManagement saveProduct(BookManagement product) {
		productRepository.save(product);
		return product;
	}

	@Override
	public BookManagement getProductById(int productId) {
		Optional<BookManagement> optionalProduct=productRepository.findById(productId);
		if(optionalProduct.isEmpty()){
		throw new ProductNotFoundException("Product is not existing with id:"+productId);
		}
		BookManagement product=optionalProduct.get();
		return product;
	}

	@Override
	public List<BookManagement> getAllProducts() {
		List<BookManagement> products=productRepository.findAll();
		return products;
	}
@Override
public BookManagement updateProduct(BookManagement product) {
	Optional<BookManagement>optionalProduct=productRepository.findById(product.getProductId());
	if(optionalProduct.isEmpty()) {
		throw new ProductNotFoundException("Product is not existing with id:"+product.getProductId());
	}
	productRepository.save(product);
	return product;
}
@Override
public void deleteProduct(int productId) {
	Optional<BookManagement>optionalProduct=productRepository.findById(productId);
	if(optionalProduct.isEmpty()) {
		throw new ProductNotFoundException("Product is not existing with id:"+productId);
	}
	BookManagement product=optionalProduct.get();
	productRepository.delete(product);
}
@Override
public List<BookManagement> getProductsByCategory(String categoryName){
	List<BookManagement> products = productRepository.findByCategory(categoryName);
	return products;
}
@Override
public List<BookManagement>getProductsWithInPriceRange(double minPrice,double maxPrice){
	List<BookManagement> products= productRepository.filterProductsWithInPriceRange(minPrice, maxPrice);
	return products;
}
}
