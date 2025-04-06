package com.wipro.abcmart.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orderitem_tbl")
public class OrderItem {
	@Id
	@Column(name="orderitem_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int orderItemId;
	
	@Column(length=2)
	private int quantity;
	
	@OneToOne
	@JoinColumn(name="product_id")
	private BookManagement product;
	
	@Column(name="item_total")
	private double itemTotal;
	
	@ManyToOne
	@JoinColumn(name="oredr_id")
	@JsonIgnore
	private Order order;

	public int getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BookManagement getProduct() {
		return product;
	}

	public void setProduct(BookManagement product) {
		this.product = product;
	}

	public double getItemTotal() {
		return itemTotal;
	}

	public void setItemTotal(double itemTotal) {
		this.itemTotal = itemTotal;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	
}
