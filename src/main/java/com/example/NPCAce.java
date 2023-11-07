package com.example;

public class NPCAce extends NPC{

    public NPCAce (NPC nextRank){
        listaRanks.add(DesafioRankAce.getDesafioRankAce());
        setNpcAcima(nextRank);
    }

    public String getDescricaoDesafio(){
        return "Lorelay: 3 Pokémons";
    }
    
}
