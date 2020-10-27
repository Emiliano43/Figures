package com.company;

public class Square implements Shape {
    private double side;

    public Square (double side) throws Exception {
        this.side =  side;
        if (side <= 0) throw new Exception("Введены неверные данные");
    }

    public double calcArea() {
        return side * side;
    }

    public double calcPerimeter() {
        return 4*side;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Квадрат со стороной " + side + " ,площадью " + calcArea() + " и периметром " + calcPerimeter());
        return str.toString();
    }
}
