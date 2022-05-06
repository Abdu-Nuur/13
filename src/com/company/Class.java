package com.company;

public class Class {

    int nomer;
    String soz;
    int[] masiv;

    public Class() {
    }

    public Class(int nomer, String soz, int[] masiv) {
        this.nomer = nomer;
        this.soz = soz;
        this.masiv = masiv;
    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    public String getSoz() {
        return soz;
    }

    public void setSoz(String soz) {
        this.soz = soz;
    }

    public int[] getMasiv() {
        return masiv;
    }

    public void setMasiv(int[] masiv) {
        this.masiv = masiv;
    }
}
