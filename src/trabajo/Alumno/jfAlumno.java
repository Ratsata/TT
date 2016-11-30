package trabajo.Alumno;

import java.awt.Image;
import java.awt.Toolkit;
import trabajo.jfMenu;

public class jfAlumno extends javax.swing.JFrame {

    public jfAlumno() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/gorro.png"));
        setIconImage(icon);
        initComponents();
        this.setLocationRelativeTo(null); //CENTRAR EN LA PANTALLA
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnIngresar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jInstruccion = new javax.swing.JLabel();
        btnInscribirAlumno = new javax.swing.JButton();
        btnIngresarMatricula = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(590, 430));
        setMinimumSize(new java.awt.Dimension(590, 430));
        setResizable(false);
        setSize(new java.awt.Dimension(590, 430));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(590, 430));
        jPanel1.setMinimumSize(new java.awt.Dimension(590, 430));
        jPanel1.setPreferredSize(new java.awt.Dimension(590, 430));

        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/book_add.png"))); // NOI18N
        btnIngresar.setText("Ingresar Alumno");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/book_edit.png"))); // NOI18N
        btnModificar.setText("Modificar Alumno");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/book_delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar Alumno");
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

        jInstruccion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jInstruccion.setText("Elija la opción que desee");

        btnInscribirAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/group_add.png"))); // NOI18N
        btnInscribirAlumno.setText("Inscribir alumno en curso");
        btnInscribirAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirAlumnoActionPerformed(evt);
            }
        });

        btnIngresarMatricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/book_add.png"))); // NOI18N
        btnIngresarMatricula.setText("Ingresar Matricula");
        btnIngresarMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarMatriculaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(btnInscribirAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnIngresarMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnVolver))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jInstruccion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnIngresar)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jInstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInscribirAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresarMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addComponent(btnVolver))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnEliminar, btnIngresar, btnIngresarMatricula, btnInscribirAlumno, btnModificar});

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 590, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        jfMenu menu = new jfMenu(true);
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        jfEliminar eli = new jfEliminar();
        this.dispose();
        eli.setVisible(true);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        jfModificar jfModi = new jfModificar();
        this.dispose();
        jfModi.setVisible(true);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // Boton Ingresar Alumno
        jfIngresar jfIng = new jfIngresar();
        this.dispose();
        jfIng.pack();
        jfIng.setVisible(true);
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnIngresarMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarMatriculaActionPerformed
        jfIngresarMatricula Matri = new jfIngresarMatricula();
        this.dispose();
        Matri.setVisible(true);
    }//GEN-LAST:event_btnIngresarMatriculaActionPerformed

    private void btnInscribirAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirAlumnoActionPerformed
        jfInscribirAlumno Inscri = new jfInscribirAlumno();
        this.dispose();
        Inscri.setVisible(true);
    }//GEN-LAST:event_btnInscribirAlumnoActionPerformed

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
            java.util.logging.Logger.getLogger(jfAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnIngresarMatricula;
    private javax.swing.JButton btnInscribirAlumno;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jInstruccion;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
