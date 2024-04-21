package com.aluracursos.radioalura.principal;

import com.aluracursos.radioalura.modelos.Song;
import com.aluracursos.radioalura.modelos.MyFavorites;
import com.aluracursos.radioalura.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Song mySong = new Song();
        mySong.setTitle("Forever");
        mySong.setSinger("Kiss");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela Aguiar");
        miPodcast.setTitle("Cafe.Tech");
        //cancion
        for (int i = 0; i < 100; i++) {
            mySong.like();
        }
        for (int i = 0; i < 2000; i++) {
            mySong.play();
        }
        // podcast
        for (int i = 0; i < 100; i++) {
            miPodcast.like();
        }
        for (int i = 0; i < 8000; i++) {
            miPodcast.play();
        }

        System.out.println("Total reproducciones: " + mySong.getTotalPlays());
        System.out.println("Total de Me Gusta: " + mySong.getTotalPlays());

        MyFavorites favorites = new MyFavorites();
        favorites.add(miPodcast);
        favorites.add(mySong);
    }
}
