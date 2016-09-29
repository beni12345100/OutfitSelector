package com.example.admin.outfitselector.app.BOs.Clothes;

public class Sweatshirt implements ClothingItems{
	
	private String brand;
	private String description;
	final private String category = "SWEATSHIRT";
	private String picUrl;
	
	public  Sweatshirt (String brand, String description, String picUrl){
		this.brand = brand;
		this.description = description;
		this.picUrl = picUrl;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getCategory() {
		return category;
	}
}
