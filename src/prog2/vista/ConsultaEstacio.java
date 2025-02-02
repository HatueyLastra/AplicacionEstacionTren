/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package prog2.vista;

import javax.swing.JOptionPane;
import prog2.model.EstacioTren;

/**
 *
 * @author Hatuey
 */
public class ConsultaEstacio extends javax.swing.JDialog {
    
    EstacioTren estacio;

    /**
     * Creates new form ConsultaEstacio
     */
    public ConsultaEstacio(java.awt.Frame parent, boolean modal, EstacioTren estacio) {
        super(parent, modal);
        initComponents();
        this.estacio = estacio;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        btnMostraVies = new javax.swing.JButton();
        btnMostrarAccesos = new javax.swing.JButton();
        cbOpcionVies = new javax.swing.JComboBox<>();
        cbOpcionAccesos = new javax.swing.JComboBox<>();
        btnMostraIncidencies = new javax.swing.JButton();
        txtCalcul = new javax.swing.JTextField();
        cbCalculs = new javax.swing.JComboBox<>();

        jRadioButton3.setText("jRadioButton3");

        jRadioButton4.setText("jRadioButton4");

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnMostraVies.setText("Mostrar Vies");
        btnMostraVies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostraViesActionPerformed(evt);
            }
        });

        btnMostrarAccesos.setText("Mostrar accesos");
        btnMostrarAccesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarAccesosActionPerformed(evt);
            }
        });

        cbOpcionVies.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Totes", "Obertes", "Tancades" }));

        cbOpcionAccesos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Oberts", "Tancats" }));

        btnMostraIncidencies.setText("Mostrar Incidències");
        btnMostraIncidencies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostraIncidenciesActionPerformed(evt);
            }
        });

        txtCalcul.setEditable(false);

        cbCalculs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre Accesos", "Calcular Longitud" }));
        cbCalculs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCalculsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbCalculs, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnMostraVies, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMostrarAccesos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMostraIncidencies, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbOpcionVies, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbOpcionAccesos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(txtCalcul, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostraVies)
                    .addComponent(cbOpcionVies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbOpcionAccesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarAccesos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCalculs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCalcul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMostraIncidencies)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostraViesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostraViesActionPerformed
        // TODO add your handling code here:
        String opcio = (String) cbOpcionVies.getSelectedItem();
        boolean error = false;
        String contingut = "";
        switch(opcio){
            case "Totes":
                try{
                  contingut = estacio.getLlistaVies().llistarVies();  
                }
                catch(ExcepcioEstacio e){
                    error = true;
                    JOptionPane.showMessageDialog(this,"Ha ocorregut un error: " + e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
                }
                break;
                case "Obertes":
                try{
                  contingut = estacio.getLlistaVies().llistarVies("Oberta");  
                }
                catch(ExcepcioEstacio e){
                    error = true;
                    JOptionPane.showMessageDialog(this,"Ha ocorregut un error: " + e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
                }
                break;
                case "Tancades":
                try{
                  contingut = estacio.getLlistaVies().llistarVies("Tancada");  
                }
                catch(ExcepcioEstacio e){
                    error = true;
                    JOptionPane.showMessageDialog(this,"Ha ocorregut un error: " + e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
                }
                break;
            
        }
        if(!error)
        JOptionPane.showMessageDialog(this,contingut,"IFORMACIÓ",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnMostraViesActionPerformed

    private void btnMostrarAccesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarAccesosActionPerformed
        // TODO add your handling code here:
          String opcio = (String) cbOpcionAccesos.getSelectedItem();
        boolean error = false;
        String contingut = "";
        switch(opcio){
                case "Oberts":
                try{
                  contingut = estacio.getLlistaAccessos().llistarAccessos(true);  
                }
                catch(ExcepcioEstacio e){
                    error = true;
                    JOptionPane.showMessageDialog(this,"Ha ocorregut un error: " + e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
                }
                break;
                case "Tancats":
                try{
                  contingut = estacio.getLlistaAccessos().llistarAccessos(false);  
                }
                catch(ExcepcioEstacio e){
                    error = true;
                    JOptionPane.showMessageDialog(this,"Ha ocorregut un error: " + e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
                }
                break;
            
        }
        if(!error)
        JOptionPane.showMessageDialog(this,contingut,"IFORMACIÓ",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnMostrarAccesosActionPerformed

    private void cbCalculsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCalculsActionPerformed
        // TODO add your handling code here:
        String opcio = (String) cbCalculs.getSelectedItem();
        
        float contingut = 0;
                switch(opcio){
                case "Nombre Accesos":
                try{
                  contingut = estacio.getLlistaAccessos().calculaAccessosAccessibles();  
                }
                catch(ExcepcioEstacio e){
                    JOptionPane.showMessageDialog(this,"Ha ocorregut un error: " + e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
                }
                break;
                case "Calcular Longitud":
                try{
                  contingut = estacio.getLlistaAccessos().calculaLongitudAccessosNivell();  
                }
                catch(ExcepcioEstacio e){
                    JOptionPane.showMessageDialog(this,"Ha ocorregut un error: " + e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
                }
                break;
            
        }
        txtCalcul.setText(String.valueOf(contingut));
    }//GEN-LAST:event_cbCalculsActionPerformed

    private void btnMostraIncidenciesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostraIncidenciesActionPerformed
        // TODO add your handling code here:
        String contingut = "";
        try{
            contingut = estacio.getLlistaIncidencies().llistarIncidencies();
            JOptionPane.showMessageDialog(this,contingut,"IFORMACIÓ",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(ExcepcioEstacio e){
            JOptionPane.showMessageDialog(this,"Ha ocorregut un error: " + e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnMostraIncidenciesActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaEstacio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaEstacio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaEstacio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaEstacio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EstacioTren estacio = new EstacioTren("Green");
                ConsultaEstacio dialog = new ConsultaEstacio(new javax.swing.JFrame(), true,estacio);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostraIncidencies;
    private javax.swing.JButton btnMostraVies;
    private javax.swing.JButton btnMostrarAccesos;
    private javax.swing.JComboBox<String> cbCalculs;
    private javax.swing.JComboBox<String> cbOpcionAccesos;
    private javax.swing.JComboBox<String> cbOpcionVies;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField txtCalcul;
    // End of variables declaration//GEN-END:variables
}
