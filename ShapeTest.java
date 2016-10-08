/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

/**
 *
 * @author x00130180
 */
public class ShapeTest {

    public static void main(String[] args) {
        Shape[] shapes;
        shapes = new Shape[]{new Circle(4, 4, 22, 88), new Square(10, 10, 71, 96), new Sphere(2, 2, 2, 8, 89), new Cube(8, 8, 8, 79, 61)};
        System.out.println("Number of Shapes created: " +Shape.getCount());
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
            if (shapes[i] instanceof ThreeDShape) {
                ThreeDShape three = (ThreeDShape) shapes[i];
                System.out.println("Area of " +three.getName() + " is: " +three.getArea());
                System.out.println("Volume of " +three.getName() + " is: " +three.getVolume());
            }else if (shapes[i] instanceof TwoDShape) {
                TwoDShape two = (TwoDShape) shapes[i];
                System.out.println("Area of " +two.getName() + " is: " +two.getArea());
            }
            System.out.println();
        }
    }
}
