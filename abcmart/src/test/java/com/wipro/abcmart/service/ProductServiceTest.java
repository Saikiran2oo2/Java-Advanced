package com.wipro.abcmart.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.wipro.abcmart.entity.BookManagement;
import com.wipro.abcmart.exception.ProductNotFoundException;
import com.wipro.abcmart.repository.ProductRepository;

@SpringBootTest
public class ProductServiceTest {
	@InjectMocks
	private ProductServiceImpl productService;

	@Mock
	private ProductRepository productRepository;

	@Test
	public void testGetProductDetails() {
		BookManagement product = new BookManagement();
		product.setProductId(111);
		product.setProductName("ABCProduct");
		product.setProductPrice(200);
		product.setMfd(LocalDate.of(2000, 10, 10));
		product.setCategory("mobile");

		when(productRepository.findById(111)).thenReturn(Optional.of(product));
		BookManagement actualObj = productService.getProductById(111);
		assertEquals("ABCProduct", actualObj.getProductName());

	}

	@Test
	public void testGetProductDetailsException() {
		when(productRepository.findById(200)).thenThrow(new ProductNotFoundException("Product is not existing with id:200"));
		assertThrows(ProductNotFoundException.class, () -> productService.getProductById(100));
	}

	@Test
	public void testGetAllProducts() {
		BookManagement product = new BookManagement();
		product.setProductId(111);
		product.setProductName("ABCProduct");
		product.setProductPrice(200);
		product.setMfd(LocalDate.of(2000, 10, 10));
		product.setCategory("mobile");

		BookManagement product1 = new BookManagement();
		product1.setProductId(222);
		product1.setProductName("ABCLaptop");
		product1.setProductPrice(100);
		product1.setMfd(LocalDate.of(2000, 10, 10));
		product1.setCategory("laptop");

		
		List<BookManagement> products = new ArrayList<>();
		products.add(product);
		products.add(product1);
		

		when(productRepository.findAll()).thenReturn(products);

		List<BookManagement> productList = productService.getAllProducts();
		assertEquals(2, productList.size());
	}
	
	@Test
	public void testGetAllProductsException() {
		
	}

	@Test
	void testDeleteProduct() {
		BookManagement product = new BookManagement();
		product.setProductId(111);
		product.setProductName("ABCProduct");
		product.setProductPrice(200);
		product.setMfd(LocalDate.of(2000, 10, 10));
		product.setCategory("mobile");

		when(productRepository.findById(111)).thenReturn(Optional.of(product));
		doNothing().when(productRepository).delete(product);

		productService.deleteProduct(111);

		verify(productRepository, times(1)).findById(111);
		verify(productRepository, times(1)).delete(product);

	}

	@Test
	void testDeleteProductWihException() {
		BookManagement product = new BookManagement();
		product.setProductId(100);
		product.setProductName("ABCProduct");
		product.setProductPrice(100);
		product.setMfd(LocalDate.of(2000, 10, 10));
		product.setCategory("mobile");

		when(productRepository.findById(111))
				.thenThrow(new ProductNotFoundException("Product is not existing with id:100"));

		assertThrows(ProductNotFoundException.class, () -> productService.deleteProduct(111));

		verify(productRepository, times(0)).delete(product);
	}
}