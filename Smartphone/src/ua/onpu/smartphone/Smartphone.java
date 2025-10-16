package ua.onpu.smartphone;

public class Smartphone implements GPS, Cellular {
    private double[] coordinates;

    public Smartphone(double[] coordinates) {
        this.coordinates = coordinates;
    }

    public double[] getCoordinates() {
        return this.coordinates;
    }

    public void makeCall() {
        System.out.println("Making call...");
    }

    public void receiveCall() {
        System.out.println("Receiving call...");
    }
}
