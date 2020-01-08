package com.citylive.server.datastructure;

public class Position2D {
    double x,y;

    public Position2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Position2D pos) {
        return Math.sqrt(Math.pow(this.getX(),2)+Math.pow(this.getY(),2));
    }
}
