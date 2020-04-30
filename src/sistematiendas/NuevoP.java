/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistematiendas;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author JAFET
 */
public class NuevoP extends javax.swing.JFrame {

    private int index;
    private boolean modificar=false;
    static String tema="";
    
    public NuevoP(int indice,boolean modificar, String tema) {
        initComponents();
        this.modificar=modificar;
        this.tema=tema;
        setLocationRelativeTo(null);
        this.index=indice;
        jbguardar.setEnabled(false);
        if(modificar){
            try {
                hacerImpresion(tema);
            } catch (IOException ex) {
                Logger.getLogger(NuevoP.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(NuevoP.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public NuevoP() {
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txttitulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jsprecio = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        txtmarca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtmodelo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbxgenero = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbxedad = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtmaterial = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdescripccion = new javax.swing.JTextArea();
        jbguardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese el titulo");

        txttitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttituloKeyTyped(evt);
            }
        });

        jLabel2.setText("Ingrese el precio");

        jsprecio.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));

        jLabel3.setText("Marca del producto");

        jLabel4.setText("Modelo del producto");

        jLabel5.setText("Genero");

        cbxgenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin genero", "Masculino", "Femenino" }));

        jLabel6.setText("Edad");

        cbxedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin edad", "Adulto", "Adolecente", "Niño", "Para todo el publico" }));

        jLabel7.setText("material");

        jLabel8.setText("Descripccion:");

        txtdescripccion.setColumns(20);
        txtdescripccion.setRows(5);
        jScrollPane1.setViewportView(txtdescripccion);

        jbguardar.setText("Guardar");
        jbguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbguardarActionPerformed(evt);
            }
        });

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(191, 191, 191)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jsprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))
                        .addGap(84, 84, 84)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(84, 84, 84)
                        .addComponent(jbguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(cbxgenero, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(cbxedad, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(txtmaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txttitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jsprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jbguardar)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxgenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton2)))
                .addGap(2, 2, 2)
                .addComponent(jLabel6)
                .addGap(10, 10, 10)
                .addComponent(cbxedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(txtmaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbguardarActionPerformed
         
        String titulo=txttitulo.getText();
         String aux=jsprecio.getValue().toString();
         double precio=Double.parseDouble(aux);
         String marca=txtmarca.getText();
         String modelo=txtmodelo.getText();
         String genero=cbxgenero.getSelectedItem().toString();
         String edad=cbxedad.getSelectedItem().toString();
         String material=txtmaterial.getText();
         String descripccion=txtdescripccion.getText();
         
         if(!modificar){
            switch (index){
                case 1:FuncionVehi autos=new FuncionVehi();
                    try {
                        autos.pedirD(titulo, precio, marca, modelo, genero, edad, material, descripccion);
                    } catch (IOException ex) {
                        Logger.getLogger(NuevoP.class.getName()).log(Level.SEVERE, null, ex);
                    }

                break;

                case 2:FuncionSuper datosS=new FuncionSuper();
                        try {
                                datosS.pedirD(titulo, precio, marca, modelo, genero, edad, material, descripccion);
                            } catch (IOException ex) {
                                Logger.getLogger(NuevoP.class.getName()).log(Level.SEVERE, null, ex);
                            }
                break;

                case 4:FuncionDep datosDep=new FuncionDep();
                      try {
                                datosDep.pedirD(titulo, precio, marca, modelo, genero, edad, material, descripccion);
                            } catch (IOException ex) {
                                Logger.getLogger(NuevoP.class.getName()).log(Level.SEVERE, null, ex);
                            }
                break;

                case 3:FuncionAccesorios datosA=new FuncionAccesorios();
                    try {
                                datosA.pedirD(titulo, precio, marca, modelo, genero, edad, material, descripccion);
                            } catch (IOException ex) {
                                Logger.getLogger(NuevoP.class.getName()).log(Level.SEVERE, null, ex);
                            }
                break;

                case 5:FuncionCompu datosC=new FuncionCompu();
                            try {
                                datosC.pedirD(titulo, precio, marca, modelo, genero, edad, material, descripccion);
                            } catch (IOException ex) {
                                Logger.getLogger(NuevoP.class.getName()).log(Level.SEVERE, null, ex);
                            }
                break;

                case 6:FuncionVideoj datosVi=new FuncionVideoj();
                    try {
                                datosVi.pedirD(titulo, precio, marca, modelo, genero, edad, material, descripccion);
                            } catch (IOException ex) {
                                Logger.getLogger(NuevoP.class.getName()).log(Level.SEVERE, null, ex);
                            }
                break;

                case 7:FuncionElectro datosE=new FuncionElectro();
                                    try {
                                datosE.pedirD(titulo, precio, marca, modelo, genero, edad, material, descripccion);
                            } catch (IOException ex) {
                                Logger.getLogger(NuevoP.class.getName()).log(Level.SEVERE, null, ex);
                            }
                break;

                case 8:FuncionInmuebles datosI=new FuncionInmuebles();
                    try {
                                datosI.pedirD(titulo, precio, marca, modelo, genero, edad, material, descripccion);
                            } catch (IOException ex) {
                                Logger.getLogger(NuevoP.class.getName()).log(Level.SEVERE, null, ex);
                            }
                break;

                case 9:FuncionRyC datosRyC=new FuncionRyC();
                    try {
                                datosRyC.pedirD(titulo, precio, marca, modelo, genero, edad, material, descripccion);
                            } catch (IOException ex) {
                                Logger.getLogger(NuevoP.class.getName()).log(Level.SEVERE, null, ex);
                            }
                break;

                case 10:FuncionTelefonia datosT=new FuncionTelefonia();
                    try {
                                datosT.pedirD(titulo, precio, marca, modelo, genero, edad, material, descripccion);
                            } catch (IOException ex) {
                                Logger.getLogger(NuevoP.class.getName()).log(Level.SEVERE, null, ex);
                            }
                break;

                case 11:FuncionAV datosAV=new FuncionAV();
                    try {
                                datosAV.pedirD(titulo, precio, marca, modelo, genero, edad, material, descripccion);
                            } catch (IOException ex) {
                                Logger.getLogger(NuevoP.class.getName()).log(Level.SEVERE, null, ex);
                            }
                break;

                case 12:FuncionMuebles datosM=new FuncionMuebles();
                    try {
                                datosM.pedirD(titulo, precio, marca, modelo, genero, edad, material, descripccion);
                            } catch (IOException ex) {
                                Logger.getLogger(NuevoP.class.getName()).log(Level.SEVERE, null, ex);
                            }
                break;

                case 13:FuncionJuguetes datosJ=new FuncionJuguetes();
                    try {
                                datosJ.pedirD(titulo, precio, marca, modelo, genero, edad, material, descripccion);
                            } catch (IOException ex) {
                                Logger.getLogger(NuevoP.class.getName()).log(Level.SEVERE, null, ex);
                            }
                break;

                case 14:FuncionPersonal datosCP=new FuncionPersonal();
                    try {
                                datosCP.pedirD(titulo, precio, marca, modelo, genero, edad, material, descripccion);
                            } catch (IOException ex) {
                                Logger.getLogger(NuevoP.class.getName()).log(Level.SEVERE, null, ex);
                            }
                break;
            }
        }else{
            try {
                guardarModificado(titulo, precio, marca, modelo, genero, edad, material, descripccion);
            } catch (IOException ex) {
                Logger.getLogger(NuevoP.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(NuevoP.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
        txttitulo.setText("");txtmarca.setText("");
        txtmodelo.setText("");txtmaterial.setText("");
        txtdescripccion.setText("");
    }//GEN-LAST:event_jbguardarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        TablasModif reg=new TablasModif(index);
        reg.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txttituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttituloKeyTyped
        if(txttitulo.getText().length()==0){
            jbguardar.setEnabled(false);
        }else{
            jbguardar.setEnabled(true);
        }
    }//GEN-LAST:event_txttituloKeyTyped

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
            java.util.logging.Logger.getLogger(NuevoP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxedad;
    private javax.swing.JComboBox<String> cbxgenero;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbguardar;
    private javax.swing.JSpinner jsprecio;
    private javax.swing.JTextArea txtdescripccion;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtmaterial;
    private javax.swing.JTextField txtmodelo;
    private javax.swing.JTextField txttitulo;
    // End of variables declaration//GEN-END:variables
    String titu;
    double precio;
    String marca;
    String modelo;
    String genero;
    String edad;
    String material;
    String descripccion;
    int indice=0;
    void hacerImpresion(String titulo) throws IOException, FileNotFoundException, ClassNotFoundException{
        switch (index){
            case 1:FuncionVehi autos=new FuncionVehi();
                indice=autos.getIndice(tema);
                //ahora tengo que pedir que me devuelva todos los atributos del producto titulo
                titu=autos.dameTitulo(indice);
                precio=autos.damePrecio(indice);
                marca=autos.dameMarca(indice);
                modelo=autos.dameModelo(indice);
                genero=autos.dameGenero(indice);
                edad=autos.dameEdad(indice);
                material=autos.dameMaterial(indice);
                descripccion=autos.dameDescripccion(indice);
                //los mostramos en la pantalla de this.estaVentana con un set
                txttitulo.setText(titu);
                txtmarca.setText(marca);
                txtmodelo.setText(modelo);
                txtmaterial.setText(material);
                txtdescripccion.setText(descripccion);
            break;
         //tenemos que hacer esto para todos los casos       
            case 2:FuncionSuper datosS=new FuncionSuper();
                indice=datosS.getIndice(tema);
                //ahora tengo que pedir que me devuelva todos los atributos del producto titulo
                titu=datosS.dameTitulo(indice);
                precio=datosS.damePrecio(indice);
                marca=datosS.dameMarca(indice);
                modelo=datosS.dameModelo(indice);
                genero=datosS.dameGenero(indice);
                edad=datosS.dameEdad(indice);
                material=datosS.dameMaterial(indice);
                descripccion=datosS.dameDescripccion(indice);
                //los mostramos en la pantalla de this.estaVentana con un set
                txttitulo.setText(titu);
                txtmarca.setText(marca);
                txtmodelo.setText(modelo);
                txtmaterial.setText(material);
                txtdescripccion.setText(descripccion);
            break;
            case 4:FuncionDep datosDep=new FuncionDep();
                indice=datosDep.getIndice(tema);
                //ahora tengo que pedir que me devuelva todos los atributos del producto titulo
                titu=datosDep.dameTitulo(indice);
                precio=datosDep.damePrecio(indice);
                marca=datosDep.dameMarca(indice);
                modelo=datosDep.dameModelo(indice);
                genero=datosDep.dameGenero(indice);
                edad=datosDep.dameEdad(indice);
                material=datosDep.dameMaterial(indice);
                descripccion=datosDep.dameDescripccion(indice);
                //los mostramos en la pantalla de this.estaVentana con un set
                txttitulo.setText(titu);
                txtmarca.setText(marca);
                txtmodelo.setText(modelo);
                txtmaterial.setText(material);
                txtdescripccion.setText(descripccion);
            break;
            case 3:FuncionAccesorios datosA=new FuncionAccesorios();
                indice=datosA.getIndice(tema);
                //ahora tengo que pedir que me devuelva todos los atributos del producto titulo
                titu=datosA.dameTitulo(indice);
                precio=datosA.damePrecio(indice);
                marca=datosA.dameMarca(indice);
                modelo=datosA.dameModelo(indice);
                genero=datosA.dameGenero(indice);
                edad=datosA.dameEdad(indice);
                material=datosA.dameMaterial(indice);
                descripccion=datosA.dameDescripccion(indice);
                //los mostramos en la pantalla de this.estaVentana con un set
                txttitulo.setText(titu);
                txtmarca.setText(marca);
                txtmodelo.setText(modelo);
                txtmaterial.setText(material);
                txtdescripccion.setText(descripccion);
            break;
            case 5:FuncionCompu datosC=new FuncionCompu();
                indice=datosC.getIndice(tema);
                //ahora tengo que pedir que me devuelva todos los atributos del producto titulo
                titu=datosC.dameTitulo(indice);
                precio=datosC.damePrecio(indice);
                marca=datosC.dameMarca(indice);
                modelo=datosC.dameModelo(indice);
                genero=datosC.dameGenero(indice);
                edad=datosC.dameEdad(indice);
                material=datosC.dameMaterial(indice);
                descripccion=datosC.dameDescripccion(indice);
                //los mostramos en la pantalla de this.estaVentana con un set
                txttitulo.setText(titu);
                txtmarca.setText(marca);
                txtmodelo.setText(modelo);
                txtmaterial.setText(material);
                txtdescripccion.setText(descripccion);
            break;
            case 6: FuncionVideoj datosVi=new FuncionVideoj();
                indice=datosVi.getIndice(tema);
                //ahora tengo que pedir que me devuelva todos los atributos del producto titulo
                titu=datosVi.dameTitulo(indice);
                precio=datosVi.damePrecio(indice);
                marca=datosVi.dameMarca(indice);
                modelo=datosVi.dameModelo(indice);
                genero=datosVi.dameGenero(indice);
                edad=datosVi.dameEdad(indice);
                material=datosVi.dameMaterial(indice);
                descripccion=datosVi.dameDescripccion(indice);
                //los mostramos en la pantalla de this.estaVentana con un set
                txttitulo.setText(titu);
                txtmarca.setText(marca);
                txtmodelo.setText(modelo);
                txtmaterial.setText(material);
                txtdescripccion.setText(descripccion);
            break;
            case 7:FuncionElectro datosE=new FuncionElectro();
                indice=datosE.getIndice(tema);
                //ahora tengo que pedir que me devuelva todos los atributos del producto titulo
                titu=datosE.dameTitulo(indice);
                precio=datosE.damePrecio(indice);
                marca=datosE.dameMarca(indice);
                modelo=datosE.dameModelo(indice);
                genero=datosE.dameGenero(indice);
                edad=datosE.dameEdad(indice);
                material=datosE.dameMaterial(indice);
                descripccion=datosE.dameDescripccion(indice);
                //los mostramos en la pantalla de this.estaVentana con un set
                txttitulo.setText(titu);
                txtmarca.setText(marca);
                txtmodelo.setText(modelo);
                txtmaterial.setText(material);
                txtdescripccion.setText(descripccion);
            break;
            case 8:FuncionInmuebles datosI=new FuncionInmuebles();
                indice=datosI.getIndice(tema);
                //ahora tengo que pedir que me devuelva todos los atributos del producto titulo
                titu=datosI.dameTitulo(indice);
                precio=datosI.damePrecio(indice);
                marca=datosI.dameMarca(indice);
                modelo=datosI.dameModelo(indice);
                genero=datosI.dameGenero(indice);
                edad=datosI.dameEdad(indice);
                material=datosI.dameMaterial(indice);
                descripccion=datosI.dameDescripccion(indice);
                //los mostramos en la pantalla de this.estaVentana con un set
                txttitulo.setText(titu);
                txtmarca.setText(marca);
                txtmodelo.setText(modelo);
                txtmaterial.setText(material);
                txtdescripccion.setText(descripccion);
            break;
            case 9:FuncionRyC datosRyC=new FuncionRyC();
                indice=datosRyC.getIndice(tema);
                //ahora tengo que pedir que me devuelva todos los atributos del producto titulo
                titu=datosRyC.dameTitulo(indice);
                precio=datosRyC.damePrecio(indice);
                marca=datosRyC.dameMarca(indice);
                modelo=datosRyC.dameModelo(indice);
                genero=datosRyC.dameGenero(indice);
                edad=datosRyC.dameEdad(indice);
                material=datosRyC.dameMaterial(indice);
                descripccion=datosRyC.dameDescripccion(indice);
                //los mostramos en la pantalla de this.estaVentana con un set
                txttitulo.setText(titu);
                txtmarca.setText(marca);
                txtmodelo.setText(modelo);
                txtmaterial.setText(material);
                txtdescripccion.setText(descripccion);
            break;
            case 10:FuncionTelefonia datosT=new FuncionTelefonia();
                indice=datosT.getIndice(tema);
                //ahora tengo que pedir que me devuelva todos los atributos del producto titulo
                titu=datosT.dameTitulo(indice);
                precio=datosT.damePrecio(indice);
                marca=datosT.dameMarca(indice);
                modelo=datosT.dameModelo(indice);
                genero=datosT.dameGenero(indice);
                edad=datosT.dameEdad(indice);
                material=datosT.dameMaterial(indice);
                descripccion=datosT.dameDescripccion(indice);
                //los mostramos en la pantalla de this.estaVentana con un set
                txttitulo.setText(titu);
                txtmarca.setText(marca);
                txtmodelo.setText(modelo);
                txtmaterial.setText(material);
                txtdescripccion.setText(descripccion);
            break;
            case 11:FuncionAV datosAV=new FuncionAV();
                indice=datosAV.getIndice(tema);
                //ahora tengo que pedir que me devuelva todos los atributos del producto titulo
                titu=datosAV.dameTitulo(indice);
                precio=datosAV.damePrecio(indice);
                marca=datosAV.dameMarca(indice);
                modelo=datosAV.dameModelo(indice);
                genero=datosAV.dameGenero(indice);
                edad=datosAV.dameEdad(indice);
                material=datosAV.dameMaterial(indice);
                descripccion=datosAV.dameDescripccion(indice);
                //los mostramos en la pantalla de this.estaVentana con un set
                txttitulo.setText(titu);
                txtmarca.setText(marca);
                txtmodelo.setText(modelo);
                txtmaterial.setText(material);
                txtdescripccion.setText(descripccion);
            break;
            case 12:FuncionMuebles datosM=new FuncionMuebles();
                indice=datosM.getIndice(tema);
                //ahora tengo que pedir que me devuelva todos los atributos del producto titulo
                titu=datosM.dameTitulo(indice);
                precio=datosM.damePrecio(indice);
                marca=datosM.dameMarca(indice);
                modelo=datosM.dameModelo(indice);
                genero=datosM.dameGenero(indice);
                edad=datosM.dameEdad(indice);
                material=datosM.dameMaterial(indice);
                descripccion=datosM.dameDescripccion(indice);
                //los mostramos en la pantalla de this.estaVentana con un set
                txttitulo.setText(titu);
                txtmarca.setText(marca);
                txtmodelo.setText(modelo);
                txtmaterial.setText(material);
                txtdescripccion.setText(descripccion);
            break;
            case 13:FuncionJuguetes datosJ=new FuncionJuguetes();
                indice=datosJ.getIndice(tema);
                //ahora tengo que pedir que me devuelva todos los atributos del producto titulo
                titu=datosJ.dameTitulo(indice);
                precio=datosJ.damePrecio(indice);
                marca=datosJ.dameMarca(indice);
                modelo=datosJ.dameModelo(indice);
                genero=datosJ.dameGenero(indice);
                edad=datosJ.dameEdad(indice);
                material=datosJ.dameMaterial(indice);
                descripccion=datosJ.dameDescripccion(indice);
                //los mostramos en la pantalla de this.estaVentana con un set
                txttitulo.setText(titu);
                txtmarca.setText(marca);
                txtmodelo.setText(modelo);
                txtmaterial.setText(material);
                txtdescripccion.setText(descripccion);
            break;
            case 14:FuncionPersonal datosCP=new FuncionPersonal();
                indice=datosCP.getIndice(tema);
                //ahora tengo que pedir que me devuelva todos los atributos del producto titulo
                titu=datosCP.dameTitulo(indice);
                precio=datosCP.damePrecio(indice);
                marca=datosCP.dameMarca(indice);
                modelo=datosCP.dameModelo(indice);
                genero=datosCP.dameGenero(indice);
                edad=datosCP.dameEdad(indice);
                material=datosCP.dameMaterial(indice);
                descripccion=datosCP.dameDescripccion(indice);
                //los mostramos en la pantalla de this.estaVentana con un set
                txttitulo.setText(titu);
                txtmarca.setText(marca);
                txtmodelo.setText(modelo);
                txtmaterial.setText(material);
                txtdescripccion.setText(descripccion);
            break;
            default: JOptionPane.showMessageDialog(null, "Ha ocurrido un error, algun datos no coincide con los esperados", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    void guardarModificado(String titulo, double precio, String marca, String modelo, String genero, String edad, String material, String descripccion) throws IOException, FileNotFoundException, ClassNotFoundException{
        switch (index){
            case 1:FuncionVehi autos=new FuncionVehi();
                titu=autos.dameTitulo(indice);
                autos.Borrar(titu);
                autos.pedirD(titulo, precio, marca, modelo, genero, edad, material, descripccion);
            break;
            //hacemos los mismo para los catorce casos
            case 2:FuncionSuper datosS=new FuncionSuper();
            //y en las funciones copeamos y pegamos el metodo  get Indice
                datosS.Borrar(titu);
                datosS.pedirD(titulo, precio, marca, modelo, genero, edad, material, descripccion);
            break;
            case 4:FuncionDep datosDep=new FuncionDep();
                datosDep.Borrar(titu);
                datosDep.pedirD(titulo, precio, marca, modelo, genero, edad, material, descripccion);
            break;
            case 3:FuncionAccesorios datosA=new FuncionAccesorios();
                datosA.Borrar(titu);
                datosA.pedirD(titulo, precio, marca, modelo, genero, edad, material, descripccion);
            break;
            case 5:FuncionCompu datosC=new FuncionCompu();
                datosC.Borrar(titu);
                datosC.pedirD(titulo, precio, marca, modelo, genero, edad, material, descripccion);
            break;
            case 6:FuncionVideoj datosVi=new FuncionVideoj();
                datosVi.Borrar(titu);
                datosVi.pedirD(titulo, precio, marca, modelo, genero, edad, material, descripccion);
            break;
            case 7:FuncionElectro datosE=new FuncionElectro();
                datosE.Borrar(titu);
                datosE.pedirD(titulo, precio, marca, modelo, genero, edad, material, descripccion);
            break;
            case 8:FuncionInmuebles datosI=new FuncionInmuebles();
                datosI.Borrar(titu);
                datosI.pedirD(titulo, precio, marca, modelo, genero, edad, material, descripccion);
            break;
            case 9:FuncionRyC datosRyC=new FuncionRyC();
                datosRyC.Borrar(titu);
                datosRyC.pedirD(titulo, precio, marca, modelo, genero, edad, material, descripccion);
            break;
            case 10:FuncionTelefonia datosT=new FuncionTelefonia();
                datosT.Borrar(titu);
                datosT.pedirD(titulo, precio, marca, modelo, genero, edad, material, descripccion);
            break;
            case 11:FuncionAV datosAV=new FuncionAV();
                datosAV.Borrar(titu);
                datosAV.pedirD(titulo, precio, marca, modelo, genero, edad, material, descripccion);
            break;
            case 12:FuncionMuebles datosM=new FuncionMuebles();
                datosM.Borrar(titu);
                datosM.pedirD(titulo, precio, marca, modelo, genero, edad, material, descripccion);
            break;
            case 13:FuncionJuguetes datosJ=new FuncionJuguetes();
                datosJ.Borrar(titu);
                datosJ.pedirD(titulo, precio, marca, modelo, genero, edad, material, descripccion);
            break;
            case 14:FuncionPersonal datosCP=new FuncionPersonal();
                datosCP.Borrar(titu);
                datosCP.pedirD(titulo, precio, marca, modelo, genero, edad, material, descripccion);
            break;
        }
    }
    
}
