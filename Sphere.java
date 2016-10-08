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
public class Sphere extends ThreeDShape{

    public Sphere(int length, int width, int height, int x, int y) {
        super(length, width, height, x, y);
    }
    
    public String getName(){
        return "Sphere";
    }
    
    public int getRadius(){
        return (int) (getLength());
    }
    
    public int getArea(){
        return (int) (4*Math.PI*getRadius()*getRadius());
    }
    
    public int getVolume(){
        return (int) (4.0/3.0*Math.PI*Math.pow(getRadius(), 3));
    }
    
    public String toString(){
        return "Sphere(" +super.toString() + ") radius: " +getRadius();
    }
}
