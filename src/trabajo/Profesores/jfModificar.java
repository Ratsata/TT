package trabajo.Profesores;

import trabajo.Apoderado.*;
import clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import trabajo.Rut;

public class jfModificar extends javax.swing.JFrame {

    private Conexion BD = new Conexion();
    private String msj;
    public jfModificar() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/book_edit.png"));
        setIconImage(icon);
        initComponents();
        this.jPanel1.setVisible(true);
        this.setLocationRelativeTo(null); //CENTRAR EN LA PANTALLA
        deshabilitarBotones();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbl_Nombre = new javax.swing.JLabel();
        jNombre = new javax.swing.JTextField();
        lbl_ApePat = new javax.swing.JLabel();
        jApePat = new javax.swing.JTextField();
        lbl_ApeMat = new javax.swing.JLabel();
        jApeMat = new javax.swing.JTextField();
        jCelular = new javax.swing.JTextField();
        lbl_celular = new javax.swing.JLabel();
        lbl_Fono = new javax.swing.JLabel();
        jFono = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        jLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        lblTitulo1 = new javax.swing.JLabel();
        jExiste = new javax.swing.JLabel();
        lbl_celular1 = new javax.swing.JLabel();
        jMail = new javax.swing.JTextField();
        jPrefijoCelu = new javax.swing.JTextField();
        cmbPrefijo = new javax.swing.JComboBox<>();
        jRutModi = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_Nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Nombre.setText("Nombre: ");

        lbl_ApePat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_ApePat.setText("Apellido Paterno:");

        lbl_ApeMat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_ApeMat.setText("Apellido Materno:");

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

        lbl_celular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_celular.setText("Celular:");

        lbl_Fono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Fono.setText("Telefono Fijo:");

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

        jLimpiar.setText("Limpiar campos");
        jLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimpiarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Rut del profesor a modificar:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblTitulo1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblTitulo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/group_edit.png"))); // NOI18N
        lblTitulo1.setText("Modificar Profesor");

        lbl_celular1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_celular1.setText("Email:");

        jPrefijoCelu.setText("+569");
        jPrefijoCelu.setEnabled(false);

