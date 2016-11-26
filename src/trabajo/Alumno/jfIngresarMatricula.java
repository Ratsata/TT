package trabajo.Alumno;

import clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.util.GregorianCalendar;
import trabajo.Rut;

public class jfIngresarMatricula extends javax.swing.JFrame {
    private Conexion BD = new Conexion();
    private ResultSet rs;
    private Rut rut;
    private String rutFormateado;
    private String rutDesformateado;
    
    public jfIngresarMatricula() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/book_add.png"));
        setIconImage(icon);
        initComponents();
        this.setLocationRelativeTo(null); //CENTRAR EN LA PANTALLA    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jInstruccion = new javax.swing.JLabel();
        lblFolio = new javax.swing.JLabel();
        lblRut = new javax.swing.JLabel();
        lblAño = new javax.swing.JLabel();
        txtFolio = new javax.swing.JTextField();
        txtRut = new javax.swing.JTextField();
        txtAño = new javax.swing.JTextField();
        btnFinalizar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInstruccion.setText("Ingrese Datos Matricula");

        lblFolio.setText("Ingrese Nº Folio: *");

        lblRut.setText("Ingrese rut alumno: *");

        lblAño.setText("Ingrese año en el que se matriculó: *");

        txtFolio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFolioKeyTyped(evt);
            }
        });

        txtRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRutKeyReleased(evt);
            }
        });

        txtAño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAñoKeyTyped(evt);
            }
        });

        btnFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disk.png"))); // NOI18N
        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/backward.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar campos");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/book_add.png"))); // NOI18N
        lblTitulo.setText("Ingresar Matricula");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFolio)
                            .addComponent(lblRut)
                            .addComponent(lblAño)
                            .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtRut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txtFolio, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimpiar))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFinalizar)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 139, Short.MAX_VALUE)
                .addComponent(jInstruccion)
                .addGap(134, 134, 134))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jInstruccion)
                .addGap(1, 1, 1)
                .addComponent(lblFolio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRut)
                .addGap(9, 9, 9)
                .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAño)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFinalizar)
                            .addComponent(btnVolver))))
                .addContainerGap())
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

    private void txtFolioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFolioKeyTyped
        int k=(int)evt.getKeyChar();
        if (k >= 97 && k <= 122 || k>=65 && k<=90){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"No puede ingresar letras!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
        if(k==241 || k==209){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"No puede ingresar letras!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
        if(k==10){
            txtAño.transferFocus();
        }
    }//GEN-LAST:event_txtFolioKeyTyped

    private void txtAñoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAñoKeyTyped
        //metodo para que no se ingresen letras en el campo jAño
        int k=(int)evt.getKeyChar();
        if (k >= 97 && k <= 122 || k>=65 && k<=90){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"No puede ingresar letras!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
        if(k==241 || k==209){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"No puede ingresar letras!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
        if(k==10){
            txtAño.transferFocus();
        }
    }//GEN-LAST:event_txtAñoKeyTyped

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        if (BD.getConexion() != null) 
            {BD.cerrarConexion();}
        this.dispose();
        new jfAlumno().setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtRut.setText("");        
        txtAño.setText("");        
        txtFolio.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        try {
            //Objeto con la fecha actual
            Calendar calendario = new GregorianCalendar();

            Integer año = Integer.parseInt(txtAño.getText());
            Integer añoLimite = calendario.get(Calendar.YEAR);

            if (año < 2001 || año > añoLimite) {
                JOptionPane.showMessageDialog(null, "Año de matricula imposible", "Ventana Error Año", JOptionPane.ERROR_MESSAGE);
                txtAño.requestFocus();
                txtAño.setText("");
            } else {
                try {
                    Integer folio = Integer.parseInt(txtFolio.getText());
                    if (folio < 0 || folio > 999999) {
                        JOptionPane.showMessageDialog(null, "Folio imposible", "Ventana Error Año", JOptionPane.ERROR_MESSAGE);
                        txtFolio.requestFocus();
                        txtFolio.setText("");
                    } else {
                        String msj;
                        if (txtRut.getText().equals("") || txtFolio.getText().equals("") || txtAño.getText().equals("")) {
                            msj = "Error, No deje ningun campo vacio";
                            JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
                        } else {
                            String coma = "','";
                            try {
                                BD.crearConexion();
                                String sqlFolio = "SELECT rut_alumno FROM matricula WHERE folio_matricula = '" + folio + "'";
                                ResultSet lis = BD.ejecutarSQLSelect(sqlFolio);
                                if (lis.next()){
                                    msj = "Folio ya asociado a un alumno";
                                    JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    String sqlFolio2 = "SELECT * FROM matricula WHERE rut_alumno = '" + rutDesformateado + "' and anno = '" + año + "'";
                                    try {
                                        lis = BD.ejecutarSQLSelect(sqlFolio2);
                                        if (lis.next()) {
                                            msj = "alumno ya tiene folio asociado a ese año";
                                            JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
                                        } else {
                                            String sql = "INSERT INTO matricula(folio_matricula,rut_alumno,anno) values ('" + folio + coma + rutDesformateado + coma + año + " ')";
                                            if (BD.ejecutarSQL(sql)) {
                                                msj = "Ingreso realizado con exito";
                                                JOptionPane.showMessageDialog(null, msj, "Exito", JOptionPane.INFORMATION_MESSAGE);
                                            } else {
                                                msj = "Error, folio existente";
                                                JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
                                            }
                                        }
                                    } catch (Exception e) {
                                        msj="Error, no se pudo ingresar los datos";
                                        JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                            } catch (Exception e) {
                                msj="Error, no se pudo ingresar los datos";
                                JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Folio vacio", "Ventana Error Año", JOptionPane.ERROR_MESSAGE);
                    txtFolio.requestFocus();
                    txtFolio.setText("");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Año de matricula imposible", "Ventana Error Año", JOptionPane.ERROR_MESSAGE);
            txtAño.requestFocus();
            txtAño.setText("");
        }
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void txtRutKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutKeyReleased
        try{
            rutFormateado = rut.formatear(txtRut.getText());
            if (rut.validar(rutFormateado)){
                txtRut.setText(rutFormateado);
                rutDesformateado = rut.desformatear(rutFormateado);
            }
            
        }catch (Exception e){
            
        }
    }//GEN-LAST:event_txtRutKeyReleased

 
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
            java.util.logging.Logger.getLogger(jfIngresarMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfIngresarMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfIngresarMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfIngresarMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfIngresarMatricula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jInstruccion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAño;
    private javax.swing.JLabel lblFolio;
    private javax.swing.JLabel lblRut;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtFolio;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}
