package circle_and_cylinder;

public class Cylinder extends Circle{
    public double height;
    public Cylinder(){}

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getVolumn() {
       double volumn = super.getArea()* height ;
       return volumn;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height = " + height + "volumn: " + getVolumn() +
                '}';
    }
}
