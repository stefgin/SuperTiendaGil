
package vista;

import javax.swing.JOptionPane;


public class MenuGeneral extends javax.swing.JFrame {

   
    public MenuGeneral() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panFondo = new javax.swing.JPanel();
        lblSistemaMenuGeneral = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuAbrir = new javax.swing.JMenu();
        itmMnuUsuario = new javax.swing.JMenuItem();
        itmMnuVentas = new javax.swing.JMenuItem();
        itmMnuAlmacen = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itmMnuSalir = new javax.swing.JMenuItem();
        mnuVersion = new javax.swing.JMenu();
        itmMnuAcerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panFondo.setBackground(new java.awt.Color(255, 255, 255));

        lblSistemaMenuGeneral.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblSistemaMenuGeneral.setForeground(new java.awt.Color(204, 0, 0));
        lblSistemaMenuGeneral.setText("Sistema Menú General");

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.PNG"))); // NOI18N

        javax.swing.GroupLayout panFondoLayout = new javax.swing.GroupLayout(panFondo);
        panFondo.setLayout(panFondoLayout);
        panFondoLayout.setHorizontalGroup(
            panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFondoLayout.createSequentialGroup()
                .addGroup(panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panFondoLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(lblLogo))
                    .addGroup(panFondoLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(lblSistemaMenuGeneral)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        panFondoLayout.setVerticalGroup(
            panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFondoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblSistemaMenuGeneral)
                .addGap(45, 45, 45)
                .addComponent(lblLogo)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        mnuAbrir.setText("Abrir");

        itmMnuUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        itmMnuUsuario.setText("Usuarios");
        itmMnuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMnuUsuarioActionPerformed(evt);
            }
        });
        mnuAbrir.add(itmMnuUsuario);

        itmMnuVentas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        itmMnuVentas.setText("Ventas");
        itmMnuVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMnuVentasActionPerformed(evt);
            }
        });
        mnuAbrir.add(itmMnuVentas);

        itmMnuAlmacen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        itmMnuAlmacen.setText("Almacen");
        itmMnuAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMnuAlmacenActionPerformed(evt);
            }
        });
        mnuAbrir.add(itmMnuAlmacen);
        mnuAbrir.add(jSeparator1);

        itmMnuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        itmMnuSalir.setText("Salir");
        itmMnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMnuSalirActionPerformed(evt);
            }
        });
        mnuAbrir.add(itmMnuSalir);

        jMenuBar1.add(mnuAbrir);

        mnuVersion.setText("Vesion");

        itmMnuAcerca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        itmMnuAcerca.setText("Acerca de..");
        itmMnuAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMnuAcercaActionPerformed(evt);
            }
        });
        mnuVersion.add(itmMnuAcerca);

        jMenuBar1.add(mnuVersion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmMnuAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMnuAlmacenActionPerformed
        Almacen ventanaAlmacen = new Almacen();
        ventanaAlmacen.setVisible(true);//visualizar
        hide();//ocultar
    }//GEN-LAST:event_itmMnuAlmacenActionPerformed

    private void itmMnuAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMnuAcercaActionPerformed
       JOptionPane.showMessageDialog(null, "Version 1.0 Software UACM 171121\nAutor Estefanie Gil");//mensage de acerca
    }//GEN-LAST:event_itmMnuAcercaActionPerformed

    private void itmMnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMnuSalirActionPerformed
         System.exit(0);//salir
    }//GEN-LAST:event_itmMnuSalirActionPerformed

    private void itmMnuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMnuUsuarioActionPerformed
        Usuario ventanaUsuario = new Usuario();
        ventanaUsuario.setVisible(true);//visualizar
        hide();//ocultar
    }//GEN-LAST:event_itmMnuUsuarioActionPerformed

    private void itmMnuVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMnuVentasActionPerformed
        Venta ventanaVenta = new Venta();
        ventanaVenta.setVisible(true);//visualizar
        hide();//ocultar
    }//GEN-LAST:event_itmMnuVentasActionPerformed

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
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmMnuAcerca;
    private javax.swing.JMenuItem itmMnuAlmacen;
    private javax.swing.JMenuItem itmMnuSalir;
    private javax.swing.JMenuItem itmMnuUsuario;
    private javax.swing.JMenuItem itmMnuVentas;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblSistemaMenuGeneral;
    private javax.swing.JMenu mnuAbrir;
    private javax.swing.JMenu mnuVersion;
    private javax.swing.JPanel panFondo;
    // End of variables declaration//GEN-END:variables
}
