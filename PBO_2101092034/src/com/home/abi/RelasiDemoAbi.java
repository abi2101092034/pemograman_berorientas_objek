/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.home.abi;

/**
 *
 * @author User
 */
public class RelasiDemoAbi {
    
    public static void main(String[] args) {
//a few numbers
int i = 37;
int j = 42;
int k = 42;
System.out.println("Variable values...");
System.out.println(" i = " + i);
System.out.println(" j = " + j);
System.out.println(" k = " + k);
//lebih besar dari
System.out.println("Greater than...");
System.out.println(" i > j = " + (i > j)); //false
System.out.println(" j > i = " + (j > i)); //true
System.out.println(" k > j = " + (k > j)); //false
    }
}
