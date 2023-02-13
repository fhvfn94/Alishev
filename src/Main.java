import Static.Human;

public class Main {
    public static void main(String[] args) {
        Human.description = "Nice"; // для константы не нужен объект
        Human h1 = new Human("ashab", 12);
//        Human.description = "Bad";
        Human h2 = new Human("Bill", 55);
//        System.out.println(Math.PI);
//        System.out.println(Human.PI);
        h2.printNumberOfPeople();
        Human h3 = new Human("Bar", 44);
        h1.printNumberOfPeople();
    }
}