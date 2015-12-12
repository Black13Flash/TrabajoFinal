/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Modelos.Vehiculo;
import javax.swing.JOptionPane;

/**
 *
 * @author G
 */
public class ventanaConfirmarBorrar extends javax.swing.JFrame {

    /**
     * Creates new form ventanaConfirmarBorrar
     */
    public ventanaConfirmarBorrar() {
        initComponents();
        setLocationRelativeTo(null);
        String patente = ventanaBorrar.txtPatente.getText();
        Vehiculo v=new Vehiculo(patente);
        Vehiculo ve=v.buscaUno(v);
        lblCPatente.setText(ve.getPatente());
        lblCMarca.setText(ve.getMarca());
        lblCModelo.setText(ve.getModelo());
        lblCColor.setText(ve.getColor());
        lblCAno.setText(String.valueOf(ve.getAno()));
        lblCPrecio.setText(String.valueOf(ve.getPrecio()));
       }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPatente = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblAno = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblCPatente = new javax.swing.JLabel();
        lblCMarca = new javax.swing.JLabel();
        lblCModelo = new javax.swing.JLabel();
        lblCColor = new javax.swing.JLabel();
        lblCAno = new javax.swing.JLabel();
        lblCPrecio = new javax.swing.JLabel();
        btnSi = new javax.swing.JButton();
        btnNo = new javax.swing.JButton();
        lblDeseo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblPatente.setText("Patente:");

        lblMarca.setText("Marca:");

        lblModelo.setText("Modelo:");

        lblColor.setText("Color:");

        lblAno.setText("Año:");

        lblPrecio.setText("Precio:");

        lblCPatente.setText("           ");

        lblCMarca.setText("           ");

        lblCModelo.setText("           ");

        lblCColor.setText("           ");

        lblCAno.setText("           ");

        lblCPrecio.setText("           ");

        btnSi.setText("Si");
        btnSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiActionPerformed(evt);
            }
        });

        btnNo.setText("No");
        btnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoActionPerformed(evt);
            }
        });

        lblDeseo.setText("Desea eliminar?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPatente)
                    .addComponent(lblMarca)
                    .addComponent(lblModelo)
                    .addComponent(lblColor)
                    .addComponent(lblAno)
                    .addComponent(lblPrecio))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCPrecio)
                    .addComponent(lblCAno)
                    .addComponent(lblCColor)
                    .addComponent(lblCModelo)
                    .addComponent(lblCMarca)
                    .addComponent(lblCPatente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSi)
                        .addGap(62, 62, 62)
                        .addComponent(btnNo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblDeseo)
                        .addGap(39, 39, 39)))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatente)
                    .addComponent(lblCPatente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca)
                    .addComponent(lblCMarca))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelo)
                    .addComponent(lblCModelo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColor)
                    .addComponent(lblCColor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAno)
                    .addComponent(lblCAno))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio)
                    .addComponent(lblCPrecio))
                .addGap(18, 18, 18)
                .addComponent(lblDeseo)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSi)
                    .addComponent(btnNo))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnNoActionPerformed

    private void btnSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiActionPerformed
       String patente = ventanaBorrar.txtPatente.getText();
       Vehiculo v=new Vehiculo(patente);
       v.eliminarVehiculo(v);
       JOptionPane.showMessageDialog(this, "Eliminado");
       this.dispose();
    }//GEN-LAST:event_btnSiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNo;
    private javax.swing.JButton btnSi;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblCAno;
    private javax.swing.JLabel lblCColor;
    private javax.swing.JLabel lblCMarca;
    private javax.swing.JLabel lblCModelo;
    private javax.swing.JLabel lblCPatente;
    private javax.swing.JLabel lblCPrecio;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblDeseo;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPatente;
    private javax.swing.JLabel lblPrecio;
    // End of variables declaration//GEN-END:variables
}
