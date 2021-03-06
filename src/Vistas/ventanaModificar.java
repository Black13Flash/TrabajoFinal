/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controladores.controladorVehiculo;
import Modelos.Vehiculo;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 *
 * @author Brujo
 */
public class ventanaModificar extends javax.swing.JInternalFrame {

    /**
     * Creates new form ventanaModificar
     */
    public ventanaModificar() {
        initComponents();
        
        lblPatente.setText("");
        lblPatente.setHorizontalAlignment(SwingConstants.CENTER);
        lblPatente.setVerticalAlignment(SwingConstants.CENTER);
        
        btnEditar.setEnabled(false);
        btnActualizar.setEnabled(false);
        btnCancelar.setEnabled(false);
        
        txtMarca.setEnabled(false);
        txtModelo.setEnabled(false);
        txtColor.setEnabled(false);
        txtAno.setEnabled(false);
        txtPrecio.setEnabled(false);
        
    }
    
    public void limpiarTodo(){
        lblPatente.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtColor.setText("");
        txtAno.setText("");
        txtPrecio.setText("");
    }
    
    public void textosEditables(){
        txtMarca.setEnabled(true);
        txtModelo.setEnabled(true);
        txtColor.setEnabled(true);
        txtAno.setEnabled(true);
        txtPrecio.setEnabled(true);
    }
    
    public void textosNoEditables(){
        txtMarca.setEnabled(false);
        txtModelo.setEnabled(false);
        txtColor.setEnabled(false);
        txtAno.setEnabled(false);
        txtPrecio.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscarPatente = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        myPanelDatos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblPatente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Modificar Vehiculos");

        myPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Ingresar Patente: ");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout myPanelLayout = new javax.swing.GroupLayout(myPanel);
        myPanel.setLayout(myPanelLayout);
        myPanelLayout.setHorizontalGroup(
            myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtBuscarPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        myPanelLayout.setVerticalGroup(
            myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBuscarPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        myPanelDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Patente: ");

        lblPatente.setForeground(new java.awt.Color(255, 0, 0));
        lblPatente.setText("LaPatente");

        jLabel3.setText("Marca: ");

        jLabel4.setText("Modelo: ");

        jLabel5.setText("Color: ");

        jLabel6.setText("Año: ");

        jLabel7.setText("Precio: ");

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout myPanelDatosLayout = new javax.swing.GroupLayout(myPanelDatos);
        myPanelDatos.setLayout(myPanelDatosLayout);
        myPanelDatosLayout.setHorizontalGroup(
            myPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelDatosLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(myPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(myPanelDatosLayout.createSequentialGroup()
                        .addGroup(myPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(myPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMarca)
                            .addComponent(lblPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(myPanelDatosLayout.createSequentialGroup()
                        .addGroup(myPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(myPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtModelo)
                            .addComponent(txtColor)
                            .addComponent(txtAno)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(myPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60))
        );
        myPanelDatosLayout.setVerticalGroup(
            myPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelDatosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(myPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblPatente)
                    .addComponent(btnEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(myPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(myPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(myPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(myPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(myPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(myPanelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(myPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(myPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(myPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // BUSCAR
        
        String buscaPatente = txtBuscarPatente.getText();
        limpiarTodo();
        
        if (buscaPatente.equals("") || buscaPatente == null) {
            JOptionPane.showMessageDialog(rootPane, "Agrega la patente para comenzar la busqueda");
            txtBuscarPatente.requestFocus();
        }else{
            
            Vehiculo v = new Vehiculo();
            v.setPatente(buscaPatente);

            Vehiculo ve=v.buscaUno(v);

            if(ve==null){
                JOptionPane.showMessageDialog(rootPane, "La patente ingresada no se encuentra en nuestra Base de Datos");
                txtBuscarPatente.requestFocus();
                btnEditar.setEnabled(false);
                btnActualizar.setEnabled(false);
                textosNoEditables();
            }else{
                    lblPatente.setText(ve.getPatente().toString());
                    
                    marca = ve.getMarca().toString();
                    txtMarca.setText(marca);
                    
                    modelo =ve.getModelo().toString();
                    txtModelo.setText(modelo);
                    
                    color =ve.getColor().toString();
                    txtColor.setText(color);
                    
                    ano =""+ve.getAno();
                    txtAno.setText(ano);
                    
                    precio = ""+ve.getPrecio();
                    txtPrecio.setText(precio);
                    
                    btnEditar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // EDITAR
        
        btnActualizar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnBuscar.setEnabled(false);
        txtBuscarPatente.setEnabled(false);
        
        textosEditables();
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // CANCELAR
        
        btnActualizar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnBuscar.setEnabled(true);
        btnEditar.setEnabled(false);
        txtBuscarPatente.setEnabled(true);
        
        limpiarTodo();
        textosNoEditables();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // ACTUALIZAR
        
        if (txtMarca.getText().equals(marca) &&
            txtModelo.getText().equals(modelo) &&
            txtColor.getText().equals(color) &&
            txtAno.getText().equals(ano) &&
            txtPrecio.getText().equals(precio)
            ) {
            JOptionPane.showMessageDialog(rootPane, "Primero modifica un campo para actualizar");
        }else{
            controladorVehiculo cv=new controladorVehiculo();
        
            String retorno = cv.modificarRegistro(lblPatente.getText(),
                                                  txtMarca.getText(),
                                                  txtModelo.getText(),
                                                  txtColor.getText(),
                                                  txtAno.getText(),
                                                  txtPrecio.getText());

            JOptionPane.showMessageDialog(rootPane, retorno);
        }
        
    }//GEN-LAST:event_btnActualizarActionPerformed
    
    String marca="";
    String modelo="";
    String color="";
    String ano="";
    String precio="";

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblPatente;
    private javax.swing.JPanel myPanel;
    private javax.swing.JPanel myPanelDatos;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtBuscarPatente;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
