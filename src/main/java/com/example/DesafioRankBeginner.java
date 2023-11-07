package com.example;

public class DesafioRankBeginner implements DesafioRank{

    private static DesafioRankBeginner desafioBeginner = new DesafioRankBeginner();

    private DesafioRankBeginner(){};

    public static DesafioRankBeginner getDesafioRankBeginner(){
        return desafioBeginner;
    }
    
}
