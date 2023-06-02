package com.pedrocpacheco.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

// Essa classe é justamente a relação de N para N, que vai ter seus
// Proprios atributos (Vimos isso em Banco de Dados)
@Entity
@Table(name = "belonging")
public class Belonging {
    
    // Duas entidades que se relacionam
    //private Game game;
    //private GameList gameList;

    // Junção das duas Entidades antes feitas
    @EmbeddedId // -> diz o ID é junto, das duas coisas dentro da classe.
    private BelongingPK id;

    private Integer position; // Atributo que surge justamente apos a relação

    public Belonging(){

    }

    // Como o nosso ID precisa receber Game e GameList, passamos eles neste construtor
    public Belonging(Game game, GameList list, Integer position){
        this.id.setGame(game);
        this.id.setGameList(list);
        this.position = position;
    }

    public BelongingPK getId() {
        return id;
    }

    public void setId(BelongingPK id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Belonging other = (Belonging) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    

}
