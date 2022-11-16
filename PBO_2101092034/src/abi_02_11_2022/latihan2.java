/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abi_02_11_2022;

/**
 *
 * @author User
 */
public class latihan2 {
    public static void main(String[] args) {
        StudentRecord student1 = new StudentRecord();
        
        student1.setName("abi");
        student1.setAddress("air camar");
        student1.setAge(19);
        student1.setMathGrade(95);
        student1.setEnglishGrade(90);
        student1.setScienceGrade(95);
        
        System.out.println("Nama : "+student1.getName());
        System.out.println("Alamat : "+student1.getAddress());
        System.out.println("Umur : "+student1.getAge());
        System.out.println("Nilai Matematika : "+student1.getMathGrade());
        System.out.println("Nilai Bahasa Inggris : "+student1.getEnglishGrade());
        System.out.println("Nilai IPA : "+student1.getScienceGrade());
        System.out.println("Rata-rata : "+student1.getAverage());
    }
}
