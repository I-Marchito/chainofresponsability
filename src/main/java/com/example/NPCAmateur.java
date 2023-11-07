package com.example;

public class NPCAmateur extends NPC{

    public NPCAmateur (NPC nextRank){
        listaRanks.add(DesafioRankAmateur.getDesafioRankAmateur());
        setNpcAcima(nextRank);
    }

    public String getDescricaoDesafio(){
        return "Abel: 2 Pokémons";
    }
    
}
