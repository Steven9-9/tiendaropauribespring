package com.example.Store.helpers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Evaluador {


    public boolean evaluarPatron(String cadena, String regex){

        Pattern patron=Pattern.compile(regex);
        Matcher validacion= patron.matcher(cadena);

        if(validacion.matches()){

            return true;

        }else{

        return false;
        }

    }

}
