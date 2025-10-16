package ua.opnu.animal;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    public String makeSound(){
        return "Woof";
    }
}
