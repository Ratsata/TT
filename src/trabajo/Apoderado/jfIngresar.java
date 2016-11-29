package trabajo.Apoderado;

import clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import clases.Rut;


public class jfIngresar extends javax.swing.JFrame {
    private Conexion BD = new Conexion();
    private String msj;
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
        jLimpiar = new javax.swing.JButton();
        lbl_Nombre = new javax.swing.JLabel();
        jNombre = new javax.swing.JTextField();
        lbl_ApePat = new javax.swing.JLabel();
        jApePat = new javax.swing.JTextField();
        lbl_ApeMat = new javax.swing.JLabel();
        jApeMat = new javax.swing.JTextField();
        lbl_Rut = new javax.swing.JLabel();
        lbl_Comuna = new javax.swing.JLabel();
        cmbComuna = new javax.swing.JComboBox<>();
        lbl_Direccion = new javax.swing.JLabel();
        jDir = new javax.swing.JTextField();
        lbl_FechaNac = new javax.swing.JLabel();
        lbl_Sexo = new javax.swing.JLabel();
        cmbSexo = new javax.swing.JComboBox<>();
        lbl_Nacionalidad = new javax.swing.JLabel();
        jNacionalidad = new javax.swing.JTextField();
        jOcupacion = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        lbl_celular = new javax.swing.JLabel();
        lbl_Fono = new javax.swing.JLabel();
        lbl_Ocupacion1 = new javax.swing.JLabel();
        jPrefijoCelu = new javax.swing.JTextField();
        jCelular = new javax.swing.JTextField();
        cmbPrefijo = new javax.swing.JComboBox<>();
        jFono = new javax.swing.JTextField();
        jAño = new javax.swing.JTextField();
        cmbDia = new javax.swing.JComboBox<>();
        cmbMes = new javax.swing.JComboBox<>();
        lbl_Fono1 = new javax.swing.JLabel();
        cmbNivelEducacion = new javax.swing.JComboBox<>();
        jRut = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(590, 550));
        setMinimumSize(new java.awt.Dimension(590, 550));
        setPreferredSize(new java.awt.Dimension(590, 550));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(590, 550));
        jPanel1.setMinimumSize(new java.awt.Dimension(590, 550));
        jPanel1.setPreferredSize(new java.awt.Dimension(590, 550));

        lblTitulo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/group_add.png"))); // NOI18N
        lblTitulo.setText("Ingreso de Apoderado");

        jLimpiar.setText("Limpiar campos");
        jLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimpiarActionPerformed(evt);
            }
        });

        lbl_Nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Nombre.setText("Nombre: *");

        lbl_ApePat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_ApePat.setText("Apellido Paterno: *");

        jApePat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                none(evt);
            }
        });

        lbl_ApeMat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_ApeMat.setText("Apellido Materno:");

        lbl_Rut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Rut.setText("Rut: *");

        lbl_Comuna.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Comuna.setText("Comuna: *");

        cmbComuna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01:Valparaiso", "02:Viña del mar", "03:Quilpue", "04:Villa Alemana", "05:Olmué", "06:Limache", "07:Quintero", "08:Concón", "09:Puchuncaví", "10:Juan Fernández", "11:Casablanca", "12:Santa María", "13:San Felipe", "14:Putaendo", "15:Panquehue", "16:Llay-Llay", "17:Catemu", "18:Santo Domingo", "19:San Antonio", "20:El Tabo", "21:El Quisco", "22:Cartagena", "23:Algarrobo", "24:Quillota", "25:Nogales", "26:La Cruz", "27:La Calera", "28:Hijuelas", "29:Zapallar", "30:Petorca", "31:Papudo", "32:La Ligua", "33:Cabildo", "34:San Esteban", "35:Rinconada", "36:Los Andes", "37:Calle Larga", "38:Isla de Pascua" }));

        lbl_Direccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Direccion.setText("Direccion: *");

        lbl_FechaNac.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_FechaNac.setText("Fecha de Nac.: *");

        lbl_Sexo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Sexo.setText("Sexo: *");

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        lbl_Nacionalidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Nacionalidad.setText("Nacionalidad: *");

        jNacionalidad.setText("Chile");

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/backward.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disk.png"))); // NOI18N
        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        lbl_celular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_celular.setText("Celular:");

        lbl_Fono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Fono.setText("Nivel de educacion:");

        lbl_Ocupacion1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Ocupacion1.setText("Ocupación:");

        jPrefijoCelu.setText("+569");
        jPrefijoCelu.setEnabled(false);

        jCelular.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCelularFocusLost(evt);
            }
        });
        jCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jCelularKeyTyped(evt);
            }
        });

        cmbPrefijo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "32", "2", "33", "34", "35", "39", "41", "42", "43", "44", "45", "51", "52", "53", "55", "57", "58", "61", "63", "64", "65", "67", "71", "72", "73", "75" }));

        jFono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFonoFocusLost(evt);
            }
        });
        jFono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFonoKeyTyped(evt);
            }
        });

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

        cmbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cmbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        lbl_Fono1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Fono1.setText("Telefono Fijo:");

        cmbNivelEducacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Media Completa", "Superior Completa", "Superior Incompleta", "Media Incompleta", "Basica Completa", "Basica Incompleta", "Preescolar Completa", "Preescolar Incompleta" }));

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
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Nacionalidad)
                    .addComponent(lbl_Ocupacion1))
                .addGap(130, 130, 130)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPrefijoCelu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbPrefijo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFono, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblTitulo)
                        .addGap(38, 38, 38)
                        .addComponent(jLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(lbl_Rut)
                        .addGap(182, 182, 182)
                        .addComponent(jRut, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lbl_Comuna)
                        .addGap(153, 153, 153)
                        .addComponent(cmbComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lbl_Direccion)
                        .addGap(149, 149, 149)
                        .addComponent(jDir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Nombre)
                            .addComponent(lbl_ApePat)
                            .addComponent(lbl_ApeMat))
                        .addGap(105, 105, 105)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jApeMat, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jApePat, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_celular)
                            .addComponent(lbl_Fono1)
                            .addComponent(lbl_Fono, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(btnVolver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnFinalizar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(cmbNivelEducacion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_FechaNac)
                            .addComponent(lbl_Sexo))
                        .addGap(119, 119, 119)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jAño, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(114, 114, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLimpiar)))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lbl_Nombre))
                    .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ApePat)
                    .addComponent(jApePat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ApeMat)
                    .addComponent(jApeMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Rut)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Comuna)
                    .addComponent(cmbComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Direccion)
                    .addComponent(jDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_FechaNac)
                    .addComponent(jAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbl_Sexo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Nacionalidad))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Ocupacion1)
                    .addComponent(jOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_celular)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jPrefijoCelu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbl_Fono1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbPrefijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_Fono)
                    .addComponent(cmbNivelEducacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnFinalizar))
                .addGap(17, 17, 17))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 590, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAñoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jAñoKeyTyped
        //metodo para que no se ingresen letras en el campo jAño
        int k=(int)evt.getKeyChar();
        if (k >= 97 && k <= 122 || k>=65 && k<=90){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"No puede ingresar letras!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
        if(k==241 || k==209){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"No puede ingresar letras!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
        if(k==10){
            jAño.transferFocus();
        }
    }//GEN-LAST:event_jAñoKeyTyped

    private void jAñoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jAñoFocusLost
        try{
            //Objeto con fecha actual
            Calendar calendario = new GregorianCalendar();

            Integer año = Integer.parseInt(jAño.getText());
            Integer añoLimite = (calendario.get(Calendar.YEAR)) - 5;

            if (año<1900 || año>añoLimite) {
                JOptionPane.showMessageDialog(null,"Año de nacimiento imposible","Ventana Error Año",JOptionPane.ERROR_MESSAGE);
                jAño.requestFocus();
                jAño.setText("");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Año de nacimiento imposible","Ventana Error Año",JOptionPane.ERROR_MESSAGE);
            jAño.requestFocus();
            jAño.setText("");
        }
    }//GEN-LAST:event_jAñoFocusLost

    private void jFonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFonoKeyTyped
        int k=(int)evt.getKeyChar();
        if (k >= 97 && k <= 122 || k>=65 && k<=90){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"No puede ingresar letras!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
        if(k==241 || k==209){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"No puede ingresar letras!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
        if(k==10){
            jCelular.transferFocus();}
    }//GEN-LAST:event_jFonoKeyTyped

    private void jFonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFonoFocusLost
        String texto = jFono.getText();
        Integer Numeros = Integer.parseInt(texto);
        if (Numeros<1000000 || Numeros>9999999) {
            JOptionPane.showMessageDialog(null,"Fono imposible","Ventana Error Año",JOptionPane.ERROR_MESSAGE);
            jFono.requestFocus();
            jFono.setText("");
        }
    }//GEN-LAST:event_jFonoFocusLost

    private void jCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCelularKeyTyped
        int k=(int)evt.getKeyChar();
        if (k >= 97 && k <= 122 || k>=65 && k<=90){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"No puede ingresar letras!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
        if(k==241 || k==209){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"No puede ingresar letras!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
        if(k==10){
            jCelular.transferFocus();}
    }//GEN-LAST:event_jCelularKeyTyped

    private void jCelularFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCelularFocusLost
        String texto = jCelular.getText();
        Integer Numeros = Integer.parseInt(texto);
        if (Numeros<10000000 || Numeros>99999999) {
            JOptionPane.showMessageDialog(null,"Celular imposible","Ventana Error Año",JOptionPane.ERROR_MESSAGE);
            jCelular.requestFocus();
            jCelular.setText("");
        }
    }//GEN-LAST:event_jCelularFocusLost

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        BD.crearConexion();

        if (jRut.getText().equals("") || jNombre.getText().equals("") || jApePat.getText().equals("") || jDir.getText().equals("") || jAño.getText().equals("") ||  jNacionalidad.getText().equals("") ){
                msj="Error, No deje ningun campo obligatorio vacio";
                JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);
            }else{

                String nombre,apeP,apeM,dir,fechaNac,coma,sexo,nacionalidad,NombreComuna,año,mes,dia,numeroComuna,letra,fono,celular,fonoFinal,celuFinal,ocupacion,nivelEducacion;
                Integer comuna;
                // Se obtiene nombre apellido paterno, apellido materno, direccion y fecha de nacimiento
                nombre = jNombre.getText();
                apeP = jApePat.getText();
                apeM = jApeMat.getText();
                dir = jDir.getText();
                
                año = jAño.getText();
                mes = String.format("%02d", cmbMes.getSelectedIndex()+1);
                dia = (String)cmbDia.getSelectedItem();
                fechaNac = año + "-" + mes + "-" + dia;  
                
                letra = (String)cmbSexo.getSelectedItem();
                sexo = letra.substring(0,1);
                // Se obtienen los datos del combobox y se extrae el numero correspondiente al id_comuna
                NombreComuna = (String)cmbComuna.getSelectedItem();
                numeroComuna = NombreComuna.substring(0,2);
                comuna = Integer.parseInt(numeroComuna);
                nacionalidad = jNacionalidad.getText();
                letra = (String)cmbSexo.getSelectedItem();
                sexo = letra.substring(0,1);
                fono = jFono.getText();
                celular = jCelular.getText();
                celuFinal =  jPrefijoCelu.getText() + celular;
                fonoFinal = cmbPrefijo.getSelectedItem() + fono;
                ocupacion = jOcupacion.getText();
                nivelEducacion = (String)cmbNivelEducacion.getSelectedItem();
                
                coma = "','";
                
                //FECHA
                try{
                    int year = Integer.parseInt(jAño.getText());
                    int month = cmbMes.getSelectedIndex() + 1;
                    String cmbD = (String)cmbDia.getSelectedItem();
                    int day = Integer.parseInt(cmbD);
                    if (year <1900){
                        throw new IllegalArgumentException("Año Invalido");
                    }
                    LocalDate today = LocalDate.of(year,month,day);
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
                    //FIN-FECHA
                    String sql = "INSERT INTO persona(rut_persona,nombres,ape_paterno,ape_materno ,fecha_nacimiento,"
                        + "sexo,direccion,id_comuna,nacionalidad,fono,celular,ocupacion,nivel_educacion) VALUES ('"+ rutDesformateado +coma+ nombre+coma+apeP+coma+apeM+coma+fechaNac+coma+sexo+coma+dir+coma+comuna+coma+nacionalidad+coma+fonoFinal+coma+celuFinal+coma+ocupacion+coma+nivelEducacion+"')";
                    if(BD.ejecutarSQL(sql)){
                        msj="Ingreso de persona realizado con exito";
                        JOptionPane.showMessageDialog(null,msj,"Exito",JOptionPane.INFORMATION_MESSAGE);   
                    }else{
                        msj="Error, rut existente";
                        JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);
                    }
                }catch (Exception e){
                    msj="Error, no se pudo ingresar los datos";
                    JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);
                }
        }

                
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        if (BD.getConexion() != null)
        {BD.cerrarConexion();}
        this.dispose();
        new jfApoderado().setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void jLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimpiarActionPerformed
        jNombre.setText("");
        jApePat.setText("");
        jApeMat.setText("");
        jRut.setText("");
        jDir.setText("");
        jAño.setText("");
        jOcupacion.setText("");
        jCelular.setText("");
        jFono.setText("");
        cmbComuna.setSelectedIndex(0);
        cmbMes.setSelectedIndex(0);
        cmbDia.setSelectedIndex(0);
        cmbSexo.setSelectedIndex(0);
        cmbPrefijo.setSelectedIndex(0);
        cmbNivelEducacion.setSelectedIndex(0);
        
    }//GEN-LAST:event_jLimpiarActionPerformed

    private void none(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_none
        // TODO add your handling code here:
    }//GEN-LAST:event_none

    private void jRutFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jRutFocusLost
        try{
            rutFormateado = rut.formatear(jRut.getText());
            if (rut.validar(rutFormateado) == false){
                JOptionPane.showMessageDialog(null,"Rut incorrecto","Ventana Error Rut",JOptionPane.ERROR_MESSAGE);
                jRut.setText("");
            }else{
                rutDesformateado = rut.desformatear(rutFormateado);
                jRut.setText(rutFormateado);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Mal formato de rut","Ventana Error Rut",JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbComuna;
    private javax.swing.JComboBox<String> cmbDia;
    private javax.swing.JComboBox<String> cmbMes;
    private javax.swing.JComboBox<String> cmbNivelEducacion;
    private javax.swing.JComboBox<String> cmbPrefijo;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JTextField jApeMat;
    private javax.swing.JTextField jApePat;
    private javax.swing.JTextField jAño;
    private javax.swing.JTextField jCelular;
    private javax.swing.JTextField jDir;
    private javax.swing.JTextField jFono;
    private javax.swing.JButton jLimpiar;
    private javax.swing.JTextField jNacionalidad;
    private javax.swing.JTextField jNombre;
    private javax.swing.JTextField jOcupacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jPrefijoCelu;
    private javax.swing.JTextField jRut;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lbl_ApeMat;
    private javax.swing.JLabel lbl_ApePat;
    private javax.swing.JLabel lbl_Comuna;
    private javax.swing.JLabel lbl_Direccion;
    private javax.swing.JLabel lbl_FechaNac;
    private javax.swing.JLabel lbl_Fono;
    private javax.swing.JLabel lbl_Fono1;
    private javax.swing.JLabel lbl_Nacionalidad;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JLabel lbl_Ocupacion1;
    private javax.swing.JLabel lbl_Rut;
    private javax.swing.JLabel lbl_Sexo;
    private javax.swing.JLabel lbl_celular;
    // End of variables declaration//GEN-END:variables
}
