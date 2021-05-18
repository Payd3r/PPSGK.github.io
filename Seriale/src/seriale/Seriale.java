/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriale;

import arduino.Arduino;

/**
 *
 * @author galeg
 */
public class Seriale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Arduino sp=new Arduino();
       sp.setPortDescription("COM4");
       sp.setBaudRate(9600);
       sp.serialRead();//legge
       sp.serialWrite("Ciao");//scrive
       
    }
    
}
