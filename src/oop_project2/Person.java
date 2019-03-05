/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project2;

import java.util.ArrayList;

/**
 *
 * @author ercangunbilek
 */
public class Person extends Observer {
   
    ArrayList<Observable> stocks ;
    
    public Person(String name) {
        super.name = name;
        stocks = new ArrayList<Observable>();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void onAction(Observable o) {
        
        if (!stocks.contains(o)) {
            stocks.add(o);
        }
        toString();
       
    }

    @Override
    public void add(Observable o) {
        o.register(this);
    }

    @Override
    public void remove(Observable o) {
        o.unRegister(this);
    }

    @Override
    public String toString() {
        String temp = "";
        for (int i = 0; i < stocks.size(); i++) {
           temp +=  name + " " + stocks.get(i).toString() +"\n";
        }
        return temp;
    }

    
    
    
    
}
