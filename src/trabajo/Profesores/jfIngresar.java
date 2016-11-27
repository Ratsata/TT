package trabajo.Profesores;

import trabajo.Apoderado.*;
import clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import trabajo.Rut;

public class jfIngresar extends javax.swing.JFrame {
    private Conexion BD = new Conexion();
    private String msj;

    public jfIngresar() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/book_add.png"));
        setIconImage(icon);
        initComponents();
        this.jPanel1.setVisible(true);
        this.setLocationRelativeTo(null); //CENTRAR EN LA PANTALLA
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jLimpiar = new javax.swing.JButton();
        lbl_Nombre = new javax.swing.JLabel();
        jNombre = new javax.swing.JTextField();
        lbl_ApePat = new javax.swing.JLabel();
        jApePat = new javax.swing.JTextField();
        lbl_ApeMat = new javax.swing.JLabel();
        jApeMat = new javax.swing.JTextField();
        lbl_Rut = new javax.swing.JLabel();
        jRut = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        lbl_celular = new javax.swing.JLabel();
        jCelular = new javax.swing.JTextField();
        lbl_Fono = new javax.swing.JLabel();
        jFono = new javax.swing.JTextField();
        lbl_celular1 = new javax.swing.JLabel();
        jMail = new javax.swing.JTextField();
        cmbPrefijo = new javax.swing.JComboBox<>();
        jPrefijoCelu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(550, 400));
        setMinimumSize(new java.awt.Dimension(550, 400));
        setPreferredSize(new java.awt.Dimension(550, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(550, 400));
        jPanel1.setMinimumSize(new java.awt.Dimension(550, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(550, 400));

        lblTitulo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/group_add.png"))); // NOI18N
        lblTitulo.setText("Ingreso de Profesor");

        jLimpiar.setText("Limpiar campos");
        jLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimpiarActionPerformed(evt);
            }
        });

        lbl_Nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Nombre.setText("Nombre:* ");

        lbl_ApePat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_ApePat.setText("Apellido Paterno:*");

        lbl_ApeMat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_ApeMat.setText("Apellido Materno:");

        lbl_Rut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Rut.setText("Rut:*");

        jRut.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jRutFocusLost(evt);
            }
        });

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/backward.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disk.png"))); // NOI18N
        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        lbl_celular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_celular.setText("Celular:*");

        jCelular.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCelularFocusLost(evt);
            }
        });
        jCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jCelularKeyTyped(evt);
            }
        });

        lbl_Fono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Fono.setText("Telefono Fijo:*");

        jFono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFonoFocusLost(evt);
            }
        });
        jFono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFonoKeyTyped(evt);
            }
        });

        lbl_celular1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_celular1.setText("Email:*");

        cmbPrefijo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "32", "2", "33", "34", "35", "39", "41", "42", "43", "44", "45", "51", "52", "53", "55", "57", "58", "61", "63", "64", "65", "67", "71", "72", "73", "75" }));

        jPrefijoCelu.setText("+569");
        jPrefijoCelu.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFinalizar)
                .addGap(82, 82, 82))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLimpiar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ApePat)
                            .addComponent(lbl_ApeMat)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_Fono)
                                    .addComponent(lbl_Nombre)
                                    .addComponent(lbl_celular)
                                    .addComponent(lbl_celular1)
                                    .addComponent(lbl_Rut))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPrefijoCelu)
                                    .addComponent(cmbPrefijo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jApePat, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jApeMat, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRut, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jMail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFono, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLimpiar)
                    .addComponent(lblTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_ApePat)
                    .addComponent(jApePat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_ApeMat)
                    .addComponent(jApeMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_Rut)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_celular1)
                    .addComponent(jMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_celular)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPrefijoCelu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Fono)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jFono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbPrefijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnFinalizar))
                .addGap(26, 26, 26))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 550, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimpiarActionPerformed
        // TODO add your handling code here:
        jNombre.setText("");
        jApePat.setText("");
        jApeMat.setText("");
        jRut.setText("");
        jMail.setText("");
        jCelular.setText("");
        jFono.setText("");
    }//GEN-LAST:event_jLimpiarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        if (BD.getConexion() != null){
            BD.cerrarConexion();
        }
        this.dispose();
        new jfProfesores().setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        BD.crearConexion();
        if (jRut.getText().equals("")|| jNombre.getText().equals("")|| jApePat.getText().equals("")|| jFono.getText().equals("")||jCelular.getText().equals("")|| jMail.getText().equals("")){
                msj="Error, No deje ningun campo obligatorio vacio";
                JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);}
        else{
            try{
            String rut,nombre,apeP,apeM,mail,fono,fonoFinal,celular,celuFinal,coma;
            rut = jRut.getText();
            nombre = jNombre.getText();
            apeP = jApePat.getText();
            apeM = jApeMat.getText();
            mail = jMail.getText();
            fono = jFono.getText();
            celular = jCelular.getText();
            celuFinal =  jPrefijoCelu.getText() + celular;
            fonoFinal = cmbPrefijo.getSelectedItem() + fono;
            coma = "','";                   
            String sql = "INSERT INTO profesor VALUES ('"+ rut +coma+ nombre+coma+apeP+coma+apeM+coma+fonoFinal+coma+celuFinal+coma+mail+"')";
            if(BD.ejecutarSQL(sql)){
                    msj="Ingreso realizado con exito";
                    JOptionPane.showMessageDialog(null,msj,"Exito",JOptionPane.INFORMATION_MESSAGE);   
                }else{
                    msj="Error, rut existente";
                    JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);
                }
            }catch(Exception e){
                msj = "Error, hubo un problema.";
                JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);    
            }
        }        
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void jCelularFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCelularFocusLost
        String texto = jCelular.getText();
        Integer Numeros = Integer.parseInt(texto);     
        if (Numeros<10000000 || Numeros>99999999) {
            JOptionPane.showMessageDialog(null,"Celular imposible","Ventana Error Año",JOptionPane.ERROR_MESSAGE);
            jCelular.requestFocus();
            jCelular.setText("");
        }
    }//GEN-LAST:event_jCelularFocusLost

    private void jCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCelularKeyTyped
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
        jCelular.transferFocus();}
        if (jCelular.getText().length()== 8){evt.consume();}
    }//GEN-LAST:event_jCelularKeyTyped

    private void jFonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFonoFocusLost
        String texto = jFono.getText();
        Integer Numeros = Integer.parseInt(texto);     
        if (Numeros<1000000 || Numeros>9999999) {
            JOptionPane.showMessageDialog(null,"Fono imposible","Ventana Error Año",JOptionPane.ERROR_MESSAGE);
            jFono.requestFocus();
            jFono.setText("");
        }
    }//GEN-LAST:event_jFonoFocusLost

    private void jFonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFonoKeyTyped
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
        jCelular.transferFocus();}
        if (jFono.getText().length()== 7){evt.consume();}
    }//GEN-LAST:event_jFonoKeyTyped

    private void jRutFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jRutFocusLost
        try{
            Rut rutv = new Rut();
            String rut = jRut.getText();
            rut = rutv.formatear(rut);
            if (rutv.validar(rut) == false){
                JOptionPane.showMessageDialog(null,"Rut incorrecto","Ventana Error Rut",JOptionPane.ERROR_MESSAGE);
                jRut.setText("");}else {
                rut = rut.replace(".", "");
                rut = rut.replace("-", "");
                jRut.setText(rut);}}catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"Mal formato de rut","Ventana Error Rut",JOptionPane.ERROR_MESSAGE);
                    jRut.setText("");
                }
    }//GEN-LAST:event_jRutFocusLost


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
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbPrefijo;
    private javax.swing.JTextField jApeMat;
    private javax.swing.JTextField jApePat;
    private javax.swing.JTextField jCelular;
    private javax.swing.JTextField jFono;
    private javax.swing.JButton jLimpiar;
    private javax.swing.JTextField jMail;
    private javax.swing.JTextField jNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jPrefijoCelu;
    private javax.swing.JTextField jRut;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lbl_ApeMat;
    private javax.swing.JLabel lbl_ApePat;
    private javax.swing.JLabel lbl_Fono;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JLabel lbl_Rut;
    private javax.swing.JLabel lbl_celular;
    private javax.swing.JLabel lbl_celular1;
    // End of variables declaration//GEN-END:variables
}
