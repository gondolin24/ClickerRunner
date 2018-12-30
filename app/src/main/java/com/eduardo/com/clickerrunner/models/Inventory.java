package com.eduardo.com.clickerrunner.models;

public class Inventory {
    private int aurum; //gold
    private int lapis;//rock
    private int arboribus;//trees
    private int nubibus;// clouds
    private int locus;//space

    public Inventory() {
        this.arboribus = 0;
        this.aurum = 0;
        this.lapis = 0;
        this.locus = 0;
        this.nubibus = 0;
    }

    public int getAurum() {
        return aurum;
    }

    public void setAurum(int aurum) {
        this.aurum = aurum;
    }

    public int getLapis() {
        return lapis;
    }

    public void setLapis(int lapis) {
        this.lapis = lapis;
    }

    public int getArboribus() {
        return arboribus;
    }

    public void setArboribus(int arboribus) {
        this.arboribus = arboribus;
    }

    public int getNubibus() {
        return nubibus;
    }

    public void setNubibus(int nubibus) {
        this.nubibus = nubibus;
    }

    public int getLocus() {
        return locus;
    }

    public void setLocus(int locus) {
        this.locus = locus;
    }
}
