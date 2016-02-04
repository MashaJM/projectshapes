public class Triangle2 extends Shape {
    double height;
    double base;
    double angle; //left base angle


    public Triangle2(double height, double base, double angle) {


            this.height = height;
            this.base = base;
            this.angle = (angle * Math.PI) / 180;
            if (!isExist(createSides())) System.out.println("Error.Your triangle isn't exist");


    }


    private double [] createSides(){


        double sideA = this.base;
        double sideB = (Math.abs(this.height/Math.sin(this.angle)));
        double sideC = Math.sqrt ((this.base - this.height/Math.tan(this.angle))*(this.base - this.height/Math.tan(this.angle)) + this.height*this.height);
        double [] arrayOfSides =
                {sideA, sideB, sideC};
        return arrayOfSides;
    }

    private boolean isExist (double mySides []) {
        // =  setSides();
        if ((mySides[0] + mySides[1] > mySides[2]) & (mySides[0] + mySides[2] > mySides[1]) &
                (mySides[1] + mySides[2] > mySides[0]))
            return true;
        else {
            System.out.println("your triangle isn't exist");
            return false;
        }
    }

        @Override
    public double square() {

        return (height * base)*0.5;
    }



    @Override
    public double perimeter() {
        double perimeter = 0;
        double mySides [] =  createSides();
        for (int i = 0; i<3; i++) {
            perimeter = perimeter + mySides[i];
        }
        return perimeter;
        }



    @Override
    //first, I create object of Triangle, the identical one to our object Triangle2 with the left angle point in (0,0)
    //after it, I move it on with move method of Triangle
    public void move(double dx, double dy) {

        Triangle triangle = new Triangle(new Point(0, 0), new Point(0, base), new Point(height / Math.tan((angle)), height));

        triangle.move(dx, dy);
        System.out.println("Our triangle's left base angle was in (0,0). Now it's moved");


    }






    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAngle() {
        return angle;

    }

    public void setAngle(int angle) {
        this.angle = angle*Math.PI/180;
        System.out.println("angle==" + angle);
    }

    @Override
    public String toString() {
        return "Triangle2{" +
                "height=" + height +
                ", base=" + base +
                ", angle=" + angle +
                '}';
    }
}
