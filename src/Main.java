public class Main {

    public static void main(String[] args) {
        // write your code here
        //
        Rectangle rectangle = new Rectangle(0,0,10,10);
        System.out.println(rectangle);
        Triangle triangle = new Triangle( 10,10 , 0, 20 , 30,15);
        System.out.println(triangle);
        System.out.println("==========================");
        Triangle2 triangle2 = new Triangle2((5/2)*Math.sqrt(3),5,60.0);
        System.out.println(triangle2);
        System.out.println(triangle2.square());
        System.out.println(triangle2.perimeter());

        Shape[] shapes = {rectangle , triangle, triangle2};
        for( Shape shape : shapes ){
            System.out.println(shape);
            System.out.println("perimeter = " + shape.perimeter());
            System.out.println("square = " + shape.square());
            System.out.println("==========================");

            System.out.println("perimeter = " + shape.perimeter());
            System.out.println("square = " + shape.square());
            triangle2.move (5,7);


        }
    }
}