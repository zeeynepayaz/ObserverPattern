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
public abstract class Observable implements Runnable{
    
    public abstract void register(Observer o);
    public abstract void unRegister(Observer o);
    public abstract void notifyAllObservers();
    public abstract String toString();
    public  abstract int getStockPrice() ;
    public abstract void setStockPrice(int stockPrice);
    
    
}
