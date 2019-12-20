package quadratic_equation;

public class Account {
    private double a;
    private double b;
    private double c;
    public Account() {}
    public Account(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }
    public  double getDiscriminant() {
     return b*b- 4*a*c;
    }



        public double getRoot1 () {
            if (getDiscriminant() >= 0) {
                return ((-b + Math.sqrt(getDiscriminant()) / (2 * a)));
            }
            return 0;
        }
    public double getRoot2 () {
        if (getDiscriminant() >= 0) {
            return ((-b - Math.sqrt(getDiscriminant()) / (2 * a)));
        }
        return 0;
    }

    @Override
    public String toString() {
        return   "Root1: " + getRoot1() + "Root2: " + getRoot2();
    }
}
