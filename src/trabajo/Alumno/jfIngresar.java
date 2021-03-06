package trabajo.Alumno;

import clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import clases.Rut;

public class jfIngresar extends javax.swing.JFrame {

    private String msj;
    private Conexion BD = new Conexion();
    private Rut rut;
    private String rutFormateado;
    private String rutDesformateado;

    public jfIngresar() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/book_add.png"));
        setIconImage(icon);
        initComponents();
        this.jPanel1.setVisible(true);
        this.setLocationRelativeTo(null); //CENTRAR EN LA PANTALLA
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lbl_Nombre = new javax.swing.JLabel();
        lbl_ApePat = new javax.swing.JLabel();
        lbl_ApeMat = new javax.swing.JLabel();
        lbl_Rut = new javax.swing.JLabel();
        lbl_Direccion = new javax.swing.JLabel();
        jNombre = new javax.swing.JTextField();
        jApePat = new javax.swing.JTextField();
        jApeMat = new javax.swing.JTextField();
        jRut = new javax.swing.JTextField();
        jDir = new javax.swing.JTextField();
        lbl_FechaNac = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        lbl_Sexo = new javax.swing.JLabel();
        cmbSexo = new javax.swing.JComboBox<>();
        lbl_Religion = new javax.swing.JLabel();
        jReligion = new javax.swing.JTextField();
        lbl_Comuna = new javax.swing.JLabel();
        lbl_Nacionalidad = new javax.swing.JLabel();
        jNacionalidad = new javax.swing.JTextField();
        lbl_Nacionalidad1 = new javax.swing.JLabel();
        cmbComuna = new javax.swing.JComboBox<>();
        lbl_Folio = new javax.swing.JLabel();
        jFolio = new javax.swing.JTextField();
        cmbDia = new javax.swing.JComboBox<>();
        cmbMes = new javax.swing.JComboBox<>();
        jAño = new javax.swing.JTextField();
        lblNombre10 = new javax.swing.JLabel();
        cmbNumHermanos = new javax.swing.JComboBox<>();
        lblNombre11 = new javax.swing.JLabel();
        cmbPosHermanos = new javax.swing.JComboBox<>();
        btnFinalizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        cmbTransporte = new javax.swing.JComboBox<>();
        lbl_Nacionalidad2 = new javax.swing.JLabel();
        jColegioProcedencia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 510));
        setMinimumSize(new java.awt.Dimension(600, 510));
        setPreferredSize(new java.awt.Dimension(600, 510));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 510));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 510));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 510));

        lblTitulo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/group_add.png"))); // NOI18N
        lblTitulo.setText("Ingreso de Alumnos");

        lbl_Nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Nombre.setText("Nombre: *");

        lbl_ApePat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_ApePat.setText("Apellido Paterno: *");

        lbl_ApeMat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_ApeMat.setText("Apellido Materno:");

        lbl_Rut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Rut.setText("Rut: *");

        lbl_Direccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Direccion.setText("Direccion: *");

        jRut.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jRutFocusLost(evt);
            }
        });

        lbl_FechaNac.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_FechaNac.setText("Fecha de Nac.: *");

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/backward.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lbl_Sexo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Sexo.setText("Sexo: *");

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        lbl_Religion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Religion.setText("Religion: *");

        lbl_Comuna.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Comuna.setText("Comuna: *");

        lbl_Nacionalidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Nacionalidad.setText("Pais Nacionalidad: *");

        jNacionalidad.setText("Chile");

        lbl_Nacionalidad1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Nacionalidad1.setText("Transporte:");

        cmbComuna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01:Valparaiso", "02:Viña del mar", "03:Quilpue", "04:Villa Alemana", "05:Olmué", "06:Limache", "07:Quintero", "08:Concón", "09:Puchuncaví", "10:Juan Fernández", "11:Casablanca", "12:Santa María", "13:San Felipe", "14:Putaendo", "15:Panquehue", "16:Llay-Llay", "17:Catemu", "18:Santo Domingo", "19:San Antonio", "20:El Tabo", "21:El Quisco", "22:Cartagena", "23:Algarrobo", "24:Quillota", "25:Nogales", "26:La Cruz", "27:La Calera", "28:Hijuelas", "29:Zapallar", "30:Petorca", "31:Papudo", "32:La Ligua", "33:Cabildo", "34:San Esteban", "35:Rinconada", "36:Los Andes", "37:Calle Larga", "38:Isla de Pascua" }));

        lbl_Folio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Folio.setText("Nº de Folio: *");

        jFolio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFolioFocusLost(evt);
            }
        });
        jFolio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFolioKeyTyped(evt);
            }
        });

        cmbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cmbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        jAño.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jAñoFocusLost(evt);
            }
        });
        jAño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jAñoKeyTyped(evt);
            }
        });

        lblNombre10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombre10.setText("N° de Hermanos:");

        cmbNumHermanos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        lblNombre11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombre11.setText("Posicion en la Hermandad:");

        cmbPosHermanos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        btnFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disk.png"))); // NOI18N
        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar campos");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        cmbTransporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Locomocion Colectiva", "Vehiculo Personal", "Otro" }));

        lbl_Nacionalidad2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Nacionalidad2.setText("Colegio de procedencia:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(lbl_Nombre))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblTitulo)))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimpiar)
                            .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombre10)
                                    .addComponent(lblNombre11))
                                .addGap(70, 70, 70)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbNumHermanos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cmbPosHermanos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFinalizar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_ApeMat)
                                    .addComponent(lbl_ApePat)
                                    .addComponent(lbl_Rut)
                                    .addComponent(lbl_Comuna)
                                    .addComponent(lbl_Direccion))
                                .addGap(91, 91, 91)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRut, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jApePat, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jApeMat, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_FechaNac)
                                    .addComponent(lbl_Religion)
                                    .addComponent(lbl_Sexo))
                                .addGap(102, 102, 102)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jReligion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jAño, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_Nacionalidad1)
                                    .addComponent(lbl_Nacionalidad)
                                    .addComponent(lbl_Nacionalidad2)
                                    .addComponent(lbl_Folio))
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jColegioProcedencia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblTitulo)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Nombre)
                    .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_ApePat)
                    .addComponent(jApePat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_ApeMat)
                    .addComponent(jApeMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Rut)
                    .addComponent(jRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Comuna)
                    .addComponent(cmbComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Direccion)
                    .addComponent(jDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_FechaNac)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Religion)
                    .addComponent(jReligion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Sexo)
                    .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Nacionalidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Nacionalidad1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jColegioProcedencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Nacionalidad2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_Folio)
                    .addComponent(jFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre10)
                            .addComponent(cmbNumHermanos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombre11)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbPosHermanos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFinalizar)))
                .addGap(50, 50, 50))
        );

        cmbSexo.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        if (jRut.getText().equals("") || jNombre.getText().equals("") || jApePat.getText().equals("") || jDir.getText().equals("") || jAño.getText().equals("") || jReligion.getText().equals("") || jNacionalidad.getText().equals("") || jFolio.getText().equals("")) {
            msj = "Error, No deje ningun campo obligatorio vacio";
            JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String nombre, apeP, apeM, dir, fechaNac, coma, religion, sexo, nacionalidad, transporte, NombreComuna, año, mes, dia, numeroComuna, letra, colegioProcedencia;
            Integer folioMatricula, PosHermano, NumHermano, comuna;
            // Se obtiene nombre apellido paterno, apellido materno, direccion y fecha de nacimiento
            nombre = jNombre.getText();
            apeP = jApePat.getText();
            apeM = jApeMat.getText();
            dir = jDir.getText();
            //FECHA
            año = jAño.getText();
            mes = String.format("%02d", cmbMes.getSelectedIndex() + 1);
            dia = (String) cmbDia.getSelectedItem();
            fechaNac = año + "-" + mes + "-" + dia;

            folioMatricula = Integer.parseInt(jFolio.getText());
            letra = (String) cmbSexo.getSelectedItem();
            sexo = letra.substring(0, 1);
            religion = jReligion.getText();

            // Se obtienen los datos del combobox y se extrae el numero correspondiente al id_comuna
            NombreComuna = (String) cmbComuna.getSelectedItem();
            numeroComuna = NombreComuna.substring(0, 2);
            comuna = Integer.parseInt(numeroComuna);
            nacionalidad = jNacionalidad.getText();
            transporte = (String) cmbTransporte.getSelectedItem();

            PosHermano = Integer.parseInt((String) cmbPosHermanos.getSelectedItem());
            NumHermano = Integer.parseInt((String) cmbNumHermanos.getSelectedItem());
            colegioProcedencia = jColegioProcedencia.getText();
            // Coma designada como variable para facilitar y entender mas la sintaxis de la linea de sql
            coma = "','";
            if (PosHermano > NumHermano) {
                msj = "No puedes estar en una posicion mayor a la de el numero de hermanos";
                JOptionPane.showMessageDialog(null, msj, "Error hermandad", JOptionPane.INFORMATION_MESSAGE);
            } else {

                try {
                    BD.crearConexion();
                    String sql1 = "SELECT * from matricula where folio_matricula = '" + folioMatricula + "'";
                    ResultSet lis = BD.ejecutarSQLSelect(sql1);
                    if (lis.next()) {
                        msj = "Folio existente";
                        JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        //FECHA
                        int year = Integer.parseInt(jAño.getText());
                        int month = cmbMes.getSelectedIndex() + 1;
                        int day = Integer.parseInt((String) cmbDia.getSelectedItem());
                        if (year < 1900) {
                            throw new IllegalArgumentException("Año Invalido");
                        }
                        LocalDate today = LocalDate.of(year, month, day);
                        //FIN-FECHA
                        String sql = "INSERT INTO alumno(rut_alumno,nombres,ape_paterno,ape_materno ,fecha_nacimiento,"
                                + "sexo,direccion,religion,id_comuna,nacionalidad,transporte,num_hermanos,"
                                + "posicion_hermanos," + "colegio_procedencia) VALUES ('" + rutDesformateado + coma + nombre + coma + apeP + coma + apeM + coma + fechaNac + coma + sexo + coma + dir + coma + religion + coma + comuna + coma + nacionalidad + coma + transporte + coma + NumHermano + coma + PosHermano + coma + colegioProcedencia + "')";
                        if (BD.ejecutarSQL(sql)) {
                            msj = "Ingreso de alumno realizado con exito";
                            JOptionPane.showMessageDialog(null, msj, "Exito", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            msj = "Error, rut existente";
                            JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        //año actual
                        Calendar calendario = new GregorianCalendar();
                        int anno = calendario.get(Calendar.YEAR);
                        //
                        String sqlFolio2 = "SELECT * FROM matricula WHERE rut_alumno = '" + rutDesformateado + "' and anno = '" + anno + "'";
                        try {
                            lis = BD.ejecutarSQLSelect(sqlFolio2);
                            if (lis.next()) {
                                msj = "alumno ya tiene folio asociado a ese año";
                                JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
                            } else {
                                sql = "INSERT INTO matricula(folio_matricula,rut_alumno,anno) values ('" + folioMatricula + coma + rutDesformateado + coma + anno + " ')";
                                if (BD.ejecutarSQL(sql)) {
                                    msj = "Ingreso de matricula realizado con exito";
                                    JOptionPane.showMessageDialog(null, msj, "Exito", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    msj = "Error, folio existente";
                                    JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        } catch (Exception e) {
                            msj = "Error, no se pudo ingresar los datos";
                            JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        BD.cerrarConexion();
                    }
                } catch (DateTimeException ex) {
                    msj = "Error, fecha invalida";
                    JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
                } catch (Exception e) {
                    msj = "Error, hubo un problema.";
                    JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        if (BD.getConexion() != null) {
            BD.cerrarConexion();
        }
        this.dispose();
        new jfAlumno().setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void jAñoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jAñoKeyTyped
        //metodo para que no se ingresen letras en el campo jAño
        int k = (int) evt.getKeyChar();
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 241 || k == 209) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 10) {
            jAño.transferFocus();
        }
    }//GEN-LAST:event_jAñoKeyTyped

    private void jAñoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jAñoFocusLost
        try {
            //Objeto con fecha actual
            Calendar calendario = new GregorianCalendar();

            Integer año = Integer.parseInt(jAño.getText());
            Integer añoLimite = (calendario.get(Calendar.YEAR)) - 5;

            if (año < 1900 || año > añoLimite) {
                JOptionPane.showMessageDialog(null, "Año de nacimiento imposible", "Ventana Error Año", JOptionPane.ERROR_MESSAGE);
                jAño.requestFocus();
                jAño.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Año de nacimiento imposible", "Ventana Error Año", JOptionPane.ERROR_MESSAGE);
            jAño.requestFocus();
            jAño.setText("");
        }

    }//GEN-LAST:event_jAñoFocusLost

    private void jFolioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFolioFocusLost
        try {
            String texto = jFolio.getText();
            Integer Numeros = Integer.parseInt(texto);
            if (Numeros < 0 || Numeros > 9999999) {
                JOptionPane.showMessageDialog(null, "Folio imposible", "Ventana Error Año", JOptionPane.ERROR_MESSAGE);
                jFolio.requestFocus();
                jFolio.setText("");
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jFolioFocusLost

    private void jFolioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFolioKeyTyped
        int k = (int) evt.getKeyChar();
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 241 || k == 209) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 10) {
            jAño.transferFocus();
        }
        if (jFolio.getText().length()== 7){evt.consume();}
    }//GEN-LAST:event_jFolioKeyTyped

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        jNombre.setText("");
        jApePat.setText("");
        jApeMat.setText("");
        jRut.setText("");
        jDir.setText("");
        jReligion.setText("");
        jAño.setText("");
        jFolio.setText("");
        cmbComuna.setSelectedIndex(0);
        cmbMes.setSelectedIndex(0);
        cmbDia.setSelectedIndex(0);
        cmbSexo.setSelectedIndex(0);
        cmbNumHermanos.setSelectedIndex(0);
        cmbPosHermanos.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfIngresar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbComuna;
    private javax.swing.JComboBox<String> cmbDia;
    private javax.swing.JComboBox<String> cmbMes;
    private javax.swing.JComboBox<String> cmbNumHermanos;
    private javax.swing.JComboBox<String> cmbPosHermanos;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JComboBox<String> cmbTransporte;
    private javax.swing.JTextField jApeMat;
    private javax.swing.JTextField jApePat;
    private javax.swing.JTextField jAño;
    private javax.swing.JTextField jColegioProcedencia;
    private javax.swing.JTextField jDir;
    private javax.swing.JTextField jFolio;
    private javax.swing.JTextField jNacionalidad;
    private javax.swing.JTextField jNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jReligion;
    private javax.swing.JTextField jRut;
    private javax.swing.JLabel lblNombre10;
    private javax.swing.JLabel lblNombre11;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lbl_ApeMat;
    private javax.swing.JLabel lbl_ApePat;
    private javax.swing.JLabel lbl_Comuna;
    private javax.swing.JLabel lbl_Direccion;
    private javax.swing.JLabel lbl_FechaNac;
    private javax.swing.JLabel lbl_Folio;
    private javax.swing.JLabel lbl_Nacionalidad;
    private javax.swing.JLabel lbl_Nacionalidad1;
    private javax.swing.JLabel lbl_Nacionalidad2;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JLabel lbl_Religion;
    private javax.swing.JLabel lbl_Rut;
    private javax.swing.JLabel lbl_Sexo;
    // End of variables declaration//GEN-END:variables
}
