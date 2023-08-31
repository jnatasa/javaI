
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author integ
 */
public class Stack {
    private ArrayList<String> list;
    
    public Stack(){
        this.list = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        if(this.list.isEmpty()){
            return true;
        }
        return false;
    }
    
    public void add(String vaule){
        this.list.add(vaule);
    }
    
    public String take(){
        String last = this.list.get(this.list.size() - 1);
        this.list.remove(last);
        return last;
    }

   
}
