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

/**
 *
 * @author JAFET
 */
public class FuncionRyC implements Serializable{
     
    static ArrayList<VariablesProductos> productos=new ArrayList();
    
    String titulo;
    double precio;
    String marca;
    String modelo;
    String genero;
    String edad;
    String material;
    String descripccion;
    
    VariablesProductos atributos=new VariablesProductos();
    
    public void guardar() throws FileNotFoundException, IOException {
       
        FileOutputStream archivo=new FileOutputStream("RopaCalzado.txt");
        ObjectOutputStream salida=new ObjectOutputStream(archivo);
        
        salida.writeObject(productos);
        salida.close();
        JOptionPane.showMessageDialog(null, "se registró con exito");
    }
    
    public void pedirD(String titulo, double precio, String marca, String modelo, String genero, String edad, String material, String descripccion) throws IOException{
        this.titulo = titulo;
        this.precio = precio;
        this.marca = marca;
        this.modelo = modelo;
        this.genero = genero;
        this.edad = edad;
        this.material = material;
        this.descripccion = descripccion;
        atributos=new VariablesProductos(titulo, precio, marca, modelo, genero, edad, material, descripccion);
        productos.add(atributos);
        guardar();
    }
    
    public void LeerJ() throws FileNotFoundException, IOException, ClassNotFoundException {
          
         FileInputStream archivo=new FileInputStream("RopaCalzado.txt");
         
         ObjectInputStream entrada=new ObjectInputStream(archivo);
         
         productos=(ArrayList)entrada.readObject();
         for (int i = 0; i < productos.size(); i++) {
             VariablesProductos obj=(VariablesProductos)productos.get(i);
                JOptionPane.showMessageDialog(null, "titulo: "+obj.getTitulo());
         }
    }
    
    public int tamanoArray(){
        int tamaño=productos.size();
        return tamaño;
    }
    
    public String dameTitulo(int posicion) throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream archivo=new FileInputStream("RopaCalzado.txt");
         
         ObjectInputStream entrada=new ObjectInputStream(archivo);
         
         productos=(ArrayList)entrada.readObject();
         
             VariablesProductos obj=(VariablesProductos)productos.get(posicion);
            return obj.getTitulo();
    }
    public double damePrecio(int posicion) throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream archivo=new FileInputStream("RopaCalzado.txt");
         
         ObjectInputStream entrada=new ObjectInputStream(archivo);
         
         productos=(ArrayList)entrada.readObject();
         
             VariablesProductos obj=(VariablesProductos)productos.get(posicion);
            return obj.getPrecio();
    }
    public String dameMarca(int posicion) throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream archivo=new FileInputStream("RopaCalzado.txt");
         
         ObjectInputStream entrada=new ObjectInputStream(archivo);
         
         productos=(ArrayList)entrada.readObject();
         
             VariablesProductos obj=(VariablesProductos)productos.get(posicion);
            return obj.getMarca();
    }
    public String dameModelo(int posicion) throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream archivo=new FileInputStream("RopaCalzado.txt");
         
         ObjectInputStream entrada=new ObjectInputStream(archivo);
         
         productos=(ArrayList)entrada.readObject();
         
             VariablesProductos obj=(VariablesProductos)productos.get(posicion);
            return obj.getModelo();
    }
    public String dameGenero(int posicion) throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream archivo=new FileInputStream("RopaCalzado.txt");
         
         ObjectInputStream entrada=new ObjectInputStream(archivo);
         
         productos=(ArrayList)entrada.readObject();
         
             VariablesProductos obj=(VariablesProductos)productos.get(posicion);
            return obj.getGenero();
    }
    public String dameEdad(int posicion) throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream archivo=new FileInputStream("RopaCalzado.txt");
         
         ObjectInputStream entrada=new ObjectInputStream(archivo);
         
         productos=(ArrayList)entrada.readObject();
         
             VariablesProductos obj=(VariablesProductos)productos.get(posicion);
            return obj.getEdad();
    }
    public String dameMaterial(int posicion) throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream archivo=new FileInputStream("RopaCalzado.txt");
         
         ObjectInputStream entrada=new ObjectInputStream(archivo);
         
         productos=(ArrayList)entrada.readObject();
         
             VariablesProductos obj=(VariablesProductos)productos.get(posicion);
            return obj.getMaterial();
    }
    public String dameDescripccion(int posicion) throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream archivo=new FileInputStream("RopaCalzado.txt");
         
         ObjectInputStream entrada=new ObjectInputStream(archivo);
         
         productos=(ArrayList)entrada.readObject();
         
             VariablesProductos obj=(VariablesProductos)productos.get(posicion);
            return obj.getDescripccion();
    }
    public void prepararDatos() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream archivo=new FileInputStream("RopaCalzado.txt");
         
         ObjectInputStream entrada=new ObjectInputStream(archivo);
         
         productos=(ArrayList)entrada.readObject();
         for (int i = 0; i < productos.size(); i++) {
             VariablesProductos obj=(VariablesProductos)productos.get(i);
                System.out.println("titulo: "+obj.getTitulo());
         }
    }
    public void Borrar(String titulo)throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream archivo=new FileInputStream("RopaCalzado.txt");
         
         ObjectInputStream entrada=new ObjectInputStream(archivo);
         
         productos=(ArrayList)entrada.readObject();
         for (int i = 0; i < productos.size(); i++) {
             VariablesProductos obj=(VariablesProductos)productos.get(i);
                if(obj.getTitulo().equals(titulo)){
                    productos.remove(i);
                    guardar();
                    JOptionPane.showMessageDialog(null, "Se ah borrado con exito");
                }
         }
    }
    public int getIndice(String titulo)throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream archivo=new FileInputStream("RopaCalzado.txt");
         
         ObjectInputStream entrada=new ObjectInputStream(archivo);
         int index=-1;
         boolean b=false;
         
         productos=(ArrayList)entrada.readObject();
         for (int i = 0; i < productos.size(); i++) {System.out.println(titulo);
             VariablesProductos obj=(VariablesProductos)productos.get(i);
             if (titulo.equals(obj.getTitulo())) {
                index=i;
                b=true;
             }
         }
         if(!b){
             JOptionPane.showMessageDialog(null, "ha ocurrido un error, algunos datos no concuerdan\ncierre el programa y vuelva a interntarlo");
             System.out.println(index);
         }
         return index;
    }
}
