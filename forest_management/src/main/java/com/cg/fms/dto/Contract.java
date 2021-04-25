package com.cg.fms.dto;


import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Contract{
		
		@Id
		private String contractNumber;
		//private Customer customer;
		//private Product product;
		private String deliveryPlace;
		private String deliveryDate;
		private String quantity;
		//private Scheduler scheduler;
		private String customer_id;
	    private String schedulerId;
		public Contract() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Contract(String contractNumber, String customer_id, String deliveryPlace, String deliveryDate,
				String quantity) {
			super();
			this.contractNumber = contractNumber;
			this.customer_id = customer_id;
			this.deliveryPlace = deliveryPlace;
			this.deliveryDate = deliveryDate;
			this.quantity = quantity;
		}
		
		public Contract(String contractNumber, String deliveryPlace, String deliveryDate, String quantity,
		 String customer_id, String schedulerId) {
			super();
			this.contractNumber = contractNumber;
			this.deliveryPlace = deliveryPlace;
			this.deliveryDate = deliveryDate;
			this.quantity = quantity;
			this.customer_id = customer_id;
			this.schedulerId = schedulerId;}
		
		public String getContractNumber() {
			return contractNumber;
		}
		public void setContractNumber(String contractNumber) {
			this.contractNumber = contractNumber;
		}
		public String getCustomer_id() {
			return customer_id;
		}
		public void setCustomer_id(String customer_id) {
			this.customer_id = customer_id;
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
		public String getSchedulerId() {
			return schedulerId;
		}
		public void setScheduler_id(String schedulerId) {
			this.schedulerId = schedulerId;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((contractNumber == null) ? 0 : contractNumber.hashCode());
			result = prime * result + ((deliveryDate == null) ? 0 : deliveryDate.hashCode());
			result = prime * result + ((deliveryPlace == null) ? 0 : deliveryPlace.hashCode());
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
			Contract other = (Contract) obj;
			if (contractNumber == null) {
				if (other.contractNumber != null)
					return false;
			} else if (!contractNumber.equals(other.contractNumber))
				return false;
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
			if (quantity == null) {
				if (other.quantity != null)
					return false;
			} else if (!quantity.equals(other.quantity))
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "Contract [contractNumber=" + contractNumber + ", deliveryPlace=" + deliveryPlace + ", deliveryDate="
					+ deliveryDate + ", quantity=" + quantity + ", customer_id=" + customer_id + ", schedulerId="
					+ schedulerId + "]";
		}
		
		
	}

