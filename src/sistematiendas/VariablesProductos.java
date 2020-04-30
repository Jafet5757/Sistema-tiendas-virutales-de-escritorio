package sistematiendas;

import java.io.Serializable;

public class VariablesProductos implements Serializable{
    
    private String titulo;
    private double precio;
    private String marca;
    private String modelo;
    private String genero;
    private String edad;
    private String material;
    private String descripccion;

    public VariablesProductos() {
    }

    public VariablesProductos(String titulo, double precio, String marca, String modelo, String genero, String edad, String material, String descripccion) {
        this.titulo = titulo;
        this.precio = precio;
        this.marca = marca;
        this.modelo = modelo;
        this.genero = genero;
        this.edad = edad;
        this.material = material;
        this.descripccion = descripccion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDescripccion() {
        return descripccion;
    }

    public void setDescripccion(String descripccion) {
        this.descripccion = descripccion;
    }
    
    
    
}
