package Tasks.Vector;

public class Vector {
    private int x;
    private int y;
    private int z;

    public Vector(int x, int y, int z) {
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }



    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int observationVector() {
        int result = 0;
        result = (int) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
        return result;
    }

    public int scalarProduct(Vector vector) {
        int result = 0;
        result = x * vector.x + y * vector.y + z * vector.z;
        return result;
    }

    public void crossProduct(Vector vector) {
        int result = 0;
        int result2 = 0;
        int result3 = 0;
        result = y * vector.z - z * vector.y;
        result2 = z * vector.x - x * vector.z;
        result3 = x * vector.y - y * vector.x;
        System.out.println(result + ", " +  result2 + ", "+ result3);;
    }


}












