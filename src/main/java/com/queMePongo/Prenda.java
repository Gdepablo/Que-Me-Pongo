package com.queMePongo;

public class Prenda
{
    TipoDePrenda tipoDePrenda = null;
    Categoria categoria = null;
    Material material = null;
    Color color = null;
    Color colorSecundario = null;
    Trama trama = Trama.LISA;
    Prenda borrador = null;
    
      public Prenda() {
          if (tipoDePrenda == null || categoria == null || material == null || color == null || colorSecundario == null) {
                throw new PrendaInvalida("La prenda es invalida");
          }
      }

    public void guardarBorrador(Prenda prenda) {
        borrador = prenda;
}}
