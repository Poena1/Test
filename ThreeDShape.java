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
public abstract class ThreeDShape extends Shape{
    private int length, width, height;

    public ThreeDShape(int length, int width, int height, int x, int y) {
        super(x, y);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    
    public abstract int getArea();
    
    public abstract int getVolume();
}
