package point_and_moveablepoint;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    public MovablePoint () {};
    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed (float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed () {

        float[] arr1 = {this.xSpeed, this.ySpeed};
        return arr1;
    }

    @Override
    public String toString() {
        return "MovablePoint{" + "(" + getX() + "," + getY() + ")" +
                ",speed = " + "(" + xSpeed + "," + ySpeed + ")"
                ;
    }
    public MovablePoint move()  {
         this.setX(this.getX() + this.getxSpeed());
         this.setY(this.getY() + this.getySpeed());
         return this ;

    }
}

