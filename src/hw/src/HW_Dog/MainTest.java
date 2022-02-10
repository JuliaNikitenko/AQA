package HW_Dog;

public class MainTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Джина", "лабрадор", "черный", 1);
        System.out.println(dog);
        dog.sayWoof();
        Dog dog1 = new Dog();
        System.out.println(dog1);
        dog1.setName("Тарзан");
        dog1.setColor("рыжий");
        dog1.setAge(15);
        System.out.println(dog1);
    }
}
