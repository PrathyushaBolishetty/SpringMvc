package com.sathya.mvc.entities;

import java.time.LocalDate;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long proId;
	private String proName;
	private double proPrice;
	private double proDprice;
	//private String proImage;
	private String proDescripition;
	private String proBrand;
	private String proCategory;
	private LocalDate proCreatedAt;
	private String proCreatedBy;
	public long getProId() {
		return proId;
	}
	public void setProId(long proId) {
		this.proId= proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public double getProPrice() {
		return proPrice;
	}
	public void setProPrice(double proPrice) {
		this.proPrice = proPrice;
	}
	public double getProDprice() {
		return proDprice;
	}
	public void setProDprice(double proDprice) {
		this.proDprice = proDprice;
	}
	public String getProDescripition() {
		return proDescripition;
	}
	public void setProDescripition(String proDescripition) {
		this.proDescripition = proDescripition;
	}
	public String getProBrand() {
		return proBrand;
	}
	public void setProBrand(String proBrand) {
		this.proBrand = proBrand;
	}
	public String getProCategory() {
		return proCategory;
	}
	public void setProCategory(String proCategory) {
		this.proCategory = proCategory;
	}
	public LocalDate getProCreatedAt() {
		return proCreatedAt;
	}
	public void setProCreatedAt(LocalDate proCreatedAt) {
		this.proCreatedAt = proCreatedAt;
	}
	public String getProCreatedBy() {
		return proCreatedBy;
	}
	public void setProCreatedBy(String proCreatedBy) {
		this.proCreatedBy = proCreatedBy;
	}
}
