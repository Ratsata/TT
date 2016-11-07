
package trabajo;

import trabajo.Alumno.jfAlumno;
import trabajo.Apoderado.jfApoderado;
import trabajo.Profesores.jfProfesores;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import trabajo.Asignaturas.jfAsignaturas;
import trabajo.Cursos.jfCursos;
import trabajo.Evaluaciones.jfEvaluaciones;
import trabajo.Informes.jfInformes;
import trabajo.Notas.jfNotas;


public class jfMenu extends javax.swing.JFrame {

    /**
     * CONSTRUCTOR VACIO DEL MENU
     */
    public jfMenu() {        
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/gorro.png"));
        setIconImage(icon);
        initComponents();
        this.setLocationRelativeTo(null); //CENTRAR EN LA PANTALLA
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        lblContraseña = new javax.swing.JLabel();
        btnAlumno = new javax.swing.JButton();
        btnProfesores = new javax.swing.JButton();
        btnCursos = new javax.swing.JButton();
        btnAsignaturas = new javax.swing.JButton();
        btnApoderado = new javax.swing.JButton();
        btnEvaluacion = new javax.swing.JButton();
        btnNotas = new javax.swing.JButton();
        btnContraseña = new javax.swing.JButton();
        jContraseña = new javax.swing.JPasswordField();
        btnGenerarInforme = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 300));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 300));

        lblTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblTitulo.setText("Sistema de Apoyo Académico");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gorro.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(29, 29, 29))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 260);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setMaximumSize(new java.awt.Dimension(600, 200));
        jPanel2.setMinimumSize(new java.awt.Dimension(600, 200));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 200));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel.png"))); // NOI18N
        btnSalir.setMnemonic('s');
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblContraseña.setText("Ingrese Contraseña");

        btnAlumno.setText("Alumnos");
        btnAlumno.setEnabled(false);
        btnAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlumnoActionPerformed(evt);
            }
        });

        btnProfesores.setText("Profesores");
        btnProfesores.setEnabled(false);
        btnProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfesoresActionPerformed(evt);
            }
        });

        btnCursos.setText("Cursos");
        btnCursos.setEnabled(false);
        btnCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCursosActionPerformed(evt);
            }
        });

        btnAsignaturas.setText("Asignaturas");
        btnAsignaturas.setEnabled(false);
        btnAsignaturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignaturasActionPerformed(evt);
            }
        });

        btnApoderado.setText("Apoderado");
        btnApoderado.setEnabled(false);
        btnApoderado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApoderadoActionPerformed(evt);
            }
        });

        btnEvaluacion.setText("Evaluaciones");
        btnEvaluacion.setEnabled(false);
        btnEvaluacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvaluacionActionPerformed(evt);
            }
        });

        btnNotas.setText("Notas");
        btnNotas.setEnabled(false);
        btnNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotasActionPerformed(evt);
            }
        });

        btnContraseña.setText("Aceptar");
        btnContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContraseñaActionPerformed(evt);
            }
        });

        jContraseña.setText("contraseña");
        jContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jContraseñaActionPerformed(evt);
            }
        });
        jContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jContraseñaKeyPressed(evt);
            }
        });

        btnGenerarInforme.setText("Informes");
        btnGenerarInforme.setEnabled(false);
        btnGenerarInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarInformeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnContraseña))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(lblContraseña))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnGenerarInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnApoderado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnProfesores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAsignaturas, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEvaluacion))))))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlumno, btnApoderado, btnAsignaturas, btnCursos, btnEvaluacion, btnGenerarInforme, btnNotas, btnProfesores, btnSalir});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(lblContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnContraseña))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProfesores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAsignaturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEvaluacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerarInforme)
                    .addComponent(btnApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir))
                .addGap(29, 29, 29))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAlumno, btnApoderado, btnAsignaturas, btnCursos, btnEvaluacion, btnGenerarInforme, btnNotas, btnProfesores, btnSalir});

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 260, 600, 220);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // boton salir
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumnoActionPerformed
        jfAlumno jfAlu = new jfAlumno();
        this.dispose();
        jfAlu.setVisible(true);
    }//GEN-LAST:event_btnAlumnoActionPerformed

    private void btnApoderadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApoderadoActionPerformed
        jfApoderado Apo = new jfApoderado();
        this.dispose();
        Apo.setVisible(true);
    }//GEN-LAST:event_btnApoderadoActionPerformed

    private void btnProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfesoresActionPerformed
        jfProfesores Profe = new jfProfesores();
        this.dispose();
        Profe.setVisible(true);
              
    }//GEN-LAST:event_btnProfesoresActionPerformed

    private void btnContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContraseñaActionPerformed
        String contraseña;
        contraseña = jContraseña.getText();
        if (contraseña.equals("contraseña")){
            btnAlumno.setEnabled(true);
            btnApoderado.setEnabled(true);
            btnCursos.setEnabled(true);
            btnNotas.setEnabled(true);
            btnProfesores.setEnabled(true);
            btnAsignaturas.setEnabled(true);
            btnEvaluacion.setEnabled(true);
            btnGenerarInforme.setEnabled(true);
            
            jContraseña.setVisible(false);
            btnContraseña.setVisible(false);
            lblContraseña.setVisible(false);
            
        }else{
            JOptionPane.showMessageDialog(null,"Contraseña erronea","Error",JOptionPane.INFORMATION_MESSAGE);
            jContraseña.setText("");
        }
    }//GEN-LAST:event_btnContraseñaActionPerformed

    private void jContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jContraseñaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
             btnContraseña.doClick();
        }
    }//GEN-LAST:event_jContraseñaKeyPressed

    private void jContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jContraseñaActionPerformed

    private void btnCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCursosActionPerformed
        jfCursos cursos = new jfCursos();
        this.dispose();
        cursos.setVisible(true);
    }//GEN-LAST:event_btnCursosActionPerformed

    private void btnEvaluacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluacionActionPerformed
        jfEvaluaciones eva = new jfEvaluaciones();
        this.dispose();
        eva.setVisible(true);
    }//GEN-LAST:event_btnEvaluacionActionPerformed

    private void btnNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotasActionPerformed
        jfNotas notas = new jfNotas();
        this.dispose();
        notas.setVisible(true);
    }//GEN-LAST:event_btnNotasActionPerformed

    private void btnAsignaturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignaturasActionPerformed
        jfAsignaturas asig = new jfAsignaturas();
        this.dispose();
        asig.setVisible(true);
    }//GEN-LAST:event_btnAsignaturasActionPerformed

    private void btnGenerarInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarInformeActionPerformed
        jfInformes inf = new jfInformes();
        this.dispose();
        inf.setVisible(true);
    }//GEN-LAST:event_btnGenerarInformeActionPerformed

    
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
            java.util.logging.Logger.getLogger(jfMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlumno;
    private javax.swing.JButton btnApoderado;
    private javax.swing.JButton btnAsignaturas;
    private javax.swing.JButton btnContraseña;
    private javax.swing.JButton btnCursos;
    private javax.swing.JButton btnEvaluacion;
    private javax.swing.JButton btnGenerarInforme;
    private javax.swing.JButton btnNotas;
    private javax.swing.JButton btnProfesores;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPasswordField jContraseña;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
