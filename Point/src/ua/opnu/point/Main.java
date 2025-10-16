package ua.opnu.point;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(3.39485, 45.3456);
        System.out.println(p.getX() + " " + p.getY());
        p.setX(7.4343435);
        System.out.println(p.getX() + " " + p.getY());
        p.setY(9.4399935);
        System.out.println(p.getX() + " " + p.getY());
        p.moveTo(23.576, 34.324);
        System.out.println(p.getX() + " " + p.getY());
    }
}
