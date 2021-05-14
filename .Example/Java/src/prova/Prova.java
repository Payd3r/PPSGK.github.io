/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Payd3r
 */
public class Prova {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {

        //creazione del un file
        try {
            File file = new File("C:\\Users\\Payd3r\\Desktop\\prova.txt");
            if (file.createNewFile()) {
                System.out.println("File creato: " + file.getName());
            } else {
                System.out.println("Il file esiste gia'");
            }
        } catch (IOException e) {
            System.out.println("error");
        }
        int r;
        do {
            System.out.println(" menu ");
            System.out.println(" 0 - Leggi il file");
            System.out.println(" 1 - Scrivi nel file");
            System.out.println(" 2 - Aggiungi testo al file ");
            System.out.println(" 3 - Esci ");
            Scanner menu = new Scanner(System.in);
            r = menu.nextInt();

            if (r == 0) {
                File file = new File("C:\\Users\\Payd3r\\Desktop\\prova.txt");
                Scanner myReader = new Scanner(file);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
                myReader.close();
            } else if (r == 1) {
                FileWriter myWriter = new FileWriter("C:\\Users\\Payd3r\\Desktop\\prova.txt");
                Scanner testo = new Scanner(System.in);
                String s = testo.nextLine();
                myWriter.write(s);
                myWriter.close();
                System.out.println("Testo scritto");
            } else if (r == 2) {
                FileWriter file = new FileWriter("C:\\Users\\Payd3r\\Desktop\\prova.txt", true);
                Scanner testo = new Scanner(System.in);
                String s = testo.nextLine();
                BufferedWriter b = new BufferedWriter(file);
                b.write("\n" + s);
                b.close();
                file.close();
            }
        } while (r != 3);
    }
}
