package com.sathya.mvc.model;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ProductModel {
	private Long proId;
	 @NotBlank(message = "Product name is required.")
	 @Size(min = 1, max = 100, message = "Product name must be between 1 and 100 characters.")
	private String proName;
	 @DecimalMin(value = "0.0", message = "Price must be greater than zero.")
	private double proPrice;
	 @NotBlank(message = "Descripition is required.")
	    @Size(max = 255, message = "Descripition must be up to 255 characters.")
	private String proDescripition;
	@NotBlank(message = "Brand is required.")
    @Size(max = 50, message = "Brand must be up to 50 characters.")
	private String proBrand;
	 @NotBlank(message = "Category is required.")
	    @Size(max = 50, message = "Category must be up to 50 characters.")
	private String proCategory;


	public Long getProId() {
		return proId;
	}
	public void setProId(Long proId) {
		this.proId = proId;
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
	
}
	