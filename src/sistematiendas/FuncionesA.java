
package sistematiendas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FuncionesA implements Serializable{
    
    static ArrayList<Dadmon> datos=new ArrayList();
    
    String user, conter;
    
    Dadmon comp=new Dadmon();
    
     void guardar() throws FileNotFoundException, IOException {
       
        FileOutputStream archivo=new FileOutputStream("admon.txt");
        ObjectOutputStream salida=new ObjectOutputStream(archivo);
        
        salida.writeObject(datos);
        salida.close();
        JOptionPane.showMessageDialog(null, "se registró con exito");
    }
    
    void pedirD(String usuario, String contraseña) throws IOException{
        user=usuario;
        conter=contraseña;
        comp=new Dadmon(user,conter);
        datos.add(comp);
        guardar();
    }
    
    public void LeerJ() throws FileNotFoundException, IOException, ClassNotFoundException {
          
         FileInputStream archivo=new FileInputStream("admon.txt");
         
         ObjectInputStream entrada=new ObjectInputStream(archivo);
         
         datos=(ArrayList)entrada.readObject();
         for (int i = 0; i < datos.size(); i++) {
             Dadmon obj=(Dadmon)datos.get(i);
             JOptionPane.showMessageDialog(null, obj.getUsuario()+"\n"+obj.getContraseña());
         }
    }
    
    public boolean DarAcceso(String user, String password)throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream archivo=new FileInputStream("admon.txt");
         
         ObjectInputStream entrada=new ObjectInputStream(archivo);
         boolean pr=false,en=false;
         
         datos=(ArrayList)entrada.readObject();
         for (int i = 0; i < datos.size(); i++) {
             Dadmon obj=(Dadmon)datos.get(i);
             if(obj.getUsuario().equalsIgnoreCase(user)){ 
                en=true;
                String aux=obj.getContraseña();
                 if(password.equals(aux)){
                     pr=true;
                 }else{
                     JOptionPane.showMessageDialog(null, "la contraseña es incorrecta","ERROR",JOptionPane.WARNING_MESSAGE);
                 }
             }
         }
         if (!en) {
            JOptionPane.showMessageDialog(null, "no se encontro el nombre de usuario","ERROR",JOptionPane.WARNING_MESSAGE);
        }
         return pr;
    }
    
    public boolean comprobarNombre(String name) throws FileNotFoundException, IOException, ClassNotFoundException {
          
         FileInputStream archivo=new FileInputStream("admon.txt");
         
         ObjectInputStream entrada=new ObjectInputStream(archivo);
         boolean permiso=false;
         
         datos=(ArrayList)entrada.readObject();
         for (int i = 0; i < datos.size(); i++) {
             Dadmon obj=(Dadmon)datos.get(i);
             if(obj.getUsuario().equalsIgnoreCase(name)){
                 JOptionPane.showMessageDialog(null, "El nombre de usuario ya esta registrado");
                 permiso=false;
                 break;
             }else{
                 permiso=true;
             }
         }
         return permiso;
    }
    
}
