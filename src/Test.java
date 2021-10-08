public class Test {

    public static void main(String[] args)
    {
        Shape circle = new Circle();

        Shape BlackCircle = new BlackShapeDecorator(new Circle());

        Shape BlackRectangle = new BlackShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");

        circle.draw();

        System.out.println("\nCircle of black border");

        BlackCircle.draw();

        System.out.println("\nRectangle of Black border");

        BlackRectangle.draw();
    }
}