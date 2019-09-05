
public class FactoryDemo
{
    public static void main(String[] args) {
        ShapeFactory obj = new ShapeFactory();
        obj.getShape("square").draw();
        obj.getShape("circle").draw();
    }
}