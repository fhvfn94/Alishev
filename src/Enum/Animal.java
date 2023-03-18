package Enum;

public enum Animal {
    DOG("собака"), CAT("кошка"), FROG("лягушка");
//    это тоже самое что и Animal dog = new Animal("собака");
    private String translation;

    Animal(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}
