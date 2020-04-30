package sistematiendas;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JAFET
 */
public class Tablas extends javax.swing.JFrame {
    
    ArrayList<VariablesProductos> datos=new ArrayList();
    public Tablas(int opc) {
        initComponents();
        setLocationRelativeTo(null);
        preparar();
        try{
        seleccion(opc);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public Tablas() {
    }
    
    FuncionVehi autos=new FuncionVehi();
    VariablesProductos atributos=new VariablesProductos();
    
    void llenarArrayV() throws IOException, FileNotFoundException, ClassNotFoundException{
        String titulo;
        double precio;
        String marca;
        String modelo;
        String genero;
        String edad;
        String material;
        String descripccion;
        for (int i = 0; i < autos.tamanoArray(); i++) {
            titulo=autos.dameTitulo(i);
            precio=autos.damePrecio(i);
            marca=autos.dameMarca(i);
            modelo=autos.dameModelo(i);
            genero=autos.dameGenero(i);
            edad=autos.dameEdad(i);
            material=autos.dameMaterial(i);
            descripccion=autos.dameDescripccion(i);
            atributos=new VariablesProductos(titulo, precio, marca, modelo, genero, edad, material, descripccion);
            datos.add(atributos);
        }
       llenar();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(229, 223, 223));

        jPanel2.setBackground(new java.awt.Color(1, 131, 131));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setForeground(new java.awt.Color(245, 222, 163));
        jLabel4.setText("Mis compras");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(245, 222, 163));
        jLabel7.setText("Ofertas");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(245, 222, 163));
        jLabel6.setText("Tiendas oficiales");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(245, 222, 163));
        jLabel5.setText("Ayuda");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa11.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tienda.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/shopping.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Button31.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(61, 61, 61)
                .addComponent(jLabel5)
                .addGap(68, 68, 68)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addGap(146, 146, 146)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(54, 54, 54))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Titulo", "Precio", "Marca", "Modelo", "Genero", "Edad", "Material", "Descripccion"
            }
        ));
        jtbl.setAutoscrolls(false);
        jtbl.setRowHeight(40);
        jScrollPane1.setViewportView(jtbl);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresarNopresion.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AgregarNopress.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(44, 44, 44)
                .addComponent(jLabel9)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        jLabel7.setForeground(new java.awt.Color(245, 222, 163));
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jLabel6.setForeground(new java.awt.Color(245, 222, 163));
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setForeground(new java.awt.Color(245, 222, 163));
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        jLabel4.setForeground(new java.awt.Color(245, 222, 163));
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        try {
            autos.LeerJ();
        } catch (IOException ex) {
            Logger.getLogger(Tablas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Tablas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/shopping2.png")));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/shopping.png")));
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        this.dispose();
        MenuUser reg=new MenuUser();
        reg.setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresarPresionado.png")));
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresarNopresion.png")));
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AgregarPressing.png")));
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AgregarNopress.png")));
    }//GEN-LAST:event_jLabel10MouseExited

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
            java.util.logging.Logger.getLogger(Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable jtbl;
    // End of variables declaration//GEN-END:variables
    private void llenar(){
        String matriz[][]=new String [datos.size()][8];
        
        for (int i = 0; i < datos.size(); i++) {
            matriz[i][0]=datos.get(i).getTitulo();
            matriz[i][1]=String.valueOf(datos.get(i).getPrecio());
            matriz[i][2]=datos.get(i).getMarca();
            matriz[i][3]=datos.get(i).getModelo();
            matriz[i][4]=datos.get(i).getGenero();
            matriz[i][5]=datos.get(i).getEdad();
            matriz[i][6]=datos.get(i).getMaterial();
            matriz[i][7]=datos.get(i).getDescripccion();
            
            jtbl.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Titulo", "Precio", "Marca", "Modelo", "Genero", "Edad", "Material", "Descripccion"
            }
        ));
        }
    }
    
    public void seleccion(int opc) throws IOException, FileNotFoundException, ClassNotFoundException{
        switch (opc){
            case 1:llenarArrayV();
            break;
            
            case 2:llenarArrayS();
            break;
            
            case 4:llenarArrayD();
            break;
            
            case 3:llenarArrayA();
            break;
            
            case 5:llenarArrayC();
            break;
            
            case 6:llenarArrayVideo();
            break;
            
            case 7:llenarArrayE();
            break;
            
            case 8:llenarArrayI();
            break;
            
            case 9:llenarArrayRyC();
            break;
            
            case 10:llenarArrayT();
            break;
            
            case 11:llenarArrayAV();
            break;
            
            case 12:llenarArrayM();
            break;
            
            case 13:llenarArrayJ();
            break;
            
            case 14:llenarArrayCP();
            break;
        }
    }
    
    FuncionSuper datosS=new FuncionSuper();
    //llenamos el array del supermercado
    private void llenarArrayS() throws IOException, FileNotFoundException, ClassNotFoundException{
        String titulo;
        double precio;
        String marca;
        String modelo;
        String genero;
        String edad;
        String material;
        String descripccion;
        for (int i = 0; i < datosS.tamanoArray(); i++) {
            titulo=datosS.dameTitulo(i);
            precio=datosS.damePrecio(i);
            marca=datosS.dameMarca(i);
            modelo=datosS.dameModelo(i);
            genero=datosS.dameGenero(i);
            edad=datosS.dameEdad(i);
            material=datosS.dameMaterial(i);
            descripccion=datosS.dameDescripccion(i);
            atributos=new VariablesProductos(titulo, precio, marca, modelo, genero, edad, material, descripccion);
            datos.add(atributos);
        }
       llenar();
    }
    
    FuncionDep datosDep=new FuncionDep();
    private void llenarArrayD()throws IOException, FileNotFoundException, ClassNotFoundException{
        String titulo;
        double precio;
        String marca;
        String modelo;
        String genero;
        String edad;
        String material;
        String descripccion;
        for (int i = 0; i < datosDep.tamanoArray(); i++) {
            titulo=datosDep.dameTitulo(i);
            precio=datosDep.damePrecio(i);
            marca=datosDep.dameMarca(i);
            modelo=datosDep.dameModelo(i);
            genero=datosDep.dameGenero(i);
            edad=datosDep.dameEdad(i);
            material=datosDep.dameMaterial(i);
            descripccion=datosDep.dameDescripccion(i);
            atributos=new VariablesProductos(titulo, precio, marca, modelo, genero, edad, material, descripccion);
            datos.add(atributos);
        }
        llenar();
    }
    FuncionAccesorios datosA=new FuncionAccesorios();
    private void llenarArrayA()throws IOException, FileNotFoundException, ClassNotFoundException{
        String titulo;
        double precio;
        String marca;
        String modelo;
        String genero;
        String edad;
        String material;
        String descripccion;
        for (int i = 0; i < datosA.tamanoArray(); i++) {
            titulo=datosA.dameTitulo(i);
            precio=datosA.damePrecio(i);
            marca=datosA.dameMarca(i);
            modelo=datosA.dameModelo(i);
            genero=datosA.dameGenero(i);
            edad=datosA.dameEdad(i);
            material=datosA.dameMaterial(i);
            descripccion=datosA.dameDescripccion(i);
            atributos=new VariablesProductos(titulo, precio, marca, modelo, genero, edad, material, descripccion);
            datos.add(atributos);
        }
        llenar();
    }
    FuncionCompu datosC=new FuncionCompu();
    private void llenarArrayC()throws IOException, FileNotFoundException, ClassNotFoundException{
        String titulo;
        double precio;
        String marca;
        String modelo;
        String genero;
        String edad;
        String material;
        String descripccion;
        for (int i = 0; i < datosC.tamanoArray(); i++) {
            titulo=datosC.dameTitulo(i);
            precio=datosC.damePrecio(i);
            marca=datosC.dameMarca(i);
            modelo=datosC.dameModelo(i);
            genero=datosC.dameGenero(i);
            edad=datosC.dameEdad(i);
            material=datosC.dameMaterial(i);
            descripccion=datosC.dameDescripccion(i);
            atributos=new VariablesProductos(titulo, precio, marca, modelo, genero, edad, material, descripccion);
            datos.add(atributos);
        }
        llenar();
    }
    FuncionVideoj datosVi=new FuncionVideoj();
    private void llenarArrayVideo()throws IOException, FileNotFoundException, ClassNotFoundException{
        String titulo;
        double precio;
        String marca;
        String modelo;
        String genero;
        String edad;
        String material;
        String descripccion;
        for (int i = 0; i < datosVi.tamanoArray(); i++) {
            titulo=datosVi.dameTitulo(i);
            precio=datosVi.damePrecio(i);
            marca=datosVi.dameMarca(i);
            modelo=datosVi.dameModelo(i);
            genero=datosVi.dameGenero(i);
            edad=datosVi.dameEdad(i);
            material=datosVi.dameMaterial(i);
            descripccion=datosVi.dameDescripccion(i);
            atributos=new VariablesProductos(titulo, precio, marca, modelo, genero, edad, material, descripccion);
            datos.add(atributos);
        }
        llenar();
    }
    FuncionElectro datosE=new FuncionElectro();
    private void llenarArrayE()throws IOException, FileNotFoundException, ClassNotFoundException{
        String titulo;
        double precio;
        String marca;
        String modelo;
        String genero;
        String edad;
        String material;
        String descripccion;
        for (int i = 0; i < datosE.tamanoArray(); i++) {
            titulo=datosE.dameTitulo(i);
            precio=datosE.damePrecio(i);
            marca=datosE.dameMarca(i);
            modelo=datosE.dameModelo(i);
            genero=datosE.dameGenero(i);
            edad=datosE.dameEdad(i);
            material=datosE.dameMaterial(i);
            descripccion=datosE.dameDescripccion(i);
            atributos=new VariablesProductos(titulo, precio, marca, modelo, genero, edad, material, descripccion);
            datos.add(atributos);
        }
        llenar();
    }
    FuncionInmuebles datosI=new FuncionInmuebles();
    private void llenarArrayI()throws IOException, FileNotFoundException, ClassNotFoundException{
        String titulo;
        double precio;
        String marca;
        String modelo;
        String genero;
        String edad;
        String material;
        String descripccion;
        for (int i = 0; i < datosI.tamanoArray(); i++) {
            titulo=datosI.dameTitulo(i);
            precio=datosI.damePrecio(i);
            marca=datosI.dameMarca(i);
            modelo=datosI.dameModelo(i);
            genero=datosI.dameGenero(i);
            edad=datosI.dameEdad(i);
            material=datosI.dameMaterial(i);
            descripccion=datosI.dameDescripccion(i);
            atributos=new VariablesProductos(titulo, precio, marca, modelo, genero, edad, material, descripccion);
            datos.add(atributos);
        }
        llenar();
    }
    FuncionRyC datosRyC=new FuncionRyC();
    private void llenarArrayRyC()throws IOException, FileNotFoundException, ClassNotFoundException{
        String titulo;
        double precio;
        String marca;
        String modelo;
        String genero;
        String edad;
        String material;
        String descripccion;
        for (int i = 0; i < datosRyC.tamanoArray(); i++) {
            titulo=datosRyC.dameTitulo(i);
            precio=datosRyC.damePrecio(i);
            marca=datosRyC.dameMarca(i);
            modelo=datosRyC.dameModelo(i);
            genero=datosRyC.dameGenero(i);
            edad=datosRyC.dameEdad(i);
            material=datosRyC.dameMaterial(i);
            descripccion=datosRyC.dameDescripccion(i);
            atributos=new VariablesProductos(titulo, precio, marca, modelo, genero, edad, material, descripccion);
            datos.add(atributos);
        }
        llenar();
    }
    FuncionTelefonia datosT=new FuncionTelefonia();
    private void llenarArrayT()throws IOException, FileNotFoundException, ClassNotFoundException{
        String titulo;
        double precio;
        String marca;
        String modelo;
        String genero;
        String edad;
        String material;
        String descripccion;
        for (int i = 0; i < datosT.tamanoArray(); i++) {
            titulo=datosT.dameTitulo(i);
            precio=datosT.damePrecio(i);
            marca=datosT.dameMarca(i);
            modelo=datosT.dameModelo(i);
            genero=datosT.dameGenero(i);
            edad=datosT.dameEdad(i);
            material=datosT.dameMaterial(i);
            descripccion=datosT.dameDescripccion(i);
            atributos=new VariablesProductos(titulo, precio, marca, modelo, genero, edad, material, descripccion);
            datos.add(atributos);
        }
        llenar();
    }
    FuncionAV datosAV=new FuncionAV();
    private void llenarArrayAV()throws IOException, FileNotFoundException, ClassNotFoundException{
        String titulo;
        double precio;
        String marca;
        String modelo;
        String genero;
        String edad;
        String material;
        String descripccion;
        for (int i = 0; i < datosAV.tamanoArray(); i++) {
            titulo=datosAV.dameTitulo(i);
            precio=datosAV.damePrecio(i);
            marca=datosAV.dameMarca(i);
            modelo=datosAV.dameModelo(i);
            genero=datosAV.dameGenero(i);
            edad=datosAV.dameEdad(i);
            material=datosAV.dameMaterial(i);
            descripccion=datosAV.dameDescripccion(i);
            atributos=new VariablesProductos(titulo, precio, marca, modelo, genero, edad, material, descripccion);
            datos.add(atributos);
        }
        llenar();
    }
    FuncionMuebles datosM=new FuncionMuebles();
    private void llenarArrayM()throws IOException, FileNotFoundException, ClassNotFoundException{
        String titulo;
        double precio;
        String marca;
        String modelo;
        String genero;
        String edad;
        String material;
        String descripccion;
        for (int i = 0; i < datosM.tamanoArray(); i++) {
            titulo=datosM.dameTitulo(i);
            precio=datosM.damePrecio(i);
            marca=datosM.dameMarca(i);
            modelo=datosM.dameModelo(i);
            genero=datosM.dameGenero(i);
            edad=datosM.dameEdad(i);
            material=datosM.dameMaterial(i);
            descripccion=datosM.dameDescripccion(i);
            atributos=new VariablesProductos(titulo, precio, marca, modelo, genero, edad, material, descripccion);
            datos.add(atributos);
        }
        llenar();
    }
    FuncionJuguetes datosJ=new FuncionJuguetes();
    private void llenarArrayJ()throws IOException, FileNotFoundException, ClassNotFoundException{
        String titulo;
        double precio;
        String marca;
        String modelo;
        String genero;
        String edad;
        String material;
        String descripccion;
        for (int i = 0; i < datosJ.tamanoArray(); i++) {
            titulo=datosJ.dameTitulo(i);
            precio=datosJ.damePrecio(i);
            marca=datosJ.dameMarca(i);
            modelo=datosJ.dameModelo(i);
            genero=datosJ.dameGenero(i);
            edad=datosJ.dameEdad(i);
            material=datosJ.dameMaterial(i);
            descripccion=datosJ.dameDescripccion(i);
            atributos=new VariablesProductos(titulo, precio, marca, modelo, genero, edad, material, descripccion);
            datos.add(atributos);
        }
        llenar();
    }
    FuncionPersonal datosCP=new FuncionPersonal();
    private void llenarArrayCP()throws IOException, FileNotFoundException, ClassNotFoundException{
        String titulo;
        double precio;
        String marca;
        String modelo;
        String genero;
        String edad;
        String material;
        String descripccion;
        for (int i = 0; i < datosCP.tamanoArray(); i++) {
            titulo=datosCP.dameTitulo(i);
            precio=datosCP.damePrecio(i);
            marca=datosCP.dameMarca(i);
            modelo=datosCP.dameModelo(i);
            genero=datosCP.dameGenero(i);
            edad=datosCP.dameEdad(i);
            material=datosCP.dameMaterial(i);
            descripccion=datosCP.dameDescripccion(i);
            atributos=new VariablesProductos(titulo, precio, marca, modelo, genero, edad, material, descripccion);
            datos.add(atributos);
        }
        llenar();
    }
    
    void preparar(){
        try{
        autos.prepararDatos();
        datosS.prepararDatos();
        datosDep.prepararDatos();
        datosA.prepararDatos();
        datosC.prepararDatos();
        datosVi.prepararDatos();
        datosE.prepararDatos();
        datosI.prepararDatos();
        datosRyC.prepararDatos();
        datosT.prepararDatos();
        datosAV.prepararDatos();
        datosM.prepararDatos();
        datosJ.prepararDatos();
        datosCP.prepararDatos();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error, regrese a la ventana anterior y vuelva a entrar");
            try {
                guardarUnDato();
            } catch (IOException ex) {
                Logger.getLogger(Tablas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private void guardarUnDato() throws IOException{
        String x="algo";
        double y=55.77;
        autos.pedirD(x, y, x, x, x, x, x, x);
        datosS.pedirD(x, y, x, x, x, x, x, x);
        datosDep.pedirD(x, y, x, x, x, x, x, x);
        datosA.pedirD(x, y, x, x, x, x, x, x);
        datosC.pedirD(x, y, x, x, x, x, x, x);
        datosVi.pedirD(x, y, x, x, x, x, x, x);
        datosE.pedirD(x, y, x, x, x, x, x, x);
        datosI.pedirD(x, y, x, x, x, x, x, x);
        datosRyC.pedirD(x, y, x, x, x, x, x, x);
        datosT.pedirD(x, y, x, x, x, x, x, x);
        datosAV.pedirD(x, y, x, x, x, x, x, x);
        datosM.pedirD(x, y, x, x, x, x, x, x);
        datosJ.pedirD(x, y, x, x, x, x, x, x);
        datosCP.pedirD(x, y, x, x, x, x, x, x);
    }
}
