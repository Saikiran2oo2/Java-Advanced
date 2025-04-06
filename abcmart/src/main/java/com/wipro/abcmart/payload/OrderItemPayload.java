package com.wipro.abcmart.payload;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.wipro.abcmart.entity.Order;
import com.wipro.abcmart.entity.BookManagement;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

public class OrderItemPayload {
	 private int productId;
     private int quantity;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
     
     
}
