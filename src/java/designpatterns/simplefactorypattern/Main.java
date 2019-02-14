package designpatterns.simplefactorypattern;

public class Main {
    public static void main(String[]args) throws UnsupportedShapeException {
        ShapeUtil shapeUtil=ShapeFactory.getShapeUtil("triple");
        shapeUtil.draw();
        shapeUtil.erase();

        shapeUtil=ShapeFactory.getShapeUtil("circle");
        shapeUtil.draw();
        shapeUtil.erase();

        shapeUtil=ShapeFactory.getShapeUtil("cube");
        shapeUtil.draw();
        shapeUtil.erase();

    }
}
