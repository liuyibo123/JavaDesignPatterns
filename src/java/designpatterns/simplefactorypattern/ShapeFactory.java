package designpatterns.simplefactorypattern;


import designpatterns.simplefactorypattern.impl.CircleUtil;
import designpatterns.simplefactorypattern.impl.TripleUtil;

public class ShapeFactory {
    public static ShapeUtil getShapeUtil(String shape) throws UnsupportedShapeException {
        switch (shape){
            case "circle":
                return new CircleUtil();
            case "triple":
                return new TripleUtil();
            default:
                throw new UnsupportedShapeException();
        }

    }
}
