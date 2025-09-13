package Personas;

import Cervezas.MarcaCerveza;

public class Persona {
    double peso;
    int cantJarras;
    boolean leGustaMusTrad;
    double aguante;
    double nivelAlcohol;
    Nacionalidad nacionalidad;
   
    public Persona(double peso, int cantJarras, boolean leGustaMusTrad, double aguante,
            Nacionalidad nacionalidad,double nivelAlcohol) {
        this.peso = peso;
        this.cantJarras = cantJarras;
        this.leGustaMusTrad = leGustaMusTrad;
        this.aguante = aguante;
        this.nacionalidad = nacionalidad;
        this.nivelAlcohol = nivelAlcohol;
    }

    public boolean estaEbria(){
        return nivelAlcohol * peso > aguante;
    }

    public boolean leGustaCerveza(MarcaCerveza cerveza){
        return nacionalidad.leGustaCerveza(cerveza);
    }
}
