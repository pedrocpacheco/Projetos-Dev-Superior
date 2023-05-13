package com.pedrocpacheco.dslist.projections;


public interface GameMinProjection {

    // Metodos Get para cada dato que a consulta esta buscando
    Long getId();
    String getTitle();
    Integer getGameYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();

}
