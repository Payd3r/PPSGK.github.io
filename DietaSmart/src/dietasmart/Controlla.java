/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dietasmart;

import arduino.Arduino;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mattia
 */
public class Controlla extends Thread {
    
    @Override
    public void run() {
        Arduino arduino = new Arduino();
        arduino.setBaudRate(9600);
        arduino.setPortDescription("COM1");//rivedere porta
        ArrayList <String> lista=new ArrayList <String>();
        while (true) {
            String s;
            s = arduino.serialRead();            
            if (!"".equals(s)) {
                FileReader file;
                try {
                    file = new FileReader("RicetteRealizzabili.txt");
                    BufferedReader lettore = new BufferedReader(file);
                    String riga = lettore.readLine();
                    while (riga != null) {
                        lista.add(riga);
                        riga = lettore.readLine();
                    }
                    file.close();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Controlla.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Controlla.class.getName()).log(Level.SEVERE, null, ex);
                }   
                
                //scrivi
                File f = new File("RicetteRealizzabili.txt");
                if (f.exists()) {
                    FileOutputStream fos;
                    try {
                        fos = new FileOutputStream("RicetteRealizzabili.txt", true);
                        PrintWriter scrivi = new PrintWriter(fos);
                        for(int i=0;i<lista.size();i++){
                            if(lista.get(i)!=s){
                                scrivi.append(lista.get(i));
                            }
                        }                        
                        scrivi.close();
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Controlla.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else try {
                    if (f.createNewFile()) {
                        PrintWriter scrivi;
                        try {
                            scrivi = new PrintWriter(f);
                            scrivi.print(s);
                            scrivi.close();
                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(Controlla.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Controlla.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    }

