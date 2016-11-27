package trabajo.Profesores;

import java.util.Calendar;
import java.util.GregorianCalendar;
import clases.Conexion;
import java.sql.ResultSet;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class jfEliminarProfesorAsignatura extends javax.swing.JFrame {

    private Conexion BD = new Conexion();
    private String msj;
    private ResultSet rs;
    String actualizando = "s";

    public jfEliminarProfesorAsignatura() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/book_delete.png"));
        setIconImage(icon);
        initComponents();
        this.setLocationRelativeTo(null); //CENTRAR EN LA PANTALLA
        try {

            BD.crearConexion();
            //PRIMER COMBOBOX
            String sql = "SELECT distinct ap.id_asignatura,a.nombre FROM asignatura_profesor ap, asignatura a WHERE ap.id_asignatura = a.id_asignatura";
            rs = BD.ejecutarSQLSelect(sql);
            while (rs.next()) {
                cmbAsignatura.addItem(rs.getString("ap.id_asignatura") + " " + rs.getString("a.nombre"));
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

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbAsignatura = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cmbProfesores = new javax.swing.JComboBox<>();
        btnVolver = new javax.swing.JButton();
        jOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Seleccione Asignatura y Profesor");

        jLabel2.setText("Asignatura:");

        cmbAsignatura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Asignatura" }));
        cmbAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAsignaturaActionPerformed(evt);
            }
        });

        jLabel1.setText("Profesor:");

        cmbProfesores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Profesor" }));

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/backward.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jOk.setText("Eliminar");
        jOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jOk))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(cmbProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel4)))
                        .addGap(69, 69, 69)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jOk))
                .addContainerGap(55, Short.MAX_VALUE))
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
        this.dispose();
        new jfProfesores().setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void jOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOkActionPerformed
        Integer indexA = cmbAsignatura.getSelectedIndex();
        Integer indexP = cmbProfesores.getSelectedIndex();
        String msj;
        Calendar calendario = new GregorianCalendar();
        Integer añoLimite = (calendario.get(Calendar.YEAR));
        String año = String.valueOf(añoLimite);
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar esta relacion?", "Advertencia", JOptionPane.OK_CANCEL_OPTION);
        if (resp == 0) {
            if (!(indexA == 0) || !(indexP == 0)) {
                String rut = (String) cmbProfesores.getSelectedItem();
                rut = rut.substring(0, rut.indexOf(" "));
                String asignatura = (String) cmbAsignatura.getSelectedItem();
                asignatura = asignatura.substring(0, asignatura.indexOf(" "));
                try {
                    BD.crearConexion();
                    String sql = "Select * from asignatura_profesor where rut_profesor = '" + rut + "' and id_asignatura = '" + asignatura + "' and anno = '" + año + "'";
                    ResultSet lis = BD.ejecutarSQLSelect(sql);
                    if (lis.next()) {
                        sql = "Delete from asignatura_profesor where rut_profesor = '" + rut + "' and id_asignatura = '" + asignatura + "' and anno = '" + año + "'";
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
        if (actualizando.equals("n")) {
            Integer index = cmbAsignatura.getSelectedIndex();
            cmbProfesores.setSelectedIndex(0);
            if (!(index == 0)) {
                try {
                    actualizando = "s";
                    cmbProfesores.removeAllItems();
                    cmbProfesores.addItem("Seleccione Profesor");
                    BD.crearConexion();
                    calendario = new GregorianCalendar();
                    añoLimite = (calendario.get(Calendar.YEAR));
                    año = String.valueOf(añoLimite);
                    String codigo = (String) cmbAsignatura.getSelectedItem();
                    String asignatura = codigo.substring(0, 4);
                    //String sql = "SELECT rut_alumno FROM alumno_curso where id_curso = '" + curso + "' and anno = " + año;
                    String sql = "SELECT ap.rut_profesor, p.nombres, p.ape_paterno FROM asignatura_profesor ap , profesor p where ap.id_asignatura = '" + asignatura + "' and ap.anno = " + año + " and ap.rut_profesor = p.rut_profesor";
                    //String sql = "SELECT rut_alumno FROM alumno_curso ";
                    rs = BD.ejecutarSQLSelect(sql);
                    while (rs.next()) {
                        cmbProfesores.addItem(rs.getString("ap.rut_profesor") + " " + rs.getString("p.nombres") + " " + rs.getString("p.ape_paterno"));
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
    }//GEN-LAST:event_jOkActionPerformed

    private void cmbAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAsignaturaActionPerformed
        if (actualizando.equals("n")) {
            Integer index = cmbAsignatura.getSelectedIndex();
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
                    String codigo = (String) cmbAsignatura.getSelectedItem();
                    String asignatura = codigo.substring(0, 4);
                    //String sql = "SELECT rut_alumno FROM alumno_curso where id_curso = '" + curso + "' and anno = " + año;
                    String sql = "SELECT ap.rut_profesor, p.nombres, p.ape_paterno FROM asignatura_profesor ap , profesor p where ap.id_asignatura = '" + asignatura + "' and ap.anno = " + año + " and ap.rut_profesor = p.rut_profesor";
                    //String sql = "SELECT rut_alumno FROM alumno_curso ";
                    rs = BD.ejecutarSQLSelect(sql);
                    while (rs.next()) {
                        cmbProfesores.addItem(rs.getString("ap.rut_profesor") + " " + rs.getString("p.nombres") + " " + rs.getString("p.ape_paterno"));
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
    }//GEN-LAST:event_cmbAsignaturaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfEliminarProfesorAsignatura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbAsignatura;
    private javax.swing.JComboBox<String> cmbProfesores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jOk;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
