package com.areg.app.animals;

public enum Color {
    YELLOW("жёлтый"),
    GREEN("зелёный"),
    BLUE("синий"),
    BROWN("коричневый"),
    WHITE("белый"),
    RED("красный"),
    ORANGE("оранжевый"),
    PINK("розовый"),
    BLACK("черный");

    private String value;

    Color (String value) {
        this.value = value;
    }


    public String getValue () {
        return value;
    }



}
