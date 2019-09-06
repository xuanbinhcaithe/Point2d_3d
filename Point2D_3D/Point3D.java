package OOP.Point2D_3D;

public class Point3D extends Point2D{
private float z = 0.0f;
public Point3D(){
}
public Point3D (float x ,float y ,float z) {
    setX(x);
    setY(y);
    this.z = z;
}

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setArray (float z) {
        this.z = z;
       super.getXY();
    }
    public float[] getArray() {
    float[]XYZ = {super.getX(),super.getY(),this.z};
    return XYZ;
    }
    @Override
    public String toString() {
    return super.toString() + " and z = " + getZ();
    }
}
