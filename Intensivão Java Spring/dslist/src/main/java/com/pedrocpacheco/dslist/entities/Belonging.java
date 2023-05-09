package com.pedrocpacheco.dslist.entities;

// Essa classe é justamente a relação de N para N, que vai ter seus
// Proprios atributos (Vimos isso em Banco de Dados)
public class Belonging {
    
    // Duas entidades que se relacionam
    //private Game game;
    //private GameList gameList;

    // Junção das duas Entidades antes feitas
    private BelongingPK id;

    private Integer position; // Atributo que surge justamente apos a relação

}
