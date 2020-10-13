package com.tom.box;

import java.util.Scanner;

public class Box3 {
    Box box3 = new Box(23.0f,14.0f,13);

    public boolean validate(float length, float width, int height) {
        return box3.length>length && box3.width > width && box3.height > height;
    }


}
