/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abi301122;

/**
 *
 * @author LENOVO
 */
public abstract class LivingThing {
    
    public void breath(){ 
        System.out.println("Living Thing breathing..."); 
    } 
    
    public void eat(){ 
        System.out.println("Living Thing eating..."); 
    } 

    public abstract void walk();
}