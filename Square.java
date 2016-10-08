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
public class Square extends TwoDShape{

    public Square(int d1, int d2, int x, int y) {
        super(d1, d2, x, y);
    }
    
    public String getName(){
        return "Square";
    }
    
    public int getSide(){
        return getD1();
    }
    
    public int getArea(){
        return (int) (getD1()*getD2());
    }
    
    public String toString(){
        return "Square(" +super.toString() + ") side: " +getD1();
    }
}
