package StringBuilder;

public class StringBuilder {
    private String name;
    private int age;
//    private static int countPeople;

    public StringBuilder(String name, int age) {
        this.name = name;
        this.age = age;
//        countPeople++;
    }

    @Override
    public String toString() {
        return "name = " + name + "; \nage = " + age;
    }
    //    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void printNumberOfPeople() {
//        System.out.println("Number of people is " + countPeople);
//    }
}
