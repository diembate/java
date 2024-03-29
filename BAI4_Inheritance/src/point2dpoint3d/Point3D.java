package point2dpoint3d;

public class Point3D extends Point2d{
    private float z;
    public Point3D() {}

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
        super.getXY();
        this.z = z;
    }

    public float[] getXYZ() {
        float arr2[] = {super.getX(), super.getY(), this.z};
        return arr2;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                '}';
    }
}
