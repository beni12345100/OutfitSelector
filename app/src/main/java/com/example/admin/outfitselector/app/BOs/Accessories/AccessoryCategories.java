package com.example.admin.outfitselector.app.BOs.Accessories;

import java.util.ArrayList;

/**
 * Created by admin on 28.09.2016.
 */
public class AccessoryCategories {

    private ArrayList<Watch> watches;
    private ArrayList<Belt> belts;
    private ArrayList<Cap> caps;
    private ArrayList<Beanie> beanies;
    private ArrayList<Sunglasses> sunglasses;
    private ArrayList<Necklace> necklaces;
    private ArrayList<Bracelet> bracelets;
    private ArrayList<Ring> rings;

    public AccessoryCategories(){

        this.watches = new ArrayList<Watch>();
        this.belts = new ArrayList<Belt>();
        this.caps = new ArrayList<Cap>();
        this.beanies = new ArrayList<Beanie>();
        this.sunglasses = new ArrayList<Sunglasses>();
        this.necklaces = new ArrayList<Necklace>();
        this.bracelets = new ArrayList<Bracelet>();
        this.rings = new ArrayList<Ring>();
    }

    public ArrayList<Belt> getBelts() {
        return belts;
    }

    public void setBelts(ArrayList<Belt> belts) {
        this.belts = belts;
    }

    public ArrayList<Watch> getWatches() {
        return watches;
    }

    public void setWatches(ArrayList<Watch> watches) {
        this.watches = watches;
    }

    public ArrayList<Cap> getCaps() {
        return caps;
    }

    public void setCaps(ArrayList<Cap> caps) {
        this.caps = caps;
    }

    public ArrayList<Beanie> getBeanies() {
        return beanies;
    }

    public void setBeanies(ArrayList<Beanie> beanies) {
        this.beanies = beanies;
    }

    public ArrayList<Sunglasses> getSunglasses() {
        return sunglasses;
    }

    public void setSunglasses(ArrayList<Sunglasses> sunglasses) {
        this.sunglasses = sunglasses;
    }

    public ArrayList<Necklace> getNecklaces() {
        return necklaces;
    }

    public void setNecklaces(ArrayList<Necklace> necklaces) {
        this.necklaces = necklaces;
    }

    public ArrayList<Bracelet> getBracelets() {
        return bracelets;
    }

    public void setBracelets(ArrayList<Bracelet> bracelets) {
        this.bracelets = bracelets;
    }

    public ArrayList<Ring> getRings() {
        return rings;
    }

    public void setRings(ArrayList<Ring> rings) {
        this.rings = rings;
    }
}
