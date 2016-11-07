package trabajo.Profesores;

import trabajo.Apoderado.*;
import clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class jfEliminar extends javax.swing.JFrame {


    private Conexion BD = new Conexion();
    private String msj;
    
    public jfEliminar() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/book_delete.png"));
        setIconImage(icon);
        initComponents();
        this.setLocationRelativeTo(null); //CENTRAR EN LA PANTALLA
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jNomProfesor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jRutProfesor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        lblTitulo1 = new javax.swing.JLabel();
        jMensaje = new javax.swing.JLabel();
        jRutEli = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 440));
        setMinimumSize(new java.awt.Dimension(500, 440));
        setPreferredSize(new java.awt.Dimension(500, 440));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(500, 440));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 440));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Rut profesor a eliminar");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jNomProfesor.setEditable(false);
        jNomProfesor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre profesor:");

        jRutProfesor.setEditable(false);
        jRutProfesor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Rut");

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/backward.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblTitulo1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblTitulo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/group_delete.png"))); // NOI18N
        lblTitulo1.setText("Eliminar Profesor");

        jRutEli.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jRutEli.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jRutEliFocusLost(evt);
            }
        });
        jRutEli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRutEliKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRutEli, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnBuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jNomProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(btnEliminar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jRutProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(lblTitulo1)
                    .addContainerGap(295, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(jRutEli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jNomProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jRutProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(57, 57, 57))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(lblTitulo1)
                    .addContainerGap(390, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 500, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        BD.crearConexion();
        msj = "";
        jRutProfesor.setText("");
        jNomProfesor.setText("");
        String rut = jRutEli.getText();
        String sql1="SELECT * FROM profesor WHERE rut_profesor='"+rut+"'";
        try{
            ResultSet lis = BD.ejecutarSQLSelect(sql1);
            if (lis.next()){
                msj="Persona Existe presione eliminar para confirmar";
                jMensaje.setText(msj);
                jRutProfesor.setText(lis.getString(1));
                jNomProfesor.setText(lis.getString(2) + " " +  lis.getString(3) + " " + lis.getString(4));
                jMensaje.setText(msj);
            }else {
                msj="Persona No Existe busque denuevo";
                jMensaje.setText(msj);
            }
        }catch(Exception e){
            msj="Error, no se pudo realizar la operacion";
            JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String rut = jRutEli.getText();
        String sql ="DELETE FROM profesor WHERE rut_profesor = '" + rut + "' ";
        if(!jNomProfesor.getText().equals("")){
            try{
                BD.ejecutarSQL(sql);
                msj="Datos eliminados con exito";
                JOptionPane.showMessageDialog(null,msj,"Exito",JOptionPane.INFORMATION_MESSAGE);
                jRutEli.setText("");
                jNomProfesor.setText("");
                jRutProfesor.setText("");
            }catch(Exception e){
                msj="Error, no se pudo realizar la operacion";
                JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            msj="Error, ningún Rut ah sido digitado";
            JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        if (BD.getConexion() != null){
            BD.cerrarConexion();
        }
        this.dispose();
        new jfProfesores().setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void jRutEliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jRutEliFocusLost
        /*    try{
            Rut rutv = new Rut();
            String rut = jRutEli.getText();
            rut = rutv.formatear(rut);
            if (rutv.validar(rut) == false){
                JOptionPane.showMessageDialog(null,"Rut incorrecto","Ventana Error Rut",JOptionPane.ERROR_MESSAGE);
                jRutEli.setText("");
            }else{
                rut = rut.replace(".", "");
                rut = rut.replace("-", "");
                jRutEli.setText(rut);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Mal formato de rut","Ventana Error Rut",JOptionPane.ERROR_MESSAGE);
            jRutEli.setText("");
        }*/
    }//GEN-LAST:event_jRutEliFocusLost

    private void jRutEliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRutEliKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String rut = jRutEli.getText();
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            jRutEli.setText(rut);
            btnBuscar.requestFocus();
            btnBuscar.doClick();}
    }//GEN-LAST:event_jRutEliKeyPressed

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
            java.util.logging.Logger.getLogger(jfEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfEliminar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jMensaje;
    private javax.swing.JTextField jNomProfesor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jRutEli;
    private javax.swing.JTextField jRutProfesor;
    private javax.swing.JLabel lblTitulo1;
    // End of variables declaration//GEN-END:variables
}
