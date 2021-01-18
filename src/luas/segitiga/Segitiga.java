/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luas.segitiga;

import java.util.Scanner;

/**
 *
 * @author Yuliana
 */
public class Segitiga {
    double alas,tinggi, hasil;
    
    void input(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Alas : ");
        alas = input.nextDouble();
        
        System.out.print("Masukkan Tinggi : ");
        tinggi = input.nextDouble();
    }
    
    void hitung(){
        System.out.println("Luas Segitiga = "+alas+"*"+tinggi+"*/2");
    }
    double hasil(){
        hasil = alas*tinggi/2;
        return hasil;
    }
}
