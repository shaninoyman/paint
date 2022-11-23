public interface Shape {

    int getId();
    String getColor();
    double getEdgeLen();
    double getPerimeter();
    double getArea();
    double getFreeArea();
    boolean addShape(Shape newShape);
    void changeColor(String color);
    String toString();


}
