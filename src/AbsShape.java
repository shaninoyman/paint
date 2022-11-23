import java.util.ArrayList;

public abstract class AbsShape implements Shape {
    private static int totalShapesCreated;
    private final int id;
    private final double edgeLen;
    private String color;
    private ArrayList<Shape> insideShapes;

    public AbsShape(String color, double edgeLen) {
        this.id = totalShapesCreated;
        this.edgeLen = edgeLen;
        this.color = color;
        this.insideShapes = new ArrayList<>();
        totalShapesCreated++;
    }

    public int getId() {
        return this.id;
    }

    public String getColor() {
        return this.color;
    }

    public double getEdgeLen() {
        return this.edgeLen;
    }

    public static int getTotalShapesCreated() {
        return totalShapesCreated;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public double getFreeArea() {
        double freeArea = this.getArea();
        for (Shape s : this.insideShapes) {
            freeArea -= s.getArea();
        }
        return freeArea;
    }

    public boolean addShape(Shape newShape) {
        if (this.getFreeArea() <= newShape.getArea()) {
            System.out.println("Couldn't add {shape id: " + newShape.getId() + "} into {shape id: " + this.getId() + "}. ");
            return false;
        }
        this.insideShapes.add(newShape);
        return true;
    }

    public void changeColor(String color) {
        this.color = color;
    }

    private String toStringRec(int layer) {
        StringBuilder str = new StringBuilder("\t".repeat(layer));
        str.append("id: ").append(this.getId()).append(", type: ").append(this.getClass().getName()).append(", shapes inside: {");
        if (this.insideShapes.size() == 0) {
            str.append("}");
        } else {
            for (Shape s : this.insideShapes) {
                str.append("\n");
                str.append(((AbsShape) s).toStringRec(layer + 1));
            }
            str.append("\n").append("\t".repeat(layer)).append("}");
        }
        return str.toString();

    }

    public String toString() {
        return this.toStringRec(0);
    }


}
