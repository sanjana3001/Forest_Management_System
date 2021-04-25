package com.cg.fms.dto;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="orders2")
public class Orders{
	@Id
	private String order_number;
	private String deliveryPlace;
	private String deliveryDate;
	private String quantity;
	private String customer_id;
	private String scheduler_id;
	//@Access(AccessType.PROPERTY)
//	@ManyToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="customer_id")
//    private Customer customer;
	 
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private Product product;
	
	
	public Orders() {
	
	}

	public Orders(String order_number, String deliveryPlace, String deliveryDate, String quantity, Customer customer,
			Product product) {
		super();
		this.order_number = order_number;
		this.deliveryPlace = deliveryPlace;
		this.deliveryDate = deliveryDate;
		this.quantity = quantity;
		//this.customer = customer;
		this.product = product;
	}

	public Orders(String order_number, String deliveryPlace, String deliveryDate, String quantity, String customer_id,
			Product product) {
		super();
		this.order_number = order_number;
		this.deliveryPlace = deliveryPlace;
		this.deliveryDate = deliveryDate;
		this.quantity = quantity;
		this.customer_id = customer_id;
		this.product = product;
	}
	



	
	public String getOrder_number() {
		return order_number;
	}

	public void setOrder_number(String order_number) {
		this.order_number = order_number;
	}

	public String getDeliveryPlace() {
		return deliveryPlace;
	}

	public void setDeliveryPlace(String deliveryPlace) {
		this.deliveryPlace = deliveryPlace;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getScheduler_id() {
		return scheduler_id;
	}

	public void setScheduler_id(String scheduler_id) {
		this.scheduler_id = scheduler_id;
	}

   

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deliveryDate == null) ? 0 : deliveryDate.hashCode());
		result = prime * result + ((deliveryPlace == null) ? 0 : deliveryPlace.hashCode());
		result = prime * result + ((order_number == null) ? 0 : order_number.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orders other = (Orders) obj;
		if (deliveryDate == null) {
			if (other.deliveryDate != null)
				return false;
		} else if (!deliveryDate.equals(other.deliveryDate))
			return false;
		if (deliveryPlace == null) {
			if (other.deliveryPlace != null)
				return false;
		} else if (!deliveryPlace.equals(other.deliveryPlace))
			return false;
		if (order_number == null) {
			if (other.order_number != null)
				return false;
		} else if (!order_number.equals(other.order_number))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Orders [order_number=" + order_number + ", deliveryPlace=" + deliveryPlace + ", deliveryDate="
				+ deliveryDate + ", quantity=" + quantity + ", customer_id=" + customer_id + ", scheduler_id="
				+ scheduler_id + ", product=" + product + "]";
	}

	

	
}