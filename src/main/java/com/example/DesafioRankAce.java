package com.example;

public class DesafioRankAce implements DesafioRank{

    private static DesafioRankAce desafioAce = new DesafioRankAce();

    private DesafioRankAce(){};

    public static DesafioRankAce getDesafioRankAce(){
        return desafioAce;
    }

}
