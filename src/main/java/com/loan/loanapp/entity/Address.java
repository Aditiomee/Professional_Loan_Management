package com.loan.loanapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer addressId;
	private String flatNo;
	private String buildingName;
	private String landmark;
	private String street;
	private String city;
	private Integer pincode;
	public Address() {
		super();
	}
	public Address(Integer addressId, String flatNo, String buildingName, String landmark, String street, String city,
			Integer pincode) {
		super();
		this.addressId = addressId;
		this.flatNo = flatNo;
		this.buildingName = buildingName;
		this.landmark = landmark;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	
	
}
