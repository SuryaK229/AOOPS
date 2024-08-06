package SDE.FactoryMethod;

public class ShapeFactory {
    public Shape getShape(String Type){

        if (Type == null)
        return null;

        if(Type.equalsIgnoreCase("Circle"))
        return new Circle();

        else if(Type.equalsIgnoreCase("Rectangle"))
        return new Rectangle();

        else if(Type.equalsIgnoreCase("Square"))
        return new Square();

        return null;
    }
    
}
