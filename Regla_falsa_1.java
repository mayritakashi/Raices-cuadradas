/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.math.*;
import static java.lang.Math.abs;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;


public class Regla_falsa_1 extends javax.swing.JFrame {

    // static String error;
    static boolean salir = false;
    //Mis variables------------------------------------
    //falsa
    static double xa = 0, xb = 0, xrm = 0, xr, fxa = 0, fxr = 0, count, xrn = 0, fxav, fxb, xrw, XRN = 0, XRNV = 0;
    static double valor = 0, valor1 = 0, valor2 = 0, valor3 = 0, valor4 = 0, valor5 = 0, valor6 = 0;
    //static double nc = -2, n1 = 0, n2 = 0, n3 = 3, n4 = 1, ecu, error, err, xrv, comp, Error; // Grados de la ecuacion
    //static int imax = 25;// -1 , 2.5 
    static int redondeo = 0;
    //biseccion
    //static double xa = 0, xb = 0, xr = 0, xrn = 0, fxa = 0, fxr = 0, fxb = 0, valor = 0, valor1 = 0, valor2 = 0, valor3 = 0, valor4 = 0, valor5 = 0, valor6 = 0, res1 = 0;
    static double nc = -2, n1 = 0, n2 = 0, n3 = 3, n4 = 1, ecu, err = 0, xrv = 0, comp = 0; // Grados de la ecuacion
    //static int imax = 25, count = 0, redondeo = 0;

    //---------------------------------------------------
    static double operacion = 0, operacion1 = 0, operacion2 = 0, errorc = 0;
    //lo ponemos global para que se pueda modificar
    javax.swing.JSlider sldGrado = new javax.swing.JSlider(1, 6, 6);
    javax.swing.JLabel lblGrado = new javax.swing.JLabel("SELECCIONA EL GRADO DE LA ECUACION");
    javax.swing.JLabel lblSeleccionGrado = new javax.swing.JLabel(sldGrado.getValue() + "");
    javax.swing.JButton btndefinir = new javax.swing.JButton("definir");//aqui pongo el boton
    javax.swing.JTextField btnspiner = new javax.swing.JTextField();
    javax.swing.JTextField btnspiner1 = new javax.swing.JTextField();
    javax.swing.JTextField btnspiner2 = new javax.swing.JTextField();
    javax.swing.JTextField btnspiner3 = new javax.swing.JTextField();
    javax.swing.JTextField btnspiner4 = new javax.swing.JTextField();
    javax.swing.JTextField btnspiner5 = new javax.swing.JTextField();
    javax.swing.JTextField btnspiner6 = new javax.swing.JTextField();
    javax.swing.JLabel lbloperacion = new javax.swing.JLabel("+");
    javax.swing.JButton btncalcular = new javax.swing.JButton("Calcular");
    javax.swing.JLabel lblgrado = new javax.swing.JLabel("Grado 0");
    javax.swing.JLabel lblgrado1 = new javax.swing.JLabel("Grado 1");
    javax.swing.JLabel lblgrado2 = new javax.swing.JLabel("Grado 2");
    javax.swing.JLabel lblgrado3 = new javax.swing.JLabel("Grado 3");
    javax.swing.JLabel lblgrado4 = new javax.swing.JLabel("Grado 4");
    javax.swing.JLabel lblgrado5 = new javax.swing.JLabel("Grado 5");
    javax.swing.JLabel lblgrado6 = new javax.swing.JLabel("Grado 6");

    javax.swing.JLabel lblintervalo1 = new javax.swing.JLabel("Introduce el intervalo 1");
    javax.swing.JLabel lblintervalo2 = new javax.swing.JLabel("Introduce el intervalo 2");
    javax.swing.JLabel lblerror = new javax.swing.JLabel("Introduce el error que se quiere");
    javax.swing.JLabel lblredondeo = new javax.swing.JLabel("Introduce el numero a redondear");
    javax.swing.JTextField txtintervalo1 = new javax.swing.JTextField();
    javax.swing.JTextField txtintervalo2 = new javax.swing.JTextField();
    javax.swing.JTextField txterror = new javax.swing.JTextField();
    javax.swing.JTextField txtredondeo = new javax.swing.JTextField();

