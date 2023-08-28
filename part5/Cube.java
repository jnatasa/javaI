/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author integ
 */
public class Cube {
    private int edgeLenght;
    private String edgeLength;
    
Cube(int edgeLength){
    this.edgeLenght = edgeLenght;
} 
public int volume(){
    return this.edgeLenght * this.edgeLenght * this.edgeLenght;
    }
    @Override
  public String toString() {
        return "The length of the edge is " + this.edgeLength + " and the volume " + volume();
    }
}
