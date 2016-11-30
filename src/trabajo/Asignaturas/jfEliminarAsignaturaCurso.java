package trabajo.Asignaturas;

import clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class jfEliminarAsignaturaCurso extends javax.swing.JFrame {

    private Conexion BD = new Conexion();
    private String msj;
    private ResultSet rs;
    private String id_curso;
    private String id_asignatura;
    private Integer año;
    String actualizando = "s";

    public jfEliminarAsignaturaCurso() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/book_edit.png"));
        setIconImage(icon);
        initComponents();
        this.setLocationRelativeTo(null); //CENTRAR EN LA PANTALLA
        
        Calendar calendario = new GregorianCalendar();
        año = (calendario.get(Calendar.YEAR));
        
        //Llenar ComboBoxs
        try {
            actualizando = "s";
            BD.crearConexion();
            //PRIMER COMBOBOX
            String sql = "SELECT distinct c.id_curso,c.nombre FROM asignatura_curso ac, curso c,asignatura a WHERE ac.id_curso = c.id_curso AND ac.anno = '"+ año +"'";
            rs = BD.ejecutarSQLSelect(sql);
            while (rs.next()) {
                cmbCurso.addItem(rs.getString("c.id_curso") + " " + rs.getString("c.nombre"));
            }
            BD.cerrarConexion();
        } catch (Exception e) {
            msj = "Error, hubo un problema.";
            JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
        }
        actualizando = "n";        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btn_volver = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        cmbCurso = new javax.swing.JComboBox<>();
        cmbAsignatura = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/book_edit.png"))); // NOI18N
        lblTitulo.setText("Eliminar asignatura de un curso");

        btn_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/backward.png"))); // NOI18N
        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        cmbCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Curso" }));
        cmbCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCursoActionPerformed(evt);
            }
        });

        cmbAsignatura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Asignatura" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_volver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_eliminar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTitulo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(cmbAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 74, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_volver)
                    .addComponent(btn_eliminar))
                .addContainerGap(40, Short.MAX_VALUE))
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

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        jfAsignaturas asig = new jfAsignaturas();
        this.dispose();
        asig.setVisible(true);
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        BD.crearConexion();
        String id_curso = (String) cmbCurso.getSelectedItem();
        id_curso = id_curso.substring(0, id_curso.indexOf(" "));
        String id_asignatura = (String) cmbAsignatura.getSelectedItem();
        id_asignatura = id_asignatura.substring(0, id_asignatura.indexOf(" "));
        Integer indexC = cmbCurso.getSelectedIndex();
        Integer indexA = cmbAsignatura.getSelectedIndex();

        //Eliminacion
        if (!(indexC == 0) && !(indexA == 0)) {
            int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar la asignatura de este curso?, Si la elimina las notas asociadas a esta asignatura no saldran en el informe de notas", "Advertencia", JOptionPane.OK_CANCEL_OPTION);
            if (resp == 0) {
                //Esta seguro que desea eliminar? SI-NO VENTANITA ANTES DEL TRY
                try {
                    String sql = "DELETE FROM asignatura_curso where id_asignatura = '" + id_asignatura + "' and id_curso = '" + id_curso + "' AND anno = '"+ año +"'";
                    BD.ejecutarSQL(sql);
                    msj = "Datos eliminados con exito";
                    JOptionPane.showMessageDialog(null, msj, "Exito", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    msj = "Error, hubo un problema.";
                    JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        //recargar combobox asignatura
        if (actualizando.equals("n")) {
            String curso = (String) cmbCurso.getSelectedItem();
            curso = curso.substring(0, curso.indexOf(" "));
            Integer index = cmbCurso.getSelectedIndex();
            cmbAsignatura.setSelectedIndex(0);
            if (!(index == 0 )) {
                try {
                    actualizando = "s";
                    cmbAsignatura.removeAllItems();
                    cmbAsignatura.addItem("Seleccione Asignatura");
                    BD.crearConexion();
                    //PRIMER COMBOBOX
                    String sql = "SELECT DISTINCT a.nombre, a.id_asignatura FROM asignatura_curso ac, asignatura a WHERE ac.id_asignatura = a.id_asignatura and ac.id_curso = '" + curso + "' AND ac.anno = '"+ año +"'";
                    rs = BD.ejecutarSQLSelect(sql);
                    while (rs.next()) {
                        cmbAsignatura.addItem(rs.getString("a.id_asignatura") + " " + rs.getString("a.nombre"));
                    }
                    BD.cerrarConexion();
                } catch (Exception e) {
                    msj = "Error, hubo un problema.";
                    JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                actualizando = "s";
                cmbAsignatura.removeAllItems();
                cmbAsignatura.addItem("Seleccione Asignatura");
            }
            actualizando = "n";
        }
        //recargar combobox curso
        try {
            actualizando = "s";
            cmbCurso.removeAllItems();
            cmbCurso.addItem("Seleccione Curso");
            BD.crearConexion();
            //PRIMER COMBOBOX
            String sql = "SELECT distinct c.id_curso,c.nombre FROM asignatura_curso ac, curso c,asignatura a WHERE ac.id_curso = c.id_curso AND ac.anno = '"+ año +"'";
            rs = BD.ejecutarSQLSelect(sql);
            while (rs.next()) {
                cmbCurso.addItem(rs.getString("c.id_curso") + " " + rs.getString("c.nombre"));
            }
            BD.cerrarConexion();
        } catch (Exception e) {
            msj = "Error, hubo un problema.";
            JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
        }
        actualizando = "n";
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void cmbCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCursoActionPerformed
        if (actualizando.equals("n")) {
            String curso = (String) cmbCurso.getSelectedItem();
            curso = curso.substring(0, curso.indexOf(" "));
            Integer index = cmbCurso.getSelectedIndex();
            cmbAsignatura.setSelectedIndex(0);
            if (!(index == 0)) {
                try {
                    actualizando = "s";
                    cmbAsignatura.removeAllItems();
                    cmbAsignatura.addItem("Seleccione Asignatura");
                    BD.crearConexion();
                    //PRIMER COMBOBOX
                    String sql = "SELECT DISTINCT a.nombre, a.id_asignatura FROM asignatura_curso ac, asignatura a WHERE ac.id_asignatura = a.id_asignatura and ac.id_curso = '" + curso + "' AND ac.anno ='"+ año +"'";
                    rs = BD.ejecutarSQLSelect(sql);
                    while (rs.next()) {
                        cmbAsignatura.addItem(rs.getString("a.id_asignatura") + " " + rs.getString("a.nombre"));
                    }
                    BD.cerrarConexion();
                } catch (Exception e) {
                    msj = "Error, hubo un problema.";
                    JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                actualizando = "s";
                cmbAsignatura.removeAllItems();
                cmbAsignatura.addItem("Seleccione Asignatura");
            }
            actualizando = "n";
        }
    }//GEN-LAST:event_cmbCursoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfEliminarAsignaturaCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JComboBox<String> cmbAsignatura;
    private javax.swing.JComboBox<String> cmbCurso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
