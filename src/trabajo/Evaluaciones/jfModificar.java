package trabajo.Evaluaciones;

import clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class jfModificar extends javax.swing.JFrame {

    private Conexion BD = new Conexion();
    private String msj;
    private ResultSet rs;
    private String id_curso;
    private String id_asignatura;
    private String sql;
    private Boolean cmbAsignaturainiciado = false;
    private Boolean cmbCursoiniciado = false;
    private Boolean cmbEvaluacionesiniciado = false;
    private String actualizando = "s";

    public jfModificar() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/book_edit.png"));
        setIconImage(icon);
        initComponents();
        this.setLocationRelativeTo(null); //CENTRAR EN LA PANTALLA

        //Llenar ComboBoxs
        try {

            BD.crearConexion();
            //PRIMER COMBOBOX
            sql = "SELECT c.id_curso,c.nombre FROM asignatura_curso ac, curso c WHERE ac.id_curso = c.id_curso";
            rs = BD.ejecutarSQLSelect(sql);
            while (rs.next()) {
                cmbCurso.addItem(rs.getString("c.id_curso") + "," + rs.getString("c.nombre"));
            }
            actualizando = "n";
            cmbCursoiniciado = true;
            //SEGUNDO COMBOBOX

            BD.cerrarConexion();
            cmbAsignaturainiciado = true;
            //Evaluaciones
            llenarCmbEvaluaciones();
        } catch (Exception e) {
            msj = "Error, hubo un problema.";
            JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        lblTitulo3 = new javax.swing.JLabel();
        lblTitulo2 = new javax.swing.JLabel();
        cmbAsignatura = new javax.swing.JComboBox<>();
        lblAsignatura = new javax.swing.JLabel();
        cmbCurso = new javax.swing.JComboBox<>();
        lblCurso = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        cmbEvaluaciones = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(372, 400));
        setMinimumSize(new java.awt.Dimension(372, 400));
        setResizable(false);

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/backward.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disk.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        lblTitulo3.setText("Descripcion de la prueba(modifique)");

        lblTitulo2.setText("Evaluaciones a la fecha (haga click sobre ella para ver detalles)");

        cmbAsignatura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Asignatura" }));
        cmbAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAsignaturaActionPerformed(evt);
            }
        });

        lblAsignatura.setText("Seleccione Asignatura");

        cmbCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Curso" }));
        cmbCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCursoActionPerformed(evt);
            }
        });

        lblCurso.setText("Seleccione curso:");

        lblTitulo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/book_edit.png"))); // NOI18N
        lblTitulo.setText("Modificar Evaluacion");

        cmbEvaluaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEvaluacionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblTitulo3)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCurso)
                                            .addComponent(lblAsignatura))
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lblTitulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbEvaluaciones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTitulo)))
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCurso)
                    .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAsignatura)
                    .addComponent(cmbAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(lblTitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbEvaluaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTitulo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnGuardar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void llenarCmbEvaluaciones() {
        if (actualizando.equals("n")) {
            if (cmbAsignaturainiciado && cmbCursoiniciado) {
                try {
                    cmbEvaluacionesiniciado = false;
                    cmbEvaluaciones.removeAllItems();
                    BD.crearConexion();
                    String nombre = (String) cmbCurso.getSelectedItem();
                    nombre = nombre.substring(nombre.indexOf(",") + 1, nombre.length());
                    sql = "SELECT ac.id_curso, ac.id_asignatura, anno FROM asignatura_curso ac, curso c, asignatura a WHERE ac.id_curso = c.id_curso AND ac.id_asignatura = a.id_asignatura AND a.nombre = '" + cmbAsignatura.getSelectedItem() + "' AND c.nombre = '" + nombre + "';";
                    rs = BD.ejecutarSQLSelect(sql);
                    while (rs.next()) {
                        id_curso = rs.getString("ac.id_curso");
                        id_asignatura = rs.getString("ac.id_asignatura");
                    }
                    sql = "SELECT id_evaluacion FROM evaluacion WHERE id_curso = '" + id_curso + "' AND id_asignatura = '" + id_asignatura + "'";
                    rs = BD.ejecutarSQLSelect(sql);
                    while (rs.next()) {
                        cmbEvaluaciones.addItem(rs.getString("id_evaluacion"));
                    }
                    BD.cerrarConexion();
                    cmbEvaluacionesiniciado = true;
                } catch (Exception e) {
                    msj = "Error, hubo un problema.";
                    JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
                }
                LlenarDescripcion();
            }
        }
    }

    private void LlenarDescripcion() {
        try {
            if (cmbEvaluacionesiniciado) {
                txtDescripcion.setText("");
                BD.crearConexion();
                sql = "SELECT detalle FROM evaluacion WHERE id_evaluacion = '" + cmbEvaluaciones.getSelectedItem() + "'";
                rs = BD.ejecutarSQLSelect(sql);
                while (rs.next()) {
                    txtDescripcion.setText(rs.getString("detalle"));
                }
                BD.cerrarConexion();
            }
        } catch (Exception e) {
            msj = "Error, hubo un problema.";
            JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        jfEvaluaciones eva = new jfEvaluaciones();
        this.dispose();
        eva.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void cmbCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCursoActionPerformed
        Integer index = cmbCurso.getSelectedIndex();
        if (!(index == 0)) {
            if (actualizando.equals("n")) {
                String codigo = (String) cmbCurso.getSelectedItem();
                codigo = codigo.substring(0, codigo.indexOf(","));
                cmbAsignatura.removeAllItems();
                cmbAsignatura.addItem("Seleccione asignatura");
                BD.crearConexion();
                try {

                    actualizando = "s";
                    sql = "SELECT a.id_asignatura,a.nombre FROM asignatura_curso ac, asignatura a WHERE ac.id_asignatura = a.id_asignatura and ac.id_curso = '" + codigo + "'";
                    rs = BD.ejecutarSQLSelect(sql);
                    while (rs.next()) {
                        cmbAsignatura.addItem(rs.getString("a.nombre"));
                    }
                } catch (Exception e) {
                }
                BD.cerrarConexion();
            }
            actualizando = "n";
            llenarCmbEvaluaciones();
        } else {
            cmbAsignatura.removeAllItems();
            cmbAsignatura.addItem("Seleccione asignatura");
        }
    }//GEN-LAST:event_cmbCursoActionPerformed

    private void cmbAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAsignaturaActionPerformed
        llenarCmbEvaluaciones();
    }//GEN-LAST:event_cmbAsignaturaActionPerformed

    private void cmbEvaluacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEvaluacionesActionPerformed

        LlenarDescripcion();
    }//GEN-LAST:event_cmbEvaluacionesActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            BD.crearConexion();
            sql = "UPDATE evaluacion SET "
                    + "detalle = '" + txtDescripcion.getText() + "'"
                    + " WHERE id_evaluacion = '" + cmbEvaluaciones.getSelectedItem() + "';";
            BD.ejecutarSQL(sql);
            BD.cerrarConexion();
            msj = "Se guardo su modificacion correctamente";
            JOptionPane.showMessageDialog(null, msj, "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            msj = "Error, hubo un problema.";
            JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(jfModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfModificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbAsignatura;
    private javax.swing.JComboBox<String> cmbCurso;
    private javax.swing.JComboBox<String> cmbEvaluaciones;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAsignatura;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTitulo3;
    private javax.swing.JTextArea txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
