/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project2;

import java.time.Duration;
import java.time.Instant;

/**
 *
 * @author  ercan gunbilek and nesibe zeynep ayaz
 */
public class App {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
//        Observer ercan = new Person("Ercan");
//        Observer  zeynep = new Person("Zeynep");
//        Observer atakan = new Person("Atakan");
//        
//        Observable companyA = new CompanyA();
//        Observable companyB = new CompanyB();
//        Observable companyC = new CompanyC();
//        Observable companyD = new CompanyD();
//        Observable companyE = new CompanyE();
//        
//        companyA.register(ercan);
//        companyC.register(ercan);
//        companyE.register(ercan);
//        companyD.register(zeynep);
//        companyB.register(atakan);
//        
//        
//        
//        
//        System.out.println(ercan);
//        System.out.println(zeynep);
//        System.out.println(atakan);
//        System.out.println("-----------------------------------------------");
//        companyB.setStockPrice(11);
//        System.out.println(ercan);
//        System.out.println(zeynep);
//        System.out.println(atakan);


            
        Observer ercan = new Person("Ercan");
        Observer  zeynep = new Person("Zeynep");
        Observer atakan = new Person("Atakan");
        
        Observable companyA = new CompanyA();
        Observable companyB = new CompanyB();
        Observable companyC = new CompanyC();
        Observable companyD = new CompanyD();
        Observable companyE = new CompanyE();
        
        companyA.register(ercan);
        companyC.register(ercan);
        companyE.register(ercan);
        companyD.register(zeynep);
        companyB.register(atakan);
            
            

           Thread companyA = new Thread(new CompanyA());
           Thread companyB = new Thread(new CompanyB());
           Thread companyC = new Thread(new CompanyC());
           Thread companyD = new Thread(new CompanyD());
           Thread companyE = new Thread(new CompanyE());
           
           companyA.start();
           companyB.start();
           companyC.start();
           companyD.start();
           companyE.start();
        
        
        
         
         //report metodunun ismi notifyAllObservers olarak degistirildi
         //company'lere setStockPrice() metodu eklendi
         //company'lerde stockPrice degerini guncelleyen setStockPrice() , increaseStockPrice() ve decreaseStockPrice() metotlari icerisinde stockPrice degeri guncellendikten sonra notifyAllObservers() metodu cagirimi yapildi
         // Yine company'lerde register() metodu icerisinde notifyAllObservers() metodu cagirimi yapildi boylece herhangi bir observer eklendiginde hisse senedi fiyati ile ilgili bilgilendirilecek
        
    }
    
}
