package trabajo.Informes;

import clases.Conexion;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.Image;
import java.awt.Toolkit;
import java.io.FileOutputStream;
import java.net.URL;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import trabajo.Rut;

public class jfAlumnos extends javax.swing.JFrame {
    private Rut rut;
    private String rutFormateado;
    private String rutDesformateado;
    private Conexion BD = new Conexion();
    private ResultSet rs;
    private String msj;

    public jfAlumnos() {
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
        lblInstruccion3 = new javax.swing.JLabel();
        panelTodos = new javax.swing.JPanel();
        lblInstruccion2 = new javax.swing.JLabel();
        cmbCursoTodos = new javax.swing.JComboBox<>();
        btnGenerarTodos = new javax.swing.JButton();
        lblInstruccion4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 445));
        setMinimumSize(new java.awt.Dimension(500, 445));
        setPreferredSize(new java.awt.Dimension(500, 445));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(500, 445));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 445));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 445));

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/backward.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/book_add.png"))); // NOI18N
        lblTitulo.setText("Generar informe de Alumno/s");

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

        javax.swing.GroupLayout panelAlumnoLayout = new javax.swing.GroupLayout(panelAlumno);
        panelAlumno.setLayout(panelAlumnoLayout);
        panelAlumnoLayout.setHorizontalGroup(
            panelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlumnoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAlumnoLayout.createSequentialGroup()
                        .addGroup(panelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAlumnoLayout.createSequentialGroup()
                                .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscar))
                            .addComponent(lblInstruccion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(btnGenerarAlu)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAlumnoLayout.createSequentialGroup()
                        .addGroup(panelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAlumnoLayout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtNombre))
                        .addGap(163, 163, 163))))
        );
        panelAlumnoLayout.setVerticalGroup(
            panelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlumnoLayout.createSequentialGroup()
                .addGroup(panelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAlumnoLayout.createSequentialGroup()
                        .addComponent(lblInstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscar)
                            .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelAlumnoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnGenerarAlu)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        lblInstruccion3.setText("Para los alumnos de un curso:");

        panelTodos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblInstruccion2.setText("Si desea el informe de los alumnos de un curso eliga el curso en cuestion:");

        cmbCursoTodos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        btnGenerarTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/accept.png"))); // NOI18N
        btnGenerarTodos.setText("Generar informe");
        btnGenerarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTodosLayout = new javax.swing.GroupLayout(panelTodos);
        panelTodos.setLayout(panelTodosLayout);
        panelTodosLayout.setHorizontalGroup(
            panelTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTodosLayout.createSequentialGroup()
                        .addComponent(cmbCursoTodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGenerarTodos))
                    .addGroup(panelTodosLayout.createSequentialGroup()
                        .addComponent(lblInstruccion2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelTodosLayout.setVerticalGroup(
            panelTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTodosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInstruccion2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbCursoTodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerarTodos))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        lblInstruccion4.setText("Para Alumno en especifico:");

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
                        .addContainerGap(55, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVolver)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblInstruccion3)
                                    .addComponent(lblInstruccion4))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInstruccion4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(panelAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstruccion3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(panelTodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVolver)
                .addContainerGap(52, Short.MAX_VALUE))
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
                    ficheroPdf = new FileOutputStream("C:\\Users\\s_dbz\\AppData\\Local\\Temp\\" + rutPDF + nombreCompleto + ".pdf");
                    PdfWriter.getInstance(
                            documento,
                            ficheroPdf
                    ).setInitialLeading(20);
                } catch (Exception ex) {
                    msj = ex.toString();
                    JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
                }
                try {
                    sql = "SELECT a.rut_alumno, a.nombres, a.ape_paterno, a.ape_materno, a.fecha_Nacimiento, a.sexo, a.direccion, a.religion, c.nombre, a.nacionalidad, a.transporte, a.num_hermanos, a.posicion_hermanos, a.colegio_procedencia FROM alumno a, comuna c WHERE c.id_comuna = a.id_comuna AND a.rut_alumno = '"+ rutDesformateado +"'";
                    rs = BD.ejecutarSQLSelect(sql);
                    if (rs.next()){
                        documento.open();
                        Font fuente= new Font();
                        String imageUrl = "http://www.fundacioncondell.cl/images/noticias/plynch/22.jpg";
                        Image foto = Image.getInstance(new URL(imageUrl));
                        foto.scaleToFit(100, 100);
                        foto.setAbsolutePosition(0f, 750f);
                        foto.setAlignment(Chunk.ALIGN_LEFT);
                        documento.add(foto);
                        //Titulo//
                        fuente.setSize(18);
                        fuente.setStyle(Font.BOLD);
                        Paragraph parrafoTitulo = new Paragraph("Informe del alumno",fuente);
                        parrafoTitulo.setAlignment(1);
                        documento.add(parrafoTitulo);
                        documento.add(new Paragraph(" "));
                        //Titulo Parrafo 1//
                        fuente.setStyle(Font.BOLD);
                        fuente.setSize(14);
                        documento.add(new Paragraph("IDENTIFICACION DEL ALUMNO", fuente));
                        //Datos//
                        fuente.setStyle(Font.NORMAL);
                        fuente.setSize(12);
                        documento.add(new Paragraph("NOMBRE                                                     :"+rs.getString("a.nombres")+" "+rs.getString("a.ape_paterno")+" "+rs.getString("a.ape_materno"), fuente));
                        documento.add(new Paragraph("RUT                                                             :"+rs.getString("a.rut_alumno"), fuente));
                        documento.add(new Paragraph("FECHA DE NACIMIENTO                           :"+rs.getString("a.fecha_nacimiento"), fuente));
                        documento.add(new Paragraph("SEXO                                                           :"+rs.getString("a.sexo"), fuente));
                        documento.add(new Paragraph("RELIGION                                                    :"+rs.getString("a.religion"), fuente));
                        documento.add(new Paragraph("DIRECCION                                                 :"+rs.getString("a.direccion"), fuente));
                        documento.add(new Paragraph("COMUNA                                                     :"+rs.getString("c.nombre"), fuente));
                        documento.add(new Paragraph("NACIONALIDAD                                          :"+rs.getString("a.nacionalidad"), fuente));
                        documento.add(new Paragraph("TRANSPORTE                                             :"+rs.getString("a.transporte"), fuente));
                        documento.add(new Paragraph("NUM. HERMANOS                                      :"+rs.getString("a.num_hermanos"), fuente));
                        documento.add(new Paragraph("POS. HERMANDAD                                    :"+rs.getString("a.posicion_hermanos"), fuente));
                        documento.add(new Paragraph("COLEGIO PROCEDENCIA                         :"+rs.getString("a.colegio_procedencia"), fuente));
                        documento.add(new Paragraph(" "));
                        
                        Integer contador=1;
                        sql = "SELECT rpa.parentesco, p.rut_persona, p.nombres, p.ape_paterno, p.ape_materno, p.fecha_nacimiento, p.sexo, p.direccion, c.nombre, p.nacionalidad, p.fono, p.celular, p.ocupacion, p.nivel_educacion FROM persona p, relacion_persona_alumno rpa, comuna c WHERE rpa.rut_persona = p.rut_persona AND rpa.rut_alumno = '"+ rutDesformateado +"' AND rpa.apoderado = 's' AND c.id_comuna = p.id_comuna";
                        rs = BD.ejecutarSQLSelect(sql);
                        while (rs.next()){
                            //Titulo Parrafo 2//
                            fuente.setStyle(Font.BOLD);
                            fuente.setSize(14);
                            documento.add(new Paragraph("IDENTIFICACION DEL APODERADO "+contador.toString(), fuente));
                            //Datos//
                            fuente.setStyle(Font.NORMAL);
                            fuente.setSize(12);
                            documento.add(new Paragraph("PARENTESCO                                            :"+rs.getString("rpa.parentesco"), fuente));
                            documento.add(new Paragraph("NOMBRE                                                     :"+rs.getString("p.nombres")+" "+rs.getString("p.ape_paterno")+" "+rs.getString("p.ape_materno"), fuente));
                            documento.add(new Paragraph("RUT                                                             :"+rs.getString("p.rut_persona"), fuente));
                            documento.add(new Paragraph("FECHA DE NACIMIENTO                           :"+rs.getString("p.fecha_nacimiento"), fuente));
                            documento.add(new Paragraph("SEXO                                                           :"+rs.getString("p.sexo"), fuente));
                            documento.add(new Paragraph("DIRECCION                                                 :"+rs.getString("p.direccion"), fuente));
                            documento.add(new Paragraph("COMUNA                                                     :"+rs.getString("c.nombre"), fuente));
                            documento.add(new Paragraph("NACIONALIDAD                                          :"+rs.getString("p.nacionalidad"), fuente));
                            documento.add(new Paragraph("FONO                                                          :"+rs.getString("p.fono"), fuente));
                            documento.add(new Paragraph("CELULAR                                                    :"+rs.getString("p.celular"), fuente));
                            documento.add(new Paragraph("OCUPACION                                               :"+rs.getString("p.ocupacion"), fuente));
                            documento.add(new Paragraph("NIVEL DE EDUCACION                              :"+rs.getString("p.nivel_educacion"), fuente));
                            documento.add(new Paragraph(" "));
                            contador ++;
                        }
                        documento.close();
                    }
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
                    String sql = "SELECT nombres, ape_paterno, ape_materno FROM alumno WHERE rut_alumno = '"+ rutDesformateado +"'";
                    rs = BD.ejecutarSQLSelect(sql);
                    if (rs.next()) {
                        txtNombre.setText(rs.getString("nombres")+" "+rs.getString("ape_paterno")+" "+rs.getString("ape_materno"));
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
                ficheroPdf = new FileOutputStream("C:\\Users\\s_dbz\\AppData\\Local\\Temp\\" + nomArchivo + ".pdf");
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
                Paragraph parrafoTitulo = new Paragraph("Informe del Curso " + idcurso, fuente);
                parrafoTitulo.setAlignment(1);
                documento.add(parrafoTitulo);
                Paragraph parrafoTitulo2 = new Paragraph(nomcurso, fuente);
                parrafoTitulo2.setAlignment(1);
                documento.add(parrafoTitulo2);
                documento.add(new Paragraph(" "));
                //Titulo Parrafo 1//
                fuente.setStyle(Font.BOLD);
                fuente.setSize(14);
                documento.add(new Paragraph("Lista de Alumnos", fuente));
                //Datos//
                fuente.setStyle(Font.NORMAL);
                fuente.setSize(12);
                try {
                    BD.crearConexion();
                    Integer contador = 1;
                    String sql = "SELECT a.rut_alumno, a.nombres, a.ape_paterno, a.ape_materno FROM alumno a, alumno_curso ac WHERE ac.id_curso = '"+ idcurso +"' AND a.rut_alumno = ac.rut_alumno ORDER BY nombres asc, ape_paterno asc, ape_materno asc";
                    rs = BD.ejecutarSQLSelect(sql);
                    while (rs.next()) {
                        documento.add(new Paragraph(contador + "    " + rs.getString("a.rut_alumno")+"    "+rs.getString("a.nombres") + " " + rs.getString("a.ape_paterno") + " " + rs.getString("a.ape_materno"),fuente));
                        contador ++;
                    }
                    BD.cerrarConexion();
                }catch(Exception ex) {
                    msj = ex.toString();
                    JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
                }
                documento.add(new Paragraph(" "));
                //Titulo Parrafo 2//
                fuente.setStyle(Font.BOLD);
                fuente.setSize(14);
                documento.add(new Paragraph("Observaciones", fuente));
                //Datos//
                fuente.setStyle(Font.NORMAL);
                fuente.setSize(12);
                try {
                    BD.crearConexion();
                    String sql = "SELECT observaciones FROM curso WHERE id_curso = '"+ idcurso +"'";
                    rs = BD.ejecutarSQLSelect(sql);
                    if (rs.next()) {
                        documento.add(new Paragraph(rs.getString("observaciones"),fuente));
                    }
                    BD.cerrarConexion();
                }catch(Exception ex) {
                    msj = ex.toString();
                    JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
                }
                    
                documento.close();
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
    private javax.swing.JButton btnGenerarAlu;
    private javax.swing.JButton btnGenerarTodos;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbCursoTodos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblInstruccion;
    private javax.swing.JLabel lblInstruccion2;
    private javax.swing.JLabel lblInstruccion3;
    private javax.swing.JLabel lblInstruccion4;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelAlumno;
    private javax.swing.JPanel panelTodos;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}
