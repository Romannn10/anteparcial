/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package principal.vista;

import principal.vista.cliente.JFormConsultaCliente;

/**
 *
 * @author Alumno
 */
public class JFormMenu extends javax.swing.JFrame {

    /**
     * Creates new form JFormMenu
     */
    public JFormMenu() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMItemConsultaCliente = new javax.swing.JMenuItem();
        jMItemConsultaVendedores = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMItemAltaCliente = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Consultas");

        jMItemConsultaCliente.setText("Clientes");
        jMItemConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemConsultaClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMItemConsultaCliente);

        jMItemConsultaVendedores.setText("Vendedores");
        jMenu1.add(jMItemConsultaVendedores);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Alta");

        jMItemAltaCliente.setText("Cliente");
        jMItemAltaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemAltaClienteActionPerformed(evt);
            }
        });
        jMenu2.add(jMItemAltaCliente);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMItemAltaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemAltaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMItemAltaClienteActionPerformed

    private void jMItemConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemConsultaClienteActionPerformed
       new JFormConsultaCliente().setVisible(true);
    }//GEN-LAST:event_jMItemConsultaClienteActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMItemAltaCliente;
    private javax.swing.JMenuItem jMItemConsultaCliente;
    private javax.swing.JMenuItem jMItemConsultaVendedores;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}