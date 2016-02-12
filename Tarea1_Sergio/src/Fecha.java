/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sergiohernandezjr
 */
import java.util.Calendar;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    public String toString(){
        String fechaStr = this.dia + "/" + this.mes + "/" + this.anio;
        return fechaStr;
    }
    
    public int calcularEdad(){
        int anioActual = Calendar.getInstance().get(Calendar.YEAR);
        int mesActual = Calendar.getInstance().get(Calendar.MONTH); // [0, 11]
        mesActual+=1;
        int diaActual = Calendar.getInstance().get(Calendar.DAY_OF_MONTH); // [1, ...]
        int edad;
        
        edad = anioActual-this.anio;
        if (anioActual>this.anio || (anioActual==this.anio && mesActual>this.mes) ||(anioActual==this.anio && mesActual==this.mes && diaActual>this.dia )) {
            if(mesActual<this.mes){
                edad-=1;
            }
            if (mesActual == this.mes){
                if (diaActual<this.dia){
                    edad-=1;
                }
            }
        }else{
            return -1;
        }
        return edad;
    }
    
    
}
