/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul7;

/**
 *
 * @author user
 */
public class Latihan1 {
    public static void main(String[] args){
        int i;
        String hari[]={"Monday","Thuesday","Wednesday","Thirstday","Friday","Saturday","Sunday"};
        
        i=0;
        while(i<hari.length){
            if(i!=0){
                System.out.print(", ");
            }
            System.out.print(hari[i]);
            i++;
        }
        
        //for(i=0;i<hari.length;i++){
            //System.out.print(hari[i] +" ");
        //}
    }
}
