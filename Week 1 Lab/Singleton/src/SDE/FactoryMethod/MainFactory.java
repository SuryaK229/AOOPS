package SDE.FactoryMethod;

public class MainFactory {
    public static void main(String[] args) {
        ShapeFactory line=new ShapeFactory();

        Shape s1=line.getShape("Circle");
        s1.draw();

        Shape s2=line.getShape("Rectangle");
        s2.draw();

        Shape s3=line.getShape("Square");
        s3.draw();
    }
    
}
