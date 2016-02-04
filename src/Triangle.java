public class Triangle extends Shape {
   // public static Object move;
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public Triangle(double xA , double yA , double xB , double yB
            ,double xC , double yC){
        pointA = new Point(xA , yA);
        pointB = new Point(xB , yB);
        pointC = new Point(xC , yC);
    }

    @Override
    public double square() {
        double sideA = distance(pointB , pointC);
        double sideB = distance(pointA , pointC);
        double sideC = distance(pointA , pointB);
        double halfPerim = perimeter() /2.0;
        return Math.sqrt( (halfPerim - sideA) * (halfPerim - sideB) *
                (halfPerim - sideC) * halfPerim );
    }

    @Override
    public double perimeter() {
        double sideA = distance(pointB , pointC);
        double sideB = distance(pointA , pointC);
        double sideC = distance(pointA , pointB);
        return sideA + sideB + sideC;
    }

    @Override
    public void move(double dx, double dy) {
        pointA.setX(pointA.getX() + dx);
        pointA.setY(pointA.getY() + dy);
        pointB.setX(pointB.getX() + dx);
        pointB.setY(pointB.getY() + dy);
        pointC.setX(pointC.getX() + dx);
        pointC.setY(pointC.getY() + dy);
    }

    private double distance(Point first , Point second){
        double dx = first.getX() - second.getX();
        double dy = first.getY() - second.getY();
        double result = Math.sqrt( dx*dx + dy*dy  );
        return result;
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "pointA=" + pointA +
                ", pointB=" + pointB +
                ", pointC=" + pointC +
                '}';
    }
}

