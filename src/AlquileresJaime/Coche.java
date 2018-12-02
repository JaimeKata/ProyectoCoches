/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlquileresJaime;

/**
 *
 * @author Jaime Catalán Mateos
 */
public abstract class Coche {
    private String matricula; 
    private String marca;
    private String modelo;
    private Fecha fechaFabricacion;
    private boolean disponible = true; // lo inicializo a True porque de primeras nada mas crearlo un coche esta disponible
    private Integer precioDiario; 
    
    public Coche(){
        this.matricula = null; 
        this.marca = null; 
        this.modelo = null; 
        this.fechaFabricacion = null; 
        
        this.precioDiario = null; 
    }
    public Coche(String matricula, String marca, String modelo, Fecha fechaFabricacion, Integer precioDiario){
        this.matricula = matricula; 
        this.marca = marca; 
        this.modelo = modelo; 
        this.fechaFabricacion = fechaFabricacion; 
        this.precioDiario = precioDiario; 
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    public Fecha getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(Fecha fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Integer getPrecioDiario() {
        return precioDiario;
    }

    public void setPrecioDiario(Integer precioDiario) {
        this.precioDiario = precioDiario;
    }
    public abstract void alquilar();
    public abstract Integer devolver(Integer diasAlquilado);    

    @Override
    public String toString() {
        return "Coche [" + "matricula:" + matricula + ", marca:" + marca + ", modelo:" + modelo + ", fechaFabricacion:" + fechaFabricacion + ", disponible:" + disponible + ", precioDiario:" + precioDiario + ']';
    }
    
    
}