    //definir botones
    //javax.swing.JButton btndefinir = new javax.swing.JButton("");
    public Regla_falsa_1() {
        initComponents();
        jTextField1.setVisible(false);
        sldGrado.setValue(0);
        sldGrado.setMinorTickSpacing(1);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFormulario = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnarchivo = new javax.swing.JMenu();
        btnsalir = new javax.swing.JMenuItem();
        btncargarslader = new javax.swing.JMenuItem();
        btnreset = new javax.swing.JMenuItem();
        btnedicion = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 800));

        jpFormulario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jpFormulario.setMaximumSize(new java.awt.Dimension(700, 600));
        jpFormulario.setMinimumSize(new java.awt.Dimension(700, 600));
        jpFormulario.setPreferredSize(new java.awt.Dimension(700, 600));
        jpFormulario.setLayout(null);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jpFormulario.add(jTextField1);
        jTextField1.setBounds(530, 540, 71, 22);

        btnarchivo.setText("Archivo");

        btnsalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        btnarchivo.add(btnsalir);

        btncargarslader.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btncargarslader.setText("cargar slader");
        btncargarslader.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncargarsladerActionPerformed(evt);
            }
        });
        btnarchivo.add(btncargarslader);

        btnreset.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnreset.setText("reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        btnarchivo.add(btnreset);

        jMenuBar1.add(btnarchivo);

        btnedicion.setText("Edicion");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Acerca de");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        btnedicion.add(jMenuItem1);

        jMenuBar1.add(btnedicion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jpFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncargarsladerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncargarsladerActionPerformed
        // TODO add your handling code here:
        btndefinir.setVisible(true);
        lblSeleccionGrado.setVisible(true);
        lblGrado.setVisible(true);
        sldGrado.setVisible(true);

        sldGrado.setMaximum(6);
        sldGrado.setMinimum(6);
        sldGrado.setMinorTickSpacing(1);

        jpFormulario.add(sldGrado);
        sldGrado.setBounds(40, 80, 250, 29);
        sldGrado.setLocation(40, 80);

        sldGrado.addChangeListener(new javax.swing.event.ChangeListener() {
            @Override
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldGradoStateChanged(evt);
            }
        });

        jpFormulario.add(lblSeleccionGrado);
        lblSeleccionGrado.setBounds(160, 95, 150, 29);
        lblSeleccionGrado.setLocation(160, 95);
        //tome las propiedades de el boton que puse en el panel principal lo copie y pegue y elimine el boton del panel y cree mi objeto boton 
        jpFormulario.add(btndefinir);
        btndefinir.setBounds(200, 150, 77, 25);
        btndefinir.setLocation(200, 150);

        ActionListener escuchador = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("entraste al boton");

                jpFormulario.add(btndefinir);
                btndefinir.setBounds(200, 150, 77, 25);
                btndefinir.setLocation(200, 150);

                lblintervalo1.setVisible(true);
                txtintervalo1.setVisible(true);
                lblintervalo2.setVisible(true);
                txtintervalo2.setVisible(true);
                lblerror.setVisible(true);
                txterror.setVisible(true);
                lblredondeo.setVisible(true);
                txtredondeo.setVisible(true);
                btncalcular.setVisible(true);

                jpFormulario.add(lblintervalo1);
                lblintervalo1.setBounds(30, 230, 250, 29);
                lblintervalo1.setLocation(30, 230);

                jpFormulario.add(txtintervalo1);
                txtintervalo1.setBounds(30, 260, 70, 29);
                txtintervalo1.setLocation(30, 260);

                jpFormulario.add(lblintervalo2);
                lblintervalo2.setBounds(30, 290, 250, 29);
                lblintervalo2.setLocation(30, 290);

                jpFormulario.add(txtintervalo2);
                txtintervalo2.setBounds(30, 320, 70, 29);
                txtintervalo2.setLocation(30, 320);

                jpFormulario.add(lblerror);
                lblerror.setBounds(30, 360, 250, 29);
                lblerror.setLocation(30, 360);

                jpFormulario.add(txterror);
                txterror.setBounds(30, 390, 70, 29);
                txterror.setLocation(30, 390);

                jpFormulario.add(lblredondeo);
                lblredondeo.setBounds(30, 420, 250, 29);
                lblredondeo.setLocation(30, 420);

                jpFormulario.add(txtredondeo);
                txtredondeo.setBounds(30, 450, 70, 29);
                txtredondeo.setLocation(30, 450);

                jpFormulario.add(btncalcular);
                btncalcular.setBounds(30, 485, 77, 25);
                btncalcular.setLocation(30, 485);

                switch (sldGrado.getValue()) {
                    case 1:
                        btnspiner.setVisible(true);//aqui hacemos activo o visible el spiner 
                        btnspiner1.setVisible(true);//aqui hacemos activo o visible el spiner 

                        lblgrado.setVisible(true);
                        lblgrado1.setVisible(true);

                        jpFormulario.add(lblgrado1);//grado 1
                        lblgrado1.setBounds(30, 170, 250, 29);
                        lblgrado1.setLocation(30, 170);

                        jpFormulario.add(btnspiner1);
                        btnspiner1.setBounds(30, 200, 55, 25);
                        btnspiner1.setLocation(30, 200);

                        jpFormulario.add(lblgrado);//grado 0
                        lblgrado.setBounds(130, 170, 250, 29);
                        lblgrado.setLocation(130, 170);

                        /* jpFormulario.add(lbloperacion);
                         lbloperacion.setBounds(330, 300, 10, 15);
                        lbloperacion.setLocation(100, 300);*/
                        jpFormulario.add(btnspiner);
                        btnspiner.setBounds(130, 200, 55, 25);
                        btnspiner.setLocation(130, 200);

                        btnspiner2.setVisible(false);
                        btnspiner3.setVisible(false);
                        btnspiner4.setVisible(false);
                        btnspiner5.setVisible(false);
                        btnspiner6.setVisible(false);

                        lblgrado2.setVisible(false);
                        lblgrado3.setVisible(false);
                        lblgrado4.setVisible(false);
                        lblgrado5.setVisible(false);
                        lblgrado6.setVisible(false);

                        break;
                    case 2:
                        btnspiner.setVisible(true);//aqui hacemos activo o visible el spiner  
                        btnspiner1.setVisible(true);//aqui hacemos activo o visible el spiner  
                        btnspiner2.setVisible(true);//aqui hacemos activo o visible el spiner  

                        lblgrado.setVisible(true);
                        lblgrado1.setVisible(true);
                        lblgrado2.setVisible(true);

                        jpFormulario.add(lblgrado2);//grado 2
                        lblgrado2.setBounds(30, 170, 250, 29);
                        lblgrado2.setLocation(30, 170);

                        jpFormulario.add(btnspiner2);//grado 2
                        btnspiner2.setBounds(30, 200, 55, 25);
                        btnspiner2.setLocation(30, 200);

                        /*jpFormulario.add(lbloperacion);
                         lbloperacion.setBounds(330, 200, 10, 15);
                        lbloperacion.setLocation(100, 200);*/
                        jpFormulario.add(lblgrado1);//grado 1
                        lblgrado1.setBounds(130, 170, 250, 29);
                        lblgrado1.setLocation(130, 170);

                        jpFormulario.add(btnspiner1);//grado 1
                        btnspiner1.setBounds(350, 200, 55, 25);
                        btnspiner1.setLocation(130, 200);

                        jpFormulario.add(lblgrado);//grado 0
                        lblgrado.setBounds(230, 170, 250, 29);
                        lblgrado.setLocation(230, 170);

                        jpFormulario.add(btnspiner);// grado 0
                        btnspiner.setBounds(400, 200, 55, 25);
                        btnspiner.setLocation(230, 200);

                        btnspiner3.setVisible(false);
                        btnspiner4.setVisible(false);
                        btnspiner5.setVisible(false);
                        btnspiner6.setVisible(false);

                        lblgrado3.setVisible(false);
                        lblgrado4.setVisible(false);
                        lblgrado5.setVisible(false);
                        lblgrado6.setVisible(false);
                        break;

                    case 3:

                        btnspiner.setVisible(true);//aqui hacemos activo o visible el spiner 
                        btnspiner1.setVisible(true);//aqui hacemos activo o visible el spiner 
                        btnspiner2.setVisible(true);//aqui hacemos activo o visible el spiner 
                        btnspiner3.setVisible(true);

                        lblgrado.setVisible(true);
                        lblgrado1.setVisible(true);
                        lblgrado2.setVisible(true);
                        lblgrado3.setVisible(true);

                        jpFormulario.add(lblgrado3);//grado 3
                        lblgrado3.setBounds(30, 170, 250, 29);
                        lblgrado3.setLocation(30, 170);

                        jpFormulario.add(btnspiner3);//grado 3
                        btnspiner3.setBounds(30, 200, 55, 25);
                        btnspiner3.setLocation(30, 200);

                        jpFormulario.add(lbloperacion);
                        lbloperacion.setBounds(330, 200, 10, 15);
                        lbloperacion.setLocation(100, 200);

                        jpFormulario.add(lblgrado2);//grado 2
                        lblgrado2.setBounds(130, 170, 250, 29);
                        lblgrado2.setLocation(130, 170);

                        jpFormulario.add(btnspiner2);//grado 2
                        btnspiner2.setBounds(350, 200, 55, 25);
                        btnspiner2.setLocation(130, 200);

                        jpFormulario.add(lblgrado1);//grado 1
                        lblgrado1.setBounds(230, 170, 250, 29);
                        lblgrado1.setLocation(230, 170);

                        jpFormulario.add(btnspiner1);//grado 1
                        btnspiner1.setBounds(400, 200, 55, 25);
                        btnspiner1.setLocation(230, 200);

                        jpFormulario.add(lblgrado);//grado 0
                        lblgrado.setBounds(330, 170, 250, 29);
                        lblgrado.setLocation(330, 170);

                        jpFormulario.add(btnspiner);// grado 0
                        btnspiner.setBounds(450, 200, 55, 25);
                        btnspiner.setLocation(330, 200);

                        btnspiner4.setVisible(false);

                        btnspiner5.setVisible(false);
                        btnspiner6.setVisible(false);

                        lblgrado4.setVisible(false);
                        lblgrado5.setVisible(false);
                        lblgrado6.setVisible(false);

                        break;
                    case 4:

                        btnspiner.setVisible(true);//aqui hacemos activo o visible el spiner 
                        btnspiner1.setVisible(true);//aqui hacemos activo o visible el spiner 
                        btnspiner2.setVisible(true);//aqui hacemos activo o visible el spiner 
                        btnspiner3.setVisible(true);
                        btnspiner4.setVisible(true);
                        btnspiner5.setVisible(true);

                        lblgrado.setVisible(true);
                        lblgrado1.setVisible(true);
                        lblgrado2.setVisible(true);
                        lblgrado3.setVisible(true);
                        lblgrado4.setVisible(true);
                        lblgrado5.setVisible(true);

                        jpFormulario.add(lblgrado4);//grado 4
                        lblgrado4.setBounds(30, 170, 250, 29);
                        lblgrado4.setLocation(30, 170);

                        jpFormulario.add(btnspiner4);
                        btnspiner4.setBounds(30, 200, 55, 25);
                        btnspiner4.setLocation(30, 200);

                        jpFormulario.add(lbloperacion);
                        lbloperacion.setBounds(330, 200, 10, 15);
                        lbloperacion.setLocation(100, 200);

                        jpFormulario.add(lblgrado3);//grado 3
                        lblgrado3.setBounds(130, 170, 250, 29);
                        lblgrado3.setLocation(130, 170);

                        jpFormulario.add(btnspiner3);
                        btnspiner3.setBounds(350, 200, 55, 25);
                        btnspiner3.setLocation(130, 200);

                        jpFormulario.add(lblgrado2);//grado 2
                        lblgrado2.setBounds(230, 170, 250, 29);
                        lblgrado2.setLocation(230, 170);

                        jpFormulario.add(btnspiner2);
                        btnspiner2.setBounds(400, 200, 55, 25);
                        btnspiner2.setLocation(230, 200);

                        jpFormulario.add(lblgrado1);//grado 1
                        lblgrado1.setBounds(330, 170, 250, 29);
                        lblgrado1.setLocation(330, 170);

                        jpFormulario.add(btnspiner1);
                        btnspiner1.setBounds(450, 200, 55, 25);
                        btnspiner1.setLocation(330, 200);

                        jpFormulario.add(lblgrado);//grado 0
                        lblgrado.setBounds(430, 170, 250, 29);
                        lblgrado.setLocation(430, 170);

                        jpFormulario.add(btnspiner);
                        btnspiner.setBounds(550, 200, 55, 25);
                        btnspiner.setLocation(430, 200);

                        btnspiner5.setVisible(false);

                        btnspiner6.setVisible(false);

                        lblgrado5.setVisible(false);
                        lblgrado6.setVisible(false);
                        break;
                    case 5:

                        btnspiner.setVisible(true);//aqui hacemos activo o visible el spiner 
                        btnspiner1.setVisible(true);//aqui hacemos activo o visible el spiner 
                        btnspiner2.setVisible(true);//aqui hacemos activo o visible el spiner 
                        btnspiner3.setVisible(true);
                        btnspiner4.setVisible(true);
                        btnspiner5.setVisible(true);
                        btnspiner6.setVisible(true);

                        lblgrado.setVisible(true);
                        lblgrado1.setVisible(true);
                        lblgrado2.setVisible(true);
                        lblgrado3.setVisible(true);
                        lblgrado4.setVisible(true);
                        lblgrado5.setVisible(true);
                        lblgrado6.setVisible(true);

                        jpFormulario.add(lblgrado5);//grado 5
                        lblgrado5.setBounds(30, 170, 250, 29);
                        lblgrado5.setLocation(30, 170);

                        jpFormulario.add(btnspiner5);//grado 5
                        btnspiner5.setBounds(30, 200, 55, 25);
                        btnspiner5.setLocation(30, 200);

                        jpFormulario.add(lbloperacion);
                        lbloperacion.setBounds(330, 200, 10, 15);
                        lbloperacion.setLocation(100, 200);

                        jpFormulario.add(lblgrado4);//grado 4
                        lblgrado4.setBounds(130, 170, 250, 29);
                        lblgrado4.setLocation(130, 170);

                        jpFormulario.add(btnspiner4);//grado 4
                        btnspiner4.setBounds(350, 200, 55, 25);
                        btnspiner4.setLocation(130, 200);

                        jpFormulario.add(lblgrado3);//grado 3
                        lblgrado3.setBounds(230, 170, 250, 29);
                        lblgrado3.setLocation(230, 170);

                        jpFormulario.add(btnspiner3);//grado 3
                        btnspiner3.setBounds(400, 200, 55, 25);
                        btnspiner3.setLocation(230, 200);

                        jpFormulario.add(lblgrado2);//grado 2
                        lblgrado2.setBounds(330, 170, 250, 29);
                        lblgrado2.setLocation(330, 170);

                        jpFormulario.add(btnspiner2);//grado 2
                        btnspiner2.setBounds(450, 200, 55, 25);
                        btnspiner2.setLocation(330, 200);

                        jpFormulario.add(lblgrado1);//grado 1
                        lblgrado1.setBounds(430, 170, 250, 29);
                        lblgrado1.setLocation(430, 170);

                        jpFormulario.add(btnspiner1);//grado 1
                        btnspiner1.setBounds(450, 200, 55, 25);
                        btnspiner1.setLocation(430, 200);

                        jpFormulario.add(lblgrado);//grado 0
                        lblgrado.setBounds(530, 170, 250, 29);
                        lblgrado.setLocation(530, 170);

                        jpFormulario.add(btnspiner);//grado 0
                        btnspiner.setBounds(650, 200, 55, 25);
                        btnspiner.setLocation(530, 200);

                        btnspiner6.setVisible(false);

                        lblgrado6.setVisible(false);
                        break;
                    case 6:
                        btnspiner.setVisible(true);//aqui hacemos activo o visible el spiner 
                        btnspiner1.setVisible(true);
                        btnspiner2.setVisible(true);
                        btnspiner3.setVisible(true);
                        btnspiner4.setVisible(true);
                        btnspiner5.setVisible(true);

                        btnspiner6.setVisible(true);

                        lblgrado.setVisible(true);
                        lblgrado1.setVisible(true);
                        lblgrado2.setVisible(true);
                        lblgrado3.setVisible(true);
                        lblgrado4.setVisible(true);
                        lblgrado5.setVisible(true);
                        lblgrado6.setVisible(true);

                        jpFormulario.add(lblgrado6);//grado 6
                        lblgrado6.setBounds(30, 170, 250, 29);
                        lblgrado6.setLocation(30, 170);

                        jpFormulario.add(btnspiner6);
                        btnspiner6.setBounds(30, 200, 55, 25);
                        btnspiner6.setLocation(30, 200);

                        jpFormulario.add(lbloperacion);
                        lbloperacion.setBounds(330, 200, 10, 15);
                        lbloperacion.setLocation(100, 200);

                        jpFormulario.add(lblgrado5);//grado 5
                        lblgrado5.setBounds(130, 170, 250, 29);
                        lblgrado5.setLocation(130, 170);

                        jpFormulario.add(btnspiner5);
                        btnspiner5.setBounds(350, 200, 55, 25);
                        btnspiner5.setLocation(130, 200);

                        jpFormulario.add(lblgrado4);//grado 4
                        lblgrado4.setBounds(230, 170, 250, 29);
                        lblgrado4.setLocation(230, 170);

                        jpFormulario.add(btnspiner4);
                        btnspiner4.setBounds(400, 200, 55, 25);
                        btnspiner4.setLocation(230, 200);

                        jpFormulario.add(lblgrado3);//grado 3
                        lblgrado3.setBounds(330, 170, 250, 29);
                        lblgrado3.setLocation(330, 170);

                        jpFormulario.add(btnspiner3);
                        btnspiner3.setBounds(450, 200, 55, 25);
                        btnspiner3.setLocation(330, 200);

                        jpFormulario.add(lblgrado2);//grado 2
                        lblgrado2.setBounds(430, 170, 250, 29);
                        lblgrado2.setLocation(430, 170);

                        jpFormulario.add(btnspiner2);
                        btnspiner2.setBounds(550, 200, 55, 25);
                        btnspiner2.setLocation(430, 200);

                        jpFormulario.add(lblgrado1);//grado 1
                        lblgrado1.setBounds(530, 170, 250, 29);
                        lblgrado1.setLocation(530, 170);

                        jpFormulario.add(btnspiner1);
                        btnspiner1.setBounds(650, 200, 55, 25);
                        btnspiner1.setLocation(530, 200);

                        jpFormulario.add(lblgrado);//grado 0
                        lblgrado.setBounds(630, 170, 250, 29);
                        lblgrado.setLocation(630, 170);

                        jpFormulario.add(btnspiner);
                        btnspiner.setBounds(750, 200, 55, 25);
                        btnspiner.setLocation(630, 200);
                        break;

                }

            }
        };
        //------------------------------------------CODIGO DE BISECCION AQUI VA
        ActionListener oido = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Aqui va mi codigo
                String Valor = btnspiner.getText();//constate
                String Valor1 = btnspiner1.getText();//grado 1
                String Valor2 = btnspiner2.getText();//grado 2
                String Valor3 = btnspiner3.getText();//grado 3
                String Valor4 = btnspiner4.getText();//grado 4
                String Valor5 = btnspiner5.getText();//grado 5
                String Valor6 = btnspiner6.getText();//grado 6
                String error = txterror.getText();

                valor = Double.parseDouble(Valor);//conversion
                //System.out.println("VALORD: "+valor);
                valor1 = Double.parseDouble(Valor1);
                //System.out.println("Valor 1d: "+valor1);
                valor2 = Double.parseDouble(Valor2);
                //System.out.println("Valor 2d: "+valor2);
                valor3 = Double.parseDouble(Valor3);
                //System.out.println("ValorD3333333333333333: "+valor3);
                valor4 = Double.parseDouble(Valor4);
                valor5 = Double.parseDouble(Valor5);
                valor6 = Double.parseDouble(Valor6);

                //System.out.println("Digita valorr de a: ");
                String Xa = txtintervalo1.getText(); //xa=x0
                xa = Double.parseDouble(Xa);

                // System.out.println("Digita valorr de b: ");
                String Xb = txtintervalo2.getText(); //xb= x1
                xb = Double.parseDouble(Xb);

                // REDONDEO 
                String REDO = txtredondeo.getText();
                redondeo = Integer.parseInt(REDO);

                double ERROR = Double.parseDouble(error);
                System.out.println("ERRR: " + ERROR);
                //1x^2 - 5x + 6             [2,5] err 0.0001 4.decimales
                //3x + 2  [-2, 0]
                switch (sldGrado.getValue()) {
                    /*case 1:
                        //do{
                        
                        fxa = (valor1 * (Math.pow(xa, 1)) + valor);
                        System.out.println("fxa 1: " + String.format("%." + redondeo + "f", fxa));
                        //-------------------------------------------------------------
                        fxb = (valor1 * (Math.pow(xb, 1)) + valor);
                        System.out.println("fxb: " + String.format("%." + redondeo + "f", fxb));
                        //--------------------------------------------------------------
                        ///Primer validacion si existe raiz
                        if (fxa == 0) {
                            System.out.println("El valor ya se encontro");
                            System.out.println("El valor es: " + xa + " Su RAIZ: " + fxa);
                            return;
                        } else if (fxb == 0) {
                            System.out.println("El valor ya se encontro");
                            System.out.println("El valor es: " + xb + " Su RAIZ: " + fxb);
                            return;
                        }
                        comp = fxa * fxb;
                        //}while(res1>=0);
                        //comp=fxa*fxb;
                        if (comp < 0) {

                            System.out.println("");
                            System.out.println("Si es el Intervalo");
                            System.out.println("Intervalo xa: " + String.format("%." + redondeo + "f", xa));
                            System.out.println("Intervalo xb: " + String.format("%." + redondeo + "f", xb));
                            do {
                                count++;
                                System.out.println("----ITERADOR---- " + count);
                                System.out.println("xa: " + String.format("%." + redondeo + "f", xa) + " xb: " + String.format("%." + redondeo + "f", fxb));
                                //----------------ERROR
                                xrv = xr;
                                xr = (xa + xb) / 2; //Punto Medio. 
                                System.out.println("xr: " + String.format("%." + redondeo + "f", xr));
                                xrn = xr;
                                err = (Math.abs((xrn - xrv) / xrn) * 100);
                                System.out.println("EE: " + String.format("%." + redondeo + "f", err));
                                if (err <= ERROR) {
                                    System.out.println("tu error es " + String.format("%." + redondeo + "f", err));
                                    return;
                                }
                                //------------------------------
                                fxr = (valor1 * (Math.pow(xr, 1)) + valor);
                                System.out.println("fxr: " + String.format("%." + redondeo + "f", fxr));
                                if (fxr == 0) {
                                    System.out.println("Encontro la raiz: " + String.format("%." + redondeo + "f", fxr));
                                    return;
                                } else if (fxa * fxr < 0) {
                                    xb = xr;
                                } else if (fxb * fxr < 0) {
                                    xa = xr;
                                }
                            } while (1 != 0);
                            //Punto Medio
                        } else {
                            System.out.println("Intenta de Nuevo");
                        }
                        break;//fin case 1

                    case 2:
                        //do{
                        fxa = (valor2 * (Math.pow(xa, 2)) + valor1 * (Math.pow(xa, 1)) + valor);
                        System.out.println("fxa 2: " + fxa);

                        fxb = (valor2 * (Math.pow(xb, 2)) + valor1 * (Math.pow(xb, 1)) + valor);
                        System.out.println("fxb: " + fxb);//0

                        if (fxa == 0) {//**************
                            System.out.println("El valor ya se encontro fxa");
                            System.out.println("El valor es: " + xa + " Su RAIZ: " + fxa);
                            return;
                        } else if (fxb == 0) {
                            System.out.println("El valor ya se encontro fxb");
                            System.out.println("El valor es: " + xb + " Su RAIZ: " + fxb);
                            return;
                        }//-*********************
                        comp = fxa * fxb;

                        if (comp < 0) {
                            xrv = xr;
                            err = (Math.abs(xrn - xrv) / xr) * 100;
                            System.out.println("EE: " + err);
                            if (err <= ERROR) {
                                System.out.println("tu error es " + err);
                                return;
                            }

                            System.out.println("");
                            System.out.println("Si es el Intervalo");
                            System.out.println("Intervalo xa: " + xa);
                            System.out.println("Intervalo xb: " + xb);
                            do {
                                count++;
                                System.out.println("----ITERADOR---- " + count);
                                System.out.println("xa: " + xa + " xb: " + xb);
                                //----------------------------ERROR
                                xrv = xr;
                                xr = (xa + xb) / 2; //Punto Medio. 
                                System.out.println("xr: " + xr);
                                xrn = xr;
                                err = (Math.abs((xrn - xrv) / xrn) * 100);
                                System.out.println("EE: " + err);
                                if (err <= ERROR) {
                                    System.out.println("tu error es " + err);
                                    return;
                                }
                                //---------------------------------
                                fxr = (valor2 * (Math.pow(xr, 2)) + valor1 * (Math.pow(xr, 1)) + valor);// <--------
                                System.out.println("fxr: " + fxr);
                                if (fxr == 0) {
                                    System.out.println("Encontro la raiz: " + xr);
                                    return;
                                } else if (fxa * fxr < 0) {
                                    xb = xr;
                                } else if (fxb * fxr < 0) {
                                    xa = xr;
                                }
                            } while (1 != 0);
                            //Punto Medio
                        } else {
                            System.out.println("Intenta de Nuevo");
                        }
                        //}while(res1>0);
                        break;//fin casse 2
                    case 3:
                        //do{
                        fxa = (valor3 * (Math.pow(xa, 3)) + valor2 * (Math.pow(xa, 2)) + valor1 * (Math.pow(xa, 1)) + valor);
                        System.out.println("fxa 2: " + fxa);

                        fxb = (valor3 * (Math.pow(xb, 3)) + valor2 * (Math.pow(xb, 2)) + valor1 * (Math.pow(xb, 1)) + valor);
                        System.out.println("fxb: " + fxb);//0

                        if (fxa == 0) {//**************
                            System.out.println("El valor ya se encontro fxa");
                            System.out.println("El valor es: " + xa + " Su RAIZ: " + fxa);
                            return;
                        } else if (fxb == 0) {
                            System.out.println("El valor ya se encontro fxb");
                            System.out.println("El valor es: " + xb + " Su RAIZ: " + fxb);
                            return;
                        }//-*********************
                        comp = fxa * fxb;

                        if (comp < 0) {
                            xrv = xr;
                            err = (Math.abs(xrn - xrv) / xr) * 100;
                            System.out.println("EE: " + err);
                            if (err <= ERROR) {
                                System.out.println("tu error es " + err);
                                return;
                            }

                            System.out.println("");
                            System.out.println("Si es el Intervalo");
                            System.out.println("Intervalo xa: " + xa);
                            System.out.println("Intervalo xb: " + xb);
                            do {
                                count++;
                                System.out.println("----ITERADOR---- " + count);
                                System.out.println("xa: " + xa + " xb: " + xb);
                                //----------------------------ERROR
                                xrv = xr;
                                xr = (xa + xb) / 2; //Punto Medio. 
                                System.out.println("xr: " + xr);
                                xrn = xr;
                                err = (Math.abs((xrn - xrv) / xrn) * 100);
                                System.out.println("EE: " + err);
                                if (err <= ERROR) {
                                    System.out.println("tu error es " + err);
                                    return;
                                }
                                //---------------------------------
                                fxr = (valor3 * (Math.pow(xr, 3)) + valor2 * (Math.pow(xr, 2)) + valor1 * (Math.pow(xr, 1)) + valor);// <--------
                                System.out.println("fxr: " + fxr);
                                if (fxr == 0) {
                                    System.out.println("Encontro la raiz: " + xr);
                                    return;
                                } else if (fxa * fxr < 0) {
                                    xb = xr;
                                } else if (fxb * fxr < 0) {
                                    xa = xr;
                                }
                            } while (1 != 0);
                            //Punto Medio
                        } else {
                            System.out.println("Intenta de Nuevo");
                        }
                        break;
                    case 4:
                        //do{
                        fxa = (valor4 * (Math.pow(xa, 4)) + valor3 * (Math.pow(xa, 3)) + valor2 * (Math.pow(xa, 2)) + valor1 * (Math.pow(xa, 1)) + valor);
                        System.out.println("fxa 2: " + fxa);

                        fxb = (valor4 * (Math.pow(xb, 4)) + valor3 * (Math.pow(xb, 3)) + valor2 * (Math.pow(xb, 2)) + valor1 * (Math.pow(xb, 1)) + valor);
                        System.out.println("fxb: " + fxb);//0

                        if (fxa == 0) {//**************
                            System.out.println("El valor ya se encontro fxa");
                            System.out.println("El valor es: " + xa + " Su RAIZ: " + fxa);
                            return;
                        } else if (fxb == 0) {
                            System.out.println("El valor ya se encontro fxb");
                            System.out.println("El valor es: " + xb + " Su RAIZ: " + fxb);
                            return;
                        }//-*********************
                        comp = fxa * fxb;

                        if (comp < 0) {
                            xrv = xr;
                            err = (Math.abs(xrn - xrv) / xr) * 100;
                            System.out.println("EE: " + err);
                            if (err <= ERROR) {
                                System.out.println("tu error es " + err);
                                return;
                            }

                            System.out.println("");
                            System.out.println("Si es el Intervalo");
                            System.out.println("Intervalo xa: " + xa);
                            System.out.println("Intervalo xb: " + xb);
                            do {
                                count++;
                                System.out.println("----ITERADOR---- " + count);
                                System.out.println("xa: " + xa + " xb: " + xb);
                                //----------------------------ERROR
                                xrv = xr;
                                xr = (xa + xb) / 2; //Punto Medio. 
                                System.out.println("xr: " + xr);
                                xrn = xr;
                                err = (Math.abs((xrn - xrv) / xrn) * 100);
                                System.out.println("EE: " + err);
                                if (err <= ERROR) {
                                    System.out.println("tu error es " + err);
                                    return;
                                }
                                //---------------------------------
                                fxr = (valor4 * (Math.pow(xr, 4)) + valor3 * (Math.pow(xr, 3)) + valor2 * (Math.pow(xr, 2)) + valor1 * (Math.pow(xr, 1)) + valor);// <--------
                                System.out.println("fxr: " + fxr);
                                if (fxr == 0) {
                                    System.out.println("Encontro la raiz: " + xr);
                                    return;
                                } else if (fxa * fxr < 0) {
                                    xb = xr;
                                } else if (fxb * fxr < 0) {
                                    xa = xr;
                                }
                            } while (1 != 0);
                            //Punto Medio
                        } else {
                            System.out.println("Intenta de Nuevo");
                        }
                        break;
                    case 5:
                        //do{
                        fxa = (valor5 * (Math.pow(xa, 5)) + valor4 * (Math.pow(xa, 4)) + valor3 * (Math.pow(xa, 3)) + valor2 * (Math.pow(xa, 2)) + valor1 * (Math.pow(xa, 1)) + valor);
                        System.out.println("fxa 2: " + fxa);

                        fxb = (valor5 * (Math.pow(xb, 5)) + valor4 * (Math.pow(xb, 4)) + valor3 * (Math.pow(xb, 3)) + valor2 * (Math.pow(xb, 2)) + valor1 * (Math.pow(xb, 1)) + valor);
                        System.out.println("fxb: " + fxb);//0

                        if (fxa == 0) {//**************
                            System.out.println("El valor ya se encontro fxa");
                            System.out.println("El valor es: " + xa + " Su RAIZ: " + fxa);
                            return;
                        } else if (fxb == 0) {
                            System.out.println("El valor ya se encontro fxb");
                            System.out.println("El valor es: " + xb + " Su RAIZ: " + fxb);
                            return;
                        }//-*********************
                        comp = fxa * fxb;

                        if (comp < 0) {
                            xrv = xr;
                            err = (Math.abs(xrn - xrv) / xr) * 100;
                            System.out.println("EE: " + err);
                            if (err <= ERROR) {
                                System.out.println("tu error es " + err);
                                return;
                            }

                            System.out.println("");
                            System.out.println("Si es el Intervalo");
                            System.out.println("Intervalo xa: " + xa);
                            System.out.println("Intervalo xb: " + xb);
                            do {
                                count++;
                                System.out.println("----ITERADOR---- " + count);
                                System.out.println("xa: " + xa + " xb: " + xb);
                                //----------------------------ERROR
                                xrv = xr;
                                xr = (xa + xb) / 2; //Punto Medio. 
                                System.out.println("raiz es xr: " + xr);
                                xrn = xr;
                                err = (Math.abs((xrn - xrv) / xrn) * 100);
                                System.out.println("EE: " + err);
                                if (err <= ERROR) {
                                    System.out.println("tu error es " + err);
                                    return;
                                }

                                //---------------------------------
                                fxr = (valor5 * (Math.pow(xr, 5)) + valor4 * (Math.pow(xr, 4)) + valor3 * (Math.pow(xr, 3)) + valor2 * (Math.pow(xr, 2)) + valor1 * (Math.pow(xr, 1)) + valor);// <--------
                                System.out.println("fxr: " + fxr);
                                if (fxr == 0) {
                                    System.out.println("Encontro la raiz: " + xr);
                                    return;
                                } else if (fxa * fxr < 0) {
                                    xb = xr;
                                } else if (fxb * fxr < 0) {
                                    xa = xr;
                                }
                            } while (1 != 0);
                            //Punto Medio
                        } else {
                            System.out.println("Intenta de Nuevo");
                        }
                        break;
                     */
                    case 6:
                        //do{
                        fxa = (valor6 * (Math.pow(xa, 6)) + valor5 * (Math.pow(xa, 5)) + valor4 * (Math.pow(xa, 4)) + valor3 * (Math.pow(xa, 3)) + valor2 * (Math.pow(xa, 2)) + valor1 * (Math.pow(xa, 1)) + valor);
                        //fxa = ((valor6* (Math.pow(xa, 6))) +(valor5* (Math.pow(xa, 5))) +(valor4* (Math.pow(xa, 4))) +(valor3* (Math.pow(xa, 3))) + (valor2 * (Math.pow(xa, 2))) + ((valor1 * (Math.pow(xa, 1)))) + valor);
                        System.out.println("fxa 2: " + String.format("%." + redondeo + "f", fxa));

                        fxb = ((valor6 * (Math.pow(xb, 6))) + (valor5 * (Math.pow(xb, 5))) + (valor4 * (Math.pow(xb, 4))) + (valor3 * (Math.pow(xb, 3))) + (valor2 * (Math.pow(xb, 2))) + ((valor1 * (Math.pow(xb, 1)))) + valor);
                        System.out.println("fxb: " + String.format("%." + redondeo + "f", fxb));//0

                        if (fxa == 0) {//**************
                            System.out.println("El valor ya se encontro fxa");
                            System.out.println("El valor es: " + xa + " Su RAIZ: " + String.format("%." + redondeo + "f", fxa));
                            return;
                        } else if (fxb == 0) {
                            System.out.println("El valor ya se encontro fxb");
                            System.out.println("El valor es: " + xb + " Su RAIZ: " + String.format("%." + redondeo + "f", fxb));
                            return;
                        }//-*********************
                        comp = fxa * fxb;
                        System.out.println("comp: " + comp);
                        if (comp < 0) {
                            System.out.println("Si es el Intervalo");
                            System.out.println("Intervalo xa: " + xa);
                            System.out.println("Intervalo xb: " + xb);
                            //primera aproximscion de la raiz
                            xr = (((fxa * xb) - (fxb * xa)) / (fxa - fxb));//aproximacion -0.083
                            xa = xr;
                            do {
                                count++;
                                System.out.println("------CONTADOR-----: " + count);
                                //xa se calcula para sacar el valor de fxa en su ecuacion
                                //fxa = ((valor6* (Math.pow(xa, 6))) +(valor5* (Math.pow(xa, 5))) +(valor4* (Math.pow(xa, 4))) +(valor3* (Math.pow(xa, 3))) + (valor2 * (Math.pow(xa, 2))) + ((valor1 * (Math.pow(xa, 1)))) + valor); //2.0827
                                fxa = (valor6 * (Math.pow(xa, 6)) + valor5 * (Math.pow(xa, 5)) + valor4 * (Math.pow(xa, 4)) + valor3 * (Math.pow(xa, 3)) + valor2 * (Math.pow(xa, 2)) + valor1 * (Math.pow(xa, 1)) + valor);
                                System.out.println("fxa: " + String.format("%." + redondeo + "f", fxa));//0
                                XRNV = XRN;

                                //se hace la formula iterativva XRN
                                XRN = xb - (((fxb * xa) - (fxb * xb)) / (fxa - fxb));
                                System.out.println("XRN: " + String.format("%." + redondeo + "f", XRN));//0

                                //System.out.println("fxa: " + fxa);
                                err = (Math.abs((XRN - XRNV) / XRN) * 100);
                                System.out.println("Error: " + err);
                                if (err <= ERROR) {
                                    System.out.println("tu error es " + err);
                                    return;
                                } else {
                                    xa = XRN;
                                }

                            } while (count <= 100);
                            //Punto Medio
                        } else {
                            System.out.println("Intenta de Nuevo Por favor: ");
                        }

                        break;

                    default:
                        System.out.println("Error en el switch");
                }

            }///action perfomand
        };

        pruebas();

        btndefinir.addActionListener(escuchador);//aqui el escuchador estara atento de lo que haga el btndefinir
        btncalcular.addActionListener(oido);

    }//GEN-LAST:event_btncargarsladerActionPerformed
    public void pruebas() {

        //grado 6
        btnspiner6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
                String nombre = "^[+-]?[0-9]{1,9}(?:\\.[0-9]{1,2})?$";
                Pattern patron = Pattern.compile(nombre);
                Matcher match = patron.matcher(btnspiner6.getText());
                if (match.find()) {
                    btncalcular.setEnabled(true);
                    txtintervalo1.setEnabled(true);
                    txtintervalo2.setEnabled(true);
                    txterror.setEnabled(true);
                    btncalcular.setEnabled(true);
                    txtredondeo.setEnabled(true);
                    btncalcular.setEnabled(true);
                } else {
                    //JOptionPane.showMessageDialog(this, "NO CARACTER ESPECIAL", "ERROR", JOptionPane.ERROR_MESSAGE);
                    txtintervalo1.setEnabled(false);
                    txtintervalo2.setEnabled(false);
                    txterror.setEnabled(false);
                    btncalcular.setEnabled(false);
                    txtredondeo.setEnabled(false);
                    return;
                }
            }
        });
        //gradi5 
        btnspiner5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
                String nombre = "^[+-]?[0-9]{1,9}(?:\\.[0-9]{1,2})?$";
                Pattern patron = Pattern.compile(nombre);
                Matcher match = patron.matcher(btnspiner5.getText());
                if (match.find()) {
                    btncalcular.setEnabled(true);
                    txtintervalo1.setEnabled(true);
                    txtintervalo2.setEnabled(true);
                    txterror.setEnabled(true);
                    btncalcular.setEnabled(true);
                    txtredondeo.setEnabled(true);
                    btncalcular.setEnabled(true);
                } else {
                    //JOptionPane.showMessageDialog(this, "NO CARACTER ESPECIAL", "ERROR", JOptionPane.ERROR_MESSAGE);
                    btncalcular.setEnabled(false);
                    txtintervalo1.setEnabled(false);
                    txtintervalo2.setEnabled(false);
                    txterror.setEnabled(false);
                    btncalcular.setEnabled(false);
                    txtredondeo.setEnabled(false);
                    return;
                }
            }
        });
        //grado 4
        btnspiner4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
                String nombre = "^[+-]?[0-9]{1,9}(?:\\.[0-9]{1,2})?$";
                Pattern patron = Pattern.compile(nombre);
                Matcher match = patron.matcher(btnspiner4.getText());
                if (match.find()) {
                    btncalcular.setEnabled(true);
                    txtintervalo1.setEnabled(true);
                    txtintervalo2.setEnabled(true);
                    txterror.setEnabled(true);
                    btncalcular.setEnabled(true);
                    txtredondeo.setEnabled(true);
                    btncalcular.setEnabled(true);
                } else {
                    //JOptionPane.showMessageDialog(this, "NO CARACTER ESPECIAL", "ERROR", JOptionPane.ERROR_MESSAGE);
                    btncalcular.setEnabled(false);
                    txtintervalo1.setEnabled(false);
                    txtintervalo2.setEnabled(false);
                    txterror.setEnabled(false);
                    btncalcular.setEnabled(false);
                    txtredondeo.setEnabled(false);
                    return;
                }
            }
        });
        // grdo 3
        btnspiner3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
                String nombre = "^[+-]?[0-9]{1,9}(?:\\.[0-9]{1,2})?$";
                Pattern patron = Pattern.compile(nombre);
                Matcher match = patron.matcher(btnspiner3.getText());
                if (match.find()) {
                    btncalcular.setEnabled(true);
                    txtintervalo1.setEnabled(true);
                    txtintervalo2.setEnabled(true);
                    txterror.setEnabled(true);
                    btncalcular.setEnabled(true);
                    txtredondeo.setEnabled(true);
                    btncalcular.setEnabled(true);
                } else {
                    //JOptionPane.showMessageDialog(this, "NO CARACTER ESPECIAL", "ERROR", JOptionPane.ERROR_MESSAGE);
                    btncalcular.setEnabled(false);
                    txtintervalo1.setEnabled(false);
                    txtintervalo2.setEnabled(false);
                    txterror.setEnabled(false);
                    btncalcular.setEnabled(false);
                    txtredondeo.setEnabled(false);
                    return;
                }
            }
        });
        //gradio 2
        btnspiner2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
                String nombre = "^[+-]?[0-9]{1,9}(?:\\.[0-9]{1,2})?$";
                Pattern patron = Pattern.compile(nombre);
                Matcher match = patron.matcher(btnspiner2.getText());
                if (match.find()) {
                    btncalcular.setEnabled(true);
                    txtintervalo1.setEnabled(true);
                    txtintervalo2.setEnabled(true);
                    txterror.setEnabled(true);
                    btncalcular.setEnabled(true);
                    txtredondeo.setEnabled(true);
                    btncalcular.setEnabled(true);
                } else {
                    //JOptionPane.showMessageDialog(this, "NO CARACTER ESPECIAL", "ERROR", JOptionPane.ERROR_MESSAGE);
                    btncalcular.setEnabled(false);
                    txtintervalo1.setEnabled(false);
                    txtintervalo2.setEnabled(false);
                    txterror.setEnabled(false);
                    btncalcular.setEnabled(false);
                    txtredondeo.setEnabled(false);
                    return;
                }
            }
        });
        // grado 1
        btnspiner1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
                String nombre = "^[+-]?[0-9]{1,9}(?:\\.[0-9]{1,2})?$";
                Pattern patron = Pattern.compile(nombre);
                Matcher match = patron.matcher(btnspiner1.getText());
                if (match.find()) {
                    btncalcular.setEnabled(true);
                    txtintervalo1.setEnabled(true);
                    txtintervalo2.setEnabled(true);
                    txterror.setEnabled(true);
                    btncalcular.setEnabled(true);
                    txtredondeo.setEnabled(true);
                    btncalcular.setEnabled(true);
                } else {
                    //JOptionPane.showMessageDialog(this, "NO CARACTER ESPECIAL", "ERROR", JOptionPane.ERROR_MESSAGE);
                    btncalcular.setEnabled(false);
                    txtintervalo1.setEnabled(false);
                    txtintervalo2.setEnabled(false);
                    txterror.setEnabled(false);
                    btncalcular.setEnabled(false);
                    txtredondeo.setEnabled(false);
                    return;
                }
            }
        });
        //constante
        btnspiner.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
                String nombre = "^[+-]?[0-9]{1,9}(?:\\.[0-9]{1,2})?$";
                Pattern patron = Pattern.compile(nombre);
                Matcher match = patron.matcher(btnspiner.getText());
                if (match.find()) {
                    btncalcular.setEnabled(true);
                    txtintervalo1.setEnabled(true);
                    txtintervalo2.setEnabled(true);
                    txterror.setEnabled(true);
                    btncalcular.setEnabled(true);
                    txtredondeo.setEnabled(true);
                    btncalcular.setEnabled(true);
                } else {
                    //JOptionPane.showMessageDialog(this, "NO CARACTER ESPECIAL", "ERROR", JOptionPane.ERROR_MESSAGE);
                    btncalcular.setEnabled(false);
                    txtintervalo1.setEnabled(false);
                    txtintervalo2.setEnabled(false);
                    txterror.setEnabled(false);
                    btncalcular.setEnabled(false);
                    txtredondeo.setEnabled(false);
                    return;
                }
            }
        });
        txtintervalo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
                String nombre = "^[+-]?[0-9]{1,9}(?:\\.[0-9]{1,2})?$";
                Pattern patron = Pattern.compile(nombre);
                Matcher match = patron.matcher(txtintervalo1.getText());
                if (match.find()) {
                    btncalcular.setEnabled(true);

                    txtintervalo2.setEnabled(true);
                    txterror.setEnabled(true);
                    btncalcular.setEnabled(true);
                    txtredondeo.setEnabled(true);
                    btncalcular.setEnabled(true);
                } else {
                    //JOptionPane.showMessageDialog(this, "NO CARACTER ESPECIAL", "ERROR", JOptionPane.ERROR_MESSAGE);
                    btncalcular.setEnabled(false);

                    txtintervalo2.setEnabled(false);
                    txterror.setEnabled(false);
                    btncalcular.setEnabled(false);
                    txtredondeo.setEnabled(false);
                    return;
                }
            }
        });
        txtintervalo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
                String nombre = "^[+-]?[0-9]{1,9}(?:\\.[0-9]{1,2})?$";
                Pattern patron = Pattern.compile(nombre);
                Matcher match = patron.matcher(txtintervalo2.getText());
                if (match.find()) {
                    btncalcular.setEnabled(true);

                    txterror.setEnabled(true);
                    btncalcular.setEnabled(true);
                    txtredondeo.setEnabled(true);
                    btncalcular.setEnabled(true);
                } else {
                    //JOptionPane.showMessageDialog(this, "NO CARACTER ESPECIAL", "ERROR", JOptionPane.ERROR_MESSAGE);
                    btncalcular.setEnabled(false);

                    txterror.setEnabled(false);
                    btncalcular.setEnabled(false);
                    txtredondeo.setEnabled(false);
                    return;
                }
            }
        });
        txterror.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
                String nombre = "^[+-]?(\\d*\\.)?\\d+$";
                Pattern patron = Pattern.compile(nombre);
                Matcher match = patron.matcher(txterror.getText());
                if (match.find()) {
                    btncalcular.setEnabled(true);

                    btncalcular.setEnabled(true);
                    txtredondeo.setEnabled(true);
                    btncalcular.setEnabled(true);
                } else {
                    //JOptionPane.showMessageDialog(this, "NO CARACTER ESPECIAL", "ERROR", JOptionPane.ERROR_MESSAGE);
                    btncalcular.setEnabled(false);

                    btncalcular.setEnabled(false);
                    txtredondeo.setEnabled(false);
                    return;
                }
            }
        });
        txtredondeo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
                String nombre = "^[+-]?[0-9]{1,9}(?:\\.[0-9]{1,2})?$";
                Pattern patron = Pattern.compile(nombre);
                Matcher match = patron.matcher(txtredondeo.getText());
                if (match.find()) {

                    btncalcular.setEnabled(true);
                } else {
                    //JOptionPane.showMessageDialog(this, "NO CARACTER ESPECIAL", "ERROR", JOptionPane.ERROR_MESSAGE);
                    btncalcular.setEnabled(false);

                    return;
                }
            }
        });

    }

    public void continuacion() {

        System.out.println("Intervalo xa: " + xa);
        System.out.println("Intervalo xb: " + xb);
        //primera aproximscion de la raiz
        xr = (((fxa * xb) - (fxb * xa)) / (fxa - fxb));//aproximacion -0.083
        xa = xr;
        do {
            count++;
            System.out.println("------CONTADOR-----: " + count);
            //xa se calcula para sacar el valor de fxa en su ecuacion
            //fxa = ((valor6* (Math.pow(xa, 6))) +(valor5* (Math.pow(xa, 5))) +(valor4* (Math.pow(xa, 4))) +(valor3* (Math.pow(xa, 3))) + (valor2 * (Math.pow(xa, 2))) + ((valor1 * (Math.pow(xa, 1)))) + valor); //2.0827
            fxa = (valor6 * (Math.pow(xa, 6)) + valor5 * (Math.pow(xa, 5)) + valor4 * (Math.pow(xa, 4)) + valor3 * (Math.pow(xa, 3)) + valor2 * (Math.pow(xa, 2)) + valor1 * (Math.pow(xa, 1)) + valor);
            System.out.println("fxa: " + String.format("%." + redondeo + "f", fxa));//0
            XRNV = XRN;

            //se hace la formula iterativva XRN
            XRN = xb - (((fxb * xa) - (fxb * xb)) / (fxa - fxb));
            System.out.println("XRN: " + String.format("%." + redondeo + "f", XRN));//0

            //System.out.println("fxa: " + fxa);
            err = (Math.abs((XRN - XRNV) / XRN) * 100);
            System.out.println("Error: " + err);
            if (err <= ERROR) {
                System.out.println("tu error es " + err);
                return;
            } else {
                xa = XRN;
            }

        } while (count <= 100);

    }
    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:

        int salir = 1;
        salir = JOptionPane.showConfirmDialog(rootPane, "Estas seguro de querer salir", "SI o No", JOptionPane.YES_NO_CANCEL_OPTION);
        if (salir == 0) {
            System.exit(0);
        }

    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        btndefinir.setVisible(false);
        lblSeleccionGrado.setVisible(false);
        lblGrado.setVisible(false);
        sldGrado.setVisible(false);
        btnspiner.setVisible(false);
        btnspiner1.setVisible(false);
        btnspiner2.setVisible(false);
        btnspiner3.setVisible(false);
        btnspiner4.setVisible(false);
        btnspiner5.setVisible(false);
        btnspiner6.setVisible(false);
        lblgrado.setVisible(false);
        lblgrado1.setVisible(false);
        lblgrado2.setVisible(false);
        lblgrado3.setVisible(false);
        lblgrado4.setVisible(false);
        lblgrado5.setVisible(false);
        lblgrado6.setVisible(false);
        lblintervalo1.setVisible(false);
        txtintervalo1.setVisible(false);
        lblintervalo2.setVisible(false);
        txtintervalo2.setVisible(false);
        lblerror.setVisible(false);
        txterror.setVisible(false);
        lblredondeo.setVisible(false);
        txtredondeo.setVisible(false);
        btncalcular.setVisible(false);


    }//GEN-LAST:event_btnresetActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "hola te doy la bienvenida a mi mini grafico", " Acerca DE", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void sldGradoStateChanged(javax.swing.event.ChangeEvent evt) {
        lblSeleccionGrado.setText(sldGrado.getValue() + "");
    }

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
            java.util.logging.Logger.getLogger(Regla_falsa_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Regla_falsa_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Regla_falsa_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Regla_falsa_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Regla_falsa_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnarchivo;
    private javax.swing.JMenuItem btncargarslader;
    private javax.swing.JMenu btnedicion;
    private javax.swing.JMenuItem btnreset;
    private javax.swing.JMenuItem btnsalir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel jpFormulario;
    // End of variables declaration//GEN-END:variables
}
