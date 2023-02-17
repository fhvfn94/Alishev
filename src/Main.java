import Static.Human;
import StringBuilder.StringBuilder;

public class Main {
    public static void main(String[] args) {
        Human.description = "Nice"; // для константы не нужен объект
        Human h1 = new Human("ashab", 12);
//        Human.description = "Bad";
        Human h2 = new Human("Bill", 55);
//        System.out.println(Math.PI);
//        System.out.println(Human.PI);
//        h2.printNumberOfPeople();
        Human h3 = new Human("Bar", 44);
//        h1.printNumberOfPeople();
//        StringBuilder sb = new StringBuilder("hello");
//        System.out.println(sb.toString());
//        sb.append(" my").append(" friend");
//        System.out.println(sb.toString());
//        System.out.printf("String %10d \n", 532);
//        System.out.printf("String %10d\n", 5);
//        System.out.printf("String %10d\n", 100000000);
//        System.out.printf("String %10d\n", 10000000);
//        System.out.printf("String %.2f\n", 1.0001);
        StringBuilder stringBuilder = new StringBuilder("name", 10);
        System.out.println(stringBuilder.toString());
    }
}