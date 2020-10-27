package com.company;

public class Rectangle implements Shape{
    private double side1, side2;

    public Rectangle (double side1, double side2) throws Exception {
        this.side1 =  side1;
        this.side2 = side2;
        if (side1 <= 0 || side2 <= 0) throw new Exception("Введены неверные данные");
    }

    public double calcArea() {

        return side1 * side2;
    }

    public double calcPerimeter() {

        return 2*(side1+side2);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Прямоугольник со сторонами " + side1 + " и " + side2 + " ,площадью "+ calcArea() + " и периметром "+ calcPerimeter());
        return str.toString();
    }
}
