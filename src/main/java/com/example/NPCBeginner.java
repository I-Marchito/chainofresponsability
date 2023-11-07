package com.example;

public class NPCBeginner extends NPC{

    public NPCBeginner (NPC nextRank){
        listaRanks.add(DesafioRankBeginner.getDesafioRankBeginner());
        setNpcAcima(nextRank);
    }

    public String getDescricaoDesafio(){
        return "Julius: 1 Pokémon";
    }
    
}
