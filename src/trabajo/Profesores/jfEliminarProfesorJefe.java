package trabajo.Profesores;

import clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class jfEliminarProfesorJefe extends javax.swing.JFrame {
    
    private Conexion BD = new Conexion();
    private String msj;
    private ResultSet rs;
    String actualizando = "s";
    
    public jfEliminarProfesorJefe() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/book_delete.png"));
        setIconImage(icon);
        initComponents();
        this.setLocationRelativeTo(null); //CENTRAR EN LA PANTALLA
        try {

            BD.crearConexion();
            //PRIMER COMBOBOX
            Calendar calendario = new GregorianCalendar();
            Integer añoLimite = (calendario.get(Calendar.YEAR));
            String año = String.valueOf(añoLimite);
            String sql = "SELECT id_curso,nombre FROM curso where id_curso in(Select distinct id_curso from profesorjefe_curso where anno = '" + año + "')";
            rs = BD.ejecutarSQLSelect(sql);
            while (rs.next()) {
                cmbCursos.addItem(rs.getString("id_curso") + " " + rs.getString("nombre"));
            }
            actualizando = "n";           

            BD.cerrarConexion();
        } catch (Exception e) {
            msj = "Error, hubo un problema.";
            JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        cmbCursos = new javax.swing.JComboBox<>();
        cmbProfesores = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/backward.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnFinalizar.setText("Eliminar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        cmbCursos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Curso" }));
        cmbCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCursosActionPerformed(evt);
            }
        });

        cmbProfesores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Profesor" }));

        jLabel1.setText("Curso:");

        jLabel2.setText("Profesor:");

        jLabel3.setText("Seleccione curso, profesor y año");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 421, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFinalizar)
                            .addGap(104, 104, 104))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmbCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(cmbProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel3))
                            .addGap(130, 130, 130)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(jLabel3)
                    .addGap(27, 27, 27)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFinalizar)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(31, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
        new jfProfesores().setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        Integer indexC = cmbCursos.getSelectedIndex();
        Integer indexP = cmbProfesores.getSelectedIndex();
        String msj;
        Calendar calendario = new GregorianCalendar();
        Integer añoLimite = (calendario.get(Calendar.YEAR));
        String año = String.valueOf(añoLimite);
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar esta relacion?", "Advertencia", JOptionPane.OK_CANCEL_OPTION);
        if (resp == 0) {
            if (!(indexC == 0) || !(indexP == 0)) {
                String rut = (String) cmbProfesores.getSelectedItem();
                rut = rut.substring(0, rut.indexOf(" "));
                String curso = (String) cmbCursos.getSelectedItem();
                curso = curso.substring(0, curso.indexOf(" "));
                try {
                    BD.crearConexion();
                    String sql = "Select * from profesorjefe_curso where rut_profesor = '" + rut + "' and id_curso = '" + curso + "' and anno = '" + año + "'";
                    ResultSet lis = BD.ejecutarSQLSelect(sql);
                    if (lis.next()) {
                        sql = "Delete from profesorjefe_curso where rut_profesor = '" + rut + "' and id_curso = '" + curso + "' and anno = '" + año + "'";
                        if (BD.ejecutarSQL(sql)) {
                            msj = "Se realizó la eliminacion con éxito.";
                            JOptionPane.showMessageDialog(null, msj, "Éxito", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            msj = "Error al intentar eliminar";
                            JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } catch (Exception e) {
                    
                    msj = "Error, hubo un problema.";
                    JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
                }
            }            
        }
        cmbCursos.removeAllItems();
        cmbCursos.addItem("Seleccione Curso");
        try {

            BD.crearConexion();
            //PRIMER COMBOBOX            
            String sql = "SELECT id_curso,nombre FROM curso where id_curso in(Select distinct id_curso from profesorjefe_curso where anno = '" + año + "')";
            rs = BD.ejecutarSQLSelect(sql);
            while (rs.next()) {
                cmbCursos.addItem(rs.getString("id_curso") + " " + rs.getString("nombre"));
            }
            actualizando = "n";           

            BD.cerrarConexion();
        } catch (Exception e) {
            msj = "Error, hubo un problema.";
            JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void cmbCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCursosActionPerformed
        if (actualizando.equals("n")) {
            Integer index = cmbCursos.getSelectedIndex();
            cmbProfesores.setSelectedIndex(0);
            if (!(index == 0)) {
                try {
                    actualizando = "s";
                    cmbProfesores.removeAllItems();
                    cmbProfesores.addItem("Seleccione Profesor");
                    BD.crearConexion();
                    Calendar calendario = new GregorianCalendar();
                    Integer añoLimite = (calendario.get(Calendar.YEAR));
                    String año = String.valueOf(añoLimite);
                    String codigo = (String) cmbCursos.getSelectedItem();
                    String curso = codigo.substring(0, 3);
                    //String sql = "SELECT rut_alumno FROM alumno_curso where id_curso = '" + curso + "' and anno = " + año;
                    String sql = "SELECT pjc.rut_profesor, p.nombres, p.ape_paterno FROM profesorjefe_curso pjc , profesor p where pjc.id_curso = '" + curso + "' and pjc.anno = " + año + " and pjc.rut_profesor = p.rut_profesor";
                    //String sql = "SELECT rut_alumno FROM alumno_curso ";
                    rs = BD.ejecutarSQLSelect(sql);
                    while (rs.next()) {
                        cmbProfesores.addItem(rs.getString("pjc.rut_profesor") + " " + rs.getString("p.nombres") + " " + rs.getString("p.ape_paterno"));
                    }
                    BD.cerrarConexion();
                } catch (Exception e) {
                    msj = "Error, hubo un problema.";
                    JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                actualizando = "s";
                cmbProfesores.removeAllItems();
                cmbProfesores.addItem("Seleccione Profesor");
            }
            actualizando = "n";
        }
    }//GEN-LAST:event_cmbCursosActionPerformed

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
            java.util.logging.Logger.getLogger(jfEliminarProfesorJefe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfEliminarProfesorJefe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfEliminarProfesorJefe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfEliminarProfesorJefe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfEliminarProfesorJefe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbCursos;
    private javax.swing.JComboBox<String> cmbProfesores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
