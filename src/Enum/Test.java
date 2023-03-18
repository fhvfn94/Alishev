package Enum;

public class Test {
    public static void main(String[] args) {
        Animal animal = Animal.CAT;
        switch (animal) {
            case CAT:
                System.out.println("It's cat");
                break;
            case DOG:
                System.out.println("It's dog");
                break;
            case FROG:
                System.out.println("It's frog");
                break;
        }
        Season seasons = Season.SPRING;
        System.out.println(seasons instanceof Enum);
        switch (seasons) {
            case AUTUMN:
                System.out.println("Seasons.AUTUMN = " + Season.AUTUMN);
                break;
            case WINTER:
                System.out.println("Seasons.WINTER = " + Season.WINTER);
                break;
            case SPRING:
                System.out.println("Seasons.SPRING = " + Season.SPRING);
                break;
            case SUMMER:
                System.out.println("Seasons.SUMMER = " + Season.SUMMER);
                break;
        }
    }
}
