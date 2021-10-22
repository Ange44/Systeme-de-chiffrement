/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpencryptage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author 225TECHNOLOGIES
 */
public class Fr_cle extends javax.swing.JFrame {

    /**
     * Creates new form Frf_cle
     */
    public Fr_cle() {
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

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cmb_fournisseur = new javax.swing.JComboBox<>();
        btn_generer = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmb_algorithme = new javax.swing.JComboBox<>();
        btn_visualiser = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtclebrute = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtclehexa = new javax.swing.JTextField();

        setTitle("CACUL ET STOCKAGE DES CLES");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Fournisseur :");

        cmb_fournisseur.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_fournisseurItemStateChanged(evt);
            }
        });
        cmb_fournisseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_fournisseurActionPerformed(evt);
            }
        });

        btn_generer.setText("Generer et stocker cle");
        btn_generer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_genererActionPerformed(evt);
            }
        });

        jLabel2.setText("Algorithme de chiffrement :");

        btn_visualiser.setText("Visualiser cle");
        btn_visualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_visualiserActionPerformed(evt);
            }
        });

        jLabel3.setText("Cle brute :");

        txtclebrute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclebruteActionPerformed(evt);
            }
        });

        jLabel4.setText("Cle en hexadecimal :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtclebrute))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtclehexa, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmb_fournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_visualiser, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_generer, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_algorithme, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmb_fournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cmb_algorithme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(btn_generer)
                .addGap(18, 18, 18)
                .addComponent(btn_visualiser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtclebrute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtclehexa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_genererActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_genererActionPerformed
        try {
            // creation d'un generateur de cle secret
            KeyGenerator kg=KeyGenerator.getInstance(cmb_algorithme.getSelectedItem().toString(), cmb_fournisseur.getSelectedItem().toString());
            // Initialisation du generateur en mode aleatoire
            SecureRandom sr= new SecureRandom();
            kg.init(sr);
            // Creation de la cle secret
            SecretKey sk= kg.generateKey();
            // Stockage de la cle dans un fichier
            JFileChooser selecteur= new JFileChooser("/");
            int etat = selecteur.showSaveDialog(this);
            if(etat==JFileChooser.APPROVE_OPTION){
                // Recuperation du nom du fichier
                
                String nomfichier= selecteur.getSelectedFile().getAbsolutePath();
                ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(nomfichier));
                oos.writeObject(sk);
                JOptionPane.showMessageDialog(this, "Cle enregistre avec succes");
            }   
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Fr_cle.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchProviderException ex) {
            Logger.getLogger(Fr_cle.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Fr_cle.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Fr_cle.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_genererActionPerformed

    private void cmb_fournisseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_fournisseurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_fournisseurActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Liste des fournisseurs cryptographiques
        // Ajout du fournisseur bcprov
        Provider p = new org.bouncycastle.jce.provider.BouncyCastleProvider();
        java.security.Security.addProvider(p);
        // Affichage de la liste dans le combo
        Provider[] list_fournisseur=java.security.Security.getProviders();
        
        for (Provider prov : list_fournisseur) {
            cmb_fournisseur.addItem(prov.getName());
        }
    }//GEN-LAST:event_formWindowOpened

    private void cmb_fournisseurItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_fournisseurItemStateChanged
        // Recuperation des algorithmes de chiffrements
        Provider four=Security.getProvider(cmb_fournisseur.getSelectedItem().toString());
        for (Provider.Service s : four.getServices() ) {
            if (s.getType().equalsIgnoreCase("Cipher")) {
                cmb_algorithme.addItem(s.getAlgorithm());
                
            }
            
        }
    }//GEN-LAST:event_cmb_fournisseurItemStateChanged

    private void btn_visualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_visualiserActionPerformed
        // Visualisation de cle
       JFileChooser vs= new JFileChooser();
       int etat= vs.showDialog(this, "Ouvrir");
       if(etat==JFileChooser.APPROVE_OPTION){
           String nomfichier= vs.getSelectedFile().getAbsolutePath();
           try {
               ObjectInputStream ois= new ObjectInputStream(new FileInputStream(nomfichier));
               SecretKey sk= (SecretKey) ois.readObject();
                JOptionPane.showMessageDialog(this, "Cle recuperee avec succes");
                byte[] clebrute= sk.getEncoded();
                String txtcle="",txtclehex="";
                for (byte b : clebrute) {
                    txtcle= txtcle+b+" ";
                    txtclehex=txtclehex+String.format("%02X", b&255)+" ";
                   
               }
                txtclebrute.setText(txtcle);
                txtclehexa.setText(txtclehex);
           } catch (FileNotFoundException ex) {
               Logger.getLogger(Fr_cle.class.getName()).log(Level.SEVERE, null, ex);
           } catch (IOException ex) {
               Logger.getLogger(Fr_cle.class.getName()).log(Level.SEVERE, null, ex);
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(Fr_cle.class.getName()).log(Level.SEVERE, null, ex);
           }
                
       }
    }//GEN-LAST:event_btn_visualiserActionPerformed

    private void txtclebruteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclebruteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclebruteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fr_cle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fr_cle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fr_cle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fr_cle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fr_cle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_generer;
    private javax.swing.JButton btn_visualiser;
    private javax.swing.JComboBox<String> cmb_algorithme;
    private javax.swing.JComboBox<String> cmb_fournisseur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtclebrute;
    private javax.swing.JTextField txtclehexa;
    // End of variables declaration//GEN-END:variables
}
