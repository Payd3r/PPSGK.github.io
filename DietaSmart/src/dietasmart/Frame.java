/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dietasmart;

import arduino.Arduino;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Payd3r,Shock03,Skin
 */
public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Frame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NomeArticolo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Calorie = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Proteine = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Grassi = new javax.swing.JTextField();
        Data = new com.toedter.calendar.JDateChooser();
        AggiungiProdotto = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Nome = new javax.swing.JTextField();
        Preparazione = new javax.swing.JTextField();
        Tempo = new javax.swing.JTextField();
        Ingredienti = new javax.swing.JTextField();
        AggiungiRicetta = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        jButton2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jButton2.setText("Conferma");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Nome Articolo:");

        NomeArticolo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Calorie:");

        Calorie.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Calorie.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Calorie.setName(""); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Proteine:");

        Proteine.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Proteine.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Proteine.setName(""); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Grassi:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Data scadenza:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        Grassi.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Grassi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Grassi.setName(""); // NOI18N

        AggiungiProdotto.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        AggiungiProdotto.setText("Aggiungi");
        AggiungiProdotto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AggiungiProdottoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(503, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(483, 483, 483))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(445, 445, 445)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Proteine)
                            .addComponent(Calorie)
                            .addComponent(NomeArticolo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Grassi)
                            .addComponent(Data, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(AggiungiProdotto, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NomeArticolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Calorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Proteine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Grassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(AggiungiProdotto)
                .addGap(53, 53, 53)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(239, 239, 239))
        );

        jTabbedPane1.addTab("Aggiungi Articolo", jPanel1);

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setText("Nome:");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setText("Preparazione:");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setText("Tempo di Preparazione:");

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel13.setText("Ingredienti:");

        Nome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        Preparazione.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        Tempo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        Ingredienti.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        AggiungiRicetta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        AggiungiRicetta.setText("Aggiungi");
        AggiungiRicetta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AggiungiRicettaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 402, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(50, 50, 50)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Preparazione, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(310, 310, 310))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Tempo, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(426, 426, 426)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ingredienti, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(AggiungiRicetta, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Preparazione, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(Ingredienti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(AggiungiRicetta, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(335, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Aggiungi Ricetta", jPanel2);

        jPanel3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel3ComponentShown(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Procedimento", "Tempo Preparazione", "Calorie", "Proteine", "Grassi", "Necessario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1359, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Visualizza Ricette Realizzabili", jPanel3);

        jPanel4.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel4ComponentShown(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Procedimento", "Tempo Preparazione", "Calorie", "Proteine", "Grassi", "Necessario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1359, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Visualizza Ricette", jPanel4);

        jPanel5.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel5ComponentShown(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Calorie", "Proteine", "Grassi", "Data Scedenza"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1359, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Visualizza Articoli", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel5ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel5ComponentShown
        // TODO add your handling code here:
        ArrayList<Prodotto> s = new ArrayList<Prodotto>();
        try {
            s = LeggiDaFileProdotti("Articoli.txt");
        } catch (ParseException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultTableModel model2;
        model2 = (DefaultTableModel) jTable3.getModel();
        model2.setRowCount(0);
        for (Prodotto p : s) {
            model2.insertRow(model2.getRowCount(), new Object[]{p.nome, p.valoreEnergetico[0], p.valoreEnergetico[1], p.valoreEnergetico[2], p.getScadenza()});
        }
    }//GEN-LAST:event_jPanel5ComponentShown

    private void jPanel3ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel3ComponentShown

        Ricette temp = new Ricette(LeggiDaFileRicette("Ricette.txt"));
        Ricette realizzabili = null;
        try {
            realizzabili = new Ricette(temp.trovaRealizzabili(temp.ricette, LeggiDaFileProdotti("Articoli.txt")));
        } catch (ParseException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultTableModel model;
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        ArrayList<Ricetta> fantastica = new ArrayList<Ricetta>(realizzabili.ricette);
        for (Ricetta r : fantastica) {
            model.insertRow(model.getRowCount(), new Object[]{r.nome, r.preparazione, r.tempo, r.valoreEnergetico[0], r.valoreEnergetico[1], r.valoreEnergetico[2], r.necessario});
        }
    }//GEN-LAST:event_jPanel3ComponentShown


    private void AggiungiRicettaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AggiungiRicettaActionPerformed
        // TODO add your handling code here:
        Ricetta r = new Ricetta();
        try {
            r = new Ricetta(Nome.getText(), Preparazione.getText(), Tempo.getText(), Ingredienti.getText(), LeggiDaFileProdotti("Articoli.txt"));
        } catch (ParseException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            scriviricette(r.ToString());
        } catch (IOException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        clearRicetta();
    }//GEN-LAST:event_AggiungiRicettaActionPerformed

    private void AggiungiProdottoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AggiungiProdottoActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dcn = new SimpleDateFormat("dd/MM/yyyy");
        String date = dcn.format(Data.getDate());
        String s = NomeArticolo.getText() + ";" + Calorie.getText() + ";" + Proteine.getText() + ";" + Grassi.getText() + ";" + date + ";" + "\n";
        try {
            scriviarticolo(s);
        } catch (IOException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        clearArticolo();
    }//GEN-LAST:event_AggiungiProdottoActionPerformed

    private void jPanel4ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel4ComponentShown
        // TODO add your handling code here:
        ArrayList<Ricetta> s = LeggiDaFileRicette("Ricette.txt");

        DefaultTableModel model1;
        model1 = (DefaultTableModel) jTable2.getModel();
        model1.setRowCount(0);
        for (Ricetta r : s) {
            model1.insertRow(model1.getRowCount(), new Object[]{r.nome, r.preparazione, r.tempo, r.valoreEnergetico[0], r.valoreEnergetico[1], r.valoreEnergetico[2], r.necessario});
        }
    }//GEN-LAST:event_jPanel4ComponentShown

    private void scriviricette(String s) throws IOException {
        File f = new File("Ricette.txt");
        if (f.exists()) {
            FileOutputStream fos = new FileOutputStream("Ricette.txt", true);
            PrintWriter scrivi = new PrintWriter(fos);
            scrivi.append(s);
            scrivi.close();
        } else if (f.createNewFile()) {
            PrintWriter scrivi = new PrintWriter(f);
            scrivi.print(s);
            scrivi.close();
        }
    }

    private void scriviarticolo(String s) throws IOException {
        File f = new File("Articoli.txt");
        if (f.exists()) {
            FileOutputStream fos = new FileOutputStream("Articoli.txt", true);
            PrintWriter scrivi = new PrintWriter(fos);
            scrivi.append(s);
            scrivi.close();
        } else if (f.createNewFile()) {
            PrintWriter scrivi = new PrintWriter(f);
            scrivi.print(s);
            scrivi.close();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws FileNotFoundException, IOException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
 /* Create and display the form */

        //INIZIALIZZAZIONE BOT
        /*ApiContextInitializer.init();
        TelegramBotsApi api = new TelegramBotsApi();
        try {
            api.registerBot(new Bot());
        } catch (TelegramApiRequestException e) {
            // gestione errore in registrazione
        }
        Arduino arduino = new Arduino();
        arduino.setBaudRate(9600);
        arduino.setPortDescription("COM1");//rivedere porta
        FileReader file = new FileReader("RicetteRealizzabili.txt");
        BufferedReader lettore = new BufferedReader(file);
        String riga = lettore.readLine();
        while (riga != null) {
            arduino.serialWrite(riga + ";");
            riga = lettore.readLine();
        arduino.serialWrite(".");
        file.close();        }*/

         
        Controlla c = new Controlla();
        c.start();

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Frame().setVisible(true);
                try {
                    c.join();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }

    //Vlad: cambiato da private --> protected
    public ArrayList<Prodotto> LeggiDaFileProdotti(String percorso) throws ParseException {
        BufferedReader br = null;
        ArrayList s = new ArrayList<Prodotto>();
        try {
            br = new BufferedReader(new FileReader(percorso));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "File " + percorso + " non trovato!");
        }
        String text = null;

        try {
            String[] a;
            while ((text = br.readLine()) != null) {
                a = text.split(";");
                s.add(new Prodotto(a[0], a[1], a[2], a[3], a[4]));
            }
        } catch (IOException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Errore nel caricamento del file!");
        }

        try {
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Errore nella chiusura del file!");
        }
        return s;
    }

    private ArrayList<Ricetta> LeggiDaFileRicette(String percorso) {
        BufferedReader br = null;
        ArrayList s = new ArrayList<Ricetta>();

        try {
            br = new BufferedReader(new FileReader(percorso));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "File " + percorso + " non trovato!");
        }
        String text = null;
        try {
            String[] a;
            while ((text = br.readLine()) != null) {
                a = text.split(";");
                s.add(new Ricetta(a[0], a[1], a[2], a[3], a[4], a[5], a[6]));
            }
        } catch (IOException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Errore nel caricamento del file!");
        }
        try {
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Errore nella chiusura del file!");
        }
        return s;
    }

    private void clearArticolo() {
        NomeArticolo.setText("");
        Calorie.setText("");
        Proteine.setText("");
        Grassi.setText("");
        Data.setCalendar(null);
    }

    private void clearRicetta() {
        Nome.setText("");
        Preparazione.setText("");
        Tempo.setText("");
        Ingredienti.setText("");
        Ingredienti.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AggiungiProdotto;
    private javax.swing.JButton AggiungiRicetta;
    private javax.swing.JTextField Calorie;
    private com.toedter.calendar.JDateChooser Data;
    private javax.swing.JTextField Grassi;
    private javax.swing.JTextField Ingredienti;
    private javax.swing.JTextField Nome;
    private javax.swing.JTextField NomeArticolo;
    private javax.swing.JTextField Preparazione;
    private javax.swing.JTextField Proteine;
    private javax.swing.JTextField Tempo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
