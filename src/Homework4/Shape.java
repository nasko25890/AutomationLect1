package Homework4;

abstract class Shape {

    public abstract double getArea(double parameter1);

    public abstract double getPerimeter(double parameter2);


}
class Circle extends Shape {

    @Override
    public double getArea(double radius) {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter(double radius) {
        return 2 * Math.PI * radius;
    }
}

class Square extends Shape {

    @Override
    public double getArea(double side) {
        return side * side;
    }

    @Override
    public double getPerimeter(double side) {
        return  4 * side;
    }
}