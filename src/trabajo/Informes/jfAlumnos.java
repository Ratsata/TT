package trabajo.Informes;

import clases.Conexion;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import trabajo.Rut;

public class jfAlumnos extends javax.swing.JFrame {

    private Rut rut;
    private String rutFormateado;
    private String rutDesformateado;
    private Conexion BD = new Conexion();
    private String actualizando = "s";
    private ResultSet rs;
    private String msj;

    public jfAlumnos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnGenerarInforme = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        cmbCurso = new javax.swing.JComboBox<>();
        jRut = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel1.setText("Si desea el informe de un alumno ingrese el rut del alumno en cuestion:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnGenerarInforme.setText("Generar informe");
        btnGenerarInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarInformeActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre alumno:");

        jLabel4.setText("Si desea el informe de los alumnos de un curso eliga el curso en cuestion:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primero Basico A" }));

        jButton3.setText("Generar informe");

        cmbCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Curso" }));
        cmbCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCursoActionPerformed(evt);
            }
        });

        jRut.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jRutFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVolver)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jRut, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscar)
                            .addGap(18, 18, 18)
                            .addComponent(btnGenerarInforme))
                        .addComponent(jLabel1))
                    .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnGenerarInforme)
                    .addComponent(jRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(btnVolver)
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

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        jfInformes inf = new jfInformes();
        this.dispose();
        inf.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnGenerarInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarInformeActionPerformed
        String sql = "SELECT * FROM ALUMNO WHERE rut_alumno = '" + rutDesformateado + "'";
        BD.crearConexion();
        ResultSet rs = BD.ejecutarSQLSelect(sql);
        try {
            if (rs.next()) {
                String rutPDF = rs.getString(1);
                String nombreCompleto = rs.getString(2) +" "+ rs.getString(3) + " "+rs.getString(4);
                Document documento = new Document();
                FileOutputStream ficheroPdf;
                try {
                    ficheroPdf = new FileOutputStream("C:\\Users\\JasonBrian95\\Desktop\\PDF\\" + rutPDF + nombreCompleto + ".PDF");
                    PdfWriter.getInstance(
                            documento,
                            ficheroPdf
                    ).setInitialLeading(20);
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                }
                try {
                    String curso = (String)cmbCurso.getSelectedItem();
                    curso = curso.substring(0,3);
                    sql = "SELECT count(id_asignatura) from asignatura_curso where id_curso = '"+curso+"'";
                    documento.open();
                    documento.add(new Paragraph("Informe de notas"));
                    Paragraph parrafo2 = new Paragraph(nombreCompleto);
                    parrafo2.setAlignment(1);//el 1 es para centrar
                    documento.add(parrafo2);
                    documento.add(new Paragraph(" "));
                    PdfPTable tabla = new PdfPTable(3);
                    //el numero indica la cantidad de Columnas
                    tabla.addCell("celda1");
                    tabla.addCell("celda2");
                    tabla.addCell("celda3");
                    tabla.addCell("celda4");
                    tabla.addCell("celda5");
                    tabla.addCell("celda6");
                    // esto nos crea una tabla de 3 Columnas por dos Filas
                    documento.add(tabla);
                    documento.add(new Paragraph(" "));
                    PdfPTable tabla2 = new PdfPTable(3);
                    PdfPCell celda = new PdfPCell(
                            new Paragraph("celda \nmodificada")
                    );
                    celda.setColspan(2);
                    //cantidad de columnas que ocupa esta celda
                    celda.setRowspan(2);
                    //cantidad de filas que ocupa esta celda
                    tabla2.addCell(celda);
                    tabla2.addCell("celda5");
                    tabla2.addCell("celda6");
                    tabla2.addCell("celda7");
                    tabla2.addCell("celda8");
                    tabla2.addCell("celda9");
                    documento.add(tabla2);
                    documento.close();
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                }
            } else {
                msj = "No existe tal alumno.";
                JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            msj = "Error, no existe tal alumno.";
            JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
        }
        BD.cerrarConexion();
    }//GEN-LAST:event_btnGenerarInformeActionPerformed

    private void cmbCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCursoActionPerformed

    }//GEN-LAST:event_cmbCursoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            BD.crearConexion();
            String sql = "SELECT c.id_curso,c.nombre FROM curso c, alumno_curso ac WHERE ac.id_curso = c.id_curso and ac.rut_alumno = '" + rutDesformateado + "'";
            rs = BD.ejecutarSQLSelect(sql);
            while (rs.next()) {
                cmbCurso.addItem(rs.getString("c.id_curso") + "," + rs.getString("c.nombre"));
            }
            BD.cerrarConexion();
        } catch (Exception e) {
            msj = "Error, hubo un problema.";
            JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jRutFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jRutFocusLost
        try {
            rutFormateado = rut.formatear(jRut.getText());
            if (rut.validar(rutFormateado) == false) {
                JOptionPane.showMessageDialog(null, "Rut incorrecto", "Ventana Error Rut", JOptionPane.ERROR_MESSAGE);
                jRut.setText("");
            } else {
                rutDesformateado = rut.desformatear(rutFormateado);
                jRut.setText(rutFormateado);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Mal formato de rut", "Ventana Error Rut", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(jfAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGenerarInforme;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbCurso;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jRut;
    // End of variables declaration//GEN-END:variables
}
