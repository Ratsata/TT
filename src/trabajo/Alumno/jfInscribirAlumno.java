package trabajo.Alumno;

import java.awt.Image;
import clases.Conexion;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class jfInscribirAlumno extends javax.swing.JFrame {
    private Conexion BD = new Conexion();
    private String msj;
    private ResultSet rs;
    private Integer añoActual;
    
    public jfInscribirAlumno() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/group_add.png"));
        setIconImage(icon);
        initComponents();
        this.setLocationRelativeTo(null); //CENTRAR EN LA PANTALLA
        
        //Llenar ComboBoxs
        try{
            BD.crearConexion();
            
            //PRIMER COMBOBOX
            String sql = "SELECT nombre FROM curso";
            rs = BD.ejecutarSQLSelect(sql);
            while(rs.next()){
                cmbCurso.addItem(rs.getString("nombre"));
            }
            
            //SEGUNDO COMBOBOX
            Calendar calendario = new GregorianCalendar();
            añoActual = (calendario.get(Calendar.YEAR));
            sql = "Select a.rut_alumno, a.nombres, a.ape_paterno, a.ape_materno FROM alumno a, matricula m, alumno_curso ac WHERE NOT a.rut_alumno = ac.rut_alumno AND (a.rut_alumno = m.rut_alumno AND m.anno = '"+ añoActual +"')";
            rs = BD.ejecutarSQLSelect(sql);
            while(rs.next()){
                cmbAlu.addItem(rs.getString("a.rut_alumno")+" "+rs.getString("a.nombres")+" "+rs.getString("a.ape_paterno")+" "+rs.getString("a.ape_materno"));
            }
            BD.cerrarConexion();
        }catch (Exception e){
            msj = "Error, hubo un problema.";
            JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);    
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblAlu = new javax.swing.JLabel();
        btnInscribir = new javax.swing.JButton();
        cmbAlu = new javax.swing.JComboBox<>();
        lblCurso = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        cmbCurso = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(435, 300));
        setMinimumSize(new java.awt.Dimension(435, 300));
        setPreferredSize(new java.awt.Dimension(435, 300));
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(435, 300));

        lblAlu.setText("Seleccione alumno matriculado no inscrito en un curso");

        btnInscribir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disk.png"))); // NOI18N
        btnInscribir.setText("Inscribir");
        btnInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirActionPerformed(evt);
            }
        });

        lblCurso.setText("Seleccione curso a inscribir");

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/backward.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/group_add.png"))); // NOI18N
        lblTitulo.setText("Inscribir Alumno");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCurso)
                            .addComponent(lblAlu)
                            .addComponent(cmbAlu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(161, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInscribir)
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(lblCurso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblAlu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbAlu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnInscribir))
                .addGap(47, 47, 47))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 435, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        if (BD.getConexion() != null) 
            {BD.cerrarConexion();}
        this.dispose();
        new jfAlumno().setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirActionPerformed
        try{
            String coma = "','";
            String rut;
            String idCurso="";
            String activo = "s";
            BD.crearConexion();
            rut = (String)cmbAlu.getSelectedItem();
            rut = rut.substring(0,9);
            String sql = "SELECT id_curso FROM curso WHERE nombre = '"+ (String)cmbCurso.getSelectedItem() +"'";
            rs = BD.ejecutarSQLSelect(sql);
            if (rs.next()){
                idCurso = rs.getString("id_curso");
            }
            sql = "INSERT INTO alumno_curso(rut_alumno,id_curso,anno,activo) VALUES ('"+ rut + coma + idCurso + coma + añoActual + coma + activo + "')";
            if (BD.ejecutarSQL(sql)){
                msj="Se ah inscrito el alumno correctamente.";
                JOptionPane.showMessageDialog(null,msj,"Exito",JOptionPane.INFORMATION_MESSAGE);   
            }else{
                msj="Error, esta relacion ya existe.";
                JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);
            }
            BD.cerrarConexion();
        }catch (Exception e){
            msj = "Error, hubo un problema.";
            JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnInscribirActionPerformed

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
            java.util.logging.Logger.getLogger(jfInscribirAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfInscribirAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfInscribirAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfInscribirAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfInscribirAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInscribir;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbAlu;
    private javax.swing.JComboBox<String> cmbCurso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAlu;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
