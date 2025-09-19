package Personas;

import Cervezas.MarcaCerveza;

public class Checo implements Nacionalidad{

    @Override
    public boolean leGustaCerveza(MarcaCerveza cerveza) {
        return cerveza.calcularGraduacion() > 0.08;
    }

}
