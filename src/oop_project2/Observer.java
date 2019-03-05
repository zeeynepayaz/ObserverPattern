/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project2;

/**
 *
 * @author ercangunbilek
 */
public abstract class Observer {
    
    protected String name;
    
    public abstract void onAction(Observable o);
    public abstract String toString();
    public abstract void add(Observable o);
    public abstract void remove(Observable o);

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
