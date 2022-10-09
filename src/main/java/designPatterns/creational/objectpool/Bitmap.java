package designPatterns.creational.objectpool;

import java.awt.geom.Point2D;

public class Bitmap implements Image{

    private Point2D location;

    @Override
    public void draw() {
        System.out.println(location.toString());
    }

    @Override
    public Point2D getLocation() {
        return location;
    }

    @Override
    public void setLocation(Point2D location) {
        this.location = location;
    }

    @Override
    public void reset() {
        location = null;
        System.out.println("Location reset");
    }
}
