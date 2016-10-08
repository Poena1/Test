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
public class Circle extends TwoDShape{

    public Circle(int d1, int d2, int x, int y) {
        super(d1, d2, x, y);
    }
    
    public String getName(){
        return "Circle";
    }
    
    public int getRadius(){
        return getD1();
    }
    
    public int getArea(){
        return (int) (Math.PI*getRadius()*getRadius());
    }
    
    public String toString(){
        return "Circle(" +super.toString() + ") radius: " +getRadius();
    }
}
