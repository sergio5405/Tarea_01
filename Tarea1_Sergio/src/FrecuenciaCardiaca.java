/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sergiohernandezjr
 */
public class FrecuenciaCardiaca {
    private Fecha fechaNacimiento;
    private String nombre;
    
    public FrecuenciaCardiaca (String nombre, Fecha fecha){
        this.nombre = nombre;
        this.fechaNacimiento = fecha;
    }
    
    public double getMaximaFrecuenciaCardiaca (){
        return 220.0-fechaNacimiento.calcularEdad();
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fecha) {
        this.fechaNacimiento = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }  
}
