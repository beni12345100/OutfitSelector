package com.example.admin.outfitselector.app.BOs.Clothes;

import java.util.ArrayList;

public class ClothingCategories {

	private ArrayList<Jacket> jackets;
    private ArrayList<Sweatshirt> sweatshirts;
    private ArrayList<Hoddie> hoodies;
    private ArrayList<Tshirt> tshirts;
    private ArrayList<Shirt> shirts;
    private ArrayList<PoloShirt> poloShirts;
    private ArrayList<Jeans> jeans;
    private ArrayList<Pants> pants;
    private ArrayList<Shorts> shorts;

    public ClothingCategories(){

        this.jackets = new ArrayList<Jacket>();
        this.sweatshirts = new ArrayList<Sweatshirt>();
        this.hoodies = new ArrayList<Hoddie>();
        this.tshirts = new ArrayList<Tshirt>();
        this.shirts = new ArrayList<Shirt>();
        this.poloShirts = new ArrayList<PoloShirt>();
        this.jeans = new ArrayList<Jeans>();
        this.pants = new ArrayList<Pants>();
        this.shorts = new ArrayList<Shorts>();
    }

    public ArrayList<Jacket> getJackets() {
        return jackets;
    }

    public void setJackets(ArrayList<Jacket> jackets) {
        this.jackets = jackets;
    }

    public ArrayList<Sweatshirt> getSweatshirts() {
        return sweatshirts;
    }

    public void setSweatshirts(ArrayList<Sweatshirt> sweatshirts) {
        this.sweatshirts = sweatshirts;
    }

    public ArrayList<Hoddie> getHoodies() {
        return hoodies;
    }

    public void setHoodies(ArrayList<Hoddie> hoodies) {
        this.hoodies = hoodies;
    }

    public ArrayList<Tshirt> getTshirts() {
        return tshirts;
    }

    public void setTshirts(ArrayList<Tshirt> tshirts) {
        this.tshirts = tshirts;
    }

    public ArrayList<Shirt> getShirts() {
        return shirts;
    }

    public void setShirts(ArrayList<Shirt> shirts) {
        this.shirts = shirts;
    }

    public ArrayList<PoloShirt> getPoloShirts() {
        return poloShirts;
    }

    public void setPoloShirts(ArrayList<PoloShirt> poloShirts) {
        this.poloShirts = poloShirts;
    }

    public ArrayList<Jeans> getJeans() {
        return jeans;
    }

    public void setJeans(ArrayList<Jeans> jeans) {
        this.jeans = jeans;
    }

    public ArrayList<Shorts> getShorts() {
        return shorts;
    }

    public void setShorts(ArrayList<Shorts> shorts) {
        this.shorts = shorts;
    }

    public ArrayList<Pants> getPants() {
        return pants;
    }

    public void setPants(ArrayList<Pants> pants) {
        this.pants = pants;
    }
}
