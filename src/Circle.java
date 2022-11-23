public class Circle extends AbsShape {

    public Circle(String color, double edgeLen) {
        super(color, edgeLen);
    }

    @Override
    public double getArea() {
        return Math.pow(this.getEdgeLen(), 2) * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.getEdgeLen();
    }
}
