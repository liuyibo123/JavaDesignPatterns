package designpatterns.simplefactorypattern.impl;

import designpatterns.simplefactorypattern.ShapeUtil;

public class CircleUtil implements ShapeUtil {
    @Override
    public void draw() {
        System.out.println("draw circle");
    }

    @Override
    public void erase() {
        System.out.println("erase circle");
    }
}
