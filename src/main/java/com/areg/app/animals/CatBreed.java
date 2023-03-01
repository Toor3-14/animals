package com.areg.app.animals;

public enum CatBreed {
    AMERICAN_BOBTAIL ("американский бобтейл"),
    ANGORA("ангорская кошка"),
    BALINESE("балийская кошка"),
    BENGAL("бенгальская кошка"),
    HIMALAYAN("гималайская кошка"),
    DON_SPHINX("донской сфинкс");



    private String value;

    CatBreed (String value) {
        this.value = value;
    }


    public String getValue () {
        return value;
    }

    }
