import ua.onpu.comparable.Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(2000, 1995, 200);
        Car car2 = new Car(1900, 1998, 250);
        System.out.println("Is car1 better than car2:\n" + car1.compareTo(car2));
    }
}
