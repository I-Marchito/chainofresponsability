package com.example;

public class NPCPro extends NPC{

    public NPCPro (NPC nextRank){
        listaRanks.add(DesafioRankPro.getDesafioRankPro());
        setNpcAcima(nextRank);
    }

    public String getDescricaoDesafio(){
        return "Lance: 6 Pokémons";
    }
    
}
