package com.wipro.abcmart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.abcmart.entity.BookManagement;
import com.wipro.abcmart.service.ProductService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	
	@GetMapping("/all")
	public List<BookManagement>fetchAllProducts(){
		List<BookManagement>products= productService.getAllProducts();
		return products;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity <BookManagement> fetchProductDetails(@PathVariable("id")int productId) {
		BookManagement product = productService.getProductById(productId);
	
			return new ResponseEntity<>(product,HttpStatus.OK);
		
	}
	@PostMapping("/save")
	public ResponseEntity<BookManagement> addProduct(@Valid @RequestBody BookManagement product) {
		productService.saveProduct(product);
		ResponseEntity<BookManagement>responseEntity= new ResponseEntity<>(product,HttpStatus.CREATED);
		return responseEntity;
	}
	@PutMapping("/update")
	public ResponseEntity<BookManagement> editProduct(@RequestBody BookManagement product) {
		productService.updateProduct(product);
		ResponseEntity<BookManagement>responseEntity= new ResponseEntity<>(product,HttpStatus.OK);
		return responseEntity;
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteProduct(@PathVariable("id")int productId) {
		productService.deleteProduct(productId);
		ResponseEntity<Void> responseEntity= new ResponseEntity<>(HttpStatus.OK);
		return responseEntity;
	}
	@GetMapping("/filter/{category}")
	public List<BookManagement> fetchProductsByCategory(@PathVariable("category")String category){
		List<BookManagement>products = productService.getProductsByCategory(category);
		return products;
	
	}
	@GetMapping("/filter/{sprice}/{eprice}")
	public List<BookManagement> fetchProductsWithInPrice(@PathVariable("sprice")double startPrice,@PathVariable("eprice")double endPrice){
	List<BookManagement>products= productService.getProductsWithInPriceRange(startPrice, endPrice);
	return products;
}
}