package com.cg.fms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
	public class Land  {
		@Id
		@Column(name="land_id")
		private int landId;
		@Column(name="survey_number")
		private String surveyNumber;
		@Column(name="owner_name")
		private String ownerName;
		@Column(name="land_area")
		private String landArea;
		public Land() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Land(int landId, String surveyNumber, String ownerName, String landArea) {
			super();
			this.landId = landId;
			this.surveyNumber = surveyNumber;
			this.ownerName = ownerName;
			this.landArea = landArea;
		}
		public int getLandId() {
			return landId;
		}
		public void setLandId(int landId) {
			this.landId = landId;
		}
		public String getSurveyNumber() {
			return surveyNumber;
		}
		public void setSurveyNumber(String surveyNumber) {
			this.surveyNumber = surveyNumber;
		}
		public String getOwnerName() {
			return ownerName;
		}
		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}
		public String getLandArea() {
			return landArea;
		}
		public void setLandArea(String landArea) {
			this.landArea = landArea;
		}
		@Override
		public String toString() {
			return "Land [landId=" + landId + ", surveyNumber=" + surveyNumber + ", ownerName=" + ownerName + ", landArea="
					+ landArea + "]";
		}
		
	}

