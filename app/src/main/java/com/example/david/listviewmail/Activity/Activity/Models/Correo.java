package com.example.david.listviewmail.Activity.Activity.Models;

/**
 * Created by David on 13/09/2017.
 */

public class Correo {
    private String Remitente;
    private String Mail;
    private String Asunto;
    private String Mensaje;
    private String Fecha;
    private String Color;


    public Correo( String remitente, String mail,  String asunto, String mensaje, String fecha,String color) {

        Remitente = remitente;
        Mail = mail;
        Asunto = asunto;
        Mensaje = mensaje;
        Fecha = fecha;
        Color = color;
    }

    public String getRemitente(){
        return Remitente;
    }
    public String getMail(){
        return Mail;
    }
    public String getAsunto(){
        return Asunto;
    }
    public String getMensaje(){
        return Mensaje;
    }
    public String getFecha(){
        return Fecha;
    }
    public String getColor(){
        return Color;
    }
}

