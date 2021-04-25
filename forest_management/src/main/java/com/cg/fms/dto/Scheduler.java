package com.cg.fms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
	public class Scheduler  {
		@Id
		@Column(name="scheduler_id")
		private String schedulerId;
		@Column(name="scheduler_name")
		private String schedulerName;
		@Column(name="scheduler_contact")
		private String schedulerContact;
		@Column(name="truck_number")
		private String truckNumber;
		
		@OneToOne
		@JoinColumn(name="scheduler_id")
		Orders order;
		@OneToOne
		@JoinColumn(name="schedulerId")
		Contract contract;
		public Scheduler() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Scheduler(String schedulerId, String schedulerName, String schedulerContact, String truckNumber) {
			super();
			this.schedulerId = schedulerId;
			this.schedulerName = schedulerName;
			this.schedulerContact = schedulerContact;
			this.truckNumber = truckNumber;
		}
		public String getSchedulerId() {
			return schedulerId;
		}
		public void setSchedulerId(String schedulerId) {
			this.schedulerId = schedulerId;
		}
		public String getSchedulerName() {
			return schedulerName;
		}
		public void setSchedulerName(String schedulerName) {
			this.schedulerName = schedulerName;
		}
		public String getSchedulerContact() {
			return schedulerContact;
		}
		public void setSchedulerContact(String schedulerContact) {
			this.schedulerContact = schedulerContact;
		}
		public String getTruckNumber() {
			return truckNumber;
		}
		public void setTruckNumber(String truckNumber) {
			this.truckNumber = truckNumber;
		}
		@Override
		public String toString() {
			return "Scheduler [schedulerId=" + schedulerId + ", schedulerName=" + schedulerName + ", schedulerContact="
					+ schedulerContact + ", truckNumber=" + truckNumber + "]";
		}
		
	}

