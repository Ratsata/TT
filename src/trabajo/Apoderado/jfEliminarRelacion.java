package trabajo.Apoderado;

import clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import clases.Rut;

public class jfEliminarRelacion extends javax.swing.JFrame {

    private Conexion BD = new Conexion();
    private String msj;
    private ResultSet rs;
    private Rut rut;
    private String rutFormateado;
    private String rutDesformateado;

    public jfEliminarRelacion() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/book_delete.png"));
        setIconImage(icon);
        initComponents();
        this.setLocationRelativeTo(null); //CENTRAR EN LA PANTALLA
        //Llenar ComboBoxs

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblCurso = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        cmbPersonas = new javax.swing.JComboBox<>();
        jRut = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jExiste = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/book_edit.png"))); // NOI18N
        lblTitulo.setText("Eliminar Apoderado de un alumno");

        lblCurso.setText("Ingrese rut alumno:");

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/backward.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        cmbPersonas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Apoderado/Sostenedor/Familiar" }));

        jRut.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jRutFocusLost(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jExiste, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cmbPersonas, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRut, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscar)))
                                .addGap(79, 79, 79)))
                        .addGap(53, 56, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblTitulo)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(lblCurso)))
                    .addContainerGap(84, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jExiste, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEliminar)
                        .addGap(19, 19, 19))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(lblTitulo)
                    .addGap(18, 18, 18)
                    .addComponent(lblCurso)
                    .addContainerGap(211, Short.MAX_VALUE)))
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

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        if (BD.getConexion() != null) {
            BD.cerrarConexion();
        }
        this.dispose();
        new jfApoderado().setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        BD.crearConexion();
        //si la asignatura esta asociada a un curso no se elimina(implementar esto en todos los importantes)
        //String codigo = (String) cmbRelacion.getSelectedItem();
        //String rutP = codigo.substring(0, codigo.indexOf("<"));
        String rutP = (String) cmbPersonas.getSelectedItem();
        rutP = rutP.substring(0, rutP.indexOf(" "));
        String rutA = rutDesformateado;
        Integer index = cmbPersonas.getSelectedIndex();
        //String rutA = codigo.substring(codigo.indexOf(">") + 1, codigo.indexOf("-"));
        //Esta seguro que desea eliminar? SI-NO VENTANITA ANTES DEL TRY
        int resp = JOptionPane.showConfirmDialog(null, "Esta seguro que desea eliminar la relacion", "Advertencia", JOptionPane.OK_CANCEL_OPTION);
        if ((resp == 0) && !(index == 0)) {
            try {
                String sql = "DELETE FROM relacion_persona_alumno where rut_persona = '" + rutP + "' and rut_alumno = '" + rutA + "'";
                BD.ejecutarSQL(sql);
                msj = "Datos eliminados con exito";
                JOptionPane.showMessageDialog(null, msj, "Exito", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                msj = "Error, hubo un problema.";
                JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            msj = "No hay relacion a eliminar";
            JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
        }
        //Recargar combobox
        cmbPersonas.removeAllItems();
        cmbPersonas.addItem("Seleccione Apoderado/Sostenedor/Familiar");
        try {
            rutFormateado = rut.formatear(jRut.getText());
            if (rut.validar(rutFormateado) == false) {
                JOptionPane.showMessageDialog(null, "Rut incorrecto", "Ventana Error Rut", JOptionPane.ERROR_MESSAGE);

            } else {
                rutDesformateado = rut.desformatear(rutFormateado);
                jRut.setText(rutFormateado);
                try {
                    BD.crearConexion();
                    String sql1 = "SELECT rpa.rut_persona , p.nombres , p.ape_paterno FROM relacion_persona_alumno rpa , persona p WHERE rpa.rut_alumno='" + rutDesformateado + "' and rpa.rut_persona = p.rut_persona ";
                    ResultSet lis = BD.ejecutarSQLSelect(sql1);
                    if (lis.next()) {
                        cmbPersonas.addItem(lis.getString("rpa.rut_persona") + " " + lis.getString("p.nombres") + " " + lis.getString("p.ape_paterno"));
                        while (lis.next()) {
                            cmbPersonas.addItem(lis.getString("rpa.rut_persona") + " " + lis.getString("p.nombres") + " " + lis.getString("p.ape_paterno"));

                        }
                    } else {
                        jExiste.setText("alumno no posee ninguna relacion");
                    }
                    BD.cerrarConexion();
                } catch (Exception e) {
                    msj = "Error, no se pudo realizar la operación";
                    JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Mal formato de rut", "Ventana Error Rut", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jRutFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jRutFocusLost
        cmbPersonas.removeAllItems();
        cmbPersonas.addItem("Seleccione Apoderado/Sostenedor/Familiar");
        jExiste.setText("");
        try {
            rutFormateado = rut.formatear(jRut.getText());
            if (rut.validar(rutFormateado) == false) {
                JOptionPane.showMessageDialog(null, "Rut incorrecto", "Ventana Error Rut", JOptionPane.ERROR_MESSAGE);
                jRut.setText("");
            } else {
                rutDesformateado = rut.desformatear(rutFormateado);
                jRut.setText(rutFormateado);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Mal formato de rut", "Ventana Error Rut", JOptionPane.ERROR_MESSAGE);
            jRut.setText("");
        }
    }//GEN-LAST:event_jRutFocusLost

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        cmbPersonas.removeAllItems();
        cmbPersonas.addItem("Seleccione Apoderado/Sostenedor/Familiar");
        jExiste.setText("");
        try {
            rutFormateado = rut.formatear(jRut.getText());
            if (rut.validar(rutFormateado) == false) {
                JOptionPane.showMessageDialog(null, "Rut incorrecto", "Ventana Error Rut", JOptionPane.ERROR_MESSAGE);

            } else {
                rutDesformateado = rut.desformatear(rutFormateado);
                jRut.setText(rutFormateado);
                try {
                    BD.crearConexion();
                    String sql1 = "SELECT rpa.rut_persona , p.nombres , p.ape_paterno FROM relacion_persona_alumno rpa , persona p WHERE rpa.rut_alumno='" + rutDesformateado + "' and rpa.rut_persona = p.rut_persona ";
                    ResultSet lis = BD.ejecutarSQLSelect(sql1);
                    if (lis.next()) {
                        cmbPersonas.addItem(lis.getString("rpa.rut_persona") + " " + lis.getString("p.nombres") + " " + lis.getString("p.ape_paterno"));
                        while (lis.next()) {
                            cmbPersonas.addItem(lis.getString("rpa.rut_persona") + " " + lis.getString("p.nombres") + " " + lis.getString("p.ape_paterno"));

                        }
                    } else {
                        jExiste.setText("alumno no posee ninguna relacion");
                    }
                    BD.cerrarConexion();
                } catch (Exception e) {
                    msj = "Error, no se pudo realizar la operación";
                    JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Mal formato de rut", "Ventana Error Rut", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(jfEliminarRelacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfEliminarRelacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfEliminarRelacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfEliminarRelacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfEliminarRelacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbPersonas;
    private javax.swing.JLabel jExiste;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jRut;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
