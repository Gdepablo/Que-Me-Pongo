package com.queMePongo;

import java.util.ArrayList;
import java.util.List;

public class Guardarropa extends Sugerencias {
    public String nombre;
    Boolean compartido;
    List<Atuendo> prendas = new ArrayList<>();
    
    public void deshacerAgregarPrenda(Atuendo atuendoAceptado) {
        prendas.remove(atuendoAceptado);
    };
    
    public void deshacerQuitarPrenda(Atuendo atuendoRechazado) {
        prendas.add(atuendoRechazado);
    };
}
