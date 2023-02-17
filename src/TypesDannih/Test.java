package TypesDannih;

public class Test {
    public static void main(String[] args) {
        byte x = 123; // -127 до 127
        long y = 1234545454454544554L;
        double a = 12.3;
        float g = 12.2f;
        int t = 23213;
        long q = t;
    }

    public static void typeOF(Object value) {
        if (value instanceof Integer) {
            System.out.println("int");
        } else if (value instanceof Long) {
            System.out.println("long");
        } else if (value instanceof Byte) {
            System.out.println("byte");
        }
    }
}
