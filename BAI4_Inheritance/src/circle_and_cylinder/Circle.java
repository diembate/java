package circle_and_cylinder;

public class Circle {
    private double radius =12;
    private String color= "blue";

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.color = color;
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        double area = this.radius * Math.PI;
        return area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' + "area: " + getArea() +
                '}';
    }
}
