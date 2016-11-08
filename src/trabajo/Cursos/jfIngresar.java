package trabajo.Cursos;

import clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class jfIngresar extends javax.swing.JFrame {
    private Conexion BD = new Conexion();
    private String msj;
    
    public jfIngresar() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/book_add.png"));
        setIconImage(icon);
        initComponents();
        this.setLocationRelativeTo(null); //CENTRAR EN LA PANTALLA
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupEnseñansa = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblCod = new javax.swing.JLabel();
        lblNom = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        btnGenerar = new javax.swing.JButton();
        cmbCurso = new javax.swing.JComboBox<>();
        lblmensaje = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        panelEnseñanza = new javax.swing.JPanel();
        rdoBasica = new javax.swing.JRadioButton();
        rdoMedia = new javax.swing.JRadioButton();
        lblEnseñanza = new javax.swing.JLabel();
        lblParalelo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(337, 329));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(337, 329));
        jPanel1.setMinimumSize(new java.awt.Dimension(337, 329));

        lblCod.setText("Codigo Curso:");

        lblNom.setText("Nombre Curso:");

        txtCod.setEditable(false);

        txtNom.setEditable(false);

        btnGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disk.png"))); // NOI18N
        btnGenerar.setText("Generar");
        btnGenerar.setEnabled(false);
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        cmbCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        cmbCurso.setAutoscrolls(true);
        cmbCurso.setEnabled(false);
        cmbCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCursoActionPerformed(evt);
            }
        });

        lblmensaje.setText("Ejemplo codigo y nombre generados");

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/backward.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        panelEnseñanza.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnGroupEnseñansa.add(rdoBasica);
        rdoBasica.setText("Basica");
        rdoBasica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoBasicaActionPerformed(evt);
            }
        });

        btnGroupEnseñansa.add(rdoMedia);
        rdoMedia.setText("Media");
        rdoMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoMediaActionPerformed(evt);
            }
        });

        lblEnseñanza.setText("Enseñanza");

        javax.swing.GroupLayout panelEnseñanzaLayout = new javax.swing.GroupLayout(panelEnseñanza);
        panelEnseñanza.setLayout(panelEnseñanzaLayout);
        panelEnseñanzaLayout.setHorizontalGroup(
            panelEnseñanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEnseñanzaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEnseñanza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(rdoBasica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdoMedia)
                .addContainerGap())
        );
        panelEnseñanzaLayout.setVerticalGroup(
            panelEnseñanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEnseñanzaLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(panelEnseñanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoBasica)
                    .addComponent(rdoMedia)
                    .addComponent(lblEnseñanza))
                .addContainerGap())
        );

        lblParalelo.setText("Paralelo");

        lblTitulo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/book_add.png"))); // NOI18N
        lblTitulo.setText("Generar Curso");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGenerar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTitulo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNom)
                                    .addComponent(lblCod))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblmensaje)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(lblParalelo)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 65, Short.MAX_VALUE)
                .addComponent(panelEnseñanza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEnseñanza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblParalelo))
                .addGap(27, 27, 27)
                .addComponent(lblmensaje)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCod)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnGenerar))
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

    private void habilitarBotones(){
        cmbCurso.setEnabled(true);
        btnGenerar.setEnabled(true);
    }

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        jfCursos curs = new jfCursos();
        this.dispose();
        curs.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        BD.crearConexion();
        String Cod,Nom,Observacion,coma;
        Observacion = "";
        coma = "','";
        try {
            if (rdoBasica.isSelected()) {
                String[] arrayCursosB = {"Primero","Segundo","Tercero","Cuarto","Quinto","Sexto","Septimo","Octavo"};
                for (int i = 1; i < 9; i++) {
                    Cod = "B" + String.valueOf(i) + cmbCurso.getSelectedItem();
                    Nom = arrayCursosB[i-1] + " Basico " + cmbCurso.getSelectedItem();
                    
                    String sql = "INSERT INTO curso(id_curso,nombre,observaciones) VALUES ('" + Cod + coma + Nom + coma + Observacion + "')";
                    BD.ejecutarSQL(sql);
                }
                
            }else{
                for (int i = 1; i < 5; i++) {
                    String[] arrayCursosM = {"Primero","Segundo","Tercero","Cuarto"};
                    Cod = "M" + String.valueOf(i) + cmbCurso.getSelectedItem();
                    Nom = arrayCursosM[i-1] + " Medio " + cmbCurso.getSelectedItem();
                    
                    String sql = "INSERT INTO curso(id_curso,nombre,observaciones) VALUES ('" + Cod + coma + Nom + coma + Observacion + "')";
                    BD.ejecutarSQL(sql);
                }
            }
            msj="Se genero el paralelo correctamente";
            JOptionPane.showMessageDialog(null,msj,"Exito",JOptionPane.INFORMATION_MESSAGE);
        }catch (Exception e){
            msj = "Error, hubo un problema.";
            JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);    
        }
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void rdoBasicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoBasicaActionPerformed
        habilitarBotones();
        String Cod,Nom;
        Cod = "B1" + cmbCurso.getSelectedItem();
        Nom = "Primero Basico " + cmbCurso.getSelectedItem();
        txtCod.setText(Cod);
        txtNom.setText(Nom);
    }//GEN-LAST:event_rdoBasicaActionPerformed

    private void rdoMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoMediaActionPerformed
        habilitarBotones();
        String Cod,Nom;
        Cod = "M1" + cmbCurso.getSelectedItem();
        Nom = "Primero Medio " + cmbCurso.getSelectedItem();
        txtCod.setText(Cod);
        txtNom.setText(Nom);
    }//GEN-LAST:event_rdoMediaActionPerformed

    private void cmbCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCursoActionPerformed
        String Cod,Nom;
        if (rdoBasica.isSelected()){
            Cod = "B1" + cmbCurso.getSelectedItem();
            Nom = "Primero Basico " + cmbCurso.getSelectedItem();
        }else{
            Cod = "M1" + cmbCurso.getSelectedItem();
            Nom = "Primero Medio " + cmbCurso.getSelectedItem();
        }
        txtCod.setText(Cod);
        txtNom.setText(Nom);
    }//GEN-LAST:event_cmbCursoActionPerformed

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
    public static javax.swing.ButtonGroup btnGroupEnseñansa;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbCurso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblEnseñanza;
    private javax.swing.JLabel lblNom;
    private javax.swing.JLabel lblParalelo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblmensaje;
    private javax.swing.JPanel panelEnseñanza;
    private javax.swing.JRadioButton rdoBasica;
    private javax.swing.JRadioButton rdoMedia;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtNom;
    // End of variables declaration//GEN-END:variables
}