        cmbPrefijo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "32", "2", "33", "34", "35", "39", "41", "42", "43", "44", "45", "51", "52", "53", "55", "57", "58", "61", "63", "64", "65", "67", "71", "72", "73", "75" }));

        jRutModi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jRutModiFocusLost(evt);
            }
        });
        jRutModi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRutModiKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblTitulo1)
                        .addGap(18, 18, 18)
                        .addComponent(jExiste, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRutModi, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ApeMat)
                            .addComponent(lbl_celular1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbl_Fono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbPrefijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFono, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbl_celular)
                                .addGap(117, 117, 117)
                                .addComponent(jPrefijoCelu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_ApePat)
                                    .addComponent(lbl_Nombre))
                                .addGap(103, 103, 103)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jApePat, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jApeMat, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jMail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLimpiar)
                                .addGap(37, 37, 37)
                                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(btnFinalizar)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitulo1)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRutModi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jExiste, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Nombre)
                    .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_ApePat)
                    .addComponent(jApePat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_ApeMat)
                    .addComponent(jApeMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_celular1)
                    .addComponent(jMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_celular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_Fono))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPrefijoCelu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbPrefijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLimpiar)
                    .addComponent(btnVolver)
                    .addComponent(btnFinalizar))
                .addGap(357, 357, 357))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        BD.crearConexion();
        msj = "";        
        jNombre.setText("");
        jApePat.setText("");
        jApeMat.setText("");
        String rut = jRutModi.getText();
        String sql1="SELECT * FROM profesor WHERE rut_profesor='"+rut+"'";
        try{
            //sentencia = (com.mysql.jdbc.Statement)conexion.createStatement();
            ResultSet lis = BD.ejecutarSQLSelect(sql1);
            if (lis.next()){
                String prefijo;
                msj="Profesor Existe Modifique los campos";
                habilitarBotones();
                jExiste.setText(msj);
                jNombre.setText(lis.getString(2));
                jApePat.setText(lis.getString(3));
                jApeMat.setText(lis.getString(4));                
                prefijo = lis.getString(5).substring(0,lis.getString(5).length()-7);
                cmbPrefijo.setSelectedItem(prefijo);
                jFono.setText(lis.getString(5).substring(lis.getString(5).length()-7,lis.getString(5).length()));
                jCelular.setText(lis.getString(6).substring(4,(lis.getString(6).length())));                
                jMail.setText(lis.getString(7));
                jExiste.setText(msj);
            }
        }catch(Exception e){
            msj="Error, no se pudo realizar la operacion";
            JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimpiarActionPerformed
        // TODO add your handling code here:
        jRutModi.setText("");
        jNombre.setText("");
        jApePat.setText("");
        jApeMat.setText("");
        jFono.setText("");
        jCelular.setText("");
        jMail.setText("");
        deshabilitarBotones();
        
    }//GEN-LAST:event_jLimpiarActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        BD.crearConexion();
        if (jNombre.getText().equals("") || jApePat.getText().equals("") || jApeMat.getText().equals("") || jMail.getText().equals("") || jFono.getText().equals("") || jCelular.getText().equals("")){
            msj="Error, No deje ningun campo vacio";
            JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);
        }else{
            String rut,nombre,apeP,apeM,mail,fono,fonoFinal,celular,celuFinal,coma;
            rut = jRutModi.getText();
            nombre = jNombre.getText();
            apeP = jApePat.getText();
            apeM = jApeMat.getText();
            mail = jMail.getText();
            fono = jFono.getText();
            celular = jCelular.getText();
            celuFinal = jPrefijoCelu.getText() + celular;
            fonoFinal = cmbPrefijo.getSelectedItem() + fono; 
            try{String sql = "UPDATE profesor SET nombres = '"+nombre+"',"
                        + "ape_paterno = '"+apeP+"',"
                        + "ape_materno = '"+apeM+"',"
                        + "fono = '"+fonoFinal+"',"
                        + "celular = '"+celuFinal+"',"
                        + "mail = '"+mail +"'"
                        + " WHERE rut_profesor = '"+rut+"';"; //Espacio Necesario para el WHERE
                    if(BD.ejecutarSQL(sql)){
                        msj="Datos modificados";
                        JOptionPane.showMessageDialog(null,msj,"Exito",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        msj="Error al intentar modificar.";
                        JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);
                    }                  
                }catch (Exception e){
                    msj = "Error, hubo un problema.";
                    JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);
        }    
    }
       
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        if (BD.getConexion() != null){
            BD.cerrarConexion();
        }
        this.dispose();
        new jfProfesores().setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

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
    }//GEN-LAST:event_jFonoKeyTyped

    private void jFonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFonoFocusLost
        String texto = jFono.getText();
        Integer Numeros = Integer.parseInt(texto);     
        if (Numeros<1000000 || Numeros>9999999) {
            JOptionPane.showMessageDialog(null,"Fono imposible","Ventana Error Año",JOptionPane.ERROR_MESSAGE);
            jFono.requestFocus();
            jFono.setText("");
        }
    }//GEN-LAST:event_jFonoFocusLost

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
    }//GEN-LAST:event_jCelularKeyTyped

    private void jCelularFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCelularFocusLost
        String texto = jCelular.getText();
        Integer Numeros = Integer.parseInt(texto);     
        if (Numeros<10000000 || Numeros>99999999) {
            JOptionPane.showMessageDialog(null,"Celular imposible","Ventana Error Año",JOptionPane.ERROR_MESSAGE);
            jCelular.requestFocus();
            jCelular.setText("");
        }
    }//GEN-LAST:event_jCelularFocusLost

    private void jRutModiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jRutModiFocusLost
        try{
            Rut rutv = new Rut();
            String rut = jRutModi.getText();
            rut = rutv.formatear(rut);
            if (rutv.validar(rut) == false){
                JOptionPane.showMessageDialog(null,"Rut incorrecto","Ventana Error Rut",JOptionPane.ERROR_MESSAGE);
                jRutModi.setText("");
                jNombre.setText("");
                jApePat.setText("");
                jApeMat.setText("");
                jFono.setText("");
                jCelular.setText("");
                jMail.setText("");
                deshabilitarBotones();
            }else{
                rut = rut.replace(".", "");
                rut = rut.replace("-", "");
                jRutModi.setText(rut);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Mal formato de rut","Ventana Error Rut",JOptionPane.ERROR_MESSAGE);
            jRutModi.setText("");
            jNombre.setText("");
            jApePat.setText("");
            jApeMat.setText("");
            jFono.setText("");
            jCelular.setText("");
            jMail.setText("");   
            deshabilitarBotones();
        }
    }//GEN-LAST:event_jRutModiFocusLost

    private void jRutModiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRutModiKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            String rut = jRutModi.getText();
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            jRutModi.setText(rut);
            btnBuscar.requestFocus();
            btnBuscar.doClick();
        }
    }//GEN-LAST:event_jRutModiKeyPressed

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
            java.util.logging.Logger.getLogger(jfModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfModificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbPrefijo;
    private javax.swing.JTextField jApeMat;
    private javax.swing.JTextField jApePat;
    private javax.swing.JTextField jCelular;
    private javax.swing.JLabel jExiste;
    private javax.swing.JTextField jFono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jLimpiar;
    private javax.swing.JTextField jMail;
    private javax.swing.JTextField jNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jPrefijoCelu;
    private javax.swing.JTextField jRutModi;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lbl_ApeMat;
    private javax.swing.JLabel lbl_ApePat;
    private javax.swing.JLabel lbl_Fono;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JLabel lbl_celular;
    private javax.swing.JLabel lbl_celular1;
    // End of variables declaration//GEN-END:variables

    private void deshabilitarBotones() {
        jNombre.setEnabled(false);
        jApePat.setEnabled(false);
        jApeMat.setEnabled(false);
        jFono.setEnabled(false);
        jCelular.setEnabled(false);
        jMail.setEnabled(false);
        cmbPrefijo.setEnabled(false);
        btnFinalizar.setEnabled(false);
        
    }

    private void habilitarBotones() {
        jNombre.setEnabled(true);
        jApePat.setEnabled(true);
        jApeMat.setEnabled(true);
        jFono.setEnabled(true);
        jCelular.setEnabled(true);
        jMail.setEnabled(true);
        cmbPrefijo.setEnabled(true);
        btnFinalizar.setEnabled(true);
    }
}
