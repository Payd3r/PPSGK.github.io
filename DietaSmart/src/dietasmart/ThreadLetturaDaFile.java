/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dietasmart;

import java.io.BufferedReader;
import java.io.FileReader;


/**
 *
 * @author Pellegata_Filippo
 */
public class ThreadLetturaDaFile extends Thread{
    
 BufferedReader reader = new BufferedReader(new FileReader("R:\\Desktop\\PPSGK.github.io-main\\PPSGK.github.io-main\\DietaSmart\prova.txt"));
  
}
