package com.hackerRank;

import static com.hackerRank.HairColor.*;

class Person {

    private HairColor hairColor = BLACK;

    Person() {

    }

    void setHairColor(HairColor hairColor) {
        this.hairColor = hairColor;
    }

    HairColor getHairColor() {
        return hairColor;
    }


}
