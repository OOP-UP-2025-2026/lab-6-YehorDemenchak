package ua.opnu.animal;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public String makeSound(){
        return "Meow";
    }
}
