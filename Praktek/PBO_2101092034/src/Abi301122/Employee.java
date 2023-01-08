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
public class Employee extends Person{
    
    public String getName(){ 
        super.name = "cahyo";
        System.out.println("Employee : getName"); 
        return name; 
    } 
    
}
