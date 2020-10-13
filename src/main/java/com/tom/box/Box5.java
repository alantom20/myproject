package com.tom.box;



public class Box5{

    Box box5 = new Box(39.5f,27.5f,23);

    public boolean validate(float length, float width, int height) {
        return box5.length>length && box5.width > width && box5.height > height;
    }
}

