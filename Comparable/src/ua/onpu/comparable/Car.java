package ua.onpu.comparable;

public class Car implements Comparable {
    private int price;
    private int year; // рік виготовлення
    private int horsePower;

    public Car(int price, int year, int horsePower) {
        this.price = price;
        this.year = year;
        this.horsePower = horsePower;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int compareTo(Car other) {
        // Порівняння за ціною
        if (this.price != other.price) {
            return Integer.compare(other.price, this.price);
        }

        // Порівняння за роком
        if (this.year != other.year) {
            return Integer.compare(this.year, other.year);
        }

        // Порівняння за кінськими силами
        return Integer.compare(this.horsePower, other.horsePower);
    }

}
