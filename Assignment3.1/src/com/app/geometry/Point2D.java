package com.app.geometry;



public class Point2D {
    private double x, y;

    // Constructor
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Method to return point details as a string
    public String getDetails() {
        return "(" + x + ", " + y + ")";
    }

    // Method to check if two points are equal
    public boolean isEqual(Point2D other) {
        return this.x == other.x && this.y == other.y;
    }

    // Method to calculate distance between this point and another point
    public double calculateDistance(Point2D other) {
        return Math.sqrt(Math.pow(other.x - this.x, 2) + Math.pow(other.y - this.y, 2));
    }
}

