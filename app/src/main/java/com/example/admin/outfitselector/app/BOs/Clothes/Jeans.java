package com.example.admin.outfitselector.app.BOs.Clothes;

public class Jeans implements ClothingItems{
	
	private String brand;
	private String description;
	final private String category = "JEANS";
	private String picUrl;
	
	public  Jeans (String brand, String description, String picUrl){
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
