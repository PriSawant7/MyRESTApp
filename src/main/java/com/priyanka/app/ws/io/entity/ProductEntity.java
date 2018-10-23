package com.priyanka.app.ws.io.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="products")
public class ProductEntity implements Serializable{

	
	private static final long serialVersionUID = 768164954942866627L;

	@Id
	private long Id;
	
	@Column(nullable = false, length = 100)
	private String productName;
	
	@Column(nullable = false, length = 100)
	private int quantity;
	
	@Column(nullable = false, length = 20)
	private String productID;
	
	@Column(nullable = false)
	private boolean confirmation = true;
	
	private String productDescription;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public boolean isConfirmation() {
		return confirmation;
	}

	public void setConfirmation(boolean confirmation) {
		this.confirmation = confirmation;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	
}
