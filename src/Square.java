public class Square extends AbsShape {
    public Square(String color, double edgeLen) {
        super(color, edgeLen);
    }

    @Override
    public double getArea() {
        return Math.pow(this.getEdgeLen(), 2);
    }

    @Override
    public double getPerimeter() {
        return this.getEdgeLen() * 4;
    }
}
