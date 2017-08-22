/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import datos.ConexionBD;

/**
 *
 * @author Alejandro RG
 */
public class frmPrincipal extends javax.swing.JFrame {
    ConexionBD con = new ConexionBD("tiendamascotas");
    frmAltasMascotas alta = new frmAltasMascotas();
    frmBajasMascotas baja = new frmBajasMascotas();
    frmModificacionMascotas modifica = new frmModificacionMascotas();
    frmConsultaMascotas consulta = new frmConsultaMascotas();
    frmAcercaDe acerca = new frmAcercaDe();

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        menuAltasMascotas = new javax.swing.JMenuItem();
        menuBajasMascotas = new javax.swing.JMenuItem();
        menuModificaMascotas = new javax.swing.JMenuItem();
        menuConsultasMascotas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tienda de Mascotas v1.0");

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Tienda de Mascotas \"San Rocke\"");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mascota.jpg"))); // NOI18N

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(0, 40, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jMenu2.setText("Inicio");

        menuAltasMascotas.setText("Altas");
        menuAltasMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAltasMascotasActionPerformed(evt);
            }
        });
        jMenu2.add(menuAltasMascotas);

        menuBajasMascotas.setText("Bajas");
        menuBajasMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBajasMascotasActionPerformed(evt);
            }
        });
        jMenu2.add(menuBajasMascotas);

        menuModificaMascotas.setText("Modificaciones");
        menuModificaMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuModificaMascotasActionPerformed(evt);
            }
        });
        jMenu2.add(menuModificaMascotas);

        menuConsultasMascotas.setText("Consultas");
        menuConsultasMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultasMascotasActionPerformed(evt);
            }
        });
        jMenu2.add(menuConsultasMascotas);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Ayuda");

        menuAcercaDe.setText("Acerca De...");
        menuAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAcercaDeActionPerformed(evt);
            }
        });
        jMenu4.add(menuAcercaDe);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuAltasMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAltasMascotasActionPerformed
        // TODO add your handling code here:
        alta.setVisible(true);
    }//GEN-LAST:event_menuAltasMascotasActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        con.cerrar();
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void menuConsultasMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultasMascotasActionPerformed
        // TODO add your handling code here:
        consulta.setVisible(true);
    }//GEN-LAST:event_menuConsultasMascotasActionPerformed

    private void menuModificaMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuModificaMascotasActionPerformed
        // TODO add your handling code here:
        modifica.setVisible(true);
    }//GEN-LAST:event_menuModificaMascotasActionPerformed

    private void menuAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAcercaDeActionPerformed
        // TODO add your handling code here:
        acerca.setVisible(true);
    }//GEN-LAST:event_menuAcercaDeActionPerformed

    private void menuBajasMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBajasMascotasActionPerformed
        // TODO add your handling code here:
        baja.setVisible(true);
    }//GEN-LAST:event_menuBajasMascotasActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menuAcercaDe;
    private javax.swing.JMenuItem menuAltasMascotas;
    private javax.swing.JMenuItem menuBajasMascotas;
    private javax.swing.JMenuItem menuConsultasMascotas;
    private javax.swing.JMenuItem menuModificaMascotas;
    // End of variables declaration//GEN-END:variables
}
