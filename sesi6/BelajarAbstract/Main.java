/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yulinar sri wahyuni
 */
public class Main {
    public static void main (String[]args){
         BangunDatar segitiga = new Segitiga (12, 20);
         BangunDatar lingkaran = new Lingkaran (60);
         
         System.out.println("Luas dari bangun datar segitiga :" + segitiga.getLuas());
         System.out.println("Luas dari bangun datar lingkaran : " + lingkaran.getLuas());
    }
}
