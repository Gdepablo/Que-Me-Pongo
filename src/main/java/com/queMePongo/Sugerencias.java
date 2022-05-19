package com.queMePongo;

import java.util.ArrayList;
import java.util.List;

public class Sugerencias {
    List<Atuendo> tentativasParaAgregar = new ArrayList<>();
    List<Atuendo> tentativasParaQuitar = new ArrayList<>();
    
    
    public void ropaParaAgregar(Atuendo atuendo) {
        tentativasParaAgregar.add(atuendo);
    };
    public void ropaParaQuitar(Atuendo atuendo) {
        tentativasParaQuitar.add(atuendo);
    };

    // Como no sabemos bajo qué criterios acepta o rechaza entonces por ahora es prosa y no voy a poner un método que no haga nada.
    //Como el método es público entonces puede ser accedido por todos. Idealmente en ropaParaAgregar / Quitar debería haber un aceptar / rechazar y en base a eso
    //Agregarlo en prendas del guardarropa. Pero como NO sabemos qué hace aceptar o rechazar lo dejo así.
}
