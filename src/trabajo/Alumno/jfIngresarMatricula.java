package trabajo.Alumno;

import clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.GregorianCalendar;
import trabajo.Rut;

public class jfIngresarMatricula extends javax.swing.JFrame {

    private Conexion BD = new Conexion();
    public jfIngresarMatricula() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/gorro.png"));
        setIconImage(icon);
        initComponents();
        this.setLocationRelativeTo(null); //CENTRAR EN LA PANTALLA
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jInstruccion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jFolio = new javax.swing.JTextField();
        jRut = new javax.swing.JTextField();
        jAño = new javax.swing.JTextField();
        btnFinalizar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInstruccion.setText("Ingrese Datos Matricula");

        jLabel1.setText("Ingrese Nº Folio:");

        jLabel2.setText("Ingrese rut alumno:");

        jLabel3.setText("Ingrese año en el que se matriculó");

        jFolio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFolioKeyTyped(evt);
            }
        });

        jAño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jAñoKeyTyped(evt);
            }
        });

        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

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

        jLabel4.setText("(El programa se encargara del formato)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jInstruccion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar))
                            .addComponent(jLabel3)
                            .addComponent(jAño, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRut, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFinalizar)
                .addGap(77, 77, 77))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInstruccion)
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFinalizar)
                    .addComponent(btnVolver))
                .addContainerGap(59, Short.MAX_VALUE))
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

    private void jFolioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFolioKeyTyped
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
            jAño.transferFocus();
        }
    }//GEN-LAST:event_jFolioKeyTyped

    private void jAñoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jAñoKeyTyped
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
            jAño.transferFocus();
        }
    }//GEN-LAST:event_jAñoKeyTyped

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        if (BD.getConexion() != null) 
            {BD.cerrarConexion();}
        this.dispose();
        //new jfMenu().setVisible(true);
        new jfAlumno().setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        jRut.setText("");        
        jAño.setText("");        
        jFolio.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        try{
            //Objeto con la fecha actual
            Calendar calendario = new GregorianCalendar();
            
            Integer año = Integer.parseInt(jAño.getText());
            Integer añoLimite = calendario.get(Calendar.YEAR);
            
            if (año < 2001 || año > añoLimite) {
                JOptionPane.showMessageDialog(null,"Año de matricula imposible","Ventana Error Año",JOptionPane.ERROR_MESSAGE);
                jAño.requestFocus();
                jAño.setText("");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Año de matricula imposible","Ventana Error Año",JOptionPane.ERROR_MESSAGE);
            jAño.requestFocus();
            jAño.setText("");
        }
        Rut rutv = new Rut();
        String rut = jRut.getText();
        rut = rutv.formatear(rut);
        if (rutv.validar(rut) == false){
            JOptionPane.showMessageDialog(null,"Rut incorrecto","Ventana Error Rut",JOptionPane.ERROR_MESSAGE);
        jRut.setText("");}else{
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            jRut.setText(rut);}
        try{
            String texto = jFolio.getText();
            Integer Numeros = Integer.parseInt(texto);
            if (Numeros<0 || Numeros>999999) {
                JOptionPane.showMessageDialog(null,"Folio imposible","Ventana Error Año",JOptionPane.ERROR_MESSAGE);
                jFolio.requestFocus();
                jFolio.setText("");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Folio vacio","Ventana Error Año",JOptionPane.ERROR_MESSAGE);
            jFolio.requestFocus();
            jFolio.setText("");
        }
        BD.crearConexion();
        String msj;
        if (jRut.getText().equals("") || jFolio.getText().equals("") || jAño.getText().equals("")){
            msj="Error, No deje ningun campo vacio";
            JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);         
        }else{Integer año, folio;
            rut = jRut.getText();
            año = Integer.parseInt(jAño.getText());
            String coma = "','";
            folio = Integer.parseInt(jFolio.getText());
            String sqlFolio = "SELECT rut_alumno FROM matricula WHERE folio_matricula = '" + folio + "'";
            try {
            ResultSet lis = BD.ejecutarSQLSelect(sqlFolio);        
                if (lis.next()){
                msj="Folio ya asociado a un alumno";
                JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.INFORMATION_MESSAGE);  }
                else{
                    String sqlFolio2 = "SELECT * FROM matricula WHERE rut_alumno = '" + rut + "' and anno = '" +año+ "'";
                    try {
                        lis = BD.ejecutarSQLSelect(sqlFolio2);        
                        if (lis.next()){msj ="alumno ya tiene folio asociado a ese año";
                        JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);
                        }else{
                    String sql = "INSERT INTO matricula(folio_matricula,rut_alumno,anno) values ('"+ folio +coma+rut+coma+año+ " ')";
                    if(BD.ejecutarSQL(sql)){
                msj="Ingreso realizado con exito";
                JOptionPane.showMessageDialog(null,msj,"Exito",JOptionPane.INFORMATION_MESSAGE);   
            }else{
                msj="Error, folio existente";
                JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);
                 }
                }
        }catch (Exception e){ msj = "continue";
            JOptionPane.showMessageDialog(null,msj,"Exito",JOptionPane.INFORMATION_MESSAGE);}
                }
            }catch (Exception e){ msj = "continue";
            JOptionPane.showMessageDialog(null,msj,"Exito",JOptionPane.INFORMATION_MESSAGE);} } 
    
    }//GEN-LAST:event_btnFinalizarActionPerformed

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
            java.util.logging.Logger.getLogger(jfIngresarMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfIngresarMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfIngresarMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfIngresarMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
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
    private javax.swing.JTextField jAño;
    private javax.swing.JTextField jFolio;
    private javax.swing.JLabel jInstruccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jRut;
    // End of variables declaration//GEN-END:variables
}
