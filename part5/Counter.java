/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author integ
 */
public class Counter {
    private int vaule;
    
    public Counter(int startVaule){
        this.vaule = startVaule;
        
    }
    
    public Counter(){
    this.vaule = 0;
}
    public void increse(){
        this.vaule = this.vaule + 1;
    }
    
    public void decrase(){
        this.vaule = this.vaule - 1;
    }
    
    public void increase(int increaseBy){
        if(increaseBy >= 0){
            this.vaule = this.vaule + increaseBy;
        }
    }
    
    public void decrease (int decreaseBy){
        if(decreaseBy >= 0){
            this.vaule = this.vaule - 1;
        }
    }
}
