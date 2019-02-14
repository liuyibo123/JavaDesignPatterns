package designpatterns.simplefactorypattern.impl;

import designpatterns.simplefactorypattern.ShapeUtil;

public class TripleUtil implements ShapeUtil {
    @Override
    public void draw() {
        System.out.println("draw triple");
    }

    @Override
    public void erase() {
        System.out.println("erase triple");
    }
}
