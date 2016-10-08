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
public abstract class Shape {
    private int x, y;
    private static int count=0;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
        count++;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public String toString(){
        return "" +x + ", " +y;
    }

    public static int getCount() {
        return count;
    }
    
    public abstract String getName();
}
