package com.example;

public class DesafioRankAmateur implements DesafioRank{

    private static DesafioRankAmateur desafioAmateur = new DesafioRankAmateur();

    private DesafioRankAmateur(){};

    public static DesafioRankAmateur getDesafioRankAmateur(){
        return desafioAmateur;
    }

}

