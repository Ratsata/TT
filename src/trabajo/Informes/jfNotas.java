package trabajo.Informes;

import clases.Conexion;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.Image;
import java.awt.Toolkit;
import java.io.FileOutputStream;
import java.net.URL;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import trabajo.Rut;

public class jfNotas extends javax.swing.JFrame {
    private Rut rut;
    private String rutFormateado;
    private String rutDesformateado;
    private Conexion BD = new Conexion();
    private ResultSet rs;
    private ResultSet rs2;
    private ResultSet rs3;
    private String msj;
    private String nombre;

    public jfNotas() {
        java.awt.Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/book_add.png"));
        setIconImage(icon);
        initComponents();
        this.setLocationRelativeTo(null); //CENTRAR EN LA PANTALLA
        
        //Llenar ComboBox
        try{
            BD.crearConexion();
            String sql = "SELECT id_curso, nombre FROM curso";
            rs = BD.ejecutarSQLSelect(sql);
            while(rs.next()){
                cmbCursoTodos.addItem(rs.getString("id_curso")+","+rs.getString("nombre"));
            }
            BD.cerrarConexion();
        }catch (Exception e){
            msj = "Error, hubo un problema.";
            JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);    
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        panelAlumno = new javax.swing.JPanel();
        lblInstruccion = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnGenerarAlu = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtRut = new javax.swing.JTextField();
        cmbCursoAlu = new javax.swing.JComboBox<>();
        lblNombre1 = new javax.swing.JLabel();
        lblNombre2 = new javax.swing.JLabel();
        cmbSemestre = new javax.swing.JComboBox<>();
        lblInstruccion3 = new javax.swing.JLabel();
        panelTodos = new javax.swing.JPanel();
        lblInstruccion2 = new javax.swing.JLabel();
        cmbCursoTodos = new javax.swing.JComboBox<>();
        btnGenerarTodos = new javax.swing.JButton();
        cmbSemestreTodos = new javax.swing.JComboBox<>();
        lblInstruccion4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(500, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/backward.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/book_add.png"))); // NOI18N
        lblTitulo.setText("Generar informe de Notas");

        panelAlumno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblInstruccion.setText("Rut Alumno:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnGenerarAlu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/accept.png"))); // NOI18N
        btnGenerarAlu.setText("Generar informe");
        btnGenerarAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarAluActionPerformed(evt);
            }
        });

        lblNombre.setText("Nombre alumno:");

        txtNombre.setEditable(false);

        txtRut.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRutFocusLost(evt);
            }
        });
        txtRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRutKeyReleased(evt);
            }
        });

        cmbCursoAlu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        lblNombre1.setText("Seleccione Curso:");

        lblNombre2.setText("Seleccione Semestre:");

        cmbSemestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primer Semestre", "Segundo Semestre" }));

        javax.swing.GroupLayout panelAlumnoLayout = new javax.swing.GroupLayout(panelAlumno);
        panelAlumno.setLayout(panelAlumnoLayout);
        panelAlumnoLayout.setHorizontalGroup(
            panelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlumnoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAlumnoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(cmbCursoAlu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblNombre1)
                    .addGroup(panelAlumnoLayout.createSequentialGroup()
                        .addGroup(panelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAlumnoLayout.createSequentialGroup()
                                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnBuscar))
                                .addComponent(lblNombre2))
                            .addGroup(panelAlumnoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(cmbSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblInstruccion))
                        .addGap(18, 18, 18)
                        .addGroup(panelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGenerarAlu, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAlumnoLayout.setVerticalGroup(
            panelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlumnoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(panelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(lblInstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscar)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(lblNombre1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCursoAlu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombre2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerarAlu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblInstruccion3.setText("Para las Notas de un curso:");

        panelTodos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblInstruccion2.setText("Si desea el informe de las notas de un curso eliga el curso en cuestion:");

        cmbCursoTodos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        btnGenerarTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/accept.png"))); // NOI18N
        btnGenerarTodos.setText("Generar informe");
        btnGenerarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarTodosActionPerformed(evt);
            }
        });

        cmbSemestreTodos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primer Semestre", "Segundo Semestre" }));

        javax.swing.GroupLayout panelTodosLayout = new javax.swing.GroupLayout(panelTodos);
        panelTodos.setLayout(panelTodosLayout);
        panelTodosLayout.setHorizontalGroup(
            panelTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTodosLayout.createSequentialGroup()
                        .addComponent(lblInstruccion2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelTodosLayout.createSequentialGroup()
                        .addGroup(panelTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbCursoTodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbSemestreTodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGenerarTodos)))
                .addContainerGap())
        );
        panelTodosLayout.setVerticalGroup(
            panelTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTodosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInstruccion2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTodosLayout.createSequentialGroup()
                        .addComponent(cmbCursoTodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbSemestreTodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnGenerarTodos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblInstruccion4.setText("Para las Notas de un Alumno en especifico:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTitulo)
                            .addComponent(panelAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(58, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVolver)
                            .addComponent(lblInstruccion3)
                            .addComponent(lblInstruccion4))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstruccion4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstruccion3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(panelTodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolver)
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        jfInformes inf = new jfInformes();
        this.dispose();
        inf.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnGenerarAluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarAluActionPerformed
        try {
            String sql = "SELECT * FROM alumno WHERE rut_alumno = '" + rutDesformateado + "'";
            BD.crearConexion();
            ResultSet rs = BD.ejecutarSQLSelect(sql);
            if (rs.next()) {
                String rutPDF = rs.getString(1);
                String nombreCompleto = rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4);
            
                Document documento = new Document();
                FileOutputStream ficheroPdf;
                try {
                    ficheroPdf = new FileOutputStream("C:\\Users\\s_dbz\\AppData\\Local\\Temp\\notas_" + rutPDF + nombreCompleto + ".pdf");
                    PdfWriter.getInstance(
                            documento,
                            ficheroPdf
                    ).setInitialLeading(20);
                } catch (Exception ex) {
                    msj = ex.toString();
                    JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
                }
                
                documento.open();
                Font fuente = new Font();
                String imageUrl = "http://www.fundacioncondell.cl/images/noticias/plynch/22.jpg";
                Image foto = Image.getInstance(new URL(imageUrl));
                foto.scaleToFit(100, 100);
                foto.setAbsolutePosition(0f, 750f);
                foto.setAlignment(Chunk.ALIGN_LEFT);
                documento.add(foto);
                //Titulo//
                fuente.setSize(18);
                fuente.setStyle(Font.BOLD);
                Paragraph parrafoTitulo = new Paragraph("Informe de Notas", fuente);
                parrafoTitulo.setAlignment(1);
                documento.add(parrafoTitulo);
                documento.add(new Paragraph(" "));
                documento.add(new Paragraph(" "));
                //Titulo Parrafo 1//
                fuente.setStyle(Font.BOLD);
                fuente.setSize(12);
                documento.add(new Paragraph("NOMBRE     :"+nombre, fuente));
                documento.add(new Paragraph("RUT              :"+rutFormateado, fuente));
                documento.add(new Paragraph("CURSO         :"+cmbCursoAlu.getSelectedItem().toString().replace(",", " - "), fuente));
                documento.add(new Paragraph("SEMESTRE :"+String.valueOf(cmbSemestre.getSelectedIndex()+1), fuente));
                documento.add(new Paragraph(" "));
                //Datos//
                fuente.setStyle(Font.NORMAL);
                fuente.setSize(12);
                PdfPTable tabla = new PdfPTable(12);
                try {
                    String idcurso = cmbCursoAlu.getSelectedItem().toString().substring(0,3);
                    Integer contadorNotas;
                    Integer promedio;
                    Integer promedioFinal=0;
                    Integer contadorPromedio = 0;
                    //Cabecera Tabla//
                    tabla.addCell("Asignatura");
                    for (int i = 0; i <= 9 ; i++) {
                            tabla.addCell(String.valueOf(i+1));
                        }
                    tabla.addCell("Prom.");
                    //Fin_cabecera//
                    sql = "SELECT a.nombre, a.id_asignatura FROM asignatura a, asignatura_curso ac WHERE a.id_asignatura = ac.id_asignatura AND ac.id_curso = '"+  idcurso +"'";
                    rs = BD.ejecutarSQLSelect(sql);
                    while (rs.next()){
                        tabla.addCell(rs.getString("a.nombre"));
                        promedio = 0;
                        contadorNotas = 0;
                        sql = "SELECT n.nota, e.id_evaluacion FROM notas n, evaluacion e WHERE n.id_evaluacion = e.id_evaluacion AND e.semestre = '"+ String.valueOf(cmbSemestre.getSelectedIndex()+1) +"' AND n.rut_alumno = '"+ rutDesformateado +"' AND e.id_curso = '"+ idcurso +"' AND e.id_asignatura = '"+ rs.getString("a.id_asignatura") +"'";
                        rs2 = BD.ejecutarSQLSelect(sql);
                        while (rs2.next()){
                            tabla.addCell(rs2.getString("n.nota"));
                            contadorNotas ++;
                            promedio = promedio + rs2.getInt("n.nota");
                        }
                        for (int i = 0; i <= 9 - contadorNotas; i++) {
                            tabla.addCell(String.valueOf(""));
                        }
                        if (contadorNotas > 0) {
                            promedio = promedio / contadorNotas;
                            promedioFinal = promedioFinal + promedio;
                            contadorPromedio ++;
                            tabla.addCell(String.valueOf(promedio));
                        }else{
                            tabla.addCell("");
                        }
                    }
                    PdfPCell celdaFinal = new PdfPCell(new Paragraph("Promedio Final"));
                    celdaFinal.setColspan(11);
                    tabla.addCell(celdaFinal);
                    if (contadorPromedio > 0) {
                        promedioFinal = promedioFinal / contadorPromedio;
                        tabla.addCell(String.valueOf(promedioFinal));
                    }else{
                        tabla.addCell("");
                    }
                    float[] medidaCeldas = {5f,1f,1f,1f,1f,1f,1f,1f,1f,1f,1f,2f};
                    tabla.setWidths(medidaCeldas);
                    documento.add(tabla);
                    documento.close();
                } catch (Exception ex) {
                    msj = ex.toString();
                    JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                msj = "No existe tal alumno.";
                JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
            }
            BD.cerrarConexion();
        } catch (Exception e) {
            msj = "Error, no existe tal alumno.";
            JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnGenerarAluActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            rutFormateado = rut.formatear(txtRut.getText());
            if (rut.validar(rutFormateado) == false) {
                JOptionPane.showMessageDialog(null, "Rut incorrecto", "Ventana Error Rut", JOptionPane.ERROR_MESSAGE);
                txtRut.setText("");
            } else {
                rutDesformateado = rut.desformatear(rutFormateado);
                txtRut.setText(rutFormateado);
                try {
                    BD.crearConexion();
                    cmbCursoAlu.removeAllItems();
                    String sql = "SELECT a.nombres, a.ape_paterno, a.ape_materno, c.id_curso,c.nombre FROM curso c, alumno_curso ac, alumno a WHERE ac.id_curso = c.id_curso and ac.rut_alumno = '"+ rutDesformateado +"'  AND a.rut_alumno = '"+ rutDesformateado +"'";
                    rs = BD.ejecutarSQLSelect(sql);
                    while (rs.next()) {
                        nombre = rs.getString("a.nombres")+" "+rs.getString("a.ape_paterno")+" "+rs.getString("a.ape_materno");
                        txtNombre.setText(nombre);
                        cmbCursoAlu.addItem(rs.getString("c.id_curso")+","+rs.getString("c.nombre"));
                    }
                    BD.cerrarConexion();
                } catch (Exception e) {
                    msj = "Error, hubo un problema.";
                    msj = e.toString();
                    JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Mal formato de rut", "Ventana Error Rut", JOptionPane.ERROR_MESSAGE);
            txtRut.setText("");
        }

        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtRutFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRutFocusLost
        
    }//GEN-LAST:event_txtRutFocusLost

    private void txtRutKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutKeyReleased

    private void btnGenerarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarTodosActionPerformed
        if (cmbCursoTodos.getSelectedIndex() == 0) {
            msj = "Seleccione un curso";
            JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Document documento = new Document();
            FileOutputStream ficheroPdf;
            String nomArchivo = cmbCursoTodos.getSelectedItem().toString().replace(",", "_");
            String idcurso = cmbCursoTodos.getSelectedItem().toString().substring(0, 3);
            String nomcurso = cmbCursoTodos.getSelectedItem().toString().replace(idcurso + ",", "");
            try {
                ficheroPdf = new FileOutputStream("C:\\Users\\s_dbz\\AppData\\Local\\Temp\\notas" + nomArchivo + String.valueOf(cmbSemestreTodos.getSelectedIndex()+1) + ".pdf");
                //ficheroPdf = new FileOutputStream("C:\\Users\\%USERNAME%\\Desktop\\" + nomArchivo + ".pdf");
                PdfWriter.getInstance(
                        documento,
                        ficheroPdf
                ).setInitialLeading(20);

                documento.open();
                Font fuente = new Font();
                String imageUrl = "http://www.fundacioncondell.cl/images/noticias/plynch/22.jpg";
                Image foto = Image.getInstance(new URL(imageUrl));
                foto.scaleToFit(100, 100);
                foto.setAbsolutePosition(0f, 750f);
                foto.setAlignment(Chunk.ALIGN_LEFT);
                documento.add(foto);
                //Titulo//
                fuente.setSize(18);
                fuente.setStyle(Font.BOLD);
                Paragraph parrafoTitulo = new Paragraph("Informe de Notas " + idcurso, fuente);
                parrafoTitulo.setAlignment(1);
                documento.add(parrafoTitulo);
                Paragraph parrafoTitulo2 = new Paragraph(nomcurso, fuente);
                parrafoTitulo2.setAlignment(1);
                documento.add(parrafoTitulo2);
                Paragraph parrafoTitulo3 = new Paragraph("Semestre N°"+String.valueOf(cmbSemestreTodos.getSelectedIndex()+1), fuente);
                parrafoTitulo3.setAlignment(1);
                documento.add(parrafoTitulo3);
                documento.add(new Paragraph(" "));
                
                fuente.setStyle(Font.NORMAL);
                fuente.setSize(12);
                PdfPTable tabla = new PdfPTable(3);
                try{
                    BD.crearConexion();
                    Integer promedio;
                    Integer promedioFinal = 0;
                    Integer contadorPromedio = 0;
                    //Cabecera Tabla//
                    tabla.addCell("Rut");
                    tabla.addCell("Nombre");
                    tabla.addCell("Promedio");
                    //Fin_cabecera//
                    String sql = "SELECT a.rut_alumno, a.nombres, a.ape_paterno, a.ape_materno FROM alumno a, alumno_curso ac WHERE a.rut_alumno = ac.rut_alumno AND ac.id_curso = '"+ idcurso +"'";
                    rs = BD.ejecutarSQLSelect(sql);
                    while (rs.next()){
                        tabla.addCell(rut.formatear(rs.getString("a.rut_alumno")));
                        tabla.addCell(rs.getString("a.nombres")+" "+rs.getString("a.ape_paterno")+" "+rs.getString("a.ape_materno"));
                        sql = "SELECT a.nombre, a.id_asignatura FROM asignatura a, asignatura_curso ac WHERE a.id_asignatura = ac.id_asignatura AND ac.id_curso = '"+  idcurso +"'";
                        rs2 = BD.ejecutarSQLSelect(sql);
                        while (rs2.next()) {
                            promedio = 0;
                            Integer contadorNotas = 0;
                            sql = "SELECT n.nota, e.id_evaluacion FROM notas n, evaluacion e WHERE n.id_evaluacion = e.id_evaluacion AND e.semestre = '" + String.valueOf(cmbSemestreTodos.getSelectedIndex() + 1) + "' AND n.rut_alumno = '" + rs.getString("a.rut_alumno") + "' AND e.id_curso = '" + idcurso + "' AND e.id_asignatura = '" + rs2.getString("a.id_asignatura") + "'";
                            rs3 = BD.ejecutarSQLSelect(sql);
                            while (rs3.next()) {
                                contadorNotas++;
                                promedio = promedio + rs3.getInt("n.nota");
                            }
                            if (contadorNotas > 0) {
                                promedio = promedio / contadorNotas;
                                promedioFinal = promedioFinal + promedio;
                                contadorPromedio++;
                            }
                        }
                        if (contadorPromedio > 0) {
                            promedioFinal = promedioFinal / contadorPromedio;
                            tabla.addCell(String.valueOf(promedioFinal));
                        } else {
                            tabla.addCell("");
                        }
                    }
                    float[] medidaCeldas = {4f,12f,3f};
                    tabla.setWidths(medidaCeldas);
                    documento.add(tabla);
                    documento.close();
                    BD.cerrarConexion();
                }catch(Exception ex) {
                    msj = ex.toString();
                    JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                msj = ex.toString();
                JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnGenerarTodosActionPerformed

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
            java.util.logging.Logger.getLogger(jfNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfNotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGenerarAlu;
    private javax.swing.JButton btnGenerarTodos;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbCursoAlu;
    private javax.swing.JComboBox<String> cmbCursoTodos;
    private javax.swing.JComboBox<String> cmbSemestre;
    private javax.swing.JComboBox<String> cmbSemestreTodos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblInstruccion;
    private javax.swing.JLabel lblInstruccion2;
    private javax.swing.JLabel lblInstruccion3;
    private javax.swing.JLabel lblInstruccion4;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelAlumno;
    private javax.swing.JPanel panelTodos;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}
