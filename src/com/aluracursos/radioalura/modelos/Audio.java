package com.aluracursos.radioalura.modelos;

public abstract class Audio {
    private String title;
    private int totalPlays;
    private int totalLikes;
    private int rating;

    public void like(){
        this.totalLikes++;
    }

    public void play(){
        this.totalPlays++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalPlays() {
        return totalPlays;
    }

    public void setTotalPlays(int totalPlays) {
        this.totalPlays = totalPlays;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public void setTotalLikes(int totalLikes) {
        this.totalLikes = totalLikes;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public abstract int getClasificacion();
}