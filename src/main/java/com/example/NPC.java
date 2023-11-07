package com.example;

import java.util.ArrayList;

public abstract class NPC {
    
    protected ArrayList listaRanks = new ArrayList();
    private NPC npcAcima;

    public NPC getNpcAcima(){
        return npcAcima;
    }

    public void setNpcAcima(NPC npcAcima){
        this.npcAcima = npcAcima;
    }

    public abstract String getDescricaoDesafio();

    public String iniciarDesafio(Desafio desafio){
        if (listaRanks.contains(desafio.getDesafioRank())){
            return getDescricaoDesafio();
        }else {
            if (npcAcima != null){
                return npcAcima.iniciarDesafio(desafio);
            }else {
                return "Desafio Sem Rank";
            }
        }
    }

}
