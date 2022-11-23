import java.lang.Math;

public class Triangle extends AbsShape {
    public Triangle(String color, int edgeLen) {
        super(color, edgeLen);
    }

    @Override
    public double getArea() {
        return (Math.pow(this.getEdgeLen(), 2) * Math.sqrt(3)) / 4;
    }

    @Override
    public double getPerimeter() {
        return this.getEdgeLen() * 3;
    }
}
