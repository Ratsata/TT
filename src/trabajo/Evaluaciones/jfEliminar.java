package trabajo.Evaluaciones;

import clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class jfEliminar extends javax.swing.JFrame {
    private Conexion BD = new Conexion();
    private String msj;
    private String ID;

    public jfEliminar() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/book_delete.png"));
        setIconImage(icon);
        initComponents();
        this.setLocationRelativeTo(null); //CENTRAR EN LA PANTALLA
        
        txtDetalle.setLineWrap(true);
        txtDetalle.setWrapStyleWord(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMensaje = new javax.swing.JLabel();
        txtId_evaluacion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDetalle = new javax.swing.JTextArea();
        btnEliminar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        lblTitulo1 = new javax.swing.JLabel();
        lblCurso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(431, 406));
        setMinimumSize(new java.awt.Dimension(431, 406));
        setResizable(false);

        lblMensaje.setText("Ingres el id de evaluacion a eliminar");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtDetalle.setEditable(false);
        txtDetalle.setColumns(20);
        txtDetalle.setRows(5);
        jScrollPane1.setViewportView(txtDetalle);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
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

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblTitulo1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblTitulo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/book_delete.png"))); // NOI18N
        lblTitulo1.setText("Eliminar Evaluacion");

        lblCurso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCurso.setText("Id de la Evaluacion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMensaje)
                .addGap(130, 130, 130))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(btnEliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitulo1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblCurso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtId_evaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo1)
                .addGap(18, 18, 18)
                .addComponent(lblMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId_evaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(lblCurso))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        jfEvaluaciones eva = new jfEvaluaciones();
        this.dispose();
        eva.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try{
            BD.crearConexion();
            String sql="SELECT e.id_evaluacion, c.nombre, a.nombre, e.anno, e.semestre, e.num_evaluacion, e.fecha FROM evaluacion e, curso c, asignatura a WHERE e.id_curso = c.id_curso AND e.id_asignatura = a.id_asignatura AND e.id_evaluacion = '"+ txtId_evaluacion.getText() +"'";
            ResultSet lis = BD.ejecutarSQLSelect(sql);
            if (lis.next()){
                msj="Evaluacion encontrada";
                ID = lis.getString("e.id_evaluacion");
                txtDetalle.setText("Usted va a eliminar la evaluacion numero " + lis.getString("e.num_evaluacion") + " correspondiente al\n" + lis.getString("c.nombre") + " , de la asignatura " + lis.getString("a.nombre") + " del Semestre " + lis.getString("e.semestre") + " puesta en la fecha: " + lis.getString("e.fecha"));
            }else {
                msj="Evaluacion no existe, busque denuevo";
            }
            lblMensaje.setText(msj);
            BD.cerrarConexion();
        }catch(Exception e){
            msj="Error, no se pudo realizar la operacion";
            JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String sql ="DELETE FROM evaluacion WHERE id_evaluacion = '" + ID + "' ";
        if(!txtId_evaluacion.getText().equals("")){
            try{
                BD.crearConexion();
                BD.ejecutarSQL(sql);
                msj="Datos eliminados con exito";
                JOptionPane.showMessageDialog(null,msj,"Exito",JOptionPane.INFORMATION_MESSAGE);
                txtDetalle.setText("");
                txtId_evaluacion.setText("");
                BD.cerrarConexion();
            }catch(Exception e){
                msj="Error, no se pudo realizar la operacion";
                JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            msj="Error, ningún ID ah sido escrito";
            JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JTextArea txtDetalle;
    private javax.swing.JTextField txtId_evaluacion;
    // End of variables declaration//GEN-END:variables
}
