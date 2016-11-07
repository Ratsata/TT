package trabajo.Alumno;

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
    String RutAnt;
    
    
    public jfModificar() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/book_edit.png"));
        setIconImage(icon);
        initComponents();
        this.jPanel1.setVisible(true);
        this.setLocationRelativeTo(null); //CENTRAR EN LA PANTALLA
        deshabilitarBotones();
        BD.crearConexion();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRutModi = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jExiste = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        lblTitulo1 = new javax.swing.JLabel();
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
        lbl_Religion = new javax.swing.JLabel();
        jReligion = new javax.swing.JTextField();
        lbl_Sexo = new javax.swing.JLabel();
        cmbSexo = new javax.swing.JComboBox<>();
        lbl_Nacionalidad = new javax.swing.JLabel();
        jNacionalidad = new javax.swing.JTextField();
        lbl_Nacionalidad1 = new javax.swing.JLabel();
        lblNombre13 = new javax.swing.JLabel();
        cmbNumHermanos = new javax.swing.JComboBox<>();
        lblNombre14 = new javax.swing.JLabel();
        cmbPosHermanos = new javax.swing.JComboBox<>();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        cmbTransporte = new javax.swing.JComboBox<>();
        lbl_Nacionalidad2 = new javax.swing.JLabel();
        jColegioProcedencia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 500));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Rut del alumno a modificar:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(110, 50, 167, 38);

        jRutModi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jRutModiFocusLost(evt);
            }
        });
        jRutModi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRutModiKeyPressed(evt);
            }
        });
        jPanel1.add(jRutModi);
        jRutModi.setBounds(280, 60, 121, 20);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar);
        btnBuscar.setBounds(410, 60, 90, 23);
        jPanel1.add(jExiste);
        jExiste.setBounds(200, 30, 287, 29);

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/backward.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver);
        btnVolver.setBounds(310, 420, 120, 30);

        lblTitulo1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblTitulo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/group_edit.png"))); // NOI18N
        lblTitulo1.setText("Modificar Alumno");
        jPanel1.add(lblTitulo1);
        lblTitulo1.setBounds(10, 11, 197, 32);

        lbl_Nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Nombre.setText("Nombre: ");
        jPanel1.add(lbl_Nombre);
        lbl_Nombre.setBounds(97, 100, 58, 17);
        jPanel1.add(jNombre);
        jNombre.setBounds(302, 100, 200, 20);

        lbl_ApePat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_ApePat.setText("Apellido Paterno:");
        jPanel1.add(lbl_ApePat);
        lbl_ApePat.setBounds(97, 126, 102, 17);
        jPanel1.add(jApePat);
        jApePat.setBounds(302, 126, 200, 20);

        lbl_ApeMat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_ApeMat.setText("Apellido Materno:");
        jPanel1.add(lbl_ApeMat);
        lbl_ApeMat.setBounds(97, 152, 104, 17);
        jPanel1.add(jApeMat);
        jApeMat.setBounds(302, 152, 200, 20);

        lbl_Comuna.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Comuna.setText("Comuna:");
        jPanel1.add(lbl_Comuna);
        lbl_Comuna.setBounds(100, 210, 57, 17);

        cmbComuna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01:Valparaiso", "02:Viña del mar", "03:Quilpue", "04:Villa Alemana", "05:Olmué", "06:Limache", "07:Quintero", "08:Concón", "09:Puchuncaví", "10:Juan Fernández", "11:Casablanca", "12:Santa María", "13:San Felipe", "14:Putaendo", "15:Panquehue", "16:Llay-Llay", "17:Catemu", "18:Santo Domingo", "19:San Antonio", "20:El Tabo", "21:El Quisco", "22:Cartagena", "23:Algarrobo", "24:Quillota", "25:Nogales", "26:La Cruz", "27:La Calera", "28:Hijuelas", "29:Zapallar", "30:Petorca", "31:Papudo", "32:La Ligua", "33:Cabildo", "34:San Esteban", "35:Rinconada", "36:Los Andes", "37:Calle Larga", "38:Isla de Pascua" }));
        jPanel1.add(cmbComuna);
        cmbComuna.setBounds(300, 210, 118, 20);

        lbl_Direccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Direccion.setText("Direccion:");
        jPanel1.add(lbl_Direccion);
        lbl_Direccion.setBounds(100, 240, 61, 17);
        jPanel1.add(jDir);
        jDir.setBounds(300, 240, 200, 20);

        lbl_FechaNac.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_FechaNac.setText("Fecha de Nac.:");
        jPanel1.add(lbl_FechaNac);
        lbl_FechaNac.setBounds(100, 260, 91, 17);

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
        jPanel1.add(jAño);
        jAño.setBounds(300, 260, 50, 20);

        cmbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(cmbDia);
        cmbDia.setBounds(360, 260, 40, 20);

        cmbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jPanel1.add(cmbMes);
        cmbMes.setBounds(410, 260, 97, 20);

        lbl_Religion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Religion.setText("Religion:");
        jPanel1.add(lbl_Religion);
        lbl_Religion.setBounds(100, 290, 51, 17);
        jPanel1.add(jReligion);
        jReligion.setBounds(300, 290, 200, 20);

        lbl_Sexo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Sexo.setText("Sexo:");
        jPanel1.add(lbl_Sexo);
        lbl_Sexo.setBounds(100, 310, 36, 17);

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        jPanel1.add(cmbSexo);
        cmbSexo.setBounds(300, 310, 90, 20);

        lbl_Nacionalidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Nacionalidad.setText("Pais Nacionalidad:");
        jPanel1.add(lbl_Nacionalidad);
        lbl_Nacionalidad.setBounds(100, 340, 120, 17);

        jNacionalidad.setText("Chile");
        jPanel1.add(jNacionalidad);
        jNacionalidad.setBounds(300, 340, 200, 20);

        lbl_Nacionalidad1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Nacionalidad1.setText("Transporte:");
        jPanel1.add(lbl_Nacionalidad1);
        lbl_Nacionalidad1.setBounds(100, 360, 72, 17);

        lblNombre13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombre13.setText("N° de Hermanos:");
        jPanel1.add(lblNombre13);
        lblNombre13.setBounds(22, 409, 106, 17);

        cmbNumHermanos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel1.add(cmbNumHermanos);
        cmbNumHermanos.setBounds(253, 409, 37, 20);

        lblNombre14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombre14.setText("Posicion en la Hermandad:");
        jPanel1.add(lblNombre14);
        lblNombre14.setBounds(22, 440, 161, 17);

        cmbPosHermanos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel1.add(cmbPosHermanos);
        cmbPosHermanos.setBounds(253, 440, 37, 20);

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disk.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar);
        btnModificar.setBounds(440, 420, 130, 30);

        btnLimpiar.setText("Limpiar campos");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar);
        btnLimpiar.setBounds(280, 10, 140, 23);

        cmbTransporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vehiculo Personal", "Locomocion Colectiva", "Otro" }));
        jPanel1.add(cmbTransporte);
        cmbTransporte.setBounds(300, 370, 127, 20);

        lbl_Nacionalidad2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Nacionalidad2.setText("Colegio de procedencia:");
        jPanel1.add(lbl_Nacionalidad2);
        lbl_Nacionalidad2.setBounds(100, 180, 146, 17);
        jPanel1.add(jColegioProcedencia);
        jColegioProcedencia.setBounds(300, 180, 200, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        if (BD.getConexion() != null){
            BD.cerrarConexion();
        }
        this.dispose();
        new jfAlumno().setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void habilitarBotones(){
        jNombre.setEnabled(true);
        jApePat.setEnabled(true);
        jApeMat.setEnabled(true);
        cmbComuna.setEnabled(true);
        jDir.setEnabled(true);
        jAño.setEnabled(true);
        cmbDia.setEnabled(true);
        cmbMes.setEnabled(true);
        jReligion.setEnabled(true);
        cmbSexo.setEnabled(true);
        jNacionalidad.setEnabled(true);
        cmbTransporte.setEnabled(true);
        //jFolio.setEnabled(true);
        cmbNumHermanos.setEnabled(true);
        cmbPosHermanos.setEnabled(true);
        btnModificar.setEnabled(true);
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
        jReligion.setEnabled(false);
        cmbSexo.setEnabled(false);
        jNacionalidad.setEnabled(false);
        cmbTransporte.setEnabled(false);
        //jFolio.setEnabled(false);
        cmbNumHermanos.setEnabled(false);
        cmbPosHermanos.setEnabled(false);
        btnModificar.setEnabled(false);
    }
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        msj = "";
        jNombre.setText("");
        jApePat.setText("");
        jApeMat.setText("");
        jDir.setText("");
        jAño.setText("");
        jReligion.setText("");        
        jNacionalidad.setText("");
        //jFolio.setText("");
        String rut = jRutModi.getText();
        String sql1="SELECT * FROM alumno WHERE RUT_ALUMNO='"+rut+"'";
        try{
            ResultSet lis = BD.ejecutarSQLSelect(sql1);
            if (lis.next()){
                msj="Alumno Existe Modifique los campos";
                jExiste.setText(msj);
                habilitarBotones();
                RutAnt = jRutModi.getText();
                jNombre.setText(lis.getString(2));
                jApePat.setText(lis.getString(3));
                jApeMat.setText(lis.getString(4));
                //jFolio.setText(lis.getString(6));
                String sexo = lis.getString(6);
                //SEXO
                if (sexo.equals("M")){
                    cmbSexo.setSelectedItem("Masculino");
                }else{
                    cmbSexo.setSelectedItem("Femenino");
                }
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
                
                jDir.setText(lis.getString(7)); 
                jReligion.setText(lis.getString(8));
                String comuna = lis.getString(9);
                cmbComuna.setSelectedIndex(Integer.parseInt(comuna)-1);
                jNacionalidad.setText(lis.getString(10));
                cmbTransporte.setSelectedItem(lis.getString(11));
                cmbNumHermanos.setSelectedItem(lis.getString(12));
                cmbPosHermanos.setSelectedItem(lis.getString(13));
                jColegioProcedencia.setText(lis.getString(14));
                jExiste.setText(msj);
            }
        }catch(Exception e){
            msj="Error, no se pudo realizar la operación";
            JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

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

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (jNombre.getText().equals("") || jApePat.getText().equals("") || jApeMat.getText().equals("") || jDir.getText().equals("") || jAño.getText().equals("") || jReligion.getText().equals("") || jNacionalidad.getText().equals("")){
            msj="Error, No deje ningun campo vacio";
            JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);
        }else{
            String numeroString,mes,dia,fechaNac,folio,letra,sexo,religion,NombreComuna,numeroComuna,nacionalidad,transporte;
            Integer folioMatricula,comuna;
            String rut = jRutModi.getText();
            String nombre = jNombre.getText();
            String apeP = jApePat.getText();
            String apeM = jApeMat.getText();
            String dir = jDir.getText();
            String año = jAño.getText();
            Integer Numero = cmbMes.getSelectedIndex();
            String colegioProcedencia = jColegioProcedencia.getText();
            mes ="01";
            if (Numero>=0 && Numero <9) {
                numeroString = Integer.toString(Numero + 1);
                mes = "0" + numeroString;
            }else if (Numero>=9){
                mes = Integer.toString(Numero + 1);
            }
            dia = (String)cmbDia.getSelectedItem();
            fechaNac = año + "-" + mes + "-" + dia;
            // Se obtiene el folio y se transforma al tipo de dato requerido por la bd
            //folio = jFolio.getText();
            //folioMatricula = Integer.parseInt(folio);
            letra = (String)cmbSexo.getSelectedItem();
            sexo = letra.substring(0,1);
            religion = jReligion.getText();
            // Se obtienen los datos del combobox y se extrae el numero correspondiente al id_comuna
            NombreComuna = (String)cmbComuna.getSelectedItem();
            numeroComuna = NombreComuna.substring(0,2);
            comuna = Integer.parseInt(numeroComuna);
            nacionalidad = jNacionalidad.getText();
            transporte = (String)cmbTransporte.getSelectedItem();
            //String fechNac = jFechNac.getText();
            //3 ultimas variables
            String PosHermanos = (String)cmbPosHermanos.getSelectedItem();
            String Nhermanos = (String)cmbNumHermanos.getSelectedItem();
            Integer Posicion = Integer.parseInt(PosHermanos);
            Integer NumeroHer = Integer.parseInt(Nhermanos);
            if (Posicion > NumeroHer){msj="No puedes estar en una posicion mayor a la de el numero de hermanos";
                JOptionPane.showMessageDialog(null,msj,"Error hermandad",JOptionPane.INFORMATION_MESSAGE);  
            }else{
                try{
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
                    String sql = "UPDATE alumno SET nombres = '"+nombre+"',"
                        + "ape_paterno = '"+apeP+"',"
                        + "ape_materno = '"+apeM+"',"
                        + "colegio_procedencia = '"+colegioProcedencia+"',"
                        + "fecha_nacimiento = '"+fechaNac+"',"
                        + "sexo = '"+sexo+"',"
                        + "direccion = '"+dir+"',"
                        + "religion = '"+religion+"',"
                        + "id_comuna = '"+comuna+"',"
                        + "nacionalidad = '"+nacionalidad+"',"
                        + "transporte = '"+transporte+"',"
                        + "num_hermanos = '"+Nhermanos+"',"
                        + "posicion_hermanos = '"+PosHermanos+"'"
                        + " WHERE rut_alumno = '"+RutAnt+"';"; //Espacio Necesario para el WHERE
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
        }
    }//GEN-LAST:event_btnModificarActionPerformed

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

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        jNombre.setText("");
        jApePat.setText("");
        jApeMat.setText("");
        jRutModi.setText("");
        jDir.setText("");
        jReligion.setText("");
        jAño.setText("");
        jNacionalidad.setText("");
        //jTransporte.setText("");
        //jFolio.setText("");
        cmbTransporte.setSelectedIndex(0);
        cmbComuna.setSelectedIndex(0);
        cmbMes.setSelectedIndex(0);
        cmbDia.setSelectedIndex(0);
        cmbSexo.setSelectedIndex(0);
        cmbNumHermanos.setSelectedIndex(0);
        cmbPosHermanos.setSelectedIndex(0);
        deshabilitarBotones();
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
                jReligion.setText("");
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
            jReligion.setText("");
            jAño.setText("");
            jNacionalidad.setText("");
            //jTransporte.setText("");
            deshabilitarBotones();
        }
    }//GEN-LAST:event_jRutModiFocusLost

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfModificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
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
    private javax.swing.JLabel jExiste;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jNacionalidad;
    private javax.swing.JTextField jNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jReligion;
    private javax.swing.JTextField jRutModi;
    private javax.swing.JLabel lblNombre13;
    private javax.swing.JLabel lblNombre14;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lbl_ApeMat;
    private javax.swing.JLabel lbl_ApePat;
    private javax.swing.JLabel lbl_Comuna;
    private javax.swing.JLabel lbl_Direccion;
    private javax.swing.JLabel lbl_FechaNac;
    private javax.swing.JLabel lbl_Nacionalidad;
    private javax.swing.JLabel lbl_Nacionalidad1;
    private javax.swing.JLabel lbl_Nacionalidad2;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JLabel lbl_Religion;
    private javax.swing.JLabel lbl_Sexo;
    // End of variables declaration//GEN-END:variables
}
