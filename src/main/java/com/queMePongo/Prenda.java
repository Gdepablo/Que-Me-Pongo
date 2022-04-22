package com.queMePongo;

import java.util.List;

public class Prenda
{
    private TipoDePrenda tipoDePrenda;
    private Categoria categoria;
    private String material;
    private String color;
    private String colorSecundario;

    //SETTERS
    public void tipoDePrenda(TipoDePrenda tipo){
        tipoDePrenda = tipo;
    }
    
    public void categoria(Categoria unaCategoria){
        categoria = unaCategoria;
    }

    public void material(String unMaterial){
        material = unMaterial;
    }
    
    public void color(String colorPrimario){
        color = colorPrimario;
    }

    public void colorSecundario(String unColorSecundario){
        colorSecundario = unColorSecundario;
    }

    // GETTERS
    public TipoDePrenda tipoDePrenda(){
        return tipoDePrenda;
    }

    public TipoDePrenda categoria(){
        return categoria();
    }

    public String material(){
        return material;
    }

    public String color(){
        return color;
    }

    public TipoDePrenda colorSecundario(){
        return colorSecundario();
    }
}