package ua.opnu.draw.model;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Ellipse extends DrawShape {

    public Ellipse() {
    }

    public Ellipse(Point startPoint, Point endPoint) {
        super(startPoint, endPoint);
    }

    // Для відтворення еліпса ми використовуємо клас Ellipse.Double (клас Double усередині класу Ellipse2D).
    // Клас Ellipse2D.Double приймає координати типу Double
    @Override
    public Shape getShape(Point startPoint, Point endPoint) {
        return new Ellipse2D.Double(Math.min(startPoint.getX(), endPoint.getX()), Math.min(startPoint.getY(), endPoint.getY()),
                Math.abs(startPoint.getX() - endPoint.getX()), Math.abs(startPoint.getY() - endPoint.getY()));
    }
}
