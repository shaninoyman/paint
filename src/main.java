public class main {
    public static void main(String[] args){
        Square t0 = new Square("red", 10);
        Square t1 = new Square("red", 5);
        Square t2 = new Square("red", 5);
        Circle t3 = new Circle("blue", 1);
        Triangle t4 = new Triangle("blue", 1);

        t0.addShape(t1);
        t0.addShape(t2);
        t2.addShape(t3);
        t2.addShape(t4);
        System.out.println(t0);
        System.out.println(t2);
    }

}
