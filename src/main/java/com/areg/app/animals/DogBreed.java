package com.areg.app.animals;

public enum DogBreed {
    AUSTRALIAN_TERRIER("австралийский терьер"),
    CATTLEDOG("пищевая собака"),
    TENTERFIELD("тентерфилд"),
    ALASKAN_MALAMUTE("аляскинский маламут"),
    AKITA("акита"),
    LABRADOR("лабрадор"),
    CHIHUAHUA ("чихуахуа");



    private String value;

    DogBreed (String value) {
        this.value = value;
    }


    public String getValue () {
        return value;
    }
}
