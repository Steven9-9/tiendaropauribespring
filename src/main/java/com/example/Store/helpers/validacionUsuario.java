package com.example.Store.helpers;

public class validacionUsuario {

    private Evaluador evaluarDatos = new Evaluador();


    public boolean validarNombres(String nombres)throws Exception{

        String regex = "^[a-zA-Z]+(?:\\s[a-zA-Z]+){0,49}$";

        if(!this.evaluarDatos.evaluarPatron(nombres, regex)){

            throw new Exception("Solo se permiten letras y una espacio entre los nombres");

        }

        if(nombres.length()>50){

            throw new Exception("Numero de caracteres mayor a 50");

        }

        return true;
    }

    public boolean validarCedula(String cedula)throws Exception{

        return true;
    }

    public boolean validarCorreo(String correo)throws  Exception{
        return true;
    }
    public boolean validarGenero(String geneo)throws Exception{

        return true;
    }

    public boolean validarCodigoPostal(String codigo)throws Exception{

        return true;
    }




}
