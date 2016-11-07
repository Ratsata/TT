package trabajo.Apoderado;

import clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import trabajo.Rut;

public class jfModificar extends javax.swing.JFrame {

    private Conexion BD = new Conexion();
    private String msj;
    
    public jfModificar() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/book_edit.png"));
        setIconImage(icon);
        initComponents();
        this.jPanel1.setVisible(true);
        this.setLocationRelativeTo(null); //CENTRAR EN LA PANTALLA
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_Nombre = new javax.swing.JLabel();
        jNombre = new javax.swing.JTextField();
        lbl_ApePat = new javax.swing.JLabel();
        jApePat = new javax.swing.JTextField();
        lbl_ApeMat = new javax.swing.JLabel();
        jApeMat = new javax.swing.JTextField();
        lbl_Comuna = new javax.swing.JLabel();
        cmbComuna = new javax.swing.JComboBox<>();
        lbl_Direccion = new javax.swing.JLabel();
        jDir = new javax.swing.JTextField();
        lbl_FechaNac = new javax.swing.JLabel();
        jAño = new javax.swing.JTextField();
        cmbDia = new javax.swing.JComboBox<>();
        cmbMes = new javax.swing.JComboBox<>();
        cmbSexo = new javax.swing.JComboBox<>();
        lbl_Sexo = new javax.swing.JLabel();
        lbl_Nacionalidad = new javax.swing.JLabel();
        jNacionalidad = new javax.swing.JTextField();
        lbl_Ocupacion = new javax.swing.JLabel();
        jOcupacion = new javax.swing.JTextField();
        lbl_celular = new javax.swing.JLabel();
        lbl_Fono = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        jLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        lblTitulo1 = new javax.swing.JLabel();
        jExiste = new javax.swing.JLabel();
        jCelular = new javax.swing.JTextField();
        jFono = new javax.swing.JTextField();
        cmbPrefijo = new javax.swing.JComboBox<>();
        jPrefijoCelu = new javax.swing.JTextField();
        jRutModi = new javax.swing.JTextField();
        lbl_Fono1 = new javax.swing.JLabel();
        cmbNivelEducacion = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(600, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 600));

        lbl_Nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Nombre.setText("Nombre: ");

        lbl_ApePat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_ApePat.setText("Apellido Paterno:");

        lbl_ApeMat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_ApeMat.setText("Apellido Materno:");

        lbl_Comuna.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Comuna.setText("Comuna:");

        cmbComuna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01:Valparaiso", "02:Viña del mar", "03:Quilpue", "04:Villa Alemana", "05:Olmué", "06:Limache", "07:Quintero", "08:Concón", "09:Puchuncaví", "10:Juan Fernández", "11:Casablanca", "12:Santa María", "13:San Felipe", "14:Putaendo", "15:Panquehue", "16:Llay-Llay", "17:Catemu", "18:Santo Domingo", "19:San Antonio", "20:El Tabo", "21:El Quisco", "22:Cartagena", "23:Algarrobo", "24:Quillota", "25:Nogales", "26:La Cruz", "27:La Calera", "28:Hijuelas", "29:Zapallar", "30:Petorca", "31:Papudo", "32:La Ligua", "33:Cabildo", "34:San Esteban", "35:Rinconada", "36:Los Andes", "37:Calle Larga", "38:Isla de Pascua" }));

        lbl_Direccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Direccion.setText("Direccion:");

        lbl_FechaNac.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_FechaNac.setText("Fecha de Nac.:");

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

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        lbl_Sexo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Sexo.setText("Sexo:");

        lbl_Nacionalidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Nacionalidad.setText("Nacionalidad:");

        lbl_Ocupacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Ocupacion.setText("Ocupación:");

        lbl_celular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_celular.setText("Celular:");

        lbl_Fono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Fono.setText("Telefono Fijo:");

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

        jLimpiar.setText("Limpiar campos");
        jLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimpiarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Rut del apoderad a modificar:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblTitulo1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblTitulo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/group_edit.png"))); // NOI18N
        lblTitulo1.setText("Modificar Apoderado");

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

        cmbPrefijo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "32", "2", "33", "34", "35", "39", "41", "42", "43", "44", "45", "51", "52", "53", "55", "57", "58", "61", "63", "64", "65", "67", "71", "72", "73", "75" }));

        jPrefijoCelu.setText("+569");
        jPrefijoCelu.setEnabled(false);

        jRutModi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jRutModiFocusLost(evt);
            }
        });
        jRutModi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRutModiActionPerformed(evt);
            }
        });
        jRutModi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRutModiKeyPressed(evt);
            }
        });

        lbl_Fono1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Fono1.setText("Nivel de educacion:");

        cmbNivelEducacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Media Completa", "Superior Completa", "Superior Incompleta", "Media Incompleta", "Basica Completa", "Basica Incompleta", "Preescolar Completa", "Preescolar Incompleta" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTitulo1)
                                .addGap(18, 18, 18)
                                .addComponent(jExiste, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRutModi, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_Fono1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(cmbNivelEducacion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_Sexo)
                                        .addGap(169, 169, 169)
                                        .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_Direccion)
                                        .addGap(144, 144, 144)
                                        .addComponent(jDir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_FechaNac)
                                        .addGap(114, 114, 114)
                                        .addComponent(jAño, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLimpiar)
                                        .addGap(40, 40, 40)
                                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnFinalizar))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_ApePat)
                                            .addComponent(lbl_Nombre))
                                        .addGap(103, 103, 103)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jApePat, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_Nacionalidad)
                                            .addComponent(lbl_Ocupacion)
                                            .addComponent(lbl_celular)
                                            .addComponent(lbl_Fono))
                                        .addGap(123, 123, 123)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPrefijoCelu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbPrefijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jFono, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_ApeMat)
                                            .addComponent(lbl_Comuna))
                                        .addGap(101, 101, 101)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jApeMat, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitulo1)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jExiste, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar)
                            .addComponent(jRutModi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Nombre)
                    .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_ApePat)
                    .addComponent(jApePat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_ApeMat)
                    .addComponent(jApeMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Comuna)
                    .addComponent(cmbComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Direccion)
                    .addComponent(jDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_FechaNac)
                    .addComponent(jAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Sexo))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbl_Nacionalidad))
                    .addComponent(jNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Ocupacion)
                    .addComponent(jOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_celular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_Fono))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPrefijoCelu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbPrefijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Fono1)
                    .addComponent(cmbNivelEducacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnFinalizar)
                    .addComponent(jLimpiar))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAñoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jAñoFocusLost
        String texto = jAño.getText();
        Integer año = Integer.parseInt(texto);
        Integer añoLimite = 2011;
        if (año<1900 || año>añoLimite) {
            JOptionPane.showMessageDialog(null,"Año de nacimiento imposible","Ventana Error Año",JOptionPane.ERROR_MESSAGE);
            jAño.requestFocus();
            jAño.setText("");
        }
    }//GEN-LAST:event_jAñoFocusLost

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

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        if (BD.getConexion() != null)
        {BD.cerrarConexion();}
        this.dispose();
        new jfApoderado().setVisible(true);
        //new jfMenu().setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        BD.crearConexion();

        if (jNombre.getText().equals("") || jApePat.getText().equals("") || jApeMat.getText().equals("") || jDir.getText().equals("") || jAño.getText().equals("") ||  jNacionalidad.getText().equals("") || jOcupacion.getText().equals("") ){
                msj="Error, No deje ningun campo vacio";
                JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);
            }else{
                String nombre,apeP,apeM,dir,fechaNac,PosHermanos,Nhermanos,coma,religion,sexo,nacionalidad,transporte,NombreComuna,año,mes = "01",dia,numeroComuna,numeroString,folio,letra,ocupacion,fono,fonoFinal,celular,celuFinal,nivelEducacion,RutModi;
                Integer folioMatricula,Posicion,Numero,comuna;
                RutModi = jRutModi.getText();
                nombre = jNombre.getText();
                apeP = jApePat.getText();
                apeM = jApeMat.getText();
                dir = jDir.getText();
                /* yyyy-mm-dd formato transformado para que en la base de datos quede tipo date
                años limitados a 1900 -> 2011
                falta validar si el año es biciesto y los meses correspondientes a los meses...*/
        
                año = jAño.getText();
                Numero = cmbMes.getSelectedIndex();
                if (Numero>=0 && Numero <9) {
                    numeroString = Integer.toString(Numero + 1);
                    mes = "0" + numeroString;
                }else if (Numero>=9){
                    mes = Integer.toString(Numero + 1);}
                dia = (String)cmbDia.getSelectedItem();
                fechaNac = año + "-" + mes + "-" + dia;
                // Se obtiene el folio y se transforma al tipo de dato requerido por la bd
                //folio = jFolio.getText();
                //folioMatricula = Integer.parseInt(folio);
                letra = (String)cmbSexo.getSelectedItem();
                sexo = letra.substring(0,1);

                // Se obtienen los datos del combobox y se extrae el numero correspondiente al id_comuna
                NombreComuna = (String)cmbComuna.getSelectedItem();
                numeroComuna = NombreComuna.substring(0,2);
                comuna = Integer.parseInt(numeroComuna);
                nacionalidad = jNacionalidad.getText();
                ocupacion = jOcupacion.getText();
                fono = jFono.getText();
                celular = jCelular.getText();
                celuFinal =  jPrefijoCelu.getText() + celular;
                fonoFinal = cmbPrefijo.getSelectedItem() + fono;
                ocupacion = jOcupacion.getText();
                nivelEducacion = (String)cmbNivelEducacion.getSelectedItem();
                // Coma designada como variable para facilitar y entender mas la sintaxis de la linea de sql
                coma = "','";
                try {
                    //FECHA
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
                    String sql = "UPDATE persona SET nombres = '"+nombre+"',"
                        + "ape_paterno = '"+apeP+"',"
                        + "ape_materno = '"+apeM+"',"
                        + "fecha_nacimiento = '"+fechaNac+"',"
                        + "sexo = '"+sexo+"',"
                        + "direccion = '"+dir+"',"
                        + "id_comuna = '"+comuna+"',"
                        + "ocupacion = '"+ocupacion+"',"
                        + "fono = '"+fonoFinal+"',"
                        + "celular = '"+celuFinal+"',"
                        + "nivel_educacion= '"+nivelEducacion+"',"
                        + "nacionalidad = '"+nacionalidad+"'"
                        + " WHERE rut_persona = '"+RutModi+"';"; //Espacio Necesario para el WHERE
                    if(BD.ejecutarSQL(sql)){
                        msj="Datos modificados";
                        JOptionPane.showMessageDialog(null,msj,"Exito",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        msj="Error al intentar modificar.";
                        JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);
                    }
                }catch (DateTimeException ex){
                    msj = "Error, fecha invalida";
                    JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);   
                }catch (Exception e){
                    msj = "Error, hubo un problema.";
                    JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);    
                }
        }
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void jLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimpiarActionPerformed
        // TODO add your handling code here:
        jNombre.setText("");
        jApePat.setText("");
        jApeMat.setText("");
        jDir.setText("");
        jAño.setText("");
        jNacionalidad.setText("");
        jOcupacion.setText("");
        //jFolio.setText("");
        cmbComuna.setSelectedIndex(0);
        cmbMes.setSelectedIndex(0);
        cmbDia.setSelectedIndex(0);
        cmbSexo.setSelectedIndex(0);
    }//GEN-LAST:event_jLimpiarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        BD.crearConexion();
        msj = "";
        jNombre.setText("");
        jApePat.setText("");
        jApeMat.setText("");
        jDir.setText("");
        jAño.setText("");
        jNacionalidad.setText("");
        //jFolio.setText("");
        String rut = jRutModi.getText();
        String sql1="SELECT * FROM persona WHERE RUT_PERSONA='"+rut+"'";
        try{
            //sentencia = (com.mysql.jdbc.Statement)conexion.createStatement();
            ResultSet lis = BD.ejecutarSQLSelect(sql1);
            if (lis.next()){
                String prefijo;
                msj="Persona Existe Modifique los campos";
                jExiste.setText(msj);
                jNombre.setText(lis.getString(2));
                jApePat.setText(lis.getString(3));
                jApeMat.setText(lis.getString(4));
                //jFolio.setText(lis.getString(6));                
                //AÑO
                String año = lis.getString(5);
                año = año.substring(0,4);
                jAño.setText(año);
                //MES
                String mes = lis.getString(5);
                mes = mes.substring(5,7);
                cmbMes.setSelectedIndex(Integer.parseInt(mes)-1);
                //DIA
                String dia = lis.getString(5);
                dia = dia.substring(8,10);
                cmbDia.setSelectedItem(dia);
                String sexo = lis.getString(6);
                if (sexo.equals("M")) {cmbSexo.setSelectedItem("Masculino");}
                else {cmbSexo.setSelectedItem("Femenino");}
                jDir.setText(lis.getString(7));
                String comuna = lis.getString(8);
                cmbComuna.setSelectedIndex(Integer.parseInt(comuna)-1);
                jNacionalidad.setText(lis.getString(9));
                prefijo = lis.getString(10).substring(0,lis.getString(10).length()-7);
                cmbPrefijo.setSelectedItem(prefijo);
                jFono.setText(lis.getString(10).substring(lis.getString(10).length()-7,lis.getString(10).length()));
                jCelular.setText(lis.getString(11).substring(4,(lis.getString(11).length()))); 
                jOcupacion.setText(lis.getString(12));
                cmbNivelEducacion.setSelectedItem(lis.getString(13));
                jExiste.setText(msj);
            }
        }catch(Exception e){
            msj="Error, no se pudo realizar la operacion";
            JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jCelularFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCelularFocusLost
        String texto = jCelular.getText();
        Integer Numeros = Integer.parseInt(texto);
        if (Numeros<10000000 || Numeros>99999999) {
            JOptionPane.showMessageDialog(null,"Celular imposible","Ventana Error Año",JOptionPane.ERROR_MESSAGE);
            jCelular.requestFocus();
            jCelular.setText("");
        }
    }//GEN-LAST:event_jCelularFocusLost

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

    private void jFonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFonoFocusLost
        String texto = jFono.getText();
        Integer Numeros = Integer.parseInt(texto);
        if (Numeros<1000000 || Numeros>9999999) {
            JOptionPane.showMessageDialog(null,"Fono imposible","Ventana Error Año",JOptionPane.ERROR_MESSAGE);
            jFono.requestFocus();
            jFono.setText("");
        }
    }//GEN-LAST:event_jFonoFocusLost

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

    private void jRutModiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jRutModiFocusLost
        try{
            Rut rutv = new Rut();
            String rut = jRutModi.getText();
            rut = rutv.formatear(rut);
            if (rutv.validar(rut) == false){
                JOptionPane.showMessageDialog(null,"Rut incorrecto","Ventana Error Rut",JOptionPane.ERROR_MESSAGE);
                jRutModi.setText("");
                jNombre.setText("");
                jApePat.setText("");
                jApeMat.setText("");
                jRutModi.setText("");
                jDir.setText("");
                jAño.setText("");
                jNacionalidad.setText("");
                //jTransporte.setText("");
                deshabilitarBotones();
            }else{
                rut = rut.replace(".", "");
                rut = rut.replace("-", "");
                jRutModi.setText(rut);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Mal formato de rut","Ventana Error Rut",JOptionPane.ERROR_MESSAGE);
            jRutModi.setText("");
            jNombre.setText("");
            jApePat.setText("");
            jApeMat.setText("");
            jRutModi.setText("");
            jDir.setText("");
            jAño.setText("");
            jNacionalidad.setText("");
            //jTransporte.setText("");
            deshabilitarBotones();
        }
    }//GEN-LAST:event_jRutModiFocusLost

    private void habilitarBotones(){
        jNombre.setEnabled(true);
        jApePat.setEnabled(true);
        jApeMat.setEnabled(true);
        cmbComuna.setEnabled(true);
        jDir.setEnabled(true);
        jAño.setEnabled(true);
        cmbDia.setEnabled(true);
        cmbMes.setEnabled(true);
        cmbSexo.setEnabled(true);
        jNacionalidad.setEnabled(true);
    }
    
    private void deshabilitarBotones(){
        jNombre.setEnabled(false);
        jApePat.setEnabled(false);
        jApeMat.setEnabled(false);
        cmbComuna.setEnabled(false);
        jDir.setEnabled(false);
        jAño.setEnabled(false);
        cmbDia.setEnabled(false);
        cmbMes.setEnabled(false);
        cmbSexo.setEnabled(false);
        jNacionalidad.setEnabled(false);
    }
    
    private void jRutModiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRutModiKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            String rut = jRutModi.getText();
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            jRutModi.setText(rut);
            btnBuscar.requestFocus();
            btnBuscar.doClick();
        }
    }//GEN-LAST:event_jRutModiKeyPressed

    private void jRutModiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRutModiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRutModiActionPerformed


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
            java.util.logging.Logger.getLogger(jfModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfModificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
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
    private javax.swing.JLabel jExiste;
    private javax.swing.JTextField jFono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jLimpiar;
    private javax.swing.JTextField jNacionalidad;
    private javax.swing.JTextField jNombre;
    private javax.swing.JTextField jOcupacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jPrefijoCelu;
    private javax.swing.JTextField jRutModi;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lbl_ApeMat;
    private javax.swing.JLabel lbl_ApePat;
    private javax.swing.JLabel lbl_Comuna;
    private javax.swing.JLabel lbl_Direccion;
    private javax.swing.JLabel lbl_FechaNac;
    private javax.swing.JLabel lbl_Fono;
    private javax.swing.JLabel lbl_Fono1;
    private javax.swing.JLabel lbl_Nacionalidad;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JLabel lbl_Ocupacion;
    private javax.swing.JLabel lbl_Sexo;
    private javax.swing.JLabel lbl_celular;
    // End of variables declaration//GEN-END:variables
}
