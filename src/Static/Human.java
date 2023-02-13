package Static;

public class Human {
    private String name;
    private int age;
    private static int countPeople = 0; // Все статические переменнные инициализируются int = 0, char && String = 0
    public static String description; // константа
    public static final double PI = 3.14; // значение присвоенной переменной нельзя изменить

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getDescription() {
        return description;
    }

    public void getAllFields() {
        System.out.println(name + " " + age + " " + description);
    }

    public void printNumberOfPeople() {
        System.out.println("number of people " + countPeople);
    }
}
