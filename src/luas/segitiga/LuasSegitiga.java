/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luas.segitiga;

/**
 *
 * @author Yuliana
 */
public class LuasSegitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Menghitung Luas Segitiga");
        Segitiga tiga = new Segitiga();
        tiga.input();
        tiga.hitung();
        
        System.out.println("Hasil = ");
        System.out.println(tiga.hasil());
    }
    
}
