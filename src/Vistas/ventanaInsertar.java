/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controladores.controladorVehiculo;
import javax.swing.JOptionPane;

/**
 *
 * @author Brujo
 */
public class ventanaInsertar extends javax.swing.JInternalFrame {

    /**
     * Creates new form ventanaInsertar
     */
    public ventanaInsertar() {
        initComponents();
        
        btnLimpiar.setEnabled(false);
        
    }
    
    // Probando metodos
    
    public void limpiarFormulario(){
        txtPatente.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtColor.setText("");
        txtAno.setText("");
        txtPrecio.setText("");
        
        txtPatente.requestFocus();
    }
    
    public void focoPatente(){
        txtPatente.requestFocus();
    }
    
    public boolean isLimpio(){
        
        int patente = txtPatente.getText().length();
        int marca   = txtMarca.getText().length();
        int modelo  = txtModelo.getText().length();
        int color   = txtColor.getText().length();
        int ano     = txtAno.getText().length();
        int precio  = txtPrecio.getText().length();
        
        int suma = patente+marca+modelo+color+ano+precio;
        
        if (suma>0) {
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPatente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Agregar Vehiculos");

        jLabel1.setText("Patente: ");

        txtPatente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPatenteKeyReleased(evt);
            }
        });

        jLabel2.setText("Marca: ");

        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMarcaKeyReleased(evt);
            }
        });

        jLabel3.setText("Modelo: ");

        txtModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModeloKeyReleased(evt);
            }
        });

        jLabel4.setText("Color: ");

        txtColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtColorKeyReleased(evt);
            }
        });

        jLabel5.setText("Año: ");

        txtAno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAnoKeyReleased(evt);
            }
        });

        jLabel6.setText("Precio: ");

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioKeyReleased(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPatente)
                                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtModelo)
                                .addComponent(txtColor)
                                .addComponent(txtAno)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnLimpiar))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // BOTON Agregar
        
        controladorVehiculo cv = new controladorVehiculo();
        
        String retorno = cv.registro(txtPatente.getText(),
                                     txtMarca.getText(),
                                     txtModelo.getText(),
                                     txtColor.getText(),
                                     txtAno.getText(),
                                     txtPrecio.getText());
        
        JOptionPane.showMessageDialog(rootPane, retorno);
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtPatenteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatenteKeyReleased
        // TODO add your handling code here:
        
        if(isLimpio()){
            btnLimpiar.setEnabled(true);
        }else{
            btnLimpiar.setEnabled(false);
        }
    }//GEN-LAST:event_txtPatenteKeyReleased

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        
        limpiarFormulario();
        txtPatente.requestFocus();
        btnLimpiar.setEnabled(false);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtMarcaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyReleased
        // TODO add your handling code here:
        
        if(isLimpio()){
            btnLimpiar.setEnabled(true);
        }else{
            btnLimpiar.setEnabled(false);
        }
    }//GEN-LAST:event_txtMarcaKeyReleased

    private void txtModeloKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModeloKeyReleased
        // TODO add your handling code here:
        
        if(isLimpio()){
            btnLimpiar.setEnabled(true);
        }else{
            btnLimpiar.setEnabled(false);
        }
    }//GEN-LAST:event_txtModeloKeyReleased

    private void txtColorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColorKeyReleased
        // TODO add your handling code here:
        
        if(isLimpio()){
            btnLimpiar.setEnabled(true);
        }else{
            btnLimpiar.setEnabled(false);
        }
    }//GEN-LAST:event_txtColorKeyReleased

    private void txtAnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnoKeyReleased
        // TODO add your handling code here:
        
        if(isLimpio()){
            btnLimpiar.setEnabled(true);
        }else{
            btnLimpiar.setEnabled(false);
        }
    }//GEN-LAST:event_txtAnoKeyReleased

    private void txtPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyReleased
        // TODO add your handling code here:
        
        if(isLimpio()){
            btnLimpiar.setEnabled(true);
        }else{
            btnLimpiar.setEnabled(false);
        }
    }//GEN-LAST:event_txtPrecioKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPatente;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
