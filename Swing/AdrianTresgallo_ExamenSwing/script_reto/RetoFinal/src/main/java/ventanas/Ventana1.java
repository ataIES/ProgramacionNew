/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import baseDatos.MetodosFicheros;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class Ventana1 extends javax.swing.JFrame {

    /**
     * Creates new form Ventana1
     */
    private String correoUsuario;
    private String contrasenia;
    private DefaultTableModel tabla;
    private List<Profesor>listaProfesores;
    private List<Departamento>listaDepartamento;
    private File ficheroProfesor;
    private File ficheroDepartamento;
    

    public Ventana1() {
        initComponents();
        this.setExtendedState(getWidth());
        PanelBienvenida.setVisible(true);
        PanelLogin.setVisible(false);
        Login.setVisible(false);
        PanelMenuInicio.setVisible(false);
        Menu.setVisible(false);
        PanelMostrarActividades.setVisible(false);
        PanelMostrarProfesor.setVisible(false);
        correoUsuario = "";
        contrasenia = "";
        tabla=new DefaultTableModel();
        listaProfesores=null;
        listaDepartamento=null;
        ficheroProfesor=new File("D:\\Usuarios\\DAW125\\Documents\\Programacion\\Swing\\AdrianTresgallo_ExamenSwing\\script_reto\\materiales_reto\\profesores.csv");
        ficheroDepartamento=new File("D:\\Usuarios\\DAW125\\Documents\\Programacion\\Swing\\AdrianTresgallo_ExamenSwing\\script_reto\\materiales_reto\\departamentos.csv");
        
    }
    public void limpiarTabla(){
        for(int i=0;i<tabla.getRowCount();i++){
            i=i-1;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBienvenida = new javax.swing.JPanel();
        LabelTitulo = new javax.swing.JLabel();
        BotonAcceso = new javax.swing.JButton();
        PanelLogin = new javax.swing.JPanel();
        Login = new javax.swing.JPanel();
        TextoInicioSesion = new javax.swing.JLabel();
        TextoNombreUsuario = new javax.swing.JLabel();
        TextFieldCorreo = new javax.swing.JTextField();
        TextoContraseña = new javax.swing.JLabel();
        ContraseñaField = new javax.swing.JPasswordField();
        BotonInicioSesion = new javax.swing.JButton();
        PanelMenuInicio = new javax.swing.JPanel();
        LabelMenuInicio = new javax.swing.JLabel();
        PanelMostrarActividades = new javax.swing.JPanel();
        LabelMostrarActividades = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaMostrarActividades = new javax.swing.JTable();
        BotonBuscarActividades = new javax.swing.JButton();
        PanelMostrarProfesor = new javax.swing.JPanel();
        LabelMostrarProfesores = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaMostrarProfesores = new javax.swing.JTable();
        BotonMostrarProfesores = new javax.swing.JButton();
        Menu = new javax.swing.JMenuBar();
        MenuMostrarActividades = new javax.swing.JMenu();
        MenuMostrarProfesores = new javax.swing.JMenu();
        MenuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelBienvenida.setBackground(new java.awt.Color(153, 0, 0));

        LabelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        LabelTitulo.setFont(new java.awt.Font("SimSun-ExtB", 0, 36)); // NOI18N
        LabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitulo.setText("ACTIVIDADES EXTRAESCOLARES 2.0");
        LabelTitulo.setOpaque(true);

        BotonAcceso.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        BotonAcceso.setText("ACCESO");
        BotonAcceso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonAccesoMouseClicked(evt);
            }
        });
        BotonAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAccesoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBienvenidaLayout = new javax.swing.GroupLayout(PanelBienvenida);
        PanelBienvenida.setLayout(PanelBienvenidaLayout);
        PanelBienvenidaLayout.setHorizontalGroup(
            PanelBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBienvenidaLayout.createSequentialGroup()
                .addGap(423, 423, 423)
                .addComponent(BotonAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(422, 451, Short.MAX_VALUE))
            .addComponent(LabelTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelBienvenidaLayout.setVerticalGroup(
            PanelBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBienvenidaLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(LabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187)
                .addComponent(BotonAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(256, Short.MAX_VALUE))
        );

        PanelLogin.setBackground(new java.awt.Color(153, 0, 0));

        TextoInicioSesion.setFont(new java.awt.Font("SimSun-ExtB", 0, 24)); // NOI18N
        TextoInicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextoInicioSesion.setText("INICIA SESION");

        TextoNombreUsuario.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        TextoNombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextoNombreUsuario.setText("CORREO");

        TextFieldCorreo.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N

        TextoContraseña.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        TextoContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextoContraseña.setText("CONTRASEÑA");

        ContraseñaField.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N

        BotonInicioSesion.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        BotonInicioSesion.setText("INICIO SESION");
        BotonInicioSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonInicioSesionMouseClicked(evt);
            }
        });
        BotonInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInicioSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextoInicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextFieldCorreo)
                            .addComponent(ContraseñaField, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(BotonInicioSesion)))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addComponent(TextoInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ContraseñaField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(BotonInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 144, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelLoginLayout = new javax.swing.GroupLayout(PanelLogin);
        PanelLogin.setLayout(PanelLoginLayout);
        PanelLoginLayout.setHorizontalGroup(
            PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginLayout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
        );
        PanelLoginLayout.setVerticalGroup(
            PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        PanelMenuInicio.setBackground(new java.awt.Color(153, 0, 0));

        LabelMenuInicio.setBackground(new java.awt.Color(255, 255, 255));
        LabelMenuInicio.setFont(new java.awt.Font("SimSun-ExtB", 0, 36)); // NOI18N
        LabelMenuInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMenuInicio.setText("MENU DE INICIO");
        LabelMenuInicio.setOpaque(true);

        javax.swing.GroupLayout PanelMenuInicioLayout = new javax.swing.GroupLayout(PanelMenuInicio);
        PanelMenuInicio.setLayout(PanelMenuInicioLayout);
        PanelMenuInicioLayout.setHorizontalGroup(
            PanelMenuInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelMenuInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 985, Short.MAX_VALUE)
        );
        PanelMenuInicioLayout.setVerticalGroup(
            PanelMenuInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuInicioLayout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(LabelMenuInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(329, Short.MAX_VALUE))
        );

        PanelMostrarActividades.setBackground(new java.awt.Color(153, 0, 0));

        LabelMostrarActividades.setBackground(new java.awt.Color(255, 255, 255));
        LabelMostrarActividades.setFont(new java.awt.Font("SimSun-ExtB", 0, 36)); // NOI18N
        LabelMostrarActividades.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMostrarActividades.setText("MOSTRAR ACTIVIDADES");
        LabelMostrarActividades.setOpaque(true);

        TablaMostrarActividades.setBackground(new java.awt.Color(255, 255, 255));
        TablaMostrarActividades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idActividad", "Fecha Inicio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaMostrarActividades);
        if (TablaMostrarActividades.getColumnModel().getColumnCount() > 0) {
            TablaMostrarActividades.getColumnModel().getColumn(0).setResizable(false);
            TablaMostrarActividades.getColumnModel().getColumn(1).setResizable(false);
        }

        BotonBuscarActividades.setBackground(new java.awt.Color(255, 255, 255));
        BotonBuscarActividades.setFont(new java.awt.Font("SimSun-ExtB", 0, 24)); // NOI18N
        BotonBuscarActividades.setText("Buscar");

        javax.swing.GroupLayout PanelMostrarActividadesLayout = new javax.swing.GroupLayout(PanelMostrarActividades);
        PanelMostrarActividades.setLayout(PanelMostrarActividadesLayout);
        PanelMostrarActividadesLayout.setHorizontalGroup(
            PanelMostrarActividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelMostrarActividades, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMostrarActividadesLayout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addGroup(PanelMostrarActividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMostrarActividadesLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMostrarActividadesLayout.createSequentialGroup()
                        .addComponent(BotonBuscarActividades, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(433, 433, 433))))
        );
        PanelMostrarActividadesLayout.setVerticalGroup(
            PanelMostrarActividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMostrarActividadesLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(LabelMostrarActividades, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(BotonBuscarActividades, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        PanelMostrarProfesor.setBackground(new java.awt.Color(153, 0, 0));

        LabelMostrarProfesores.setBackground(new java.awt.Color(255, 255, 255));
        LabelMostrarProfesores.setFont(new java.awt.Font("SimSun-ExtB", 0, 36)); // NOI18N
        LabelMostrarProfesores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMostrarProfesores.setText("MOSTRAR PROFESORES");
        LabelMostrarProfesores.setOpaque(true);

        TablaMostrarProfesores.setBackground(new java.awt.Color(255, 255, 255));
        TablaMostrarProfesores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellidos", "Departamento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TablaMostrarProfesores);
        if (TablaMostrarProfesores.getColumnModel().getColumnCount() > 0) {
            TablaMostrarProfesores.getColumnModel().getColumn(0).setResizable(false);
            TablaMostrarProfesores.getColumnModel().getColumn(2).setResizable(false);
        }

        BotonMostrarProfesores.setBackground(new java.awt.Color(255, 255, 255));
        BotonMostrarProfesores.setFont(new java.awt.Font("SimSun-ExtB", 0, 24)); // NOI18N
        BotonMostrarProfesores.setText("Mostrar");
        BotonMostrarProfesores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonMostrarProfesoresMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelMostrarProfesorLayout = new javax.swing.GroupLayout(PanelMostrarProfesor);
        PanelMostrarProfesor.setLayout(PanelMostrarProfesorLayout);
        PanelMostrarProfesorLayout.setHorizontalGroup(
            PanelMostrarProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMostrarProfesorLayout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
            .addComponent(LabelMostrarProfesores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelMostrarProfesorLayout.createSequentialGroup()
                .addGap(445, 445, 445)
                .addComponent(BotonMostrarProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelMostrarProfesorLayout.setVerticalGroup(
            PanelMostrarProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMostrarProfesorLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(LabelMostrarProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(BotonMostrarProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        Menu.setBackground(new java.awt.Color(0, 0, 0));

        MenuMostrarActividades.setText("Mostrar Actividades");
        MenuMostrarActividades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuMostrarActividadesMouseClicked(evt);
            }
        });
        Menu.add(MenuMostrarActividades);

        MenuMostrarProfesores.setText("Mostrar Profesores");
        MenuMostrarProfesores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuMostrarProfesoresMouseClicked(evt);
            }
        });
        Menu.add(MenuMostrarProfesores);

        MenuSalir.setText("Salir");
        MenuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuSalirMouseClicked(evt);
            }
        });
        Menu.add(MenuSalir);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelMenuInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelMostrarActividades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelMostrarProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBienvenida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelMenuInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelMostrarActividades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelMostrarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAccesoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonAccesoMouseClicked
        // TODO add your handling code here:
        PanelBienvenida.setVisible(false);
        PanelLogin.setVisible(rootPaneCheckingEnabled);
        Login.setVisible(rootPaneCheckingEnabled);
        Menu.setVisible(false);
    }//GEN-LAST:event_BotonAccesoMouseClicked

    private void BotonInicioSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonInicioSesionMouseClicked
        // TODO add your handling code here:
        PanelBienvenida.setVisible(false);
        PanelLogin.setVisible(false);
        Login.setVisible(false);
        PanelMenuInicio.setVisible(rootPaneCheckingEnabled);
        Menu.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_BotonInicioSesionMouseClicked

    private void BotonInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInicioSesionActionPerformed
        // TODO add your handling code here 
    }//GEN-LAST:event_BotonInicioSesionActionPerformed

    private void BotonAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAccesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAccesoActionPerformed

    private void MenuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuSalirMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_MenuSalirMouseClicked

    private void MenuMostrarActividadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMostrarActividadesMouseClicked
        // TODO add your handling code here:
        PanelBienvenida.setVisible(false);
        PanelLogin.setVisible(false);
        Login.setVisible(false);
        PanelMenuInicio.setVisible(false);
        Menu.setVisible(rootPaneCheckingEnabled);
        PanelMostrarActividades.setVisible(rootPaneCheckingEnabled);
        PanelMostrarProfesor.setVisible(false);
    }//GEN-LAST:event_MenuMostrarActividadesMouseClicked

    private void MenuMostrarProfesoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMostrarProfesoresMouseClicked
        // TODO add your handling code here:
        PanelBienvenida.setVisible(false);
        PanelLogin.setVisible(false);
        Login.setVisible(false);
        PanelMenuInicio.setVisible(false);
        Menu.setVisible(rootPaneCheckingEnabled);
        PanelMostrarActividades.setVisible(false);
        PanelMostrarProfesor.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_MenuMostrarProfesoresMouseClicked

    private void BotonMostrarProfesoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMostrarProfesoresMouseClicked
        // TODO add your handling code here:
        limpiarTabla();
        Object[]listar=new Object[3];
        tabla=(DefaultTableModel) TablaMostrarProfesores.getModel();
        listaProfesores=MetodosFicheros.importarFicheroProfesores(ficheroProfesor);
        for(Profesor p:listaProfesores){
            listar[0]=p.getNombre();
            listar[1]=p.getApellidos();
            listar[2]=p.getDepartamento();
            tabla.addRow(listar);
        }
    }//GEN-LAST:event_BotonMostrarProfesoresMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAcceso;
    private javax.swing.JButton BotonBuscarActividades;
    private javax.swing.JButton BotonInicioSesion;
    private javax.swing.JButton BotonMostrarProfesores;
    private javax.swing.JPasswordField ContraseñaField;
    private javax.swing.JLabel LabelMenuInicio;
    private javax.swing.JLabel LabelMostrarActividades;
    private javax.swing.JLabel LabelMostrarProfesores;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JPanel Login;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu MenuMostrarActividades;
    private javax.swing.JMenu MenuMostrarProfesores;
    private javax.swing.JMenu MenuSalir;
    private javax.swing.JPanel PanelBienvenida;
    private javax.swing.JPanel PanelLogin;
    private javax.swing.JPanel PanelMenuInicio;
    private javax.swing.JPanel PanelMostrarActividades;
    private javax.swing.JPanel PanelMostrarProfesor;
    private javax.swing.JTable TablaMostrarActividades;
    private javax.swing.JTable TablaMostrarProfesores;
    private javax.swing.JTextField TextFieldCorreo;
    private javax.swing.JLabel TextoContraseña;
    private javax.swing.JLabel TextoInicioSesion;
    private javax.swing.JLabel TextoNombreUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}