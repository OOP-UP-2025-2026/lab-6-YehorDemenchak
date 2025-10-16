import ua.opnu.animal.Dog;
import ua.opnu.animal.Cat;

public class Main {
    public static void main(String[] args) {
        Dog newDog = new Dog("A random dog");
        Cat newCat = new Cat("A random cat");
        System.out.println(newDog.makeSound());
        System.out.println(newCat.makeSound());
    }
}
