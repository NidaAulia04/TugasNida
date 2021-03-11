/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nida.program;

/**
 *
 * @author Regina Ainaya
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] kamar = {
            {"1", "2", "3", "4", "X"},
            {"1", "2", "3", "4", "5"},
            {"1", "2", "3", "4", "5"},
            {"1", "2", "3", "X", "5"},
      };
        
        int kamarkosong = 0;
        for (int i = 0; i < kamar.length; i++){
            for (int j = 0; j <kamar [i].length; j++){
                if ("x".equals(kamar[i][j])){
                    System.out.println ("tamu berada di lantai" + (i+1) + "kamar" + (j+1));
                }else{
                    kamarkosong += 1;
                }
            }
        }System.out.println("");
        System.out.println(" jumlah kamar yang tersedia ada" + kamarkosong);       
    }
}
