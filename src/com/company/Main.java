package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        double sumArea = 0, minArea = 1000, maxArea=0, minPer = 1000, maxPer = 0;

        Shape circle = new Circle(3.0);
        Shape rectangle = new Rectangle(3.0 ,2.0);
        Shape square = new Square(3.0);
        Shape triangle = new Triangle(3.0, 2.0, 4.0);

        ArrayList<Shape> Figures = new ArrayList<Shape>();
        Figures.add(circle);
        Figures.add(rectangle);
        Figures.add(square);
        Figures.add(triangle);

        for (int i=0; i<Figures.size(); i++){
            if (Figures.get(i).calcArea() < minArea) minArea = Figures.get(i).calcArea();
            if (Figures.get(i).calcArea() > maxArea) maxArea = Figures.get(i).calcArea();
            if (Figures.get(i).calcPerimeter() < minPer) minPer = Figures.get(i).calcPerimeter();
            if (Figures.get(i).calcPerimeter() > maxPer) maxPer = Figures.get(i).calcPerimeter();

            sumArea +=Figures.get(i).calcArea();
        }

        System.out.println("Суммарная площадь всех фигур: " + sumArea);
        System.out.println("Максимальную площадь " + maxArea + " имеют фигуры: ");
        for (int i=0; i < Figures.size(); i++) {
            if(Figures.get(i).calcArea() == maxArea)
                System.out.println(Figures.get(i).toString());
        }

        System.out.println("Минимальную площадь " + minArea + " имеют фигуры: ");
        for (int i=0; i < Figures.size(); i++) {
            if(Figures.get(i).calcArea() == minArea)
                System.out.println(Figures.get(i).toString());
        }

        System.out.println("Максимальный периметр " + maxPer + " имеют фигуры: ");
        for (int i=0; i < Figures.size(); i++) {
            if(Figures.get(i).calcPerimeter() == maxPer)
                System.out.println(Figures.get(i).toString());
        }

        System.out.println("Минимальный периметр " + minPer + " имеют фигуры: ");
        for (int i=0; i < Figures.size(); i++) {
            if(Figures.get(i).calcPerimeter() == minPer)
                System.out.println(Figures.get(i).toString());
        }
    }
}

