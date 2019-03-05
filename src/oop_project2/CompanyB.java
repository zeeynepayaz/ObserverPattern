/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project2;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

/**
 *
 * @author ercangunbilek
 */
public class CompanyB  extends Observable{

    private volatile boolean cancelled ;
    String name = "CompanyB" ;
    int stockPrice ;
    
    private ArrayList<Observer> observers;

    public CompanyB() {
        
        observers = new ArrayList<Observer>() ;
        stockPrice = 3;
        
    }
    
    @Override
    public void register(Observer o) {
        observers.add(o);
        notifyAllObservers();
    }

    @Override
    public void unRegister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyAllObservers() {
        
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).onAction(this);
        }
        
    }

    public int getStockPrice() {
        return stockPrice;
    }
    
    public void setStockPrice(int stockPrice) {
        this.stockPrice = stockPrice;
        notifyAllObservers();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CompanyB other = (CompanyB) obj;
        if (this.stockPrice != other.stockPrice) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return "CompanyB{" + "name=" + name + ", stockPrice=" + stockPrice + '}';
    }

    @Override
    public void run() {
        
        Random rand = new Random();
        
        while (!cancelled) { 
             int randomNum = rand.nextInt((10 - 1) + 1) + 1;
            setStockPrice(randomNum);
      }
        
    }

    public void cancel()
   {
      cancelled = true;  
   }

   public boolean isCancelled() {
      return cancelled;
   }
    
    
    
}
