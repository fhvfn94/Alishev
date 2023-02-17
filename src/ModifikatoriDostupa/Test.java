package ModifikatoriDostupa;

import ModifikatoriDostupa.Packet1.Person;

// В одном файле может быть только один "public" класс
public class Test extends Person {
    public Test() {
        name = "Tom";
    }

    public static void main(String[] args) {
//        public - дает доступ всем к полю
//        private - дает доступ только внутри класса
//        default - дает доступ только в пределах пакета
//        protected - дает доступ в пределах пакета и вне пакета при условии что другой класс наследуется от этого класса
    }
}
