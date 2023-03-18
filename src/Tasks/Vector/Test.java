package Tasks.Vector;

public class Test {
    public static void main(String[] args) {
        Vector vector1 = new Vector(5, 4, 6);
        Vector vector2 = new Vector(1, 2, 3);
//        System.out.println(vector1.observationVector());
        System.out.println(vector1.scalarProduct(vector2));


    }

}
