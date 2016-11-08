package trabajo.Evaluaciones;

import clases.Conexion;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class jfIngresar extends javax.swing.JFrame {
    private Conexion BD = new Conexion();
    private String msj;
    private ResultSet rs;
    private String id_evaluacion;
    private String id_curso;
    private String id_asignatura;
    private String anno;
    private String num_evaluacion;
    private String fecha;
    
    
    public jfIngresar() {
        initComponents();
        this.setLocationRelativeTo(null); //CENTRAR EN LA PANTALLA
        
        //Llenar ComboBoxs
        try{
            BD.crearConexion();
            
            //PRIMER COMBOBOX
            String sql = "SELECT c.nombre FROM asignatura_curso ac, curso c WHERE ac.id_curso = c.id_curso";
            rs = BD.ejecutarSQLSelect(sql);
            while(rs.next()){
                cmbCurso.addItem(rs.getString("c.nombre"));
            }
            
            //SEGUNDO COMBOBOX
            sql = "SELECT DISTINCT(a.nombre) FROM asignatura_curso ac, asignatura a WHERE ac.id_asignatura = a.id_asignatura";
            rs = BD.ejecutarSQLSelect(sql);
            while(rs.next()){
                cmbAsignatura.addItem(rs.getString("a.nombre"));
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

        cmbCurso = new javax.swing.JComboBox<>();
        lblCurso = new javax.swing.JLabel();
        lblAsignatura = new javax.swing.JLabel();
        cmbAsignatura = new javax.swing.JComboBox<>();
        lblSemestre = new javax.swing.JLabel();
        cmbSemestre = new javax.swing.JComboBox<>();
        btnVolver = new javax.swing.JButton();
        btnGenerar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDetalle = new javax.swing.JTextArea();
        lblTitulo = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        calendario = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(350, 343));
        setMinimumSize(new java.awt.Dimension(350, 343));
        setResizable(false);

        lblCurso.setText("Seleccione Curso");

        lblAsignatura.setText("Seleccione asignatura");

        lblSemestre.setText("Semestre");

        cmbSemestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primer Semestre", "Segundo Semestre" }));

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/backward.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disk.png"))); // NOI18N
        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        jLabel1.setText("Agregue descripcion de la prueba");

        txtDetalle.setColumns(20);
        txtDetalle.setRows(5);
        jScrollPane1.setViewportView(txtDetalle);

        lblTitulo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/book_add.png"))); // NOI18N
        lblTitulo.setText("Evaluaciones");

        lblFecha.setText("Fecha");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                        .addComponent(btnGenerar))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTitulo)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblCurso)
                                        .addComponent(lblAsignatura)
                                        .addComponent(lblSemestre)
                                        .addComponent(lblFecha)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbSemestre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(calendario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCurso)
                            .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAsignatura)
                            .addComponent(cmbAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSemestre)
                            .addComponent(cmbSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblFecha))
                    .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnGenerar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        jfEvaluaciones eva = new jfEvaluaciones();
        this.dispose();
        eva.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        String coma = "','";
        if (calendario == null){
            msj = "Error, ingrese una fecha.";
            JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE); 
        }else{
            try{
                BD.crearConexion();
                String sql = "SELECT ac.id_curso, ac.id_asignatura, anno FROM asignatura_curso ac, curso c, asignatura a WHERE ac.id_curso = c.id_curso AND ac.id_asignatura = a.id_asignatura AND a.nombre = '"+ cmbAsignatura.getSelectedItem() +"' AND c.nombre = '"+ cmbCurso.getSelectedItem() +"';";
                rs = BD.ejecutarSQLSelect(sql);
                //Armar id_evaluacion
                while(rs.next()){
                    id_curso = rs.getString("ac.id_curso");
                    id_asignatura = rs.getString("ac.id_asignatura");
                    anno = rs.getString("ac.anno");
                    id_evaluacion = id_curso + id_asignatura + anno + (int)(cmbSemestre.getSelectedIndex()+1);
                }
                //semestre = cmbSemestre.getSelectedItem();
                //Agregar el numero de la Evaluacion
                sql = "SELECT COUNT(id_evaluacion)+1 as n_evaluacion FROM evaluacion WHERE id_asignatura = '"+ id_asignatura +"' AND id_curso = '"+ id_curso +"' AND anno = '"+ anno +"' AND semestre = '"+ (int)(cmbSemestre.getSelectedIndex()+1) +"'";
                rs = BD.ejecutarSQLSelect(sql);
                while(rs.next()){
                    num_evaluacion = String.format("%02d", rs.getInt("n_evaluacion"));
                }
                id_evaluacion = id_evaluacion + num_evaluacion;
                //FECHA
                fecha = new SimpleDateFormat("yyyy-MM-dd").format(calendario.getDate());
                   
                    JOptionPane.showMessageDialog(null,fecha,"Exito",JOptionPane.INFORMATION_MESSAGE);
                sql = "INSERT INTO evaluacion(id_evaluacion,id_curso,id_asignatura,anno,semestre,num_evaluacion,fecha,detalle) VALUES ('" + id_evaluacion + coma + id_curso + coma + id_asignatura + coma + anno + coma + (int)(cmbSemestre.getSelectedIndex()+1) + coma + num_evaluacion + coma + fecha + coma + txtDetalle.getText() +"')";
                if (BD.ejecutarSQL(sql)){
                    msj="Se registro la evaluacion correctamente";
                    JOptionPane.showMessageDialog(null,msj,"Exito",JOptionPane.INFORMATION_MESSAGE);   
                }else{
                    msj="Error, No se pudo realizar la operacion";
                    JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);
                }
                BD.cerrarConexion();
            }catch (Exception e){
                msj = "Error, hubo un problema.";
                JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);    
            }
        }
    }//GEN-LAST:event_btnGenerarActionPerformed

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
            java.util.logging.Logger.getLogger(jfIngresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfIngresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfIngresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfIngresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfIngresar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnVolver;
    private com.toedter.calendar.JDateChooser calendario;
    private javax.swing.JComboBox<String> cmbAsignatura;
    private javax.swing.JComboBox<String> cmbCurso;
    private javax.swing.JComboBox<String> cmbSemestre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAsignatura;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblSemestre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtDetalle;
    // End of variables declaration//GEN-END:variables
}
