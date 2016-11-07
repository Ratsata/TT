package trabajo.Alumno;
import clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import trabajo.Rut;

public class jfEliminar extends javax.swing.JFrame {
    private Conexion BD = new Conexion();
    private String msj;
    
    public jfEliminar() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/book_delete.png"));
        setIconImage(icon);
        initComponents();
        this.setLocationRelativeTo(null); //CENTRAR EN LA PANTALLA
        BD.crearConexion();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jRutEli = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lbl_Alumno = new javax.swing.JLabel();
        lbl_Rut = new javax.swing.JLabel();
        jNomAlumno = new javax.swing.JTextField();
        jRutAlumno = new javax.swing.JTextField();
        jMensaje = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        lblTitulo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 500));

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/backward.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Rut alumno a eliminar");

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

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lbl_Alumno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Alumno.setText("Alumno");

        lbl_Rut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Rut.setText("Rut");

        jNomAlumno.setEditable(false);
        jNomAlumno.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jRutAlumno.setEditable(false);
        jRutAlumno.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblTitulo1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblTitulo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/group_delete.png"))); // NOI18N
        lblTitulo1.setText("Eliminar Alumno");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitulo1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnVolver))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(lbl_Alumno))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jNomAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jRutEli, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRutAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(btnEliminar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(lbl_Rut))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo1)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRutEli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Alumno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jNomAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_Rut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRutAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(96, 96, 96))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        if (BD.getConexion() != null){
            BD.cerrarConexion();
        }
        this.dispose();
        new jfAlumno().setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        msj = "";
        
        try{
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
        }
        
        jRutAlumno.setText("");
        jNomAlumno.setText("");
        String rut = jRutEli.getText();
        String sql1="SELECT * FROM alumno WHERE rut_alumno='"+rut+"'";
        try{
            ResultSet lis = BD.ejecutarSQLSelect(sql1);
            if (lis.next()){
                msj="Alumno Existe presione eliminar para confirmar";
                jMensaje.setText(msj);
                jRutAlumno.setText(lis.getString(1));
                jNomAlumno.setText(lis.getString(2) + " " +  lis.getString(3) + " " + lis.getString(4));
                jMensaje.setText(msj);
            }else{
                msj="Alumno No Existe busque denuevo";
                jMensaje.setText(msj);
            }
        }catch(Exception e){
            msj="Error, no se pudo realizar la operacion";
            JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String rut = jRutEli.getText();
        String sql ="DELETE FROM alumno WHERE rut_alumno = '" + rut + "' ";
        if(!jNomAlumno.getText().equals("")){
            try{
                BD.ejecutarSQL(sql);
                msj="Datos eliminados con exito";
                JOptionPane.showMessageDialog(null,msj,"Exito",JOptionPane.INFORMATION_MESSAGE);
                jRutEli.setText("");
                jNomAlumno.setText("");
                jRutAlumno.setText("");
            }catch(Exception e){
                msj="Error, no se pudo realizar la operación";
                JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            msj="Error, busque un Rut valido";
            JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

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
    private javax.swing.JLabel jMensaje;
    private javax.swing.JTextField jNomAlumno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jRutAlumno;
    private javax.swing.JTextField jRutEli;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lbl_Alumno;
    private javax.swing.JLabel lbl_Rut;
    // End of variables declaration//GEN-END:variables
}
