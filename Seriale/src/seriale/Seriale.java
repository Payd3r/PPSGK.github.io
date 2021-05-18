/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriale;

import arduino.Arduino;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author galeg
 */
public class Seriale {
    
    public static void main(String[] args)throws IOException {
      Arduino sp=new Arduino();
       sp.setPortDescription("COM4");
       sp.setBaudRate(9600);
       sp.serialRead();//legge
      sp.serialWrite("Ciao");//scrive
        
    
       
    }
    
}
