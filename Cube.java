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
public class Cube extends ThreeDShape{

    public Cube(int length, int width, int height, int x, int y) {
        super(length, width, height, x, y);
    }
    
    public String getName(){
        return "Cube";
    }
    
    public int getSide(){
        return getLength();
    }
    
    public int getArea(){
        return (int) (6*getSide()*getSide());
    }
    
    public int getVolume(){
        return (int) (getSide()*getSide()*getSide());
    }
    
    public String toString(){
        return "Cube(" +super.toString() + ") side: " +getLength();
    }
}
