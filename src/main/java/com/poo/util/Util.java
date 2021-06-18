package com.poo.util;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Util {
    public Date validarFecha(String fechaString){
        Date fecha;
        try{
            fecha = new  SimpleDateFormat("dd/MM/yyyy").parse(fechaString);
        }
        catch(Exception e){
            fecha = null;
        }
        return fecha;
    }
    public String notEmpty(String cadena){
        if(cadena==null || cadena == "" || cadena == " "){
            return null;
        }
        return cadena;
    }
}
