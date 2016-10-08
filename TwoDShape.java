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
public abstract class TwoDShape extends Shape{
    private int d1, d2;

    public TwoDShape(int d1, int d2, int x, int y) {
        super(x, y);
        this.d1 = d1;
        this.d2 = d2;
    }

    public int getD1() {
        return d1;
    }

    public int getD2() {
        return d2;
    }
    
    public abstract int getArea();
}
