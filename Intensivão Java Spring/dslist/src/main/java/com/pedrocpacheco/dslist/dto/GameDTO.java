package com.pedrocpacheco.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.pedrocpacheco.dslist.entities.Game;

// Mesmo tendo uma classe Game com os mesmos atributos que esta GameDTO, é melhor
// E mais aconecelhado criar mesmo assim uma DTO, pois assim, eliminamos risco de ficar
// Em loops infinitos, e dividimos responsabilidades.

public class GameDTO {

    private Long id;
    private String title;
    private Integer year; 
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameDTO(){

    }

    public GameDTO(Game entityGame){
        BeanUtils.copyProperties(entityGame, this); // Copia os atributos do Game
        // Para usar isto, esta classe precisa ter Getters e Setters
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    

}
