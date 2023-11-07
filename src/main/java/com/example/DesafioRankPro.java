package com.example;

public class DesafioRankPro implements DesafioRank{

    private static DesafioRankPro desafioPro = new DesafioRankPro();

    private DesafioRankPro(){};

    public static DesafioRankPro getDesafioRankPro(){
        return desafioPro;
    }

}