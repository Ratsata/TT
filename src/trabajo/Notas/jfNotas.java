package trabajo.Notas;

import clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import trabajo.jfMenu;

public class jfNotas extends javax.swing.JFrame {

    private Conexion BD = new Conexion();
    private String msj;
    private ResultSet rs;
    private String actualizando = "s";

    public jfNotas() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/gorro.png"));
        setIconImage(icon);
        initComponents();
        this.setLocationRelativeTo(null); //CENTRAR EN LA PANTALLA
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbEvaluacion = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        cmbAlumnos = new javax.swing.JComboBox<>();
        cmbNota = new javax.swing.JComboBox<>();
        jCurso = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        cmbEvaluacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione evaluacion" }));
        cmbEvaluacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEvaluacionActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione codigo evaluacion");

        jLabel4.setText("Seleccione alumno");

        jLabel5.setText("Nota:");

        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disk.png"))); // NOI18N
        btnIngresar.setText("Modificar/Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        jLabel6.setText("*Para eliminar todas las notas de una evaluación");

        jLabel7.setText("vaya a eliminar la evaluación.");

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/backward.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/book_add.png"))); // NOI18N
        lblTitulo.setText("Notas");

        cmbAlumnos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Alumno" }));
        cmbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAlumnosActionPerformed(evt);
            }
        });

        cmbNota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "n/a", "7,0", "6,9", "6,8", "6,7", "6,6", "6,5", "6,4", "6,3", "6,2", "6,1", "6,0", "5,9", "5,8", "5,7", "5,6", "5,5", "5,4", "5,3", "5,2", "5,1", "5,0", "4,9", "4,8", "4,7", "4,6", "4,5", "4,4", "4,3", "4,2", "4,1", "4,0", "3,9", "3,8", "3,7", "3,6", "3,6", "3,5", "3,4", "3,3", "3,2", "3,1", "3,0", "2,9", "2,8", "2,7", "2,6", "2,5", "2,4", "2,3", "2,2", "2,1", "2,0", "1,9", "1,8", "1,7", "1,6", "1,5", "1,4", "1,3", "1,2", "1,1", "1,0", "0,9", "0,8", "0,7", "0,6", "0,5", "0,4", "0,3", "0,2", "0,1", "0,0" }));

        jCurso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jCursoKeyTyped(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Introduzca codigo de curso:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbAlumnos, 0, 203, Short.MAX_VALUE)
                                .addGap(145, 145, 145))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnVolver)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscar)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbEvaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4))
                        .addGap(15, 15, 15))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbEvaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cmbNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresar))
                .addGap(1, 1, 1)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addComponent(btnVolver))
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        jfMenu menu = new jfMenu(true);
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void cmbEvaluacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEvaluacionActionPerformed
        if (actualizando.equals("n")) {
            Integer index = cmbEvaluacion.getSelectedIndex();
            cmbNota.setSelectedIndex(0);
            if (!(index == 0)) {
                try {
                    actualizando = "s";
                    cmbAlumnos.removeAllItems();
                    cmbAlumnos.addItem("Seleccione Alumno");
                    BD.crearConexion();
                    String codigo = (String) cmbEvaluacion.getSelectedItem();
                    String curso = codigo.substring(0, 3);
                    String año = codigo.substring(7, 11);
                    //String sql = "SELECT rut_alumno FROM alumno_curso where id_curso = '" + curso + "' and anno = " + año;
                    String sql = "SELECT ac.rut_alumno, a.nombres, a.ape_paterno FROM alumno_curso ac,alumno a where ac.id_curso = '" + curso + "' and ac.anno = " + año + " and ac.rut_alumno = a.rut_alumno";
                    //String sql = "SELECT rut_alumno FROM alumno_curso ";
                    rs = BD.ejecutarSQLSelect(sql);
                    while (rs.next()) {
                        cmbAlumnos.addItem(rs.getString("ac.rut_alumno") + " " + rs.getString("a.nombres") + " " + rs.getString("a.ape_paterno"));
                    }
                    BD.cerrarConexion();
                } catch (Exception e) {
                    msj = "Error, hubo un problema.";
                    JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                actualizando = "s";
                cmbAlumnos.removeAllItems();
                cmbAlumnos.addItem("Seleccione Alumno");
            }
            actualizando = "n";
        }
    }//GEN-LAST:event_cmbEvaluacionActionPerformed

    private void cmbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAlumnosActionPerformed
        if (actualizando.equals("n")) {
            try {
                cmbNota.setSelectedIndex(0);
                BD.crearConexion();
                String codigo = (String) cmbAlumnos.getSelectedItem();
                String rutA = codigo.substring(0, codigo.indexOf(" "));
                codigo = (String) cmbEvaluacion.getSelectedItem();
                String sql = "SELECT nota FROM notas where rut_alumno = '" + rutA + "' and id_evaluacion = '" + codigo + "'";
                rs = BD.ejecutarSQLSelect(sql);
                while (rs.next()) {
                    cmbNota.setSelectedItem(rs.getString("nota"));
                }
                BD.cerrarConexion();
            } catch (Exception e) {
                msj = "Error, hubo un problema.";
                JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_cmbAlumnosActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String nota = (String) cmbNota.getSelectedItem();
        if (!(nota.equals("n/a"))) {
            try {
                BD.crearConexion();
                String codigo = (String) cmbAlumnos.getSelectedItem();
                String rutA = codigo.substring(0, codigo.indexOf(" "));
                codigo = (String) cmbEvaluacion.getSelectedItem();
                String sql = "SELECT nota FROM notas where rut_alumno = '" + rutA + "' and id_evaluacion = '" + codigo + "'";
                rs = BD.ejecutarSQLSelect(sql);
                if (rs.next()) {
                    sql = "UPDATE notas set nota = '" + nota + "' where rut_alumno = '" + rutA + "' and id_evaluacion = '" + codigo + "'";
                    BD.ejecutarSQL(sql);
                    msj = "Se guardo su modificación correctamente";
                    JOptionPane.showMessageDialog(null, msj, "Exito", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    String coma = "','";
                    sql = "INSERT INTO notas VALUES('" + codigo + coma + rutA + coma + nota + "')";
                    BD.ejecutarSQL(sql);
                    msj = "Se ingresó su nota correctamente";
                    JOptionPane.showMessageDialog(null, msj, "Exito", JOptionPane.INFORMATION_MESSAGE);
                }
                BD.cerrarConexion();
            } catch (Exception e) {
                msj = "Error, hubo un problema al intentar ingresar o modificar la nota.";
                JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            msj = "No puede asignarle una nota vacia a un alumno.";
            JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void jCursoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCursoKeyTyped
        if (jCurso.getText().length()== 3){evt.consume();}
    }//GEN-LAST:event_jCursoKeyTyped

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String curso = jCurso.getText();
        actualizando ="s";
        cmbEvaluacion.removeAllItems();
        cmbEvaluacion.addItem("Seleccione Evaluacion");
        try {
            BD.crearConexion();
            //PRIMER COMBOBOX
            String sql = "SELECT id_evaluacion FROM evaluacion where id_curso = '"+curso+"'";
            rs = BD.ejecutarSQLSelect(sql);
            while (rs.next()) {
                cmbEvaluacion.addItem(rs.getString("id_evaluacion"));
                actualizando = "s";
            }
            actualizando = "n";
            BD.cerrarConexion();
        } catch (Exception e) {
            msj = "Error, hubo un problema.";
            JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(jfNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfNotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbAlumnos;
    private javax.swing.JComboBox<String> cmbEvaluacion;
    private javax.swing.JComboBox<String> cmbNota;
    private javax.swing.JTextField jCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
