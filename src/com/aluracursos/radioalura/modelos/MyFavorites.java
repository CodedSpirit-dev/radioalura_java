package com.aluracursos.radioalura.modelos;

public class MyFavorites {
    public void add(Audio audio){
        if(audio.getClasificacion() >= 8){
            System.out.println(audio.getTitle() + "Es uno de los favoritos del momento");
        } else {
            System.out.println(audio.getTitle() + "También es uno de los favoritos");
        }
    }
}
